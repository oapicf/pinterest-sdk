package controllers;

import apimodels.LabelCreateRequest;
import apimodels.LabelUpdateRequest;
import apimodels.LabeledEntities;
import apimodels.LabeledEntitiesCreate;
import apimodels.LabelsList200Response;
import apimodels.LabelsResponse;
import apimodels.PinterestLibError;
import apimodels.QueryLabelEntityStatusesItems;
import apimodels.QueryLabelTypesItems;

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
public abstract class LabelsApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result labelsApplyHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String labelId, LabeledEntitiesCreate labeledEntitiesCreate) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        LabeledEntities obj = labelsApply(request, adAccountId, labelId, labeledEntitiesCreate);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract LabeledEntities labelsApply(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String labelId, LabeledEntitiesCreate labeledEntitiesCreate) throws Exception;

    public Result labelsCreateHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, LabelCreateRequest labelCreateRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        LabelsResponse obj = labelsCreate(request, adAccountId, labelCreateRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract LabelsResponse labelsCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, LabelCreateRequest labelCreateRequest) throws Exception;

    public Result labelsListHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Size(min=1,max=250)List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds,  @Size(min=1,max=250)List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> labelIds, List<QueryLabelEntityStatusesItems> entityStatuses, List<QueryLabelTypesItems> labelTypes, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        LabelsList200Response obj = labelsList(request, adAccountId, campaignIds, labelIds, entityStatuses, labelTypes, bookmark, pageSize);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract LabelsList200Response labelsList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Size(min=1,max=250)List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds,  @Size(min=1,max=250)List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> labelIds, List<QueryLabelEntityStatusesItems> entityStatuses, List<QueryLabelTypesItems> labelTypes, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception;

    public Result labelsRemoveHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String labelId, LabeledEntitiesCreate labeledEntitiesCreate) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        LabeledEntities obj = labelsRemove(request, adAccountId, labelId, labeledEntitiesCreate);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract LabeledEntities labelsRemove(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String labelId, LabeledEntitiesCreate labeledEntitiesCreate) throws Exception;

    public Result labelsUpdateHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, LabelUpdateRequest labelUpdateRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        LabelsResponse obj = labelsUpdate(request, adAccountId, labelUpdateRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract LabelsResponse labelsUpdate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, LabelUpdateRequest labelUpdateRequest) throws Exception;

}
