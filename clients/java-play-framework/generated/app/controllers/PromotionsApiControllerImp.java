package controllers;

import apimodels.PinterestLibError;
import apimodels.PinterestLibPaginationOrder;
import apimodels.Promotion;
import apimodels.PromotionBatchUpdate;
import apimodels.PromotionCreate;
import apimodels.PromotionsList200Response;
import apimodels.PromotionsResponse;

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
public class PromotionsApiControllerImp extends PromotionsApiControllerImpInterface {
    @Override
    public PromotionsResponse promotionsCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, List<@Valid PromotionCreate> promotionCreate) throws Exception {
        //Do your magic!!!
        return new PromotionsResponse();
    }

    @Override
    public Promotion promotionsDelete(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String promotionId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new Promotion();
    }

    @Override
    public Promotion promotionsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String promotionId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new Promotion();
    }

    @Override
    public PromotionsList200Response promotionsList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark,  @Min(1) @Max(250)Integer pageSize, PinterestLibPaginationOrder order) throws Exception {
        //Do your magic!!!
        return new PromotionsList200Response();
    }

    @Override
    public PromotionsResponse promotionsUpdate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, List<@Valid PromotionBatchUpdate> promotionBatchUpdate) throws Exception {
        //Do your magic!!!
        return new PromotionsResponse();
    }

}
