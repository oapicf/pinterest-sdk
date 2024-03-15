package org.openapitools.controller;

import org.openapitools.model.AdAccountsCatalogsProductGroupsList200Response;
import org.openapitools.model.Error;
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
 * API tests for ProductGroupsController
 */
@MicronautTest
public class ProductGroupsControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    ProductGroupsController controller;

    /**
     * This test is used to validate the implementation of adAccountsCatalogsProductGroupsList() method
     *
     * The method should: Get catalog product groups
     *
     * This endpoint is completely deprecated. Please use &lt;a href&#x3D;&#39;/docs/api/v5/#operation/catalogs_product_groups/list&#39;&gt;List product groups&lt;/a&gt; from Catalogs API instead.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void adAccountsCatalogsProductGroupsListMethodTest() {
        // given
        String adAccountId = "example";
        String feedProfileId = "example";

        // when
        AdAccountsCatalogsProductGroupsList200Response result = controller.adAccountsCatalogsProductGroupsList(adAccountId, feedProfileId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/product_groups/catalogs' to the features of adAccountsCatalogsProductGroupsList() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void adAccountsCatalogsProductGroupsListClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/product_groups/catalogs").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("application/json");
        request.getParameters()
            .add("feed_profile_id", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, AdAccountsCatalogsProductGroupsList200Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
