package controllers;

import apimodels.CustomerListUpload;
import apimodels.CustomerListUploadCreateRequest;
import apimodels.CustomerListUploadCreateResponse;
import apimodels.PinterestLibError;

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
public class CustomerListUploadsApiControllerImp extends CustomerListUploadsApiControllerImpInterface {
    @Override
    public CustomerListUploadCreateResponse customerListUploadsCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Pattern(regexp="^\\d+$") @Size(max=18)String customerListId, CustomerListUploadCreateRequest customerListUploadCreateRequest) throws Exception {
        //Do your magic!!!
        return new CustomerListUploadCreateResponse();
    }

    @Override
    public CustomerListUpload customerListUploadsGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Pattern(regexp="^\\d+$") @Size(max=18)String customerListId,  @Pattern(regexp="^\\d+$")String customerListUploadId) throws Exception {
        //Do your magic!!!
        return new CustomerListUpload();
    }

    @Override
    public CustomerListUpload customerListUploadsRun(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,  @Pattern(regexp="^\\d+$") @Size(max=18)String customerListId,  @Pattern(regexp="^\\d+$")String customerListUploadId) throws Exception {
        //Do your magic!!!
        return new CustomerListUpload();
    }

}
