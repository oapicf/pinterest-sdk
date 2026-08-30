package controllers;

import apimodels.CustomerList;
import apimodels.CustomerListCreate;
import apimodels.CustomerListUpdateWithRequiredBody;
import apimodels.CustomerListsList200Response;
import apimodels.PinterestLibError;
import apimodels.PinterestLibPaginationOrder;

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
public class CustomerListsApiControllerImp extends CustomerListsApiControllerImpInterface {
    @Override
    public CustomerList customerListsCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, CustomerListCreate customerListCreate) throws Exception {
        //Do your magic!!!
        return new CustomerList();
    }

    @Override
    public CustomerList customerListsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Pattern(regexp="^\\d+$") @Size(max=18)String customerListId) throws Exception {
        //Do your magic!!!
        return new CustomerList();
    }

    @Override
    public CustomerListsList200Response customerListsList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark,  @Min(1) @Max(250)Integer pageSize, PinterestLibPaginationOrder order, Boolean excludeNca) throws Exception {
        //Do your magic!!!
        return new CustomerListsList200Response();
    }

    @Override
    public CustomerList customerListsUpdate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Pattern(regexp="^\\d+$") @Size(max=18)String customerListId, CustomerListUpdateWithRequiredBody customerListUpdateWithRequiredBody) throws Exception {
        //Do your magic!!!
        return new CustomerList();
    }

}
