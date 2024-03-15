package controllers;

import apimodels.DetailedError;
import apimodels.Error;
import apimodels.IntegrationLogsRequest;
import apimodels.IntegrationLogsSuccessResponse;
import apimodels.IntegrationMetadata;
import apimodels.IntegrationRecord;
import apimodels.IntegrationRequest;
import apimodels.IntegrationRequestPatch;
import apimodels.IntegrationsGetList200Response;

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
public class IntegrationsApiControllerImp extends IntegrationsApiControllerImpInterface {
    @Override
    public void integrationsCommerceDel(Http.Request request, String externalBusinessId) throws Exception {
        //Do your magic!!!
    }

    @Override
    public IntegrationMetadata integrationsCommerceGet(Http.Request request, String externalBusinessId) throws Exception {
        //Do your magic!!!
        return new IntegrationMetadata();
    }

    @Override
    public IntegrationMetadata integrationsCommercePatch(Http.Request request, String externalBusinessId, IntegrationRequestPatch integrationRequestPatch) throws Exception {
        //Do your magic!!!
        return new IntegrationMetadata();
    }

    @Override
    public IntegrationMetadata integrationsCommercePost(Http.Request request, IntegrationRequest integrationRequest) throws Exception {
        //Do your magic!!!
        return new IntegrationMetadata();
    }

    @Override
    public IntegrationRecord integrationsGetById(Http.Request request, String id) throws Exception {
        //Do your magic!!!
        return new IntegrationRecord();
    }

    @Override
    public IntegrationsGetList200Response integrationsGetList(Http.Request request, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception {
        //Do your magic!!!
        return new IntegrationsGetList200Response();
    }

    @Override
    public IntegrationLogsSuccessResponse integrationsLogsPost(Http.Request request, IntegrationLogsRequest integrationLogsRequest) throws Exception {
        //Do your magic!!!
        return new IntegrationLogsSuccessResponse();
    }

}
