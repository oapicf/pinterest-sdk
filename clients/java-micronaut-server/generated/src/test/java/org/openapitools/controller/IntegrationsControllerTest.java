package org.openapitools.controller;

import org.openapitools.model.IntegrationLogsInvalidLogResponse;
import org.openapitools.model.IntegrationLogsRequestCreate;
import org.openapitools.model.IntegrationLogsSuccessResponse;
import org.openapitools.model.IntegrationMetadata;
import org.openapitools.model.IntegrationMetadataCreate;
import org.openapitools.model.IntegrationMetadataUpdate;
import org.openapitools.model.IntegrationRecord;
import org.openapitools.model.IntegrationsGetList200Response;
import org.openapitools.model.PinterestLibError;
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
 * API tests for IntegrationsController
 */
@MicronautTest
public class IntegrationsControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    IntegrationsController controller;

    /**
     * This test is used to validate the implementation of integrationsCommerceDel() method
     *
     * The method should: Delete commerce integration
     *
     * Delete commerce integration metadata for the given external business ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void integrationsCommerceDelMethodTest() {
        // given
        String externalBusinessId = "example";

        // when
        IntegrationMetadata result = controller.integrationsCommerceDel(externalBusinessId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/integrations/commerce/{external_business_id}' to the features of integrationsCommerceDel() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void integrationsCommerceDelClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/integrations/commerce/{external_business_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("external_business_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.DELETE(uri)
            .accept("[Ljava.lang.String;@44246f75");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, IntegrationMetadata.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of integrationsCommerceGet() method
     *
     * The method should: Get commerce integration
     *
     * Get commerce integration metadata associated with the given external business ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void integrationsCommerceGetMethodTest() {
        // given
        String externalBusinessId = "example";

        // when
        IntegrationMetadata result = controller.integrationsCommerceGet(externalBusinessId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/integrations/commerce/{external_business_id}' to the features of integrationsCommerceGet() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void integrationsCommerceGetClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/integrations/commerce/{external_business_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("external_business_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@48369cd2");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, IntegrationMetadata.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of integrationsCommercePatch() method
     *
     * The method should: Update commerce integration
     *
     * Update commerce integration metadata for the given external business ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void integrationsCommercePatchMethodTest() {
        // given
        String externalBusinessId = "example";
        IntegrationMetadataUpdate integrationMetadataUpdate = new IntegrationMetadataUpdate();

        // when
        IntegrationMetadata result = controller.integrationsCommercePatch(externalBusinessId, integrationMetadataUpdate).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/integrations/commerce/{external_business_id}' to the features of integrationsCommercePatch() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void integrationsCommercePatchClientApiTest() throws IOException {
        // given
        IntegrationMetadataUpdate body = new IntegrationMetadataUpdate();
        String uri = UriTemplate.of("/integrations/commerce/{external_business_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("external_business_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.PATCH(uri, body)
            .accept("[Ljava.lang.String;@5bbe0b1a");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, IntegrationMetadata.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of integrationsCommercePost() method
     *
     * The method should: Create commerce integration
     *
     * Create commerce integration metadata to link an external business ID with a Pinterest merchant &amp; ad account. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void integrationsCommercePostMethodTest() {
        // given
        IntegrationMetadataCreate integrationMetadataCreate = new IntegrationMetadataCreate();

        // when
        IntegrationMetadata result = controller.integrationsCommercePost(integrationMetadataCreate).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/integrations/commerce' to the features of integrationsCommercePost() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void integrationsCommercePostClientApiTest() throws IOException {
        // given
        IntegrationMetadataCreate body = new IntegrationMetadataCreate();
        String uri = UriTemplate.of("/integrations/commerce").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@108f3f68");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, IntegrationMetadata.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of integrationsGetById() method
     *
     * The method should: Get integration metadata
     *
     * Get integration metadata by ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void integrationsGetByIdMethodTest() {
        // given
        String id = "example";

        // when
        IntegrationRecord result = controller.integrationsGetById(id).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/integrations/{id}' to the features of integrationsGetById() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void integrationsGetByIdClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/integrations/{id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@77b7a5cb");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, IntegrationRecord.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of integrationsGetList() method
     *
     * The method should: Get integration metadata list
     *
     * Get integration metadata list. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void integrationsGetListMethodTest() {
        // given
        String bookmark = "example";
        Integer pageSize = 25;

        // when
        IntegrationsGetList200Response result = controller.integrationsGetList(bookmark, pageSize).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/integrations' to the features of integrationsGetList() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void integrationsGetListClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/integrations").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@b9b77e3");
        request.getParameters()
            .add("bookmark", "example") // The query parameter format should be 
            .add("page_size", String.valueOf(25)); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, IntegrationsGetList200Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of integrationsLogsPost() method
     *
     * The method should: Receives batched logs from integration applications.
     *
     * This endpoint receives batched logs from integration applications on partner platforms. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void integrationsLogsPostMethodTest() {
        // given
        IntegrationLogsRequestCreate integrationLogsRequestCreate = new IntegrationLogsRequestCreate(Arrays.asList());

        // when
        IntegrationLogsSuccessResponse result = controller.integrationsLogsPost(integrationLogsRequestCreate).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/integrations/logs' to the features of integrationsLogsPost() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void integrationsLogsPostClientApiTest() throws IOException {
        // given
        IntegrationLogsRequestCreate body = new IntegrationLogsRequestCreate(Arrays.asList());
        String uri = UriTemplate.of("/integrations/logs").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@20d65b51");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, IntegrationLogsSuccessResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
