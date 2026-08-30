package org.openapitools.server.api;

import org.openapitools.server.model.AdGroup;
import org.openapitools.server.model.AdGroupAudienceSizing;
import org.openapitools.server.model.AdGroupAudienceSizingCreate;
import org.openapitools.server.model.AdGroupCreateCreate;
import org.openapitools.server.model.AdGroupUpdateBatchUpdate;
import org.openapitools.server.model.AdGroupsAnalyticsMetrics;
import org.openapitools.server.model.AdGroupsCreate200Response;
import org.openapitools.server.model.AdGroupsList200Response;
import org.openapitools.server.model.AdsAnalyticsAdGroupTargetingType;
import org.openapitools.server.model.BidFloor;
import org.openapitools.server.model.BidFloorCreate;
import java.math.BigDecimal;
import java.util.stream.Collectors;
import org.openapitools.server.model.ConversionReportAttributionType;
import org.openapitools.server.model.DynamicTitlesDownloadCSV;
import org.openapitools.server.model.DynamicTitlesGetStatus;
import org.openapitools.server.model.DynamicTitlesProcessCSV;
import org.openapitools.server.model.DynamicTitlesProcessCSVCreate;
import org.openapitools.server.model.DynamicTitlesUploadURL;
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

public class AdGroupsServiceImpl implements AdGroupsService {
    private static final ObjectMapper MAPPER = JsonProvider.objectMapper();


    @Override
    public void adGroupsAnalytics(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void adGroupsAudienceSizing(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void adGroupsBidFloorGet(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void adGroupsCreate(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void adGroupsDynamicTitlesDownloadCsv(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void adGroupsDynamicTitlesGetStatus(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void adGroupsDynamicTitlesGetUploadUrl(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void adGroupsDynamicTitlesProcessCsv(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void adGroupsGet(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void adGroupsList(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void adGroupsTargetingAnalyticsGet(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void adGroupsUpdate(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void getAdGroupsByPromotionIdsList(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }


    @Override
    public void afterStop() {
        System.out.println("Service AdGroupsService is down. Goodbye!");
    }

}
