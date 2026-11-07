package org.openapitools.api;

import org.openapitools.model.CatalogsListProductsByFilterRequest;
import org.openapitools.model.CatalogsProductGroupPinsList200Response;
import org.openapitools.model.CatalogsProductGroupProductCountsVertical;
import org.openapitools.model.CatalogsProductGroupsCreateManyRequestItems;
import org.openapitools.model.CatalogsProductGroupsCreateRequestSchema;
import org.openapitools.model.CatalogsProductGroupsList200Response;
import org.openapitools.model.CatalogsProductGroupsUpdateRequestSchema;
import org.openapitools.model.CatalogsVerticalProductGroup;
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
 * API tests for CatalogProductGroupsApi
 */
@MicronautTest
public class CatalogProductGroupsApiTest {

    @Inject
    CatalogProductGroupsApi api;

    
    /**
     * List products by product group
     *
     * Get a list of product pins for a given Catalogs Product Group Id owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
     */
    @Test
    @Disabled("Not Implemented")
    public void catalogsProductGroupPinsListTest() {
        // given
        String productGroupId = "example";
        String adAccountId = "example";
        Boolean pinMetrics = false;
        String bookmark = "example";
        Integer pageSize = 25;

        // when
        CatalogsProductGroupPinsList200Response body = api.catalogsProductGroupPinsList(productGroupId, adAccountId, pinMetrics, bookmark, pageSize).block();

        // then
        // TODO implement the catalogsProductGroupPinsListTest()
    }

    
    /**
     * Create product group
     *
     * Create product group to use in Catalogs owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager. \&quot;Catalog-based product groups\&quot; can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the \&quot;retail feed-based\&quot; option. [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
     */
    @Test
    @Disabled("Not Implemented")
    public void catalogsProductGroupsCreateTest() {
        // given
        CatalogsProductGroupsCreateRequestSchema catalogsProductGroupsCreateRequestSchema = new CatalogsProductGroupsCreateRequestSchema();
        String adAccountId = "example";

        // when
        CatalogsVerticalProductGroup body = api.catalogsProductGroupsCreate(catalogsProductGroupsCreateRequestSchema, adAccountId).block();

        // then
        // TODO implement the catalogsProductGroupsCreateTest()
    }

    
    /**
     * Create product groups
     *
     * Create product group to use in Catalogs owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
     */
    @Test
    @Disabled("Not Implemented")
    public void catalogsProductGroupsCreateManyTest() {
        // given
        List<@Valid CatalogsProductGroupsCreateManyRequestItems> catalogsProductGroupsCreateManyRequestItems = Arrays.asList();
        String adAccountId = "example";

        // when
        List<String> body = api.catalogsProductGroupsCreateMany(catalogsProductGroupsCreateManyRequestItems, adAccountId).block();

        // then
        // TODO implement the catalogsProductGroupsCreateManyTest()
    }

    
    /**
     * Delete product group
     *
     * Delete a product group owned by the \&quot;operation user_account\&quot; from being in use in Catalogs. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
     */
    @Test
    @Disabled("Not Implemented")
    public void catalogsProductGroupsDeleteTest() {
        // given
        String productGroupId = "example";
        String adAccountId = "example";

        // when
        CatalogsVerticalProductGroup body = api.catalogsProductGroupsDelete(productGroupId, adAccountId).block();

        // then
        // TODO implement the catalogsProductGroupsDeleteTest()
    }

    
    /**
     * Delete product groups
     *
     * Delete product groups owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
     */
    @Test
    @Disabled("Not Implemented")
    public void catalogsProductGroupsDeleteManyTest() {
        // given
        List<Integer> id = Arrays.asList();
        String adAccountId = "example";

        // when
        api.catalogsProductGroupsDeleteMany(id, adAccountId).block();

        // then
        // TODO implement the catalogsProductGroupsDeleteManyTest()
    }

    
    /**
     * Get product group
     *
     * Get a single product group for a given Catalogs Product Group Id owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
     */
    @Test
    @Disabled("Not Implemented")
    public void catalogsProductGroupsGetTest() {
        // given
        String productGroupId = "example";
        String adAccountId = "example";

        // when
        CatalogsVerticalProductGroup body = api.catalogsProductGroupsGet(productGroupId, adAccountId).block();

        // then
        // TODO implement the catalogsProductGroupsGetTest()
    }

    
    /**
     * List product groups
     *
     * Get a list of product groups for a given Catalogs Feed Id owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
     */
    @Test
    @Disabled("Not Implemented")
    public void catalogsProductGroupsListTest() {
        // given
        List<Integer> id = Arrays.asList();
        String feedId = "example";
        String catalogId = "example";
        String adAccountId = "example";
        String bookmark = "example";
        Integer pageSize = 25;

        // when
        CatalogsProductGroupsList200Response body = api.catalogsProductGroupsList(id, feedId, catalogId, adAccountId, bookmark, pageSize).block();

        // then
        // TODO implement the catalogsProductGroupsListTest()
    }

    
    /**
     * Get product counts
     *
     * Get a product counts for a given Catalogs Product Group owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
     */
    @Test
    @Disabled("Not Implemented")
    public void catalogsProductGroupsProductCountsGetTest() {
        // given
        String productGroupId = "example";
        String adAccountId = "example";

        // when
        CatalogsProductGroupProductCountsVertical body = api.catalogsProductGroupsProductCountsGet(productGroupId, adAccountId).block();

        // then
        // TODO implement the catalogsProductGroupsProductCountsGetTest()
    }

    
    /**
     * Update single product group
     *
     * Update product group owned by the \&quot;operation user_account\&quot; to use in Catalogs. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager. \&quot;Catalog-based product groups\&quot; can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the \&quot;retail feed-based\&quot; option. [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
     */
    @Test
    @Disabled("Not Implemented")
    public void catalogsProductGroupsUpdateTest() {
        // given
        String productGroupId = "example";
        CatalogsProductGroupsUpdateRequestSchema catalogsProductGroupsUpdateRequestSchema = new CatalogsProductGroupsUpdateRequestSchema();
        String adAccountId = "example";

        // when
        CatalogsVerticalProductGroup body = api.catalogsProductGroupsUpdate(productGroupId, catalogsProductGroupsUpdateRequestSchema, adAccountId).block();

        // then
        // TODO implement the catalogsProductGroupsUpdateTest()
    }

    
    /**
     * List products by filter
     *
     * List products Pins owned by the \&quot;operation user_account\&quot; that meet the criteria specified in the Catalogs Product Group Filter given in the request. - This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: This endpoint only supports RETAIL catalog at the moment.  [Learn more](/docs/api-features/shopping-overview/)
     */
    @Test
    @Disabled("Not Implemented")
    public void productsByProductGroupFilterListTest() {
        // given
        CatalogsListProductsByFilterRequest catalogsListProductsByFilterRequest = new CatalogsListProductsByFilterRequest();
        String bookmark = "example";
        Integer pageSize = 25;
        String adAccountId = "example";
        Boolean pinMetrics = false;

        // when
        CatalogsProductGroupPinsList200Response body = api.productsByProductGroupFilterList(catalogsListProductsByFilterRequest, bookmark, pageSize, adAccountId, pinMetrics).block();

        // then
        // TODO implement the productsByProductGroupFilterListTest()
    }

    
}
