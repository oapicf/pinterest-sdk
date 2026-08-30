package org.openapitools.controller;

import org.openapitools.model.PinterestLibError;
import org.openapitools.model.PinterestLibPaginationOrder;
import org.openapitools.model.Schedule;
import org.openapitools.model.ScheduleBatchUpdate;
import org.openapitools.model.ScheduleCreate;
import org.openapitools.model.ScheduleStatus;
import org.openapitools.model.ScheduleType;
import org.openapitools.model.SchedulesCreate200ResponseInner;
import org.openapitools.model.SchedulesList200Response;
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
 * API tests for SchedulesController
 */
@MicronautTest
public class SchedulesControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    SchedulesController controller;

    /**
     * This test is used to validate the implementation of schedulesCreate() method
     *
     * The method should: Create schedules
     *
     * Batch create schedules
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void schedulesCreateMethodTest() {
        // given
        String adAccountId = "example";
        List<@Valid ScheduleCreate> scheduleCreate = Arrays.asList();

        // when
        List<SchedulesCreate200ResponseInner> result = controller.schedulesCreate(adAccountId, scheduleCreate).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/schedules' to the features of schedulesCreate() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void schedulesCreateClientApiTest() throws IOException {
        // given
        List<@Valid ScheduleCreate> body = Arrays.asList();
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/schedules").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@d28fe12");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, Argument.of(List.class, SchedulesCreate200ResponseInner.class));

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of schedulesList() method
     *
     * The method should: Get Schedules
     *
     * Get schedules for a specific advertiser
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void schedulesListMethodTest() {
        // given
        String adAccountId = "example";
        List<@Pattern(regexp = "^\\d+$")String> entityIds = Arrays.asList("example");
        String bookmark = "example";
        Integer pageSize = 25;
        PinterestLibPaginationOrder order = PinterestLibPaginationOrder.fromValue("ASCENDING");
        List<ScheduleStatus> scheduleStatuses = Arrays.asList();
        ScheduleType scheduleType = ScheduleType.fromValue("CAMPAIGN_BUDGET_CHANGE");

        // when
        SchedulesList200Response result = controller.schedulesList(adAccountId, entityIds, bookmark, pageSize, order, scheduleStatuses, scheduleType).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/schedules' to the features of schedulesList() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void schedulesListClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/schedules").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@101f98d0");
        request.getParameters()
            .add("bookmark", "example") // The query parameter format should be 
            .add("page_size", String.valueOf(25)) // The query parameter format should be 
            .add("order", String.valueOf(PinterestLibPaginationOrder.fromValue("ASCENDING"))) // The query parameter format should be 
            .add("schedule_statuses", Arrays.asList()) // The query format should be multi
            .add("schedule_type", String.valueOf(ScheduleType.fromValue("CAMPAIGN_BUDGET_CHANGE"))) // The query parameter format should be 
            .add("entity_ids", Arrays.asList("example")); // The query format should be multi

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, SchedulesList200Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of schedulesUpdate() method
     *
     * The method should: Update schedules
     *
     * Update one or more schedules
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void schedulesUpdateMethodTest() {
        // given
        String adAccountId = "example";
        List<@Valid ScheduleBatchUpdate> scheduleBatchUpdate = Arrays.asList();

        // when
        List<SchedulesCreate200ResponseInner> result = controller.schedulesUpdate(adAccountId, scheduleBatchUpdate).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/schedules' to the features of schedulesUpdate() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void schedulesUpdateClientApiTest() throws IOException {
        // given
        List<@Valid ScheduleBatchUpdate> body = Arrays.asList();
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/schedules").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.PATCH(uri, body)
            .accept("[Ljava.lang.String;@72b6753d");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, Argument.of(List.class, SchedulesCreate200ResponseInner.class));

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
