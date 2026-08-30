package controllers;

import apimodels.ConversionEventResponse;
import apimodels.ConversionTag;
import apimodels.ConversionTagCreate;
import apimodels.ConversionTagsList200Response;
import java.util.Map;
import apimodels.PageVisitConversionTagsGet200Response;
import apimodels.PinterestLibError;
import apimodels.PinterestLibPaginationOrder;

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
public class ConversionTagsApiControllerImp extends ConversionTagsApiControllerImpInterface {
    @Override
    public ConversionTag conversionTagsCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, ConversionTagCreate conversionTagCreate) throws Exception {
        //Do your magic!!!
        return new ConversionTag();
    }

    @Override
    public ConversionTag conversionTagsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Pattern(regexp="^\\d+$") @Size(max=18)String conversionTagId) throws Exception {
        //Do your magic!!!
        return new ConversionTag();
    }

    @Override
    public ConversionTagsList200Response conversionTagsList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, Boolean filterDeleted) throws Exception {
        //Do your magic!!!
        return new ConversionTagsList200Response();
    }

    @Override
    public Map<String, List<ConversionEventResponse>> ocpmEligibleConversionTagsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new HashMap<String, List<ConversionEventResponse>>();
    }

    @Override
    public PageVisitConversionTagsGet200Response pageVisitConversionTagsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark,  @Min(1) @Max(250)Integer pageSize, PinterestLibPaginationOrder order) throws Exception {
        //Do your magic!!!
        return new PageVisitConversionTagsGet200Response();
    }

}
