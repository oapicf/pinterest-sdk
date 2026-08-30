package controllers;

import apimodels.AdvertiserDefinedEventsCreate200Response;
import apimodels.AdvertiserDefinedEventsCreateRequest;
import apimodels.AdvertiserDefinedEventsGet200Response;
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
public class ConversionsApiControllerImp extends ConversionsApiControllerImpInterface {
    @Override
    public AdvertiserDefinedEventsCreate200Response advertiserDefinedEventsCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, AdvertiserDefinedEventsCreateRequest advertiserDefinedEventsCreateRequest) throws Exception {
        //Do your magic!!!
        return new AdvertiserDefinedEventsCreate200Response();
    }

    @Override
    public AdvertiserDefinedEventsCreate200Response advertiserDefinedEventsDelete(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @NotNull List<String> eventNames) throws Exception {
        //Do your magic!!!
        return new AdvertiserDefinedEventsCreate200Response();
    }

    @Override
    public AdvertiserDefinedEventsGet200Response advertiserDefinedEventsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new AdvertiserDefinedEventsGet200Response();
    }

    @Override
    public AdvertiserDefinedEventsCreate200Response advertiserDefinedEventsUpdate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, AdvertiserDefinedEventsCreateRequest advertiserDefinedEventsCreateRequest) throws Exception {
        //Do your magic!!!
        return new AdvertiserDefinedEventsCreate200Response();
    }

}
