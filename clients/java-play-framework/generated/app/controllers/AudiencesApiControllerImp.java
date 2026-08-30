package controllers;

import apimodels.AdAccountsAudience;
import apimodels.AdAccountsAudienceCreate;
import apimodels.AdAccountsAudienceUpdate;
import apimodels.AudienceOwnershipType;
import apimodels.AudiencesList200Response;
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
public class AudiencesApiControllerImp extends AudiencesApiControllerImpInterface {
    @Override
    public AdAccountsAudience audiencesCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, AdAccountsAudienceCreate adAccountsAudienceCreate) throws Exception {
        //Do your magic!!!
        return new AdAccountsAudience();
    }

    @Override
    public AdAccountsAudience audiencesGet(Http.Request request,  @Pattern(regexp="^\\d+$")String audienceId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new AdAccountsAudience();
    }

    @Override
    public AudiencesList200Response audiencesList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark,  @Min(1) @Max(250)Integer pageSize, PinterestLibPaginationOrder order, AudienceOwnershipType ownershipType, Boolean excludeNca) throws Exception {
        //Do your magic!!!
        return new AudiencesList200Response();
    }

    @Override
    public AdAccountsAudience audiencesUpdate(Http.Request request,  @Pattern(regexp="^\\d+$")String audienceId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, AdAccountsAudienceUpdate adAccountsAudienceUpdate) throws Exception {
        //Do your magic!!!
        return new AdAccountsAudience();
    }

}
