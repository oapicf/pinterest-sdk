package controllers;

import apimodels.Error;
import apimodels.Granularity;
import java.time.LocalDate;
import apimodels.ProductGroupAnalyticsResponseInner;
import apimodels.ProductGroupPromotionCreateRequest;
import apimodels.ProductGroupPromotionResponse;
import apimodels.ProductGroupPromotionUpdateRequest;
import apimodels.ProductGroupPromotionsList200Response;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ProductGroupPromotionsApiControllerImp extends ProductGroupPromotionsApiControllerImpInterface {
    @Override
    public ProductGroupPromotionResponse productGroupPromotionsCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, ProductGroupPromotionCreateRequest productGroupPromotionCreateRequest) throws Exception {
        //Do your magic!!!
        return new ProductGroupPromotionResponse();
    }

    @Override
    public ProductGroupPromotionResponse productGroupPromotionsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Pattern(regexp="^\\d+$") @Size(max=18)String productGroupPromotionId) throws Exception {
        //Do your magic!!!
        return new ProductGroupPromotionResponse();
    }

    @Override
    public ProductGroupPromotionsList200Response productGroupPromotionsList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Size(min=1,max=100)List<@Pattern(regexp = "^\\d+$")String> productGroupPromotionIds, List<String> entityStatuses,  @Pattern(regexp="^\\d+$") @Size(max=18)String adGroupId,  @Min(1) @Max(250)Integer pageSize, String order, String bookmark) throws Exception {
        //Do your magic!!!
        return new ProductGroupPromotionsList200Response();
    }

    @Override
    public ProductGroupPromotionResponse productGroupPromotionsUpdate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, ProductGroupPromotionUpdateRequest productGroupPromotionUpdateRequest) throws Exception {
        //Do your magic!!!
        return new ProductGroupPromotionResponse();
    }

    @Override
    public List<ProductGroupAnalyticsResponseInner> productGroupsAnalytics(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull  @Size(min=1,max=100)List<@Pattern(regexp = "^\\d+$")String> productGroupIds, @NotNull List<String> columns, @NotNull Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime) throws Exception {
        //Do your magic!!!
        return new ArrayList<ProductGroupAnalyticsResponseInner>();
    }

}
