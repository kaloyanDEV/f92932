package bulkcode.f92932;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import bulkcode.controller.CompanyController;
import bulkcode.mapper.EntityMapper;
import bulkcode.model.Company;
import bulkcode.model.nomenclature.Activity;
import bulkcode.repository.CompanyRepository;
import bulkcode.service.impl.CompanyService;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
@TestPropertySource(locations = "classpath:application-integrationtest.properties")
public class CompanyControllerIntegrationTests {

    @Autowired
    private CompanyRepository companyRepository;

    @Autowired
    private CompanyController companyController;

    @Test
    public void contextLoads() {
    }

    private MockMvc mockMvc;

    @Before
    public void setup() {

        mockMvc = MockMvcBuilders.standaloneSetup(companyController).build();

        Company company1 = Company.builder().id(new Long(1)).activity(Activity.A1).build();
        Company company2 = Company.builder().id(new Long(2)).activity(Activity.A2).build();

        List<Company> resultList = Arrays.asList(company1, company2);

        when(companyRepository.findAll()).thenReturn(resultList);

        // when(companyRepository.findById(new
        // Long(1)).get()).thenReturn(company1);
    }

    @Test
    public void testGetByIdSuccess() throws Exception {

        mockMvc.perform(get("/companies/{id}", 1)).andExpect(status().isOk());

        // verify(userService, times(1)).findById(1);
        // verifyNoMoreInteractions(userService);
    }

    @Configuration
    @EnableSpringDataWebSupport
    static class TestConfig {

        // @Bean
        // public CertificateRevocationListService service() {
        // return new CassandraCertificateRevocationListService();
        // }
        //
        // @Bean
        // public CertificateRevocationListRepository repository() {
        // return Mockito.mock(CertificateRevocationListRepository.class);
        // }
        //
        // @Bean
        // public CertificateRevocationListRestController restController() {
        // return new CertificateRevocationListRestController();
        // }
        //
        // @Bean
        // public CertificateExtractCRL getInfoRestController() {
        // return new CertificateExtractCRL();
        // }
        //
        // @Bean
        // public CertificateFactory getCertificateFactory() {
        // return new BeanConfig().certificateFactory();
        // }

        @Bean
        public CompanyRepository repository() {
            return Mockito.mock(CompanyRepository.class);
        }

        @Bean
        public CompanyController getCompanyController() {
            return new CompanyController();
        }

        @Bean
        public CompanyService getCompanyService() {
            return new CompanyService();
        }

        @Bean
        public EntityMapper getEntityMapper() {
            return new EntityMapper();
        }

    }

}
