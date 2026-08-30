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

import com.google.inject.Inject;
import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import play.mvc.Result;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import openapitools.OpenAPIUtils;
import openapitools.SecurityAPIUtils;
import static play.mvc.Results.ok;
import static play.mvc.Results.unauthorized;
import play.libs.Files.TemporaryFile;

import javax.validation.constraints.*;
import javax.validation.Valid;

@SuppressWarnings("RedundantThrows")
public abstract class CatalogSupplementalApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result catalogsLocalInventoryItemsBatchOperateHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=19)String catalogId, LocalInventoryItemsBatchCreate localInventoryItemsBatchCreate,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        SupplementalItemsBatchResponse obj = catalogsLocalInventoryItemsBatchOperate(request, catalogId, localInventoryItemsBatchCreate, adAccountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SupplementalItemsBatchResponse catalogsLocalInventoryItemsBatchOperate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=19)String catalogId, LocalInventoryItemsBatchCreate localInventoryItemsBatchCreate,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception;

    public Result catalogsLocalInventoryItemsPostHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=19)String catalogId, LocalInventoryItemsGetCreate localInventoryItemsGetCreate,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        LocalInventoryItemsGet obj = catalogsLocalInventoryItemsPost(request, catalogId, localInventoryItemsGetCreate, adAccountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract LocalInventoryItemsGet catalogsLocalInventoryItemsPost(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=19)String catalogId, LocalInventoryItemsGetCreate localInventoryItemsGetCreate,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception;

    public Result catalogsLocalStoresCreateHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=19)String catalogId, List<@Valid LocalStoreCreate> localStoreCreate,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        List<CatalogsLocalStoresCreate200ResponseInner> obj = catalogsLocalStoresCreate(request, catalogId, localStoreCreate, adAccountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (CatalogsLocalStoresCreate200ResponseInner curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<CatalogsLocalStoresCreate200ResponseInner> catalogsLocalStoresCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=19)String catalogId, List<@Valid LocalStoreCreate> localStoreCreate,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception;

    public Result catalogsLocalStoresDeleteHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=19)String catalogId, @NotNull List<@Pattern(regexp = "^\\d+$")String> ids,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        List<CatalogsLocalStoresDelete200ResponseInner> obj = catalogsLocalStoresDelete(request, catalogId, ids, adAccountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (CatalogsLocalStoresDelete200ResponseInner curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<CatalogsLocalStoresDelete200ResponseInner> catalogsLocalStoresDelete(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=19)String catalogId, @NotNull List<@Pattern(regexp = "^\\d+$")String> ids,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception;

    public Result catalogsLocalStoresListHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=19)String catalogId, List<@Pattern(regexp = "^\\d+$")String> ids,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        CatalogsLocalStoresList200Response obj = catalogsLocalStoresList(request, catalogId, ids, adAccountId, bookmark, pageSize);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CatalogsLocalStoresList200Response catalogsLocalStoresList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=19)String catalogId, List<@Pattern(regexp = "^\\d+$")String> ids,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception;

    public Result catalogsLocalStoresUpdateHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=19)String catalogId, List<@Valid LocalStoreBatchUpdate> localStoreBatchUpdate,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        List<CatalogsLocalStoresCreate200ResponseInner> obj = catalogsLocalStoresUpdate(request, catalogId, localStoreBatchUpdate, adAccountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (CatalogsLocalStoresCreate200ResponseInner curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<CatalogsLocalStoresCreate200ResponseInner> catalogsLocalStoresUpdate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=19)String catalogId, List<@Valid LocalStoreBatchUpdate> localStoreBatchUpdate,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception;

    public Result catalogsSupplementalItemsBatchGetHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=19)String catalogId,  @Pattern(regexp="^\\d+$")String batchId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        SupplementalItemsBatchResponse obj = catalogsSupplementalItemsBatchGet(request, catalogId, batchId, adAccountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SupplementalItemsBatchResponse catalogsSupplementalItemsBatchGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=19)String catalogId,  @Pattern(regexp="^\\d+$")String batchId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception;

}
