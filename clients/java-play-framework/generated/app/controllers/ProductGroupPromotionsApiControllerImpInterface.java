package controllers;

import apimodels.Error;
import apimodels.Granularity;
import java.time.LocalDate;
import apimodels.ProductGroupAnalyticsResponseInner;
import apimodels.ProductGroupPromotionCreateRequest;
import apimodels.ProductGroupPromotionResponse;
import apimodels.ProductGroupPromotionUpdateRequest;
import apimodels.ProductGroupPromotionsList200Response;

import com.google.inject.Inject;
import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import play.mvc.Result;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import openapitools.OpenAPIUtils;
import openapitools.SecurityAPIUtils;
import static play.mvc.Results.ok;
import static play.mvc.Results.unauthorized;
import play.libs.Files.TemporaryFile;

import javax.validation.constraints.*;
import javax.validation.Valid;

@SuppressWarnings("RedundantThrows")
public abstract class ProductGroupPromotionsApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result productGroupPromotionsCreateHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, ProductGroupPromotionCreateRequest productGroupPromotionCreateRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        ProductGroupPromotionResponse obj = productGroupPromotionsCreate(request, adAccountId, productGroupPromotionCreateRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ProductGroupPromotionResponse productGroupPromotionsCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, ProductGroupPromotionCreateRequest productGroupPromotionCreateRequest) throws Exception;

    public Result productGroupPromotionsGetHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Pattern(regexp="^\\d+$") @Size(max=18)String productGroupPromotionId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        ProductGroupPromotionResponse obj = productGroupPromotionsGet(request, adAccountId, productGroupPromotionId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ProductGroupPromotionResponse productGroupPromotionsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Pattern(regexp="^\\d+$") @Size(max=18)String productGroupPromotionId) throws Exception;

    public Result productGroupPromotionsListHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Size(min=1,max=100)List<@Pattern(regexp = "^\\d+$")String> productGroupPromotionIds, List<String> entityStatuses,  @Pattern(regexp="^\\d+$") @Size(max=18)String adGroupId,  @Min(1) @Max(250)Integer pageSize, String order, String bookmark) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        ProductGroupPromotionsList200Response obj = productGroupPromotionsList(request, adAccountId, productGroupPromotionIds, entityStatuses, adGroupId, pageSize, order, bookmark);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ProductGroupPromotionsList200Response productGroupPromotionsList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Size(min=1,max=100)List<@Pattern(regexp = "^\\d+$")String> productGroupPromotionIds, List<String> entityStatuses,  @Pattern(regexp="^\\d+$") @Size(max=18)String adGroupId,  @Min(1) @Max(250)Integer pageSize, String order, String bookmark) throws Exception;

    public Result productGroupPromotionsUpdateHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, ProductGroupPromotionUpdateRequest productGroupPromotionUpdateRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        ProductGroupPromotionResponse obj = productGroupPromotionsUpdate(request, adAccountId, productGroupPromotionUpdateRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ProductGroupPromotionResponse productGroupPromotionsUpdate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, ProductGroupPromotionUpdateRequest productGroupPromotionUpdateRequest) throws Exception;

    public Result productGroupsAnalyticsHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull  @Size(min=1,max=100)List<@Pattern(regexp = "^\\d+$")String> productGroupIds, @NotNull List<String> columns, @NotNull Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        List<ProductGroupAnalyticsResponseInner> obj = productGroupsAnalytics(request, adAccountId, startDate, endDate, productGroupIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (ProductGroupAnalyticsResponseInner curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<ProductGroupAnalyticsResponseInner> productGroupsAnalytics(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull  @Size(min=1,max=100)List<@Pattern(regexp = "^\\d+$")String> productGroupIds, @NotNull List<String> columns, @NotNull Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime) throws Exception;

}
