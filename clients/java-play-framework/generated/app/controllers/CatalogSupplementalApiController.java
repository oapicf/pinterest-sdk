package controllers;

import apimodels.CatalogsLocalStoresCreate200ResponseInner;
import apimodels.CatalogsLocalStoresDelete200ResponseInner;
import apimodels.CatalogsLocalStoresList200Response;
import apimodels.LocalInventoryItemsBatch;
import apimodels.LocalInventoryItemsBatchCreate;
import apimodels.LocalInventoryItemsGet;
import apimodels.LocalInventoryItemsGetCreate;
import apimodels.LocalStore;
import apimodels.LocalStoreBatchUpdate;
import apimodels.LocalStoreCreate;
import apimodels.PinterestLibError;
import apimodels.SupplementalItemsBatchResponse;

import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import java.io.File;
import play.libs.Files.TemporaryFile;
import openapitools.OpenAPIUtils;
import com.fasterxml.jackson.core.type.TypeReference;

import javax.validation.constraints.*;
import javax.validation.Valid;
import com.typesafe.config.Config;

import openapitools.OpenAPIUtils.ApiAction;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CatalogSupplementalApiController extends Controller {
    private final CatalogSupplementalApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private CatalogSupplementalApiController(Config configuration, CatalogSupplementalApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result catalogsLocalInventoryItemsBatchOperate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=19)String catalogId) throws Exception {
        JsonNode nodelocalInventoryItemsBatchCreate = request.body().asJson();
        LocalInventoryItemsBatchCreate localInventoryItemsBatchCreate;
        if (nodelocalInventoryItemsBatchCreate != null) {
            localInventoryItemsBatchCreate = mapper.readValue(nodelocalInventoryItemsBatchCreate.toString(), LocalInventoryItemsBatchCreate.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(localInventoryItemsBatchCreate);
            }
        } else {
            throw new IllegalArgumentException("'LocalInventoryItemsBatchCreate' parameter is required");
        }
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        return imp.catalogsLocalInventoryItemsBatchOperateHttp(request, catalogId, localInventoryItemsBatchCreate, adAccountId);
    }

    @ApiAction
    public Result catalogsLocalInventoryItemsPost(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=19)String catalogId) throws Exception {
        JsonNode nodelocalInventoryItemsGetCreate = request.body().asJson();
        LocalInventoryItemsGetCreate localInventoryItemsGetCreate;
        if (nodelocalInventoryItemsGetCreate != null) {
            localInventoryItemsGetCreate = mapper.readValue(nodelocalInventoryItemsGetCreate.toString(), LocalInventoryItemsGetCreate.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(localInventoryItemsGetCreate);
            }
        } else {
            throw new IllegalArgumentException("'LocalInventoryItemsGetCreate' parameter is required");
        }
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        return imp.catalogsLocalInventoryItemsPostHttp(request, catalogId, localInventoryItemsGetCreate, adAccountId);
    }

    @ApiAction
    public Result catalogsLocalStoresCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=19)String catalogId) throws Exception {
        JsonNode nodelocalStoreCreate = request.body().asJson();
        List<@Valid LocalStoreCreate> localStoreCreate;
        if (nodelocalStoreCreate != null) {
            localStoreCreate = mapper.readValue(nodelocalStoreCreate.toString(), new TypeReference<List<@Valid LocalStoreCreate>>(){});
            if (configuration.getBoolean("useInputBeanValidation")) {
                for (LocalStoreCreate curItem : localStoreCreate) {
                    OpenAPIUtils.validate(curItem);
                }
            }
        } else {
            throw new IllegalArgumentException("'LocalStoreCreate' parameter is required");
        }
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        return imp.catalogsLocalStoresCreateHttp(request, catalogId, localStoreCreate, adAccountId);
    }

    @ApiAction
    public Result catalogsLocalStoresDelete(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=19)String catalogId) throws Exception {
        String[] idsArray = request.queryString().get("ids");
        if (idsArray == null) {
            throw new IllegalArgumentException("'ids' parameter is required");
        }
        List<String> idsList = OpenAPIUtils.parametersToList("csv", idsArray);
        List<@Pattern(regexp = "^\\d+$")String> ids = new ArrayList<>();
        for (String curParam : idsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                ids.add(curParam);
            }
        }
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        return imp.catalogsLocalStoresDeleteHttp(request, catalogId, ids, adAccountId);
    }

    @ApiAction
    public Result catalogsLocalStoresList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=19)String catalogId) throws Exception {
        String[] idsArray = request.queryString().get("ids");
        List<String> idsList = OpenAPIUtils.parametersToList("csv", idsArray);
        List<@Pattern(regexp = "^\\d+$")String> ids = new ArrayList<>();
        for (String curParam : idsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                ids.add(curParam);
            }
        }
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        String valuebookmark = request.getQueryString("bookmark");
        String bookmark;
        if (valuebookmark != null) {
            bookmark = valuebookmark;
        } else {
            bookmark = null;
        }
        String valuepageSize = request.getQueryString("page_size");
        Integer pageSize;
        if (valuepageSize != null) {
            pageSize = Integer.parseInt(valuepageSize);
        } else {
            pageSize = 25;
        }
        return imp.catalogsLocalStoresListHttp(request, catalogId, ids, adAccountId, bookmark, pageSize);
    }

    @ApiAction
    public Result catalogsLocalStoresUpdate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=19)String catalogId) throws Exception {
        JsonNode nodelocalStoreBatchUpdate = request.body().asJson();
        List<@Valid LocalStoreBatchUpdate> localStoreBatchUpdate;
        if (nodelocalStoreBatchUpdate != null) {
            localStoreBatchUpdate = mapper.readValue(nodelocalStoreBatchUpdate.toString(), new TypeReference<List<@Valid LocalStoreBatchUpdate>>(){});
            if (configuration.getBoolean("useInputBeanValidation")) {
                for (LocalStoreBatchUpdate curItem : localStoreBatchUpdate) {
                    OpenAPIUtils.validate(curItem);
                }
            }
        } else {
            throw new IllegalArgumentException("'LocalStoreBatchUpdate' parameter is required");
        }
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        return imp.catalogsLocalStoresUpdateHttp(request, catalogId, localStoreBatchUpdate, adAccountId);
    }

    @ApiAction
    public Result catalogsSupplementalItemsBatchGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=19)String catalogId, @Pattern(regexp="^\\d+$")String batchId) throws Exception {
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        return imp.catalogsSupplementalItemsBatchGetHttp(request, catalogId, batchId, adAccountId);
    }

}
