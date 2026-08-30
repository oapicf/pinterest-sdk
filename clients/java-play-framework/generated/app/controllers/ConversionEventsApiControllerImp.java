package controllers;

import apimodels.ConversionEvents;
import apimodels.ConversionEventsCreate;
import apimodels.DetailedError;
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
public class ConversionEventsApiControllerImp extends ConversionEventsApiControllerImpInterface {
    @Override
    public ConversionEvents eventsCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, ConversionEventsCreate conversionEventsCreate, Boolean test) throws Exception {
        //Do your magic!!!
        return new ConversionEvents();
    }

}
