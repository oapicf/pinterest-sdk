package controllers;

import apimodels.Error;
import apimodels.TermsOfService;

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
public class TermsOfServiceApiControllerImp extends TermsOfServiceApiControllerImpInterface {
    @Override
    public TermsOfService termsOfServiceGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, Boolean includeHtml, String tosType) throws Exception {
        //Do your magic!!!
        return new TermsOfService();
    }

}
