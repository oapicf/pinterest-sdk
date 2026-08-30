package org.openapitools.api;

import org.openapitools.model.CatalogsLocalStoresCreate200ResponseInner;
import org.openapitools.model.CatalogsLocalStoresDelete200ResponseInner;
import org.openapitools.model.CatalogsLocalStoresList200Response;
import org.openapitools.model.LocalInventoryItemsBatch;
import org.openapitools.model.LocalInventoryItemsBatchCreate;
import org.openapitools.model.LocalInventoryItemsGet;
import org.openapitools.model.LocalInventoryItemsGetCreate;
import org.openapitools.model.LocalStore;
import org.openapitools.model.LocalStoreBatchUpdate;
import org.openapitools.model.LocalStoreCreate;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.SupplementalItemsBatchResponse;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import jakarta.inject.Inject;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;

/**
 * API tests for CatalogSupplementalApi
 */
@MicronautTest
public class CatalogSupplementalApiTest {

    @Inject
    CatalogSupplementalApi api;

    
    /**
     * Operate on local inventory item batch
     *
     * Managing local inventory information in batches supporting CREATE, UPDATE, UPSERT, DELETE operations. Up to 1000 items per request to match catalogs/items.  - Must provide both item_id and store_code to identify a local inventory item.  - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
     */
    @Test
    @Disabled("Not Implemented")
    public void catalogsLocalInventoryItemsBatchOperateTest() {
        // given
        String catalogId = "example";
        LocalInventoryItemsBatchCreate localInventoryItemsBatchCreate = new LocalInventoryItemsBatchCreate(Arrays.asList());
        String adAccountId = "example";

        // when
        SupplementalItemsBatchResponse body = api.catalogsLocalInventoryItemsBatchOperate(catalogId, localInventoryItemsBatchCreate, adAccountId).block();

        // then
        // TODO implement the catalogsLocalInventoryItemsBatchOperateTest()
    }

    
    /**
     * Get local inventory items (POST)
     *
     * Get local inventory items for a catalog owned by the \&quot;operation user_account\&quot;.  - Must provide an array of {item_id, store_code} pairs in item filters to identify local inventory items.  - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
     */
    @Test
    @Disabled("Not Implemented")
    public void catalogsLocalInventoryItemsPostTest() {
        // given
        String catalogId = "example";
        LocalInventoryItemsGetCreate localInventoryItemsGetCreate = new LocalInventoryItemsGetCreate(Arrays.asList());
        String adAccountId = "example";

        // when
        LocalInventoryItemsGet body = api.catalogsLocalInventoryItemsPost(catalogId, localInventoryItemsGetCreate, adAccountId).block();

        // then
        // TODO implement the catalogsLocalInventoryItemsPostTest()
    }

    
    /**
     * Create local stores
     *
     * Create a local store for a catalog owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
     */
    @Test
    @Disabled("Not Implemented")
    public void catalogsLocalStoresCreateTest() {
        // given
        String catalogId = "example";
        List<@Valid LocalStoreCreate> localStoreCreate = Arrays.asList();
        String adAccountId = "example";

        // when
        List<CatalogsLocalStoresCreate200ResponseInner> body = api.catalogsLocalStoresCreate(catalogId, localStoreCreate, adAccountId).block();

        // then
        // TODO implement the catalogsLocalStoresCreateTest()
    }

    
    /**
     * Delete local stores
     *
     *   Delete multiple local stores for a catalog owned by the \&quot;operation user_account\&quot;.   - By default, the \&quot;operation user_account\&quot; is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)
     */
    @Test
    @Disabled("Not Implemented")
    public void catalogsLocalStoresDeleteTest() {
        // given
        String catalogId = "example";
        List<@Pattern(regexp = "^\\d+$")String> ids = Arrays.asList("example");
        String adAccountId = "example";

        // when
        List<CatalogsLocalStoresDelete200ResponseInner> body = api.catalogsLocalStoresDelete(catalogId, ids, adAccountId).block();

        // then
        // TODO implement the catalogsLocalStoresDeleteTest()
    }

    
    /**
     * List local stores
     *
     * Fetch local stores for a catalog owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
     */
    @Test
    @Disabled("Not Implemented")
    public void catalogsLocalStoresListTest() {
        // given
        String catalogId = "example";
        List<@Pattern(regexp = "^\\d+$")String> ids = Arrays.asList("example");
        String adAccountId = "example";
        String bookmark = "example";
        Integer pageSize = 25;

        // when
        CatalogsLocalStoresList200Response body = api.catalogsLocalStoresList(catalogId, ids, adAccountId, bookmark, pageSize).block();

        // then
        // TODO implement the catalogsLocalStoresListTest()
    }

    
    /**
     * Update local stores
     *
     *   Update a local store for a catalog owned by the \&quot;operation user_account\&quot;.   - By default, the \&quot;operation user_account\&quot; is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)
     */
    @Test
    @Disabled("Not Implemented")
    public void catalogsLocalStoresUpdateTest() {
        // given
        String catalogId = "example";
        List<@Valid LocalStoreBatchUpdate> localStoreBatchUpdate = Arrays.asList();
        String adAccountId = "example";

        // when
        List<CatalogsLocalStoresCreate200ResponseInner> body = api.catalogsLocalStoresUpdate(catalogId, localStoreBatchUpdate, adAccountId).block();

        // then
        // TODO implement the catalogsLocalStoresUpdateTest()
    }

    
    /**
     * Get supplemental items batch status
     *
     * Fetch the status and results of a supplemental items batch operation. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
     */
    @Test
    @Disabled("Not Implemented")
    public void catalogsSupplementalItemsBatchGetTest() {
        // given
        String catalogId = "example";
        String batchId = "example";
        String adAccountId = "example";

        // when
        SupplementalItemsBatchResponse body = api.catalogsSupplementalItemsBatchGet(catalogId, batchId, adAccountId).block();

        // then
        // TODO implement the catalogsSupplementalItemsBatchGetTest()
    }

    
}
