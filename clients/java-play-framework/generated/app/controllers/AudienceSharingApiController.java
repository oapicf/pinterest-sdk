package controllers;

import apimodels.AdAccountToAdAccountSharedAudience;
import apimodels.AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody;
import apimodels.AdAccountToBusinessSharedAudience;
import apimodels.AdAccountToBusinessSharedAudienceUpdateWithRequiredBody;
import apimodels.AdAccountsAudiencesSharedAccountsList200Response;
import apimodels.AudienceAccountType;
import apimodels.BusinessToAdAccountSharedAudience;
import apimodels.BusinessToAdAccountSharedAudienceUpdateWithRequiredBody;
import apimodels.BusinessToBusinessSharedAudience;
import apimodels.BusinessToBusinessSharedAudienceUpdateWithRequiredBody;
import apimodels.Order;
import apimodels.PinterestLibError;
import apimodels.SharedAudiencesForBusinessList200Response;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
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
        String valuebookmark = request.getQueryString("bookmark");
        String bookmark;
        if (valuebookmark != null) {
            bookmark = valuebookmark;
        } else {
            bookmark = null;
        }
        String valuepageSize = request.getQueryString("page_size");
        Integer pageSize;
        if (valuepageSize != null) {
            pageSize = Integer.parseInt(valuepageSize);
        } else {
            pageSize = 25;
        }
        return imp.adAccountsAudiencesSharedAccountsListHttp(request, audienceId, accountType, adAccountId, bookmark, pageSize);
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
        String valuebookmark = request.getQueryString("bookmark");
        String bookmark;
        if (valuebookmark != null) {
            bookmark = valuebookmark;
        } else {
            bookmark = null;
        }
        String valuepageSize = request.getQueryString("page_size");
        Integer pageSize;
        if (valuepageSize != null) {
            pageSize = Integer.parseInt(valuepageSize);
        } else {
            pageSize = 25;
        }
        return imp.businessAccountAudiencesSharedAccountsListHttp(request, businessId, audienceId, accountType, bookmark, pageSize);
    }

    @ApiAction
    public Result sharedAudiencesForBusinessList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId) throws Exception {
        String valueorder = request.getQueryString("order");
        Order order;
        if (valueorder != null) {
            order = valueorder;
        } else {
            order = null;
        }
        String valuebookmark = request.getQueryString("bookmark");
        String bookmark;
        if (valuebookmark != null) {
            bookmark = valuebookmark;
        } else {
            bookmark = null;
        }
        String valuepageSize = request.getQueryString("page_size");
        Integer pageSize;
        if (valuepageSize != null) {
            pageSize = Integer.parseInt(valuepageSize);
        } else {
            pageSize = 25;
        }
        return imp.sharedAudiencesForBusinessListHttp(request, businessId, order, bookmark, pageSize);
    }

    @ApiAction
    public Result updateAdAccountToAdAccountSharedAudience(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        JsonNode nodeadAccountToAdAccountSharedAudienceUpdateWithRequiredBody = request.body().asJson();
        AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody adAccountToAdAccountSharedAudienceUpdateWithRequiredBody;
        if (nodeadAccountToAdAccountSharedAudienceUpdateWithRequiredBody != null) {
            adAccountToAdAccountSharedAudienceUpdateWithRequiredBody = mapper.readValue(nodeadAccountToAdAccountSharedAudienceUpdateWithRequiredBody.toString(), AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(adAccountToAdAccountSharedAudienceUpdateWithRequiredBody);
            }
        } else {
            throw new IllegalArgumentException("'AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody' parameter is required");
        }
        return imp.updateAdAccountToAdAccountSharedAudienceHttp(request, adAccountId, adAccountToAdAccountSharedAudienceUpdateWithRequiredBody);
    }

    @ApiAction
    public Result updateAdAccountToBusinessSharedAudience(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        JsonNode nodeadAccountToBusinessSharedAudienceUpdateWithRequiredBody = request.body().asJson();
        AdAccountToBusinessSharedAudienceUpdateWithRequiredBody adAccountToBusinessSharedAudienceUpdateWithRequiredBody;
        if (nodeadAccountToBusinessSharedAudienceUpdateWithRequiredBody != null) {
            adAccountToBusinessSharedAudienceUpdateWithRequiredBody = mapper.readValue(nodeadAccountToBusinessSharedAudienceUpdateWithRequiredBody.toString(), AdAccountToBusinessSharedAudienceUpdateWithRequiredBody.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(adAccountToBusinessSharedAudienceUpdateWithRequiredBody);
            }
        } else {
            throw new IllegalArgumentException("'AdAccountToBusinessSharedAudienceUpdateWithRequiredBody' parameter is required");
        }
        return imp.updateAdAccountToBusinessSharedAudienceHttp(request, adAccountId, adAccountToBusinessSharedAudienceUpdateWithRequiredBody);
    }

    @ApiAction
    public Result updateBusinessToAdAccountSharedAudience(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId) throws Exception {
        JsonNode nodebusinessToAdAccountSharedAudienceUpdateWithRequiredBody = request.body().asJson();
        BusinessToAdAccountSharedAudienceUpdateWithRequiredBody businessToAdAccountSharedAudienceUpdateWithRequiredBody;
        if (nodebusinessToAdAccountSharedAudienceUpdateWithRequiredBody != null) {
            businessToAdAccountSharedAudienceUpdateWithRequiredBody = mapper.readValue(nodebusinessToAdAccountSharedAudienceUpdateWithRequiredBody.toString(), BusinessToAdAccountSharedAudienceUpdateWithRequiredBody.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(businessToAdAccountSharedAudienceUpdateWithRequiredBody);
            }
        } else {
            throw new IllegalArgumentException("'BusinessToAdAccountSharedAudienceUpdateWithRequiredBody' parameter is required");
        }
        return imp.updateBusinessToAdAccountSharedAudienceHttp(request, businessId, businessToAdAccountSharedAudienceUpdateWithRequiredBody);
    }

    @ApiAction
    public Result updateBusinessToBusinessSharedAudience(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId) throws Exception {
        JsonNode nodebusinessToBusinessSharedAudienceUpdateWithRequiredBody = request.body().asJson();
        BusinessToBusinessSharedAudienceUpdateWithRequiredBody businessToBusinessSharedAudienceUpdateWithRequiredBody;
        if (nodebusinessToBusinessSharedAudienceUpdateWithRequiredBody != null) {
            businessToBusinessSharedAudienceUpdateWithRequiredBody = mapper.readValue(nodebusinessToBusinessSharedAudienceUpdateWithRequiredBody.toString(), BusinessToBusinessSharedAudienceUpdateWithRequiredBody.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(businessToBusinessSharedAudienceUpdateWithRequiredBody);
            }
        } else {
            throw new IllegalArgumentException("'BusinessToBusinessSharedAudienceUpdateWithRequiredBody' parameter is required");
        }
        return imp.updateBusinessToBusinessSharedAudienceHttp(request, businessId, businessToBusinessSharedAudienceUpdateWithRequiredBody);
    }

}
