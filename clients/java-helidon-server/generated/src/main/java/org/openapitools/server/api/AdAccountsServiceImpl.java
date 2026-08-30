package org.openapitools.server.api;

import org.openapitools.server.model.AdAccount;
import org.openapitools.server.model.AdAccountAnalyticsItems;
import org.openapitools.server.model.AdAccountCreate;
import org.openapitools.server.model.AdAccountsList200Response;
import org.openapitools.server.model.AdsAnalyticsAccountTargetingType;
import org.openapitools.server.model.AdsAnalyticsCreateAsyncRequest;
import org.openapitools.server.model.AdsAnalyticsCreateAsyncResponse;
import org.openapitools.server.model.AdsAnalyticsGetAsyncResponse;
import java.math.BigDecimal;
import java.util.stream.Collectors;
import org.openapitools.server.model.ConversionProductReport;
import org.openapitools.server.model.ConversionProductReportCreate;
import org.openapitools.server.model.ConversionReportAttributionType;
import org.openapitools.server.model.Granularity;
import java.util.HexFormat;
import java.util.List;
import java.time.LocalDate;
import org.openapitools.server.model.MMMReport;
import org.openapitools.server.model.MMMReportCreate;
import org.openapitools.server.model.MetricsResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import org.openapitools.server.model.PinterestLibError;
import org.openapitools.server.model.PinterestLibPaginationOrder;
import org.openapitools.server.model.ReportingColumnSync;
import org.openapitools.server.model.ReportingTimeZone;
import io.helidon.http.Status;
import org.openapitools.server.model.TemplateBasedReport;
import org.openapitools.server.model.TemplatesList200Response;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;

public class AdAccountsServiceImpl implements AdAccountsService {
    private static final ObjectMapper MAPPER = JsonProvider.objectMapper();


    @Override
    public void adAccountAnalytics(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void adAccountTargetingAnalyticsGet(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void adAccountsCreate(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void adAccountsGet(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void adAccountsList(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void analyticsCreateConversionProductReport(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void analyticsCreateMmmReport(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void analyticsCreateReport(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void analyticsCreateTemplateReport(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void analyticsGetConversionProductReport(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void analyticsGetMmmReport(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void analyticsGetReport(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void sandboxDelete(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void templatesList(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }


    @Override
    public void afterStop() {
        System.out.println("Service AdAccountsService is down. Goodbye!");
    }

}
