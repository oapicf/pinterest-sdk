package org.openapitools.controller;

import org.openapitools.model.LabelCreateRequest;
import org.openapitools.model.LabelUpdateRequest;
import org.openapitools.model.LabeledEntities;
import org.openapitools.model.LabeledEntitiesCreate;
import org.openapitools.model.LabelsList200Response;
import org.openapitools.model.LabelsResponse;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.QueryLabelEntityStatusesItems;
import org.openapitools.model.QueryLabelTypesItems;
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
 * API tests for LabelsController
 */
@MicronautTest
public class LabelsControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    LabelsController controller;

    /**
     * This test is used to validate the implementation of labelsApply() method
     *
     * The method should: Apply label to entity
     *
     *   [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Apply a label to one or more campaigns.   Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/) in addition to campaigns.   Currently, you can apply **brand** and **custom** labels. Future releases will provide more options.    **Note:** You can only apply one brand label to a campaign. You can apply up to 30 custom labels to a campaign.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void labelsApplyMethodTest() {
        // given
        String adAccountId = "example";
        String labelId = "example";
        LabeledEntitiesCreate labeledEntitiesCreate = new LabeledEntitiesCreate(Arrays.asList("example"));

        // when
        LabeledEntities result = controller.labelsApply(adAccountId, labelId, labeledEntitiesCreate).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/labels/{label_id}/apply' to the features of labelsApply() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void labelsApplyClientApiTest() throws IOException {
        // given
        LabeledEntitiesCreate body = new LabeledEntitiesCreate(Arrays.asList("example"));
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/labels/{label_id}/apply").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
            put("label_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@646c24f0");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, LabeledEntities.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of labelsCreate() method
     *
     * The method should: Create labels
     *
     * [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Apply one or more labels to a campaign. Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/). Currently, you can apply brand and custom labels. Future releases will provide more options.  **Note:** You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void labelsCreateMethodTest() {
        // given
        String adAccountId = "example";
        LabelCreateRequest labelCreateRequest = new LabelCreateRequest(Arrays.asList());

        // when
        LabelsResponse result = controller.labelsCreate(adAccountId, labelCreateRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/labels' to the features of labelsCreate() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void labelsCreateClientApiTest() throws IOException {
        // given
        LabelCreateRequest body = new LabelCreateRequest(Arrays.asList());
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/labels").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@4eea7648");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, LabelsResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of labelsList() method
     *
     * The method should: List labels
     *
     * [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  See a list of labels for assets that your account owns, and filter the list by different criteria. If no filter is provided, it will default to labels associated with the ad account id.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void labelsListMethodTest() {
        // given
        String adAccountId = "example";
        List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds = Arrays.asList("example");
        List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> labelIds = Arrays.asList("example");
        List<QueryLabelEntityStatusesItems> entityStatuses = Arrays.asList();
        List<QueryLabelTypesItems> labelTypes = Arrays.asList();
        String bookmark = "example";
        Integer pageSize = 25;

        // when
        LabelsList200Response result = controller.labelsList(adAccountId, campaignIds, labelIds, entityStatuses, labelTypes, bookmark, pageSize).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/labels' to the features of labelsList() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void labelsListClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/labels").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@d23fb70");
        request.getParameters()
            .add("campaign_ids", Arrays.asList("example")) // The query format should be multi
            .add("label_ids", Arrays.asList("example")) // The query format should be multi
            .add("entity_statuses", Arrays.asList()) // The query format should be multi
            .add("label_types", Arrays.asList()) // The query format should be multi
            .add("bookmark", "example") // The query parameter format should be 
            .add("page_size", String.valueOf(25)); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, LabelsList200Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of labelsRemove() method
     *
     * The method should: Remove label from entities
     *
     *   [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Remove a label from one or more entities.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void labelsRemoveMethodTest() {
        // given
        String adAccountId = "example";
        String labelId = "example";
        LabeledEntitiesCreate labeledEntitiesCreate = new LabeledEntitiesCreate(Arrays.asList("example"));

        // when
        LabeledEntities result = controller.labelsRemove(adAccountId, labelId, labeledEntitiesCreate).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/labels/{label_id}/remove' to the features of labelsRemove() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void labelsRemoveClientApiTest() throws IOException {
        // given
        LabeledEntitiesCreate body = new LabeledEntitiesCreate(Arrays.asList("example"));
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/labels/{label_id}/remove").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
            put("label_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@44a1f46b");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, LabeledEntities.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of labelsUpdate() method
     *
     * The method should: Update labels
     *
     * [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Change the properties of one or more labels.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void labelsUpdateMethodTest() {
        // given
        String adAccountId = "example";
        LabelUpdateRequest labelUpdateRequest = new LabelUpdateRequest(Arrays.asList());

        // when
        LabelsResponse result = controller.labelsUpdate(adAccountId, labelUpdateRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/labels' to the features of labelsUpdate() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void labelsUpdateClientApiTest() throws IOException {
        // given
        LabelUpdateRequest body = new LabelUpdateRequest(Arrays.asList());
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/labels").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.PATCH(uri, body)
            .accept("[Ljava.lang.String;@41ef13ab");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, LabelsResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
