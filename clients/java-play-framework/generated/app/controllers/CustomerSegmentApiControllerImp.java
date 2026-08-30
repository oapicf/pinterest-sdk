package controllers;

import apimodels.CustomerSegment;
import apimodels.CustomerSegmentCreate;
import apimodels.CustomerSegmentList200Response;
import apimodels.CustomerSegmentUpdateRequestUpdateWithRequiredBody;
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
public class CustomerSegmentApiControllerImp extends CustomerSegmentApiControllerImpInterface {
    @Override
    public CustomerSegment customerSegmentCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, CustomerSegmentCreate customerSegmentCreate) throws Exception {
        //Do your magic!!!
        return new CustomerSegment();
    }

    @Override
    public CustomerSegmentList200Response customerSegmentList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark,  @Min(1) @Max(250)Integer pageSize, PinterestLibPaginationOrder order, Boolean includeSizing, String searchQuery) throws Exception {
        //Do your magic!!!
        return new CustomerSegmentList200Response();
    }

    @Override
    public void customerSegmentUpdate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, CustomerSegmentUpdateRequestUpdateWithRequiredBody customerSegmentUpdateRequestUpdateWithRequiredBody) throws Exception {
        //Do your magic!!!
    }

}
