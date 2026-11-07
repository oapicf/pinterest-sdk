package org.openapitools.controller;

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
 * API tests for CatalogProductGroupsController
 */
@MicronautTest
public class CatalogProductGroupsControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    CatalogProductGroupsController controller;

    /**
     * This test is used to validate the implementation of catalogsProductGroupPinsList() method
     *
     * The method should: List products by product group
     *
     * Get a list of product pins for a given Catalogs Product Group Id owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void catalogsProductGroupPinsListMethodTest() {
        // given
        String productGroupId = "example";
        String adAccountId = "example";
        Boolean pinMetrics = false;
        String bookmark = "example";
        Integer pageSize = 25;

        // when
        CatalogsProductGroupPinsList200Response result = controller.catalogsProductGroupPinsList(productGroupId, adAccountId, pinMetrics, bookmark, pageSize).block();

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
            .accept("[Ljava.lang.String;@d28fe12");
        request.getParameters()
            .add("ad_account_id", "example") // The query parameter format should be 
            .add("pin_metrics", String.valueOf(false)) // The query parameter format should be 
            .add("bookmark", "example") // The query parameter format should be 
            .add("page_size", String.valueOf(25)); // The query parameter format should be 

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
     * Create product group to use in Catalogs owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager. \&quot;Catalog-based product groups\&quot; can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the \&quot;retail feed-based\&quot; option. [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void catalogsProductGroupsCreateMethodTest() {
        // given
        CatalogsProductGroupsCreateRequestSchema catalogsProductGroupsCreateRequestSchema = new CatalogsProductGroupsCreateRequestSchema();
        String adAccountId = "example";

        // when
        CatalogsVerticalProductGroup result = controller.catalogsProductGroupsCreate(catalogsProductGroupsCreateRequestSchema, adAccountId).block();

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
        CatalogsProductGroupsCreateRequestSchema body = new CatalogsProductGroupsCreateRequestSchema();
        String uri = UriTemplate.of("/catalogs/product_groups").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@101f98d0");
        request.getParameters()
            .add("ad_account_id", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, CatalogsVerticalProductGroup.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of catalogsProductGroupsCreateMany() method
     *
     * The method should: Create product groups
     *
     * Create product group to use in Catalogs owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void catalogsProductGroupsCreateManyMethodTest() {
        // given
        List<@Valid CatalogsProductGroupsCreateManyRequestItems> catalogsProductGroupsCreateManyRequestItems = Arrays.asList();
        String adAccountId = "example";

        // when
        List<String> result = controller.catalogsProductGroupsCreateMany(catalogsProductGroupsCreateManyRequestItems, adAccountId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/catalogs/product_groups/multiple' to the features of catalogsProductGroupsCreateMany() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void catalogsProductGroupsCreateManyClientApiTest() throws IOException {
        // given
        List<@Valid CatalogsProductGroupsCreateManyRequestItems> body = Arrays.asList();
        String uri = UriTemplate.of("/catalogs/product_groups/multiple").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@72b6753d");
        request.getParameters()
            .add("ad_account_id", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, Argument.of(List.class, String.class));

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of catalogsProductGroupsDelete() method
     *
     * The method should: Delete product group
     *
     * Delete a product group owned by the \&quot;operation user_account\&quot; from being in use in Catalogs. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
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
        CatalogsVerticalProductGroup result = controller.catalogsProductGroupsDelete(productGroupId, adAccountId).block();

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
            .accept("[Ljava.lang.String;@1d4681ea");
        request.getParameters()
            .add("ad_account_id", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, CatalogsVerticalProductGroup.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of catalogsProductGroupsDeleteMany() method
     *
     * The method should: Delete product groups
     *
     * Delete product groups owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void catalogsProductGroupsDeleteManyMethodTest() {
        // given
        List<Integer> id = Arrays.asList();
        String adAccountId = "example";

        // when
        controller.catalogsProductGroupsDeleteMany(id, adAccountId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/catalogs/product_groups/multiple' to the features of catalogsProductGroupsDeleteMany() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void catalogsProductGroupsDeleteManyClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/catalogs/product_groups/multiple").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.DELETE(uri)
            .accept("[Ljava.lang.String;@5754243e");
        request.getParameters()
            .add("id", String.valueOf(Arrays.asList())) // The query parameter format should be csv
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
     * Get a single product group for a given Catalogs Product Group Id owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
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
        CatalogsVerticalProductGroup result = controller.catalogsProductGroupsGet(productGroupId, adAccountId).block();

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
            .accept("[Ljava.lang.String;@3b61ef1c");
        request.getParameters()
            .add("ad_account_id", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, CatalogsVerticalProductGroup.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of catalogsProductGroupsList() method
     *
     * The method should: List product groups
     *
     * Get a list of product groups for a given Catalogs Feed Id owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void catalogsProductGroupsListMethodTest() {
        // given
        List<Integer> id = Arrays.asList();
        String feedId = "example";
        String catalogId = "example";
        String adAccountId = "example";
        String bookmark = "example";
        Integer pageSize = 25;

        // when
        CatalogsProductGroupsList200Response result = controller.catalogsProductGroupsList(id, feedId, catalogId, adAccountId, bookmark, pageSize).block();

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
            .accept("[Ljava.lang.String;@7abf7ad0");
        request.getParameters()
            .add("id", String.valueOf(Arrays.asList())) // The query parameter format should be csv
            .add("feed_id", "example") // The query parameter format should be 
            .add("catalog_id", "example") // The query parameter format should be 
            .add("ad_account_id", "example") // The query parameter format should be 
            .add("bookmark", "example") // The query parameter format should be 
            .add("page_size", String.valueOf(25)); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, CatalogsProductGroupsList200Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of catalogsProductGroupsProductCountsGet() method
     *
     * The method should: Get product counts
     *
     * Get a product counts for a given Catalogs Product Group owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
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
        CatalogsProductGroupProductCountsVertical result = controller.catalogsProductGroupsProductCountsGet(productGroupId, adAccountId).block();

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
            .accept("[Ljava.lang.String;@535fedbc");
        request.getParameters()
            .add("ad_account_id", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, CatalogsProductGroupProductCountsVertical.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of catalogsProductGroupsUpdate() method
     *
     * The method should: Update single product group
     *
     * Update product group owned by the \&quot;operation user_account\&quot; to use in Catalogs. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager. \&quot;Catalog-based product groups\&quot; can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the \&quot;retail feed-based\&quot; option. [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void catalogsProductGroupsUpdateMethodTest() {
        // given
        String productGroupId = "example";
        CatalogsProductGroupsUpdateRequestSchema catalogsProductGroupsUpdateRequestSchema = new CatalogsProductGroupsUpdateRequestSchema();
        String adAccountId = "example";

        // when
        CatalogsVerticalProductGroup result = controller.catalogsProductGroupsUpdate(productGroupId, catalogsProductGroupsUpdateRequestSchema, adAccountId).block();

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
        CatalogsProductGroupsUpdateRequestSchema body = new CatalogsProductGroupsUpdateRequestSchema();
        String uri = UriTemplate.of("/catalogs/product_groups/{product_group_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("product_group_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.PATCH(uri, body)
            .accept("[Ljava.lang.String;@25dc563d");
        request.getParameters()
            .add("ad_account_id", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, CatalogsVerticalProductGroup.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of productsByProductGroupFilterList() method
     *
     * The method should: List products by filter
     *
     * List products Pins owned by the \&quot;operation user_account\&quot; that meet the criteria specified in the Catalogs Product Group Filter given in the request. - This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: This endpoint only supports RETAIL catalog at the moment.  [Learn more](/docs/api-features/shopping-overview/)
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
        Boolean pinMetrics = false;

        // when
        CatalogsProductGroupPinsList200Response result = controller.productsByProductGroupFilterList(catalogsListProductsByFilterRequest, bookmark, pageSize, adAccountId, pinMetrics).block();

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
            .accept("[Ljava.lang.String;@11714495");
        request.getParameters()
            .add("bookmark", "example") // The query parameter format should be 
            .add("page_size", String.valueOf(25)) // The query parameter format should be 
            .add("ad_account_id", "example") // The query parameter format should be 
            .add("pin_metrics", String.valueOf(false)); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, CatalogsProductGroupPinsList200Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
