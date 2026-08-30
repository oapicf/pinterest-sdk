package controllers;

import apimodels.AdAccountCountriesGet200Response;
import apimodels.BookClosed;
import apimodels.DeliveryMetricsGet200Response;
import apimodels.PinterestLibError;
import apimodels.PublicTargetingType;
import apimodels.ReportType;
import apimodels.SingleInterestTargetingOption;

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
public class ResourcesApiControllerImp extends ResourcesApiControllerImpInterface {
    @Override
    public AdAccountCountriesGet200Response adAccountCountriesGet(Http.Request request) throws Exception {
        //Do your magic!!!
        return new AdAccountCountriesGet200Response();
    }

    @Override
    public DeliveryMetricsGet200Response deliveryMetricsGet(Http.Request request, ReportType reportType) throws Exception {
        //Do your magic!!!
        return new DeliveryMetricsGet200Response();
    }

    @Override
    public SingleInterestTargetingOption interestTargetingOptionsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String interestId) throws Exception {
        //Do your magic!!!
        return new SingleInterestTargetingOption();
    }

    @Override
    public void leadFormQuestionsGet(Http.Request request) throws Exception {
        //Do your magic!!!
    }

    @Override
    public BookClosed metricsReadyStateGet(Http.Request request, @NotNull  @Pattern(regexp="^\\d{4}-\\d{2}-\\d{2}$")String date) throws Exception {
        //Do your magic!!!
        return new BookClosed();
    }

    @Override
    public List<Object> targetingOptionsGet(Http.Request request, PublicTargetingType targetingType,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Pattern(regexp="^\\d+$") @Size(max=18)String clientId, String oauthSignature,  @Pattern(regexp="\\d+")String timestamp) throws Exception {
        //Do your magic!!!
        return new ArrayList<Object>();
    }

}
