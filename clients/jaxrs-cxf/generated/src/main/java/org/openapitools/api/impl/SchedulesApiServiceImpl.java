package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.PinterestLibPaginationOrder;
import org.openapitools.model.Schedule;
import org.openapitools.model.ScheduleBatchUpdate;
import org.openapitools.model.ScheduleCreate;
import org.openapitools.model.ScheduleStatus;
import org.openapitools.model.ScheduleType;
import org.openapitools.model.SchedulesCreate200ResponseInner;
import org.openapitools.model.SchedulesList200Response;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;


/**
 * Pinterest REST API
 *
 * <p>Pinterest's REST API
 *
 */
public class SchedulesApiServiceImpl implements SchedulesApi {
    /**
     * Create schedules
     *
     * Batch create schedules
     *
     */
    public List<SchedulesCreate200ResponseInner> schedulesCreate(String adAccountId, List<@Valid ScheduleCreate> scheduleCreate) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Schedules
     *
     * Get schedules for a specific advertiser
     *
     */
    public SchedulesList200Response schedulesList(String adAccountId, List<@Pattern(regexp = "^\\d+$")String> entityIds, String bookmark, Integer pageSize, PinterestLibPaginationOrder order, List<ScheduleStatus> scheduleStatuses, ScheduleType scheduleType) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update schedules
     *
     * Update one or more schedules
     *
     */
    public List<SchedulesCreate200ResponseInner> schedulesUpdate(String adAccountId, List<@Valid ScheduleBatchUpdate> scheduleBatchUpdate) {
        // TODO: Implement...

        return null;
    }

}
