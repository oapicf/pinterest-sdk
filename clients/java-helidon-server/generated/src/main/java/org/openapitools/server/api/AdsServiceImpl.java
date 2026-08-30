package org.openapitools.server.api;

import org.openapitools.server.model.Ad;
import org.openapitools.server.model.AdBatchUpdate;
import org.openapitools.server.model.AdBatchWriteResponseModel;
import org.openapitools.server.model.AdCreate;
import org.openapitools.server.model.AdPreviewRequest;
import org.openapitools.server.model.AdPreviewURLResponse;
import org.openapitools.server.model.AdsAnalytics;
import org.openapitools.server.model.AdsAnalyticsAdTargetingType;
import org.openapitools.server.model.AdsList200Response;
import java.math.BigDecimal;
import org.openapitools.server.model.CampaignAdPreview;
import org.openapitools.server.model.CampaignAdPreviewCreate;
import org.openapitools.server.model.CampaignAdPreviewCreate200ResponseInner;
import org.openapitools.server.model.CampaignAdPreviewDelete200ResponseInner;
import java.util.stream.Collectors;
import org.openapitools.server.model.ConversionAttributionWindowDays;
import org.openapitools.server.model.ConversionReportAttributionType;
import org.openapitools.server.model.ConversionReportTimeType;
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

public class AdsServiceImpl implements AdsService {
    private static final ObjectMapper MAPPER = JsonProvider.objectMapper();


    @Override
    public void adPreviewsCreate(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void adTargetingAnalyticsGet(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void adsAnalytics(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void adsCreate(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void adsGet(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void adsList(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void adsUpdate(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void campaignAdPreviewCreate(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void campaignAdPreviewDelete(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void campaignAdPreviewRead(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }


    @Override
    public void afterStop() {
        System.out.println("Service AdsService is down. Goodbye!");
    }

}
