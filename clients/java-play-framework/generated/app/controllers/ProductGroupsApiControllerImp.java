package controllers;

import apimodels.AdAccountsCatalogsProductGroupsList200Response;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ProductGroupsApiControllerImp extends ProductGroupsApiControllerImpInterface {
    @Override
    public AdAccountsCatalogsProductGroupsList200Response adAccountsCatalogsProductGroupsList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Pattern(regexp="^\\d+$") @Size(max=18)String feedProfileId) throws Exception {
        //Do your magic!!!
        return new AdAccountsCatalogsProductGroupsList200Response();
    }

}
