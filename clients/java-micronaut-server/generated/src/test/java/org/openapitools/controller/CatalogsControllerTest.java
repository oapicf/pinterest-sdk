package org.openapitools.controller;

import org.openapitools.model.CatalogsFeed;
import org.openapitools.model.CatalogsItemValidationIssue;
import org.openapitools.model.CatalogsItems;
import org.openapitools.model.CatalogsItemsBatch;
import org.openapitools.model.CatalogsItemsFilters;
import org.openapitools.model.CatalogsList200Response;
import org.openapitools.model.CatalogsListProductsByFilterRequest;
import org.openapitools.model.CatalogsProductGroupPinsList200Response;
import org.openapitools.model.CatalogsProductGroupProductCounts;
import org.openapitools.model.CatalogsProductGroupsCreate201Response;
import org.openapitools.model.CatalogsProductGroupsCreateRequest;
import org.openapitools.model.CatalogsProductGroupsList200Response;
import org.openapitools.model.CatalogsProductGroupsUpdateRequest;
import org.openapitools.model.Error;
import org.openapitools.model.FeedProcessingResultsList200Response;
import org.openapitools.model.FeedsCreateRequest;
import org.openapitools.model.FeedsList200Response;
import org.openapitools.model.FeedsUpdateRequest;
import org.openapitools.model.ItemsBatchPostRequest;
import org.openapitools.model.ItemsIssuesList200Response;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.runtime.server.EmbeddedServer;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.MutableHttpRequest;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.uri.UriTemplate;
import io.micronaut.http.cookie.Cookie;
import io.micronaut.http.client.multipart.MultipartBody;
import io.micronaut.core.type.Argument;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Assertions;
import jakarta.inject.Inject;
import reactor.core.publisher.Mono;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;


/**
 * API tests for CatalogsController
 */
