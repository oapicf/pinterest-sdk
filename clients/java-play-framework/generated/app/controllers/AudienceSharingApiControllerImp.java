package controllers;

import apimodels.AdAccountsAudiencesSharedAccountsList200Response;
import apimodels.AudienceAccountType;
import apimodels.AudiencesList200Response;
import apimodels.BusinessSharedAudience;
import apimodels.BusinessSharedAudienceResponse;
import apimodels.Error;
import apimodels.SharedAudience;
import apimodels.SharedAudienceResponse;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class AudienceSharingApiControllerImp extends AudienceSharingApiControllerImpInterface {
    @Override
    public AdAccountsAudiencesSharedAccountsList200Response adAccountsAudiencesSharedAccountsList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18)String audienceId, @NotNull AudienceAccountType accountType,  @Min(1) @Max(250)Integer pageSize, String bookmark) throws Exception {
        //Do your magic!!!
        return new AdAccountsAudiencesSharedAccountsList200Response();
    }

    @Override
    public AdAccountsAudiencesSharedAccountsList200Response businessAccountAudiencesSharedAccountsList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18)String audienceId, @NotNull AudienceAccountType accountType,  @Min(1) @Max(250)Integer pageSize, String bookmark) throws Exception {
        //Do your magic!!!
        return new AdAccountsAudiencesSharedAccountsList200Response();
    }

    @Override
    public AudiencesList200Response sharedAudiencesForBusinessList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, String bookmark, String order,  @Min(1) @Max(250)Integer pageSize) throws Exception {
        //Do your magic!!!
        return new AudiencesList200Response();
    }

    @Override
    public SharedAudienceResponse updateAdAccountToAdAccountSharedAudience(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, SharedAudience sharedAudience) throws Exception {
        //Do your magic!!!
        return new SharedAudienceResponse();
    }

    @Override
    public BusinessSharedAudienceResponse updateAdAccountToBusinessSharedAudience(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, BusinessSharedAudience businessSharedAudience) throws Exception {
        //Do your magic!!!
        return new BusinessSharedAudienceResponse();
    }

    @Override
    public SharedAudienceResponse updateBusinessToAdAccountSharedAudience(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, SharedAudience sharedAudience) throws Exception {
        //Do your magic!!!
        return new SharedAudienceResponse();
    }

    @Override
    public BusinessSharedAudienceResponse updateBusinessToBusinessSharedAudience(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, BusinessSharedAudience businessSharedAudience) throws Exception {
        //Do your magic!!!
        return new BusinessSharedAudienceResponse();
    }

}
