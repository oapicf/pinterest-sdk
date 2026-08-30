package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.PinterestLibError;
import org.openapitools.vertxweb.server.model.PinterestLibPaginationOrder;
import org.openapitools.vertxweb.server.model.Schedule;
import org.openapitools.vertxweb.server.model.ScheduleBatchUpdate;
import org.openapitools.vertxweb.server.model.ScheduleCreate;
import org.openapitools.vertxweb.server.model.ScheduleStatus;
import org.openapitools.vertxweb.server.model.ScheduleType;
import org.openapitools.vertxweb.server.model.SchedulesCreate200ResponseInner;
import org.openapitools.vertxweb.server.model.SchedulesList200Response;

import com.fasterxml.jackson.core.type.TypeReference;
import io.vertx.core.json.jackson.DatabindCodec;
import io.vertx.ext.web.openapi.RouterBuilder;
import io.vertx.ext.web.validation.RequestParameters;
import io.vertx.ext.web.validation.RequestParameter;
import io.vertx.ext.web.validation.ValidationHandler;
import io.vertx.ext.web.RoutingContext;
import io.vertx.core.json.JsonObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

public class SchedulesApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(SchedulesApiHandler.class);

    private final SchedulesApi api;

    public SchedulesApiHandler(SchedulesApi api) {
        this.api = api;
    }

    @Deprecated
    public SchedulesApiHandler() {
        this(new SchedulesApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("schedulesCreate").handler(this::schedulesCreate);
        builder.operation("schedulesList").handler(this::schedulesList);
        builder.operation("schedulesUpdate").handler(this::schedulesUpdate);
    }

    private void schedulesCreate(RoutingContext routingContext) {
        logger.info("schedulesCreate()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        RequestParameter body = requestParameters.body();
        List<ScheduleCreate> scheduleCreate = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<List<ScheduleCreate>>(){}) : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter scheduleCreate is {}", scheduleCreate);

        api.schedulesCreate(adAccountId, scheduleCreate)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void schedulesList(RoutingContext routingContext) {
        logger.info("schedulesList()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        List<String> entityIds = requestParameters.queryParameter("entity_ids") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("entity_ids").get(), new TypeReference<List<String>>(){}) : null;
        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : 25;
        PinterestLibPaginationOrder order = requestParameters.queryParameter("order") != null ? requestParameters.queryParameter("order").getPinterestLibPaginationOrder() : null;
        List<ScheduleStatus> scheduleStatuses = requestParameters.queryParameter("schedule_statuses") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("schedule_statuses").get(), new TypeReference<List<ScheduleStatus>>(){}) : null;
        ScheduleType scheduleType = requestParameters.queryParameter("schedule_type") != null ? requestParameters.queryParameter("schedule_type").getScheduleType() : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter entityIds is {}", entityIds);
        logger.debug("Parameter bookmark is {}", bookmark);
        logger.debug("Parameter pageSize is {}", pageSize);
        logger.debug("Parameter order is {}", order);
        logger.debug("Parameter scheduleStatuses is {}", scheduleStatuses);
        logger.debug("Parameter scheduleType is {}", scheduleType);

        api.schedulesList(adAccountId, entityIds, bookmark, pageSize, order, scheduleStatuses, scheduleType)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void schedulesUpdate(RoutingContext routingContext) {
        logger.info("schedulesUpdate()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String adAccountId = requestParameters.pathParameter("ad_account_id") != null ? requestParameters.pathParameter("ad_account_id").getString() : null;
        RequestParameter body = requestParameters.body();
        List<ScheduleBatchUpdate> scheduleBatchUpdate = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<List<ScheduleBatchUpdate>>(){}) : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter scheduleBatchUpdate is {}", scheduleBatchUpdate);

        api.schedulesUpdate(adAccountId, scheduleBatchUpdate)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

}
