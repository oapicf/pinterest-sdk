package controllers;

import apimodels.Error;
import apimodels.PromotionCreateRequest;
import apimodels.PromotionResponse;
import apimodels.PromotionUpdateRequest;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-31T04:53:01.455950794Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class PromotionsApiControllerImp extends PromotionsApiControllerImpInterface {
    @Override
    public PromotionsResponse promotionsCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, List<@Valid PromotionCreateRequest> promotionCreateRequest) throws Exception {
        //Do your magic!!!
        return new PromotionsResponse();
    }

    @Override
    public void promotionsDelete(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Pattern(regexp="^\\d+$") @Size(max=18)String promotionId) throws Exception {
        //Do your magic!!!
    }

    @Override
    public PromotionResponse promotionsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Pattern(regexp="^\\d+$") @Size(max=18)String promotionId) throws Exception {
        //Do your magic!!!
        return new PromotionResponse();
    }

    @Override
    public PromotionsList200Response promotionsList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Min(1) @Max(250)Integer pageSize, String order, String bookmark) throws Exception {
        //Do your magic!!!
        return new PromotionsList200Response();
    }

    @Override
    public PromotionsResponse promotionsUpdate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, List<@Valid PromotionUpdateRequest> promotionUpdateRequest) throws Exception {
        //Do your magic!!!
        return new PromotionsResponse();
    }

}
