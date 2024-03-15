package controllers;

import apimodels.ConversionEventResponse;
import apimodels.ConversionTagCreate;
import apimodels.ConversionTagListResponse;
import apimodels.ConversionTagResponse;
import apimodels.Error;
import java.util.Map;
import apimodels.PageVisitConversionTagsGet200Response;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ConversionTagsApiControllerImp extends ConversionTagsApiControllerImpInterface {
    @Override
    public ConversionTagResponse conversionTagsCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, ConversionTagCreate conversionTagCreate) throws Exception {
        //Do your magic!!!
        return new ConversionTagResponse();
    }

    @Override
    public ConversionTagResponse conversionTagsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Pattern(regexp="^\\d+$") @Size(max=18)String conversionTagId) throws Exception {
        //Do your magic!!!
        return new ConversionTagResponse();
    }

    @Override
    public ConversionTagListResponse conversionTagsList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, Boolean filterDeleted) throws Exception {
        //Do your magic!!!
        return new ConversionTagListResponse();
    }

    @Override
    public Map<String, List<ConversionEventResponse>> ocpmEligibleConversionTagsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new HashMap<String, List<ConversionEventResponse>>();
    }

    @Override
    public PageVisitConversionTagsGet200Response pageVisitConversionTagsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Min(1) @Max(250)Integer pageSize, String order, String bookmark) throws Exception {
        //Do your magic!!!
        return new PageVisitConversionTagsGet200Response();
    }

}
