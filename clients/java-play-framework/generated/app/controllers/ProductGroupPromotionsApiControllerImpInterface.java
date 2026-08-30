package controllers;

import java.math.BigDecimal;
import apimodels.EntityStatus;
import apimodels.Granularity;
import java.time.LocalDate;
import apimodels.PinterestLibError;
import apimodels.PinterestLibPaginationOrder;
import apimodels.ProductGroupAnalyticsItems;
import apimodels.ProductGroupPromotion;
import apimodels.ProductGroupPromotions;
import apimodels.ProductGroupPromotionsCreate;
import apimodels.ProductGroupPromotionsList200Response;
import apimodels.ProductGroupPromotionsUpdateWithRequiredBody;
import apimodels.ReportingColumnSync;
import apimodels.ReportingTimeZone;

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

    public Result productGroupPromotionsCreateHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, ProductGroupPromotionsCreate productGroupPromotionsCreate) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        ProductGroupPromotions obj = productGroupPromotionsCreate(request, adAccountId, productGroupPromotionsCreate);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ProductGroupPromotions productGroupPromotionsCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, ProductGroupPromotionsCreate productGroupPromotionsCreate) throws Exception;

    public Result productGroupPromotionsGetHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Pattern(regexp="^\\d+$") @Size(max=18)String productGroupPromotionId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        ProductGroupPromotion obj = productGroupPromotionsGet(request, adAccountId, productGroupPromotionId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ProductGroupPromotion productGroupPromotionsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Pattern(regexp="^\\d+$") @Size(max=18)String productGroupPromotionId) throws Exception;

    public Result productGroupPromotionsListHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark,  @Min(1) @Max(250)Integer pageSize, PinterestLibPaginationOrder order,  @Size(min=1,max=250)List<@Pattern(regexp = "^\\d+$")String> productGroupPromotionIds, List<EntityStatus> entityStatuses,  @Pattern(regexp="^\\d+$") @Size(max=18)String adGroupId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        ProductGroupPromotionsList200Response obj = productGroupPromotionsList(request, adAccountId, bookmark, pageSize, order, productGroupPromotionIds, entityStatuses, adGroupId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ProductGroupPromotionsList200Response productGroupPromotionsList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark,  @Min(1) @Max(250)Integer pageSize, PinterestLibPaginationOrder order,  @Size(min=1,max=250)List<@Pattern(regexp = "^\\d+$")String> productGroupPromotionIds, List<EntityStatus> entityStatuses,  @Pattern(regexp="^\\d+$") @Size(max=18)String adGroupId) throws Exception;

    public Result productGroupPromotionsUpdateHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, ProductGroupPromotionsUpdateWithRequiredBody productGroupPromotionsUpdateWithRequiredBody) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        ProductGroupPromotions obj = productGroupPromotionsUpdate(request, adAccountId, productGroupPromotionsUpdateWithRequiredBody);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ProductGroupPromotions productGroupPromotionsUpdate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, ProductGroupPromotionsUpdateWithRequiredBody productGroupPromotionsUpdateWithRequiredBody) throws Exception;

    public Result productGroupsAnalyticsHttp(Http.Request request, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull  @Size(min=1,max=250)List<@Pattern(regexp = "^\\d+$")String> productGroupIds, @NotNull List<ReportingColumnSync> columns, @NotNull Granularity granularity,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, BigDecimal clickWindowDays, BigDecimal engagementWindowDays, BigDecimal viewWindowDays, String conversionReportTime, ReportingTimeZone reportingTimezone) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        List<ProductGroupAnalyticsItems> obj = productGroupsAnalytics(request, startDate, endDate, productGroupIds, columns, granularity, adAccountId, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, reportingTimezone);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (ProductGroupAnalyticsItems curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<ProductGroupAnalyticsItems> productGroupsAnalytics(Http.Request request, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull  @Size(min=1,max=250)List<@Pattern(regexp = "^\\d+$")String> productGroupIds, @NotNull List<ReportingColumnSync> columns, @NotNull Granularity granularity,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, BigDecimal clickWindowDays, BigDecimal engagementWindowDays, BigDecimal viewWindowDays, String conversionReportTime, ReportingTimeZone reportingTimezone) throws Exception;

}
