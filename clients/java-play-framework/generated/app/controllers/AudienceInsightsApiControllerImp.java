package controllers;

import apimodels.AudienceInsightType;
import apimodels.AudienceInsights;
import apimodels.AudienceInsightsScopeAndTypeGet200Response;
import apimodels.PinterestLibError;

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
public class AudienceInsightsApiControllerImp extends AudienceInsightsApiControllerImpInterface {
    @Override
    public AudienceInsights audienceInsightsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @NotNull AudienceInsightType audienceInsightType) throws Exception {
        //Do your magic!!!
        return new AudienceInsights();
    }

    @Override
    public AudienceInsightsScopeAndTypeGet200Response audienceInsightsScopeAndTypeGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new AudienceInsightsScopeAndTypeGet200Response();
    }

}
