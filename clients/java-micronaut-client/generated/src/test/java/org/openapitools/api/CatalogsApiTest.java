package org.openapitools.api;

import org.openapitools.model.Catalog;
import org.openapitools.model.CatalogsAvailableFilterValues;
import org.openapitools.model.CatalogsCreateRequest;
import org.openapitools.model.CatalogsList200Response;
import org.openapitools.model.CatalogsLocale;
import org.openapitools.model.Country;
import org.openapitools.model.Error;
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
 * API tests for CatalogsApi
 */
@MicronautTest
public class CatalogsApiTest {

    @Inject
    CatalogsApi api;

    
    /**
     * List available filter values
     *
     * Get the available filter attributes and values associated with a given feed or catalog owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account. - &lt;code&gt;country&lt;/code&gt;, &lt;code&gt;language&lt;/code&gt;, and &lt;code&gt;feed_id&lt;/code&gt; are only used in retail catalogs. - Note: It is not guaranteed that all available filter values will be returned. Instead this endpoint will return values from a sample of up to 1000 items.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/api-features/shopping-overview/&#39;&gt;Learn more&lt;/a&gt;
     */
    @Test
    @Disabled("Not Implemented")
    public void catalogsAvailableFilterValuesTest() {
        // given
        String catalogId = "example";
        String feedId = "example";
        Country country = Country.fromValue("US");
        CatalogsLocale language = CatalogsLocale.fromValue("en-US");
        String adAccountId = "example";

        // when
        CatalogsAvailableFilterValues body = api.catalogsAvailableFilterValues(catalogId, feedId, country, language, adAccountId).block();

        // then
        // TODO implement the catalogsAvailableFilterValuesTest()
    }

    
    /**
     * Create catalog
     *
     * Create a new catalog owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/api-features/shopping-overview/&#39;&gt;Learn more&lt;/a&gt;  Note: Access to the Product and Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
     */
    @Test
    @Disabled("Not Implemented")
    public void catalogsCreateTest() {
        // given
        CatalogsCreateRequest catalogsCreateRequest = new CatalogsCreateRequest(org.openapitools.model.CatalogsType.fromValue("RETAIL"), "example");
        String adAccountId = "example";

        // when
        Catalog body = api.catalogsCreate(catalogsCreateRequest, adAccountId).block();

        // then
        // TODO implement the catalogsCreateTest()
    }

    
    /**
     * List catalogs
     *
     * Fetch catalogs owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/api-features/shopping-overview/&#39;&gt;Learn more&lt;/a&gt;
     */
    @Test
    @Disabled("Not Implemented")
    public void catalogsListTest() {
        // given
        String bookmark = "example";
        Integer pageSize = 25;
        String adAccountId = "example";

        // when
        CatalogsList200Response body = api.catalogsList(bookmark, pageSize, adAccountId).block();

        // then
        // TODO implement the catalogsListTest()
    }

    
}
