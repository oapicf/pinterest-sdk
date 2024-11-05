package org.openapitools.controller;

import org.openapitools.model.Error;
import org.openapitools.model.LeadsExportCreateRequest;
import org.openapitools.model.LeadsExportCreateResponse;
import org.openapitools.model.LeadsExportResponseData;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.runtime.server.EmbeddedServer;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.MutableHttpRequest;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.uri.UriTemplate;
import io.micronaut.http.cookie.Cookie;
import io.micronaut.http.client.multipart.MultipartBody;
import io.micronaut.core.type.Argument;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Assertions;
import jakarta.inject.Inject;
import reactor.core.publisher.Mono;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;


/**
 * API tests for LeadsExportController
 */
@MicronautTest
public class LeadsExportControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    LeadsExportController controller;

    /**
     * This test is used to validate the implementation of leadsExportCreate() method
     *
     * The method should: Create a request to export leads collected from a lead ad
     *
     * &lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt;  Create an export of leads collected from a lead ad. This returns a lead_export_id  token that you can use to download the export when it is ready.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/lead-ads\&quot;&gt;Lead ads&lt;/a&gt;.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void leadsExportCreateMethodTest() {
        // given
        String adAccountId = "example";
        LeadsExportCreateRequest leadsExportCreateRequest = new LeadsExportCreateRequest("2020-12-20", "2020-12-20", "687201361754");

        // when
        LeadsExportCreateResponse result = controller.leadsExportCreate(adAccountId, leadsExportCreateRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/leads_export' to the features of leadsExportCreate() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void leadsExportCreateClientApiTest() throws IOException {
        // given
        LeadsExportCreateRequest body = new LeadsExportCreateRequest("2020-12-20", "2020-12-20", "687201361754");
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/leads_export").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@5245b69c");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, LeadsExportCreateResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of leadsExportGet() method
     *
     * The method should: Get the lead export from the lead export create call
     *
     * &lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt;  Get the export of leads collected from a lead ad. This returns a URL to a list of lead export given a lead_export_id token returned from the create a lead export call. You can use the URL to download the report.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/lead-ads\&quot;&gt;Lead ads&lt;/a&gt;.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void leadsExportGetMethodTest() {
        // given
        String adAccountId = "example";
        String leadsExportId = "123755885175";

        // when
        LeadsExportResponseData result = controller.leadsExportGet(adAccountId, leadsExportId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/leads_export/{leads_export_id}' to the features of leadsExportGet() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void leadsExportGetClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/leads_export/{leads_export_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
            put("leads_export_id", "123755885175");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@6cd3a9ef");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, LeadsExportResponseData.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
