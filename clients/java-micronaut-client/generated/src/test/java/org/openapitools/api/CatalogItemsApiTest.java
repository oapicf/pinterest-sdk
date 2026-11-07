package org.openapitools.api;

import org.openapitools.model.CatalogsItemsBatch;
import org.openapitools.model.CatalogsItemsBatchPostRequest;
import org.openapitools.model.CatalogsItemsRequest;
import org.openapitools.model.ItemsPost200Response;
import org.openapitools.model.PinterestLibError;
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
 * API tests for CatalogItemsApi
 */
@MicronautTest
public class CatalogItemsApiTest {

    @Inject
    CatalogItemsApi api;

    
    /**
     * Get item batch status
     *
     * Get a single catalogs items batch owned by the \&quot;operating user_account\&quot;. [See detailed documentation here.](/docs/api-features/shopping-overview/#Update%20items%20in%20batch) - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.
     */
    @Test
    @Disabled("Not Implemented")
    public void itemsBatchGetTest() {
        // given
        String batchId = "example";
        String adAccountId = "example";

        // when
        CatalogsItemsBatch body = api.itemsBatchGet(batchId, adAccountId).block();

        // then
        // TODO implement the itemsBatchGetTest()
    }

    
    /**
     * Operate on item batch
     *
     * This endpoint supports multiple operations on a set of one or more catalog items owned by the \&quot;operation user_account\&quot;. [See detailed documentation here.](/docs/work-with-catalogs/modify-items-in-batch/) - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: - Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager. - The item UPSERT operation is restricted to users without a feed data source. If you plan to migrate item ingestion from feeds to the API, please reach out to your partner manager or via the Help Center to get assistance.
     */
    @Test
    @Disabled("Not Implemented")
    public void itemsBatchPostTest() {
        // given
        CatalogsItemsBatchPostRequest catalogsItemsBatchPostRequest = new CatalogsItemsBatchPostRequest();
        String adAccountId = "example";

        // when
        CatalogsItemsBatch body = api.itemsBatchPost(catalogsItemsBatchPostRequest, adAccountId).block();

        // then
        // TODO implement the itemsBatchPostTest()
    }

    
    /**
     * Get catalogs items (POST)
     *
     * Get the items of the catalog owned by the \&quot;operation user_account\&quot;. [See detailed documentation here.](/docs/api-features/shopping-overview/#Update%20items%20in%20batch) - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
     */
    @Test
    @Disabled("Not Implemented")
    public void itemsPostTest() {
        // given
        CatalogsItemsRequest catalogsItemsRequest = new CatalogsItemsRequest(org.openapitools.model.Country.fromValue("AD"), null, "example");
        String adAccountId = "example";

        // when
        ItemsPost200Response body = api.itemsPost(catalogsItemsRequest, adAccountId).block();

        // then
        // TODO implement the itemsPostTest()
    }

    
}
