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
public class CatalogSupplementalApiControllerImp extends CatalogSupplementalApiControllerImpInterface {
    @Override
    public SupplementalItemsBatchResponse catalogsLocalInventoryItemsBatchOperate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=19)String catalogId, LocalInventoryItemsBatchCreate localInventoryItemsBatchCreate,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new SupplementalItemsBatchResponse();
    }

    @Override
    public LocalInventoryItemsGet catalogsLocalInventoryItemsPost(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=19)String catalogId, LocalInventoryItemsGetCreate localInventoryItemsGetCreate,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new LocalInventoryItemsGet();
    }

    @Override
    public List<CatalogsLocalStoresCreate200ResponseInner> catalogsLocalStoresCreate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=19)String catalogId, List<@Valid LocalStoreCreate> localStoreCreate,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new ArrayList<CatalogsLocalStoresCreate200ResponseInner>();
    }

    @Override
    public List<CatalogsLocalStoresDelete200ResponseInner> catalogsLocalStoresDelete(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=19)String catalogId, @NotNull List<@Pattern(regexp = "^\\d+$")String> ids,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new ArrayList<CatalogsLocalStoresDelete200ResponseInner>();
    }

    @Override
    public CatalogsLocalStoresList200Response catalogsLocalStoresList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=19)String catalogId, List<@Pattern(regexp = "^\\d+$")String> ids,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception {
        //Do your magic!!!
        return new CatalogsLocalStoresList200Response();
    }

    @Override
    public List<CatalogsLocalStoresCreate200ResponseInner> catalogsLocalStoresUpdate(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=19)String catalogId, List<@Valid LocalStoreBatchUpdate> localStoreBatchUpdate,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new ArrayList<CatalogsLocalStoresCreate200ResponseInner>();
    }

    @Override
    public SupplementalItemsBatchResponse catalogsSupplementalItemsBatchGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=19)String catalogId,  @Pattern(regexp="^\\d+$")String batchId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new SupplementalItemsBatchResponse();
    }

}
