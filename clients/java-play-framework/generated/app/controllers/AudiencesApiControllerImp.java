package controllers;

import apimodels.Audience;
import apimodels.AudienceCreateCustomRequest;
import apimodels.AudienceCreateRequest;
import apimodels.AudienceUpdateRequest;
import apimodels.AudiencesList200Response;
import apimodels.Error;

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
public class AudiencesApiControllerImp extends AudiencesApiControllerImpInterface {
    @Override
    public Audience audiencesCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, AudienceCreateRequest audienceCreateRequest) throws Exception {
        //Do your magic!!!
        return new Audience();
    }

    @Override
    public Audience audiencesCreateCustom(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, AudienceCreateCustomRequest audienceCreateCustomRequest) throws Exception {
        //Do your magic!!!
        return new Audience();
    }

    @Override
    public Audience audiencesGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Pattern(regexp="^\\d+$") @Size(max=18)String audienceId) throws Exception {
        //Do your magic!!!
        return new Audience();
    }

    @Override
    public AudiencesList200Response audiencesList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark, String order,  @Min(1) @Max(250)Integer pageSize, String ownershipType) throws Exception {
        //Do your magic!!!
        return new AudiencesList200Response();
    }

    @Override
    public Audience audiencesUpdate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Pattern(regexp="^\\d+$") @Size(max=18)String audienceId, AudienceUpdateRequest audienceUpdateRequest) throws Exception {
        //Do your magic!!!
        return new Audience();
    }

}
