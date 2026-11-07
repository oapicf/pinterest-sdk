package controllers;

import apimodels.OrderLine;
import apimodels.OrderLinesList200Response;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-11-07T04:05:46.315568162Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class OrderLinesApiControllerImp extends OrderLinesApiControllerImpInterface {
    @Override
    public OrderLine orderLinesGet(Http.Request request,  @Pattern(regexp="^\\d+$")String orderLineId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new OrderLine();
    }

    @Override
    public OrderLinesList200Response orderLinesList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark,  @Min(1) @Max(250)Integer pageSize, PinterestLibPaginationOrder order) throws Exception {
        //Do your magic!!!
        return new OrderLinesList200Response();
    }

}
