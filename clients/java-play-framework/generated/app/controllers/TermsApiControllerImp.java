package controllers;

import apimodels.PinterestLibError;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-11-07T04:05:46.315568162Z[Etc/UTC]", comments = "Generator version: 7.26.0")
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
