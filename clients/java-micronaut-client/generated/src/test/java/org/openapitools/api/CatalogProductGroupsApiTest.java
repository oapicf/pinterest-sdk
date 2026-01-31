package org.openapitools.api;

import org.openapitools.model.CatalogsListProductsByFilterRequest;
import org.openapitools.model.CatalogsProductGroupPinsList200Response;
import org.openapitools.model.CatalogsProductGroupProductCountsVertical;
import org.openapitools.model.CatalogsProductGroupsList200Response;
import org.openapitools.model.CatalogsProductGroupsUpdateRequest;
import org.openapitools.model.CatalogsVerticalProductGroup;
import org.openapitools.model.Error;
import org.openapitools.model.MultipleProductGroupsInner;
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
     * Get a list of product pins for a given Catalogs Product Group Id owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/api-features/shopping-overview/&#39;&gt;Learn more&lt;/a&gt;
     */
    @Test
    @Disabled("Not Implemented")
    public void catalogsProductGroupPinsListTest() {
        // given
        String productGroupId = "example";
        String bookmark = "example";
        Integer pageSize = 25;
        String adAccountId = "example";
        Boolean pinMetrics = false;

        // when
        CatalogsProductGroupPinsList200Response body = api.catalogsProductGroupPinsList(productGroupId, bookmark, pageSize, adAccountId, pinMetrics).block();

        // then
        // TODO implement the catalogsProductGroupPinsListTest()
    }

    
    /**
     * Create product group
     *
     * Create product group to use in Catalogs owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager. \&quot;Catalog-based product groups\&quot; can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the \&quot;retail feed-based\&quot; option. &lt;a href&#x3D;&#39;/docs/api-features/shopping-overview/&#39;&gt;Learn more&lt;/a&gt;  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
     */
    @Test
    @Disabled("Not Implemented")
    public void catalogsProductGroupsCreateTest() {
        // given
        MultipleProductGroupsInner multipleProductGroupsInner = new MultipleProductGroupsInner();
        String adAccountId = "example";

        // when
        CatalogsVerticalProductGroup body = api.catalogsProductGroupsCreate(multipleProductGroupsInner, adAccountId).block();

        // then
        // TODO implement the catalogsProductGroupsCreateTest()
    }

    
    /**
     * Create product groups
     *
     * Create product group to use in Catalogs owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/api-features/shopping-overview/&#39;&gt;Learn more&lt;/a&gt;  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
     */
    @Test
    @Disabled("Not Implemented")
    public void catalogsProductGroupsCreateManyTest() {
        // given
        List<MultipleProductGroupsInner> multipleProductGroupsInner = Arrays.asList();
        String adAccountId = "example";

        // when
        List<String> body = api.catalogsProductGroupsCreateMany(multipleProductGroupsInner, adAccountId).block();

        // then
        // TODO implement the catalogsProductGroupsCreateManyTest()
    }

    
    /**
     * Delete product group
     *
     * Delete a product group owned by the \&quot;operation user_account\&quot; from being in use in Catalogs. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/api-features/shopping-overview/&#39;&gt;Learn more&lt;/a&gt;
     */
    @Test
    @Disabled("Not Implemented")
    public void catalogsProductGroupsDeleteTest() {
        // given
        String productGroupId = "example";
        String adAccountId = "example";

        // when
        api.catalogsProductGroupsDelete(productGroupId, adAccountId).block();

        // then
        // TODO implement the catalogsProductGroupsDeleteTest()
    }

    
    /**
     * Delete product groups
     *
     * Delete product groups owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/api-features/shopping-overview/&#39;&gt;Learn more&lt;/a&gt;
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
     * Get a singe product group for a given Catalogs Product Group Id owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/api-features/shopping-overview/&#39;&gt;Learn more&lt;/a&gt;
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
     * Get a list of product groups for a given Catalogs Feed Id owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/api-features/shopping-overview/&#39;&gt;Learn more&lt;/a&gt;
     */
    @Test
    @Disabled("Not Implemented")
    public void catalogsProductGroupsListTest() {
        // given
        List<Integer> id = Arrays.asList();
        String feedId = "example";
        String catalogId = "example";
        String bookmark = "example";
        Integer pageSize = 25;
        String adAccountId = "example";

        // when
        CatalogsProductGroupsList200Response body = api.catalogsProductGroupsList(id, feedId, catalogId, bookmark, pageSize, adAccountId).block();

        // then
        // TODO implement the catalogsProductGroupsListTest()
    }

    
    /**
     * Get product counts
     *
     * Get a product counts for a given Catalogs Product Group owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/api-features/shopping-overview/&#39;&gt;Learn more&lt;/a&gt;
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
     * Update product group owned by the \&quot;operation user_account\&quot; to use in Catalogs. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager. \&quot;Catalog-based product groups\&quot; can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the \&quot;retail feed-based\&quot; option. &lt;a href&#x3D;&#39;/docs/api-features/shopping-overview/&#39;&gt;Learn more&lt;/a&gt;  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
     */
    @Test
    @Disabled("Not Implemented")
    public void catalogsProductGroupsUpdateTest() {
        // given
        String productGroupId = "example";
        CatalogsProductGroupsUpdateRequest catalogsProductGroupsUpdateRequest = new CatalogsProductGroupsUpdateRequest();
        String adAccountId = "example";

        // when
        CatalogsVerticalProductGroup body = api.catalogsProductGroupsUpdate(productGroupId, catalogsProductGroupsUpdateRequest, adAccountId).block();

        // then
        // TODO implement the catalogsProductGroupsUpdateTest()
    }

    
    /**
     * List products by filter
     *
     * List products Pins owned by the \&quot;operation user_account\&quot; that meet the criteria specified in the Catalogs Product Group Filter given in the request. - This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: This endpoint only supports RETAIL catalog at the moment.  &lt;a href&#x3D;&#39;/docs/api-features/shopping-overview/&#39;&gt;Learn more&lt;/a&gt;
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
