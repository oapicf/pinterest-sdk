package controllers;

import apimodels.Error;
import apimodels.PinsList200Response;
import apimodels.SearchPartnerPins200Response;
import apimodels.SearchUserBoardsGet200Response;

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
public class SearchApiControllerImp extends SearchApiControllerImpInterface {
    @Override
    public SearchPartnerPins200Response searchPartnerPins(Http.Request request, @NotNull String term, @NotNull String countryCode, String bookmark, String locale,  @Min(1) @Max(50)Integer limit) throws Exception {
        //Do your magic!!!
        return new SearchPartnerPins200Response();
    }

    @Override
    public SearchUserBoardsGet200Response searchUserBoardsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark,  @Min(1) @Max(250)Integer pageSize, String query) throws Exception {
        //Do your magic!!!
        return new SearchUserBoardsGet200Response();
    }

    @Override
    public PinsList200Response searchUserPinsList(Http.Request request, @NotNull String query,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark) throws Exception {
        //Do your magic!!!
        return new PinsList200Response();
    }

}
