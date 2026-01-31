package controllers;

import apimodels.Catalog;
import apimodels.CatalogsAvailableFilterValues;
import apimodels.CatalogsCreateRequest;
import apimodels.CatalogsList200Response;
import apimodels.CatalogsLocale;
import apimodels.Country;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-31T04:53:01.455950794Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CatalogsApiControllerImp extends CatalogsApiControllerImpInterface {
    @Override
    public CatalogsAvailableFilterValues catalogsAvailableFilterValues(Http.Request request, @NotNull  @Pattern(regexp="^\\d+$")String catalogId,  @Pattern(regexp="^\\d+$")String feedId, Country country, CatalogsLocale language,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new CatalogsAvailableFilterValues();
    }

    @Override
    public Catalog catalogsCreate(Http.Request request, CatalogsCreateRequest catalogsCreateRequest,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new Catalog();
    }

    @Override
    public CatalogsList200Response catalogsList(Http.Request request, String bookmark,  @Min(1) @Max(250)Integer pageSize,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new CatalogsList200Response();
    }

}
