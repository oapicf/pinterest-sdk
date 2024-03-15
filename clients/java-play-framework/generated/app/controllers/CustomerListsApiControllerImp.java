package controllers;

import apimodels.CustomerList;
import apimodels.CustomerListRequest;
import apimodels.CustomerListUpdateRequest;
import apimodels.CustomerListsList200Response;
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
public class CustomerListsApiControllerImp extends CustomerListsApiControllerImpInterface {
    @Override
    public CustomerList customerListsCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, CustomerListRequest customerListRequest) throws Exception {
        //Do your magic!!!
        return new CustomerList();
    }

    @Override
    public CustomerList customerListsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Pattern(regexp="^\\d+$") @Size(max=18)String customerListId) throws Exception {
        //Do your magic!!!
        return new CustomerList();
    }

    @Override
    public CustomerListsList200Response customerListsList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Min(1) @Max(250)Integer pageSize, String order, String bookmark) throws Exception {
        //Do your magic!!!
        return new CustomerListsList200Response();
    }

    @Override
    public CustomerList customerListsUpdate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Pattern(regexp="^\\d+$") @Size(max=18)String customerListId, CustomerListUpdateRequest customerListUpdateRequest) throws Exception {
        //Do your magic!!!
        return new CustomerList();
    }

}
