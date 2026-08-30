package org.openapitools.api;

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
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import jakarta.inject.Inject;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;

/**
 * API tests for SchedulesApi
 */
@MicronautTest
public class SchedulesApiTest {

    @Inject
    SchedulesApi api;

    
    /**
     * Create schedules
     *
     * Batch create schedules
     */
    @Test
    @Disabled("Not Implemented")
    public void schedulesCreateTest() {
        // given
        String adAccountId = "example";
        List<@Valid ScheduleCreate> scheduleCreate = Arrays.asList();

        // when
        List<SchedulesCreate200ResponseInner> body = api.schedulesCreate(adAccountId, scheduleCreate).block();

        // then
        // TODO implement the schedulesCreateTest()
    }

    
    /**
     * Get Schedules
     *
     * Get schedules for a specific advertiser
     */
    @Test
    @Disabled("Not Implemented")
    public void schedulesListTest() {
        // given
        String adAccountId = "example";
        List<@Pattern(regexp = "^\\d+$")String> entityIds = Arrays.asList("example");
        String bookmark = "example";
        Integer pageSize = 25;
        PinterestLibPaginationOrder order = PinterestLibPaginationOrder.fromValue("ASCENDING");
        List<ScheduleStatus> scheduleStatuses = Arrays.asList();
        ScheduleType scheduleType = ScheduleType.fromValue("CAMPAIGN_BUDGET_CHANGE");

        // when
        SchedulesList200Response body = api.schedulesList(adAccountId, entityIds, bookmark, pageSize, order, scheduleStatuses, scheduleType).block();

        // then
        // TODO implement the schedulesListTest()
    }

    
    /**
     * Update schedules
     *
     * Update one or more schedules
     */
    @Test
    @Disabled("Not Implemented")
    public void schedulesUpdateTest() {
        // given
        String adAccountId = "example";
        List<@Valid ScheduleBatchUpdate> scheduleBatchUpdate = Arrays.asList();

        // when
        List<SchedulesCreate200ResponseInner> body = api.schedulesUpdate(adAccountId, scheduleBatchUpdate).block();

        // then
        // TODO implement the schedulesUpdateTest()
    }

    
}
