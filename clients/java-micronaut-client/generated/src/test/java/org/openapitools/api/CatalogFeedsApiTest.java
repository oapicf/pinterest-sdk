package org.openapitools.api;

import org.openapitools.model.CatalogsFeed;
import org.openapitools.model.CatalogsFeedCreateRequestSchema;
import org.openapitools.model.CatalogsFeedIngestion;
import org.openapitools.model.CatalogsFeedUpdateRequestSchema;
import org.openapitools.model.CatalogsItemValidationIssue;
import org.openapitools.model.FeedProcessingResultsList200Response;
import org.openapitools.model.FeedsList200Response;
import org.openapitools.model.ItemsIssuesList200Response;
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
 * API tests for CatalogFeedsApi
 */
@MicronautTest
public class CatalogFeedsApiTest {

    @Inject
    CatalogFeedsApi api;

    
    /**
     * List feed processing results
     *
     * Fetch a feed processing results owned by the \&quot;operation user_account\&quot;. Please note that for now the bookmark parameter is not functional and only the first page will be available until it is implemented in some release in the near future. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
     */
    @Test
    @Disabled("Not Implemented")
    public void feedProcessingResultsListTest() {
        // given
        String feedId = "example";
        String adAccountId = "example";
        String bookmark = "example";
        Integer pageSize = 25;

        // when
        FeedProcessingResultsList200Response body = api.feedProcessingResultsList(feedId, adAccountId, bookmark, pageSize).block();

        // then
        // TODO implement the feedProcessingResultsListTest()
    }

    
    /**
     * Create feed
     *
     * Create a new feed owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Please, be aware that \&quot;default_country\&quot; and \&quot;default_locale\&quot; are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to [Before you get started with Catalogs](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs). For Hotel partners, refer to [Pinterest API for shopping](/docs/api-features/shopping-overview/).  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
     */
    @Test
    @Disabled("Not Implemented")
    public void feedsCreateTest() {
        // given
        CatalogsFeedCreateRequestSchema catalogsFeedCreateRequestSchema = new CatalogsFeedCreateRequestSchema();
        String adAccountId = "example";

        // when
        CatalogsFeed body = api.feedsCreate(catalogsFeedCreateRequestSchema, adAccountId).block();

        // then
        // TODO implement the feedsCreateTest()
    }

    
    /**
     * Delete feed
     *
     * Delete a feed owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to [Before you get started with Catalogs](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs). For Hotel partners, refer to [Pinterest API for shopping](/docs/api-features/shopping-overview/).
     */
    @Test
    @Disabled("Not Implemented")
    public void feedsDeleteTest() {
        // given
        String feedId = "example";
        String adAccountId = "example";

        // when
        CatalogsFeed body = api.feedsDelete(feedId, adAccountId).block();

        // then
        // TODO implement the feedsDeleteTest()
    }

    
    /**
     * Get feed
     *
     * Get a single feed owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to [Before you get started with Catalogs](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs). For Hotel partners, refer to [Pinterest API for shopping](/docs/api-features/shopping-overview/).
     */
    @Test
    @Disabled("Not Implemented")
    public void feedsGetTest() {
        // given
        String feedId = "example";
        String adAccountId = "example";

        // when
        CatalogsFeed body = api.feedsGet(feedId, adAccountId).block();

        // then
        // TODO implement the feedsGetTest()
    }

    
    /**
     * Ingest feed items
     *
     * Ingest items for a given feed owned by the \&quot;operation user_account\&quot;.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)  Note: This endpoint is restricted to a specific group of users. If you require access, please reach out to your partner manager.
     */
    @Test
    @Disabled("Not Implemented")
    public void feedsIngestTest() {
        // given
        String feedId = "example";
        String adAccountId = "example";

        // when
        CatalogsFeedIngestion body = api.feedsIngest(feedId, adAccountId).block();

        // then
        // TODO implement the feedsIngestTest()
    }

    
    /**
     * List feeds
     *
     * Fetch feeds owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to [Before you get started with Catalogs](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs). For Hotel partners, refer to [Pinterest API for shopping](/docs/api-features/shopping-overview/).
     */
    @Test
    @Disabled("Not Implemented")
    public void feedsListTest() {
        // given
        String catalogId = "example";
        String adAccountId = "example";
        String bookmark = "example";
        Integer pageSize = 25;

        // when
        FeedsList200Response body = api.feedsList(catalogId, adAccountId, bookmark, pageSize).block();

        // then
        // TODO implement the feedsListTest()
    }

    
    /**
     * Update feed
     *
     * Update a feed owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to [Before you get started with Catalogs](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs). For Hotel partners, refer to [Pinterest API for shopping](/docs/api-features/shopping-overview/).  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
     */
    @Test
    @Disabled("Not Implemented")
    public void feedsUpdateTest() {
        // given
        String feedId = "example";
        CatalogsFeedUpdateRequestSchema catalogsFeedUpdateRequestSchema = new CatalogsFeedUpdateRequestSchema();
        String adAccountId = "example";

        // when
        CatalogsFeed body = api.feedsUpdate(feedId, catalogsFeedUpdateRequestSchema, adAccountId).block();

        // then
        // TODO implement the feedsUpdateTest()
    }

    
    /**
     * List item issues
     *
     * List item validation issues for a given feed processing result owned by the \&quot;operation user_account\&quot;. Up to 20 random samples of affected items are returned for each error and warning code. Please note that for now query parameters &#39;item_numbers&#39; and &#39;item_validation_issue&#39; cannot be used simultaneously until it is implemented in some release in the future. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: To get a list of all affected items instead of sampled issues, please refer to [Build catalogs report](/docs/api/v5/#operation/reports/create) and [Get catalogs report](/docs/api/v5/#operation/reports/get) endpoints. Moreover, they support multiple types of catalogs.  [Learn more](/docs/api-features/shopping-overview/)
     */
    @Test
    @Disabled("Not Implemented")
    public void itemsIssuesListTest() {
        // given
        String processingResultId = "example";
        List<Integer> itemNumbers = Arrays.asList();
        CatalogsItemValidationIssue itemValidationIssue = CatalogsItemValidationIssue.fromValue("AD_IMAGE_0_LINK_LENGTH_TOO_LONG");
        String adAccountId = "example";
        String bookmark = "example";
        Integer pageSize = 25;

        // when
        ItemsIssuesList200Response body = api.itemsIssuesList(processingResultId, itemNumbers, itemValidationIssue, adAccountId, bookmark, pageSize).block();

        // then
        // TODO implement the itemsIssuesListTest()
    }

    
}
