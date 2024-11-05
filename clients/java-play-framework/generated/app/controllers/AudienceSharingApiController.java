package controllers;

import apimodels.AdAccountsAudiencesSharedAccountsList200Response;
import apimodels.AudienceAccountType;
import apimodels.AudiencesList200Response;
import apimodels.BusinessSharedAudience;
import apimodels.BusinessSharedAudienceResponse;
import apimodels.Error;
import apimodels.SharedAudience;
import apimodels.SharedAudienceResponse;

import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import java.io.File;
import play.libs.Files.TemporaryFile;
import openapitools.OpenAPIUtils;
import com.fasterxml.jackson.core.type.TypeReference;

import javax.validation.constraints.*;
import javax.validation.Valid;
import com.typesafe.config.Config;

import openapitools.OpenAPIUtils.ApiAction;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class AudienceSharingApiController extends Controller {
    private final AudienceSharingApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private AudienceSharingApiController(Config configuration, AudienceSharingApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result adAccountsAudiencesSharedAccountsList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        String valueaudienceId = request.getQueryString("audience_id");
        String audienceId;
        if (valueaudienceId != null) {
            audienceId = valueaudienceId;
        } else {
            throw new IllegalArgumentException("'audience_id' parameter is required");
        }
        String valueaccountType = request.getQueryString("account_type");
        AudienceAccountType accountType;
        if (valueaccountType != null) {
            accountType = valueaccountType;
        } else {
            throw new IllegalArgumentException("'account_type' parameter is required");
        }
        String valuepageSize = request.getQueryString("page_size");
        Integer pageSize;
        if (valuepageSize != null) {
            pageSize = Integer.parseInt(valuepageSize);
        } else {
            pageSize = 25;
        }
        String valuebookmark = request.getQueryString("bookmark");
        String bookmark;
        if (valuebookmark != null) {
            bookmark = valuebookmark;
        } else {
            bookmark = null;
        }
        return imp.adAccountsAudiencesSharedAccountsListHttp(request, adAccountId, audienceId, accountType, pageSize, bookmark);
    }

    @ApiAction
    public Result businessAccountAudiencesSharedAccountsList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId) throws Exception {
        String valueaudienceId = request.getQueryString("audience_id");
        String audienceId;
        if (valueaudienceId != null) {
            audienceId = valueaudienceId;
        } else {
            throw new IllegalArgumentException("'audience_id' parameter is required");
        }
        String valueaccountType = request.getQueryString("account_type");
        AudienceAccountType accountType;
        if (valueaccountType != null) {
            accountType = valueaccountType;
        } else {
            throw new IllegalArgumentException("'account_type' parameter is required");
        }
        String valuepageSize = request.getQueryString("page_size");
        Integer pageSize;
        if (valuepageSize != null) {
            pageSize = Integer.parseInt(valuepageSize);
        } else {
            pageSize = 25;
        }
        String valuebookmark = request.getQueryString("bookmark");
        String bookmark;
        if (valuebookmark != null) {
            bookmark = valuebookmark;
        } else {
            bookmark = null;
        }
        return imp.businessAccountAudiencesSharedAccountsListHttp(request, businessId, audienceId, accountType, pageSize, bookmark);
    }

    @ApiAction
    public Result sharedAudiencesForBusinessList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId) throws Exception {
        String valuebookmark = request.getQueryString("bookmark");
        String bookmark;
        if (valuebookmark != null) {
            bookmark = valuebookmark;
        } else {
            bookmark = null;
        }
        String valueorder = request.getQueryString("order");
        String order;
        if (valueorder != null) {
            order = valueorder;
        } else {
            order = null;
        }
        String valuepageSize = request.getQueryString("page_size");
        Integer pageSize;
        if (valuepageSize != null) {
            pageSize = Integer.parseInt(valuepageSize);
        } else {
            pageSize = 25;
        }
        return imp.sharedAudiencesForBusinessListHttp(request, businessId, bookmark, order, pageSize);
    }

    @ApiAction
    public Result updateAdAccountToAdAccountSharedAudience(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        JsonNode nodesharedAudience = request.body().asJson();
        SharedAudience sharedAudience;
        if (nodesharedAudience != null) {
            sharedAudience = mapper.readValue(nodesharedAudience.toString(), SharedAudience.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(sharedAudience);
            }
        } else {
            throw new IllegalArgumentException("'SharedAudience' parameter is required");
        }
        return imp.updateAdAccountToAdAccountSharedAudienceHttp(request, adAccountId, sharedAudience);
    }

    @ApiAction
    public Result updateAdAccountToBusinessSharedAudience(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        JsonNode nodebusinessSharedAudience = request.body().asJson();
        BusinessSharedAudience businessSharedAudience;
        if (nodebusinessSharedAudience != null) {
            businessSharedAudience = mapper.readValue(nodebusinessSharedAudience.toString(), BusinessSharedAudience.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(businessSharedAudience);
            }
        } else {
            throw new IllegalArgumentException("'BusinessSharedAudience' parameter is required");
        }
        return imp.updateAdAccountToBusinessSharedAudienceHttp(request, adAccountId, businessSharedAudience);
    }

    @ApiAction
    public Result updateBusinessToAdAccountSharedAudience(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId) throws Exception {
        JsonNode nodesharedAudience = request.body().asJson();
        SharedAudience sharedAudience;
        if (nodesharedAudience != null) {
            sharedAudience = mapper.readValue(nodesharedAudience.toString(), SharedAudience.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(sharedAudience);
            }
        } else {
            throw new IllegalArgumentException("'SharedAudience' parameter is required");
        }
        return imp.updateBusinessToAdAccountSharedAudienceHttp(request, businessId, sharedAudience);
    }

    @ApiAction
    public Result updateBusinessToBusinessSharedAudience(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId) throws Exception {
        JsonNode nodebusinessSharedAudience = request.body().asJson();
        BusinessSharedAudience businessSharedAudience;
        if (nodebusinessSharedAudience != null) {
            businessSharedAudience = mapper.readValue(nodebusinessSharedAudience.toString(), BusinessSharedAudience.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(businessSharedAudience);
            }
        } else {
            throw new IllegalArgumentException("'BusinessSharedAudience' parameter is required");
        }
        return imp.updateBusinessToBusinessSharedAudienceHttp(request, businessId, businessSharedAudience);
    }

}
