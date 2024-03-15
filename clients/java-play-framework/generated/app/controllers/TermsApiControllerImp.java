package controllers;

import apimodels.Error;
import apimodels.RelatedTerms;

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
public class TermsApiControllerImp extends TermsApiControllerImpInterface {
    @Override
    public RelatedTerms termsRelatedList(Http.Request request, @NotNull List<String> terms) throws Exception {
        //Do your magic!!!
        return new RelatedTerms();
    }

    @Override
    public List<String> termsSuggestedList(Http.Request request, @NotNull String term,  @Min(1) @Max(10)Integer limit) throws Exception {
        //Do your magic!!!
        return new ArrayList<String>();
    }

}
