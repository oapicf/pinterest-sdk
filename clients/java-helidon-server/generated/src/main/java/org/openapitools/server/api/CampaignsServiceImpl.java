package org.openapitools.server.api;

import org.openapitools.server.model.AdPinAnalytics;
import org.openapitools.server.model.AdsAnalyticsCampaignTargetingType;
import java.math.BigDecimal;
import org.openapitools.server.model.Campaign;
import org.openapitools.server.model.CampaignBatchUpdateItem;
import org.openapitools.server.model.CampaignBatchWriteResponseModel;
import org.openapitools.server.model.CampaignCreateItem;
import org.openapitools.server.model.CampaignDeliveryEstimatesCampaign;
import org.openapitools.server.model.CampaignDeliveryEstimatesResponse;
import org.openapitools.server.model.CampaignsAnalyticsMetrics;
import org.openapitools.server.model.CampaignsList200Response;
import java.util.stream.Collectors;
import org.openapitools.server.model.ConversionReportAttributionType;
import org.openapitools.server.model.EntityStatus;
import org.openapitools.server.model.GenericTypes;
import org.openapitools.server.model.Granularity;
import java.util.HexFormat;
import java.util.List;
import java.time.LocalDate;
import org.openapitools.server.model.MetricsResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import org.openapitools.server.model.PinterestLibError;
import org.openapitools.server.model.PinterestLibPaginationOrder;
import org.openapitools.server.model.ReportingColumnSync;
import org.openapitools.server.model.ReportingTimeZone;
import io.helidon.http.Status;
import jakarta.validation.Valid;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;

public class CampaignsServiceImpl implements CampaignsService {
    private static final ObjectMapper MAPPER = JsonProvider.objectMapper();


    @Override
    public void adPinsAnalytics(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void campaignTargetingAnalyticsGet(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void campaignsAnalytics(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void campaignsCreate(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void campaignsGet(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void campaignsList(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void campaignsUpdate(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getCampaignDeliveryEstimates(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }


    @Override
    public void afterStop() {
        System.out.println("Service CampaignsService is down. Goodbye!");
    }

}
