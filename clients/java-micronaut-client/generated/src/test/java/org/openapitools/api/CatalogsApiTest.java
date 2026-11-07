package org.openapitools.api;

import org.openapitools.model.Catalog;
import org.openapitools.model.CatalogCreate;
import org.openapitools.model.CatalogsAvailableFilterValues;
import org.openapitools.model.CatalogsList200Response;
import org.openapitools.model.CatalogsLocale;
import org.openapitools.model.Country;
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
 * API tests for CatalogsApi
 */
@MicronautTest
public class CatalogsApiTest {

    @Inject
    CatalogsApi api;

    
    /**
     * List available filter values
     *
     * Get the available filter attributes and values associated with a given feed or catalog owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account. - &#x60;country&#x60;, &#x60;language&#x60;, and &#x60;feed_id&#x60; are only used in retail catalogs. - Note: It is not guaranteed that all available filter values will be returned. Instead this endpoint will return values from a sample of up to 1000 items.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
     */
    @Test
    @Disabled("Not Implemented")
    public void catalogsAvailableFilterValuesTest() {
        // given
        String catalogId = "example";
        String feedId = "example";
        Country country = Country.fromValue("AD");
        CatalogsLocale language = CatalogsLocale.fromValue("af-ZA");
        String adAccountId = "example";

        // when
        CatalogsAvailableFilterValues body = api.catalogsAvailableFilterValues(catalogId, feedId, country, language, adAccountId).block();

        // then
        // TODO implement the catalogsAvailableFilterValuesTest()
    }

    
    /**
     * Create catalog
     *
     * Create a new catalog owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Product and Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
     */
    @Test
    @Disabled("Not Implemented")
    public void catalogsCreateTest() {
        // given
        CatalogCreate catalogCreate = new CatalogCreate(org.openapitools.model.CatalogsType.fromValue("RETAIL"), "example");
        String adAccountId = "example";

        // when
        Catalog body = api.catalogsCreate(catalogCreate, adAccountId).block();

        // then
        // TODO implement the catalogsCreateTest()
    }

    
    /**
     * List catalogs
     *
     * Fetch catalogs owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
     */
    @Test
    @Disabled("Not Implemented")
    public void catalogsListTest() {
        // given
        String adAccountId = "example";
        String bookmark = "example";
        Integer pageSize = 25;

        // when
        CatalogsList200Response body = api.catalogsList(adAccountId, bookmark, pageSize).block();

        // then
        // TODO implement the catalogsListTest()
    }

    
}
