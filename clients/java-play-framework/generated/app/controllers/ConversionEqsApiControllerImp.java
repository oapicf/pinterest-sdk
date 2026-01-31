package controllers;

import apimodels.EventQualityScore;
import apimodels.IngestionSourceOptions;
import apimodels.LookbackPeriodOptions;
import apimodels.PinterestLibError;
import apimodels.SourcePlatformOptions;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-31T04:53:01.455950794Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ConversionEqsApiControllerImp extends ConversionEqsApiControllerImpInterface {
    @Override
    public List<EventQualityScore> conversionEqsList(Http.Request request, @NotNull LookbackPeriodOptions lookbackPeriod,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, SourcePlatformOptions sourcePlatform, IngestionSourceOptions ingestionSource) throws Exception {
        //Do your magic!!!
        return new ArrayList<EventQualityScore>();
    }

}
