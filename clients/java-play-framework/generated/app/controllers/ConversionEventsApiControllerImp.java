package controllers;

import apimodels.ConversionApiResponse;
import apimodels.ConversionEvents;
import apimodels.DetailedError;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ConversionEventsApiControllerImp extends ConversionEventsApiControllerImpInterface {
    @Override
    public ConversionApiResponse eventsCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, ConversionEvents conversionEvents, Boolean test) throws Exception {
        //Do your magic!!!
        return new ConversionApiResponse();
    }

}
