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
public class AudienceSharingApiControllerImp extends AudienceSharingApiControllerImpInterface {
    @Override
    public AdAccountsAudiencesSharedAccountsList200Response adAccountsAudiencesSharedAccountsList(Http.Request request, @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18)String audienceId, @NotNull AudienceAccountType accountType,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception {
        //Do your magic!!!
        return new AdAccountsAudiencesSharedAccountsList200Response();
    }

    @Override
    public AdAccountsAudiencesSharedAccountsList200Response businessAccountAudiencesSharedAccountsList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18)String audienceId, @NotNull AudienceAccountType accountType, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception {
        //Do your magic!!!
        return new AdAccountsAudiencesSharedAccountsList200Response();
    }

    @Override
    public SharedAudiencesForBusinessList200Response sharedAudiencesForBusinessList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, Order order, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception {
        //Do your magic!!!
        return new SharedAudiencesForBusinessList200Response();
    }

    @Override
    public AdAccountToAdAccountSharedAudience updateAdAccountToAdAccountSharedAudience(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody adAccountToAdAccountSharedAudienceUpdateWithRequiredBody) throws Exception {
        //Do your magic!!!
        return new AdAccountToAdAccountSharedAudience();
    }

    @Override
    public AdAccountToBusinessSharedAudience updateAdAccountToBusinessSharedAudience(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, AdAccountToBusinessSharedAudienceUpdateWithRequiredBody adAccountToBusinessSharedAudienceUpdateWithRequiredBody) throws Exception {
        //Do your magic!!!
        return new AdAccountToBusinessSharedAudience();
    }

    @Override
    public BusinessToAdAccountSharedAudience updateBusinessToAdAccountSharedAudience(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, BusinessToAdAccountSharedAudienceUpdateWithRequiredBody businessToAdAccountSharedAudienceUpdateWithRequiredBody) throws Exception {
        //Do your magic!!!
        return new BusinessToAdAccountSharedAudience();
    }

    @Override
    public BusinessToBusinessSharedAudience updateBusinessToBusinessSharedAudience(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, BusinessToBusinessSharedAudienceUpdateWithRequiredBody businessToBusinessSharedAudienceUpdateWithRequiredBody) throws Exception {
        //Do your magic!!!
        return new BusinessToBusinessSharedAudience();
    }

}
