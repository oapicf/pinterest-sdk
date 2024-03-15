package controllers;

import apimodels.AdAccountsCountryResponse;
import apimodels.BookClosedResponse;
import apimodels.DeliveryMetricsResponse;
import apimodels.Error;
import apimodels.SingleInterestTargetingOptionResponse;

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
public class ResourcesApiControllerImp extends ResourcesApiControllerImpInterface {
    @Override
    public AdAccountsCountryResponse adAccountCountriesGet(Http.Request request) throws Exception {
        //Do your magic!!!
        return new AdAccountsCountryResponse();
    }

    @Override
    public DeliveryMetricsResponse deliveryMetricsGet(Http.Request request, String reportType) throws Exception {
        //Do your magic!!!
        return new DeliveryMetricsResponse();
    }

    @Override
    public SingleInterestTargetingOptionResponse interestTargetingOptionsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String interestId) throws Exception {
        //Do your magic!!!
        return new SingleInterestTargetingOptionResponse();
    }

    @Override
    public void leadFormQuestionsGet(Http.Request request) throws Exception {
        //Do your magic!!!
    }

    @Override
    public BookClosedResponse metricsReadyStateGet(Http.Request request, @NotNull  @Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})$")String date) throws Exception {
        //Do your magic!!!
        return new BookClosedResponse();
    }

    @Override
    public List<Object> targetingOptionsGet(Http.Request request, String targetingType,  @Pattern(regexp="^\\d+$") @Size(max=18)String clientId, String oauthSignature,  @Pattern(regexp="\\d+")String timestamp) throws Exception {
        //Do your magic!!!
        return new ArrayList<Object>();
    }

}