@MicronautTest
public class CatalogsControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    CatalogsController controller;

    /**
     * This test is used to validate the implementation of catalogsList() method
     *
     * The method should: List catalogs
     *
     * Fetch catalogs owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Learn more&lt;/a&gt;
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void catalogsListMethodTest() {
        // given
        String bookmark = "example";
        Integer pageSize = 25;
        String adAccountId = "example";

        // when
        CatalogsList200Response result = controller.catalogsList(bookmark, pageSize, adAccountId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/catalogs' to the features of catalogsList() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void catalogsListClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/catalogs").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("application/json");
        request.getParameters()
            .add("bookmark", "example") // The query parameter format should be 
            .add("page_size", String.valueOf(25)) // The query parameter format should be 
            .add("ad_account_id", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, CatalogsList200Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of catalogsProductGroupPinsList() method
     *
     * The method should: List products for a Product Group
     *
     * Get a list of product pins for a given Catalogs Product Group Id owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Learn more&lt;/a&gt;
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void catalogsProductGroupPinsListMethodTest() {
        // given
        String productGroupId = "example";
        String bookmark = "example";
        Integer pageSize = 25;
        String adAccountId = "example";

        // when
        CatalogsProductGroupPinsList200Response result = controller.catalogsProductGroupPinsList(productGroupId, bookmark, pageSize, adAccountId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/catalogs/product_groups/{product_group_id}/products' to the features of catalogsProductGroupPinsList() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void catalogsProductGroupPinsListClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/catalogs/product_groups/{product_group_id}/products").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("product_group_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("application/json");
        request.getParameters()
            .add("bookmark", "example") // The query parameter format should be 
            .add("page_size", String.valueOf(25)) // The query parameter format should be 
            .add("ad_account_id", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, CatalogsProductGroupPinsList200Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of catalogsProductGroupsCreate() method
     *
     * The method should: Create product group
     *
     * Create product group to use in Catalogs owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Learn more&lt;/a&gt;
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void catalogsProductGroupsCreateMethodTest() {
        // given
        CatalogsProductGroupsCreateRequest catalogsProductGroupsCreateRequest = new CatalogsProductGroupsCreateRequest();
        String adAccountId = "example";

        // when
        CatalogsProductGroupsCreate201Response result = controller.catalogsProductGroupsCreate(catalogsProductGroupsCreateRequest, adAccountId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/catalogs/product_groups' to the features of catalogsProductGroupsCreate() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void catalogsProductGroupsCreateClientApiTest() throws IOException {
        // given
        CatalogsProductGroupsCreateRequest body = new CatalogsProductGroupsCreateRequest();
        String uri = UriTemplate.of("/catalogs/product_groups").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("application/json");
        request.getParameters()
            .add("ad_account_id", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, CatalogsProductGroupsCreate201Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of catalogsProductGroupsDelete() method
     *
     * The method should: Delete product group
     *
     * Delete a product group owned by the \&quot;operation user_account\&quot; from being in use in Catalogs. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Learn more&lt;/a&gt;
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void catalogsProductGroupsDeleteMethodTest() {
        // given
        String productGroupId = "example";
        String adAccountId = "example";

        // when
        controller.catalogsProductGroupsDelete(productGroupId, adAccountId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/catalogs/product_groups/{product_group_id}' to the features of catalogsProductGroupsDelete() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void catalogsProductGroupsDeleteClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/catalogs/product_groups/{product_group_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("product_group_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.DELETE(uri)
            .accept("application/json");
        request.getParameters()
            .add("ad_account_id", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request); // To retrieve body you must specify required type (e.g. Map.class) as second argument 

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of catalogsProductGroupsGet() method
     *
     * The method should: Get product group
     *
     * Get a singe product group for a given Catalogs Product Group Id owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Learn more&lt;/a&gt;
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void catalogsProductGroupsGetMethodTest() {
        // given
        String productGroupId = "example";
        String adAccountId = "example";

        // when
        CatalogsProductGroupsCreate201Response result = controller.catalogsProductGroupsGet(productGroupId, adAccountId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/catalogs/product_groups/{product_group_id}' to the features of catalogsProductGroupsGet() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void catalogsProductGroupsGetClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/catalogs/product_groups/{product_group_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("product_group_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("application/json");
        request.getParameters()
            .add("ad_account_id", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, CatalogsProductGroupsCreate201Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of catalogsProductGroupsList() method
     *
     * The method should: List product groups
     *
     * Get a list of product groups for a given Catalogs Feed Id owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Learn more&lt;/a&gt;
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void catalogsProductGroupsListMethodTest() {
        // given
        String feedId = "example";
        String catalogId = "example";
        String bookmark = "example";
        Integer pageSize = 25;
        String adAccountId = "example";

        // when
        CatalogsProductGroupsList200Response result = controller.catalogsProductGroupsList(feedId, catalogId, bookmark, pageSize, adAccountId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/catalogs/product_groups' to the features of catalogsProductGroupsList() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void catalogsProductGroupsListClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/catalogs/product_groups").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("application/json");
        request.getParameters()
            .add("feed_id", "example") // The query parameter format should be 
            .add("catalog_id", "example") // The query parameter format should be 
            .add("bookmark", "example") // The query parameter format should be 
            .add("page_size", String.valueOf(25)) // The query parameter format should be 
            .add("ad_account_id", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, CatalogsProductGroupsList200Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of catalogsProductGroupsProductCountsGet() method
     *
     * The method should: Get product counts for a Product Group
     *
     * Get a product counts for a given Catalogs Product Group owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Learn more&lt;/a&gt;
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void catalogsProductGroupsProductCountsGetMethodTest() {
        // given
        String productGroupId = "example";
        String adAccountId = "example";

        // when
        CatalogsProductGroupProductCounts result = controller.catalogsProductGroupsProductCountsGet(productGroupId, adAccountId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/catalogs/product_groups/{product_group_id}/product_counts' to the features of catalogsProductGroupsProductCountsGet() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void catalogsProductGroupsProductCountsGetClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/catalogs/product_groups/{product_group_id}/product_counts").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("product_group_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("application/json");
        request.getParameters()
            .add("ad_account_id", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, CatalogsProductGroupProductCounts.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of catalogsProductGroupsUpdate() method
     *
     * The method should: Update product group
     *
     * Update product group owned by the \&quot;operation user_account\&quot; to use in Catalogs. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Learn more&lt;/a&gt;
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void catalogsProductGroupsUpdateMethodTest() {
        // given
        String productGroupId = "example";
        CatalogsProductGroupsUpdateRequest catalogsProductGroupsUpdateRequest = new CatalogsProductGroupsUpdateRequest();
        String adAccountId = "example";

        // when
        CatalogsProductGroupsCreate201Response result = controller.catalogsProductGroupsUpdate(productGroupId, catalogsProductGroupsUpdateRequest, adAccountId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/catalogs/product_groups/{product_group_id}' to the features of catalogsProductGroupsUpdate() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void catalogsProductGroupsUpdateClientApiTest() throws IOException {
        // given
        CatalogsProductGroupsUpdateRequest body = new CatalogsProductGroupsUpdateRequest();
        String uri = UriTemplate.of("/catalogs/product_groups/{product_group_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("product_group_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.PATCH(uri, body)
            .accept("application/json");
        request.getParameters()
            .add("ad_account_id", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, CatalogsProductGroupsCreate201Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of feedProcessingResultsList() method
     *
     * The method should: List processing results for a given feed
     *
     * Fetch a feed processing results owned by the \&quot;operation user_account\&quot;. Please note that for now the bookmark parameter is not functional and only the first page will be available until it is implemented in some release in the near future. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Learn more&lt;/a&gt;
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void feedProcessingResultsListMethodTest() {
        // given
        String feedId = "example";
        String bookmark = "example";
        Integer pageSize = 25;
        String adAccountId = "example";

        // when
        FeedProcessingResultsList200Response result = controller.feedProcessingResultsList(feedId, bookmark, pageSize, adAccountId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/catalogs/feeds/{feed_id}/processing_results' to the features of feedProcessingResultsList() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void feedProcessingResultsListClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/catalogs/feeds/{feed_id}/processing_results").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("feed_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("application/json");
        request.getParameters()
            .add("bookmark", "example") // The query parameter format should be 
            .add("page_size", String.valueOf(25)) // The query parameter format should be 
            .add("ad_account_id", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, FeedProcessingResultsList200Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of feedsCreate() method
     *
     * The method should: Create feed
     *
     * Create a new feed owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Please, be aware that \&quot;default_country\&quot; and \&quot;default_locale\&quot; are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to &lt;a href&#x3D;&#39;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs&#39;&gt;Before you get started with Catalogs&lt;/a&gt;. For Hotel parterns, refer to &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Pinterest API for shopping&lt;/a&gt;.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void feedsCreateMethodTest() {
        // given
        FeedsCreateRequest feedsCreateRequest = new FeedsCreateRequest();
        String adAccountId = "example";

        // when
        CatalogsFeed result = controller.feedsCreate(feedsCreateRequest, adAccountId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/catalogs/feeds' to the features of feedsCreate() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void feedsCreateClientApiTest() throws IOException {
        // given
        FeedsCreateRequest body = new FeedsCreateRequest();
        String uri = UriTemplate.of("/catalogs/feeds").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("application/json");
        request.getParameters()
            .add("ad_account_id", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, CatalogsFeed.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of feedsDelete() method
     *
     * The method should: Delete feed
     *
     * Delete a feed owned by the \&quot;operating user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to &lt;a href&#x3D;&#39;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs&#39;&gt;Before you get started with Catalogs&lt;/a&gt;. For Hotel parterns, refer to &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Pinterest API for shopping&lt;/a&gt;.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void feedsDeleteMethodTest() {
        // given
        String feedId = "example";
        String adAccountId = "example";

        // when
        controller.feedsDelete(feedId, adAccountId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/catalogs/feeds/{feed_id}' to the features of feedsDelete() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void feedsDeleteClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/catalogs/feeds/{feed_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("feed_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.DELETE(uri)
            .accept("application/json");
        request.getParameters()
            .add("ad_account_id", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request); // To retrieve body you must specify required type (e.g. Map.class) as second argument 

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of feedsGet() method
     *
     * The method should: Get feed
     *
     * Get a single feed owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to &lt;a href&#x3D;&#39;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs&#39;&gt;Before you get started with Catalogs&lt;/a&gt;. For Hotel parterns, refer to &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Pinterest API for shopping&lt;/a&gt;.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void feedsGetMethodTest() {
        // given
        String feedId = "example";
        String adAccountId = "example";

        // when
        CatalogsFeed result = controller.feedsGet(feedId, adAccountId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/catalogs/feeds/{feed_id}' to the features of feedsGet() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void feedsGetClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/catalogs/feeds/{feed_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("feed_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("application/json");
        request.getParameters()
            .add("ad_account_id", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, CatalogsFeed.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of feedsList() method
     *
     * The method should: List feeds
     *
     * Fetch feeds owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to &lt;a href&#x3D;&#39;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs&#39;&gt;Before you get started with Catalogs&lt;/a&gt;. For Hotel parterns, refer to &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Pinterest API for shopping&lt;/a&gt;.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void feedsListMethodTest() {
        // given
        String bookmark = "example";
        Integer pageSize = 25;
        String catalogId = "example";
        String adAccountId = "example";

        // when
        FeedsList200Response result = controller.feedsList(bookmark, pageSize, catalogId, adAccountId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/catalogs/feeds' to the features of feedsList() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void feedsListClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/catalogs/feeds").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("application/json");
        request.getParameters()
            .add("bookmark", "example") // The query parameter format should be 
            .add("page_size", String.valueOf(25)) // The query parameter format should be 
            .add("catalog_id", "example") // The query parameter format should be 
            .add("ad_account_id", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, FeedsList200Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of feedsUpdate() method
     *
     * The method should: Update feed
     *
     * Update a feed owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to &lt;a href&#x3D;&#39;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs&#39;&gt;Before you get started with Catalogs&lt;/a&gt;. For Hotel parterns, refer to &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Pinterest API for shopping&lt;/a&gt;.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void feedsUpdateMethodTest() {
        // given
        String feedId = "example";
        FeedsUpdateRequest feedsUpdateRequest = new FeedsUpdateRequest();
        String adAccountId = "example";

        // when
        CatalogsFeed result = controller.feedsUpdate(feedId, feedsUpdateRequest, adAccountId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/catalogs/feeds/{feed_id}' to the features of feedsUpdate() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void feedsUpdateClientApiTest() throws IOException {
        // given
        FeedsUpdateRequest body = new FeedsUpdateRequest();
        String uri = UriTemplate.of("/catalogs/feeds/{feed_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("feed_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.PATCH(uri, body)
            .accept("application/json");
        request.getParameters()
            .add("ad_account_id", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, CatalogsFeed.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of itemsBatchGet() method
     *
     * The method should: Get catalogs item batch status
     *
     * Get a single catalogs items batch owned by the \&quot;operating user_account\&quot;. &lt;a href&#x3D;\&quot;/docs/shopping/catalog/#Update%20items%20in%20batch\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See detailed documentation here.&lt;/a&gt; - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void itemsBatchGetMethodTest() {
        // given
        String batchId = "595953100599279259-66753b9bb65c46c49bd8503b27fecf9e";
        String adAccountId = "example";

        // when
        CatalogsItemsBatch result = controller.itemsBatchGet(batchId, adAccountId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/catalogs/items/batch/{batch_id}' to the features of itemsBatchGet() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void itemsBatchGetClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/catalogs/items/batch/{batch_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("batch_id", "595953100599279259-66753b9bb65c46c49bd8503b27fecf9e");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("application/json");
        request.getParameters()
            .add("ad_account_id", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, CatalogsItemsBatch.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of itemsBatchPost() method
     *
     * The method should: Operate on item batch
     *
     * This endpoint supports multiple operations on a set of one or more catalog items owned by the \&quot;operation user_account\&quot;. &lt;a href&#x3D;\&quot;/docs/shopping/catalog/#Update%20items%20in%20batch\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See detailed documentation here.&lt;/a&gt; - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void itemsBatchPostMethodTest() {
        // given
        ItemsBatchPostRequest itemsBatchPostRequest = new ItemsBatchPostRequest();
        String adAccountId = "example";

        // when
        CatalogsItemsBatch result = controller.itemsBatchPost(itemsBatchPostRequest, adAccountId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/catalogs/items/batch' to the features of itemsBatchPost() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void itemsBatchPostClientApiTest() throws IOException {
        // given
        ItemsBatchPostRequest body = new ItemsBatchPostRequest();
        String uri = UriTemplate.of("/catalogs/items/batch").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("application/json");
        request.getParameters()
            .add("ad_account_id", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, CatalogsItemsBatch.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of itemsGet() method
     *
     * The method should: Get catalogs items
     *
     * Get the items of the catalog owned by the \&quot;operation user_account\&quot;. &lt;a href&#x3D;\&quot;/docs/shopping/catalog/#Update%20items%20in%20batch\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See detailed documentation here.&lt;/a&gt; - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void itemsGetMethodTest() {
        // given
        String country = "US";
        String language = "EN";
        String adAccountId = "example";
        List<String> itemIds = Arrays.asList("example");
        CatalogsItemsFilters filters = new CatalogsItemsFilters(org.openapitools.model.CatalogsType.fromValue("RETAIL"));

        // when
        CatalogsItems result = controller.itemsGet(country, language, adAccountId, itemIds, filters).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/catalogs/items' to the features of itemsGet() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void itemsGetClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/catalogs/items").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("application/json");
        request.getParameters()
            .add("ad_account_id", "example") // The query parameter format should be 
            .add("country", "US") // The query parameter format should be 
            .add("language", "EN") // The query parameter format should be 
            .add("item_ids", Arrays.asList("example")) // The query format should be multi
            .add("filters[property]", "value"); // The query format should be deep-object

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, CatalogsItems.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of itemsIssuesList() method
     *
     * The method should: List item issues for a given processing result
     *
     * List item validation issues for a given feed processing result owned by the \&quot;operation user_account\&quot;. Up to 20 random samples of affected items are returned for each error and warning code. Please note that for now query parameters &#39;item_numbers&#39; and &#39;item_validation_issue&#39; cannot be used simultaneously until it is implemented in some release in the future. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Learn more&lt;/a&gt;
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void itemsIssuesListMethodTest() {
        // given
        String processingResultId = "5224831246441439241";
        String bookmark = "example";
        Integer pageSize = 25;
        List<Integer> itemNumbers = Arrays.asList();
        CatalogsItemValidationIssue itemValidationIssue = CatalogsItemValidationIssue.fromValue("TITLE_MISSING");
        String adAccountId = "example";

        // when
        ItemsIssuesList200Response result = controller.itemsIssuesList(processingResultId, bookmark, pageSize, itemNumbers, itemValidationIssue, adAccountId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/catalogs/processing_results/{processing_result_id}/item_issues' to the features of itemsIssuesList() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void itemsIssuesListClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/catalogs/processing_results/{processing_result_id}/item_issues").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("processing_result_id", "5224831246441439241");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("application/json");
        request.getParameters()
            .add("bookmark", "example") // The query parameter format should be 
            .add("page_size", String.valueOf(25)) // The query parameter format should be 
            .add("item_numbers", Arrays.asList()) // The query format should be multi
            .add("item_validation_issue", String.valueOf(CatalogsItemValidationIssue.fromValue("TITLE_MISSING"))) // The query parameter format should be 
            .add("ad_account_id", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, ItemsIssuesList200Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of productsByProductGroupFilterList() method
     *
     * The method should: List filtered products
     *
     * List products Pins owned by the \&quot;operation user_account\&quot; that meet the criteria specified in the Catalogs Product Group Filter given in the request. - This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  &lt;a href&#x3D;&#39;/docs/shopping/catalog/&#39;&gt;Learn more&lt;/a&gt;
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void productsByProductGroupFilterListMethodTest() {
        // given
        CatalogsListProductsByFilterRequest catalogsListProductsByFilterRequest = new CatalogsListProductsByFilterRequest();
        String bookmark = "example";
        Integer pageSize = 25;
        String adAccountId = "example";

        // when
        CatalogsProductGroupPinsList200Response result = controller.productsByProductGroupFilterList(catalogsListProductsByFilterRequest, bookmark, pageSize, adAccountId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/catalogs/products/get_by_product_group_filters' to the features of productsByProductGroupFilterList() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void productsByProductGroupFilterListClientApiTest() throws IOException {
        // given
        CatalogsListProductsByFilterRequest body = new CatalogsListProductsByFilterRequest();
        String uri = UriTemplate.of("/catalogs/products/get_by_product_group_filters").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("application/json");
        request.getParameters()
            .add("bookmark", "example") // The query parameter format should be 
            .add("page_size", String.valueOf(25)) // The query parameter format should be 
            .add("ad_account_id", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, CatalogsProductGroupPinsList200Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
