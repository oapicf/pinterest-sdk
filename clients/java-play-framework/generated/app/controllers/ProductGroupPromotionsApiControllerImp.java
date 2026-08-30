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

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ProductGroupPromotionsApiControllerImp extends ProductGroupPromotionsApiControllerImpInterface {
    @Override
    public ProductGroupPromotions productGroupPromotionsCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, ProductGroupPromotionsCreate productGroupPromotionsCreate) throws Exception {
        //Do your magic!!!
        return new ProductGroupPromotions();
    }

    @Override
    public ProductGroupPromotion productGroupPromotionsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Pattern(regexp="^\\d+$") @Size(max=18)String productGroupPromotionId) throws Exception {
        //Do your magic!!!
        return new ProductGroupPromotion();
    }

    @Override
    public ProductGroupPromotionsList200Response productGroupPromotionsList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark,  @Min(1) @Max(250)Integer pageSize, PinterestLibPaginationOrder order,  @Size(min=1,max=250)List<@Pattern(regexp = "^\\d+$")String> productGroupPromotionIds, List<EntityStatus> entityStatuses,  @Pattern(regexp="^\\d+$") @Size(max=18)String adGroupId) throws Exception {
        //Do your magic!!!
        return new ProductGroupPromotionsList200Response();
    }

    @Override
    public ProductGroupPromotions productGroupPromotionsUpdate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, ProductGroupPromotionsUpdateWithRequiredBody productGroupPromotionsUpdateWithRequiredBody) throws Exception {
        //Do your magic!!!
        return new ProductGroupPromotions();
    }

    @Override
    public List<ProductGroupAnalyticsItems> productGroupsAnalytics(Http.Request request, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull  @Size(min=1,max=250)List<@Pattern(regexp = "^\\d+$")String> productGroupIds, @NotNull List<ReportingColumnSync> columns, @NotNull Granularity granularity,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, BigDecimal clickWindowDays, BigDecimal engagementWindowDays, BigDecimal viewWindowDays, String conversionReportTime, ReportingTimeZone reportingTimezone) throws Exception {
        //Do your magic!!!
        return new ArrayList<ProductGroupAnalyticsItems>();
    }

}
