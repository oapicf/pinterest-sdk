package org.openapitools.controller;

import org.openapitools.model.CatalogsFeed;
import org.openapitools.model.CatalogsFeedsCreateRequest;
import org.openapitools.model.CatalogsFeedsUpdateRequest;
import org.openapitools.model.CatalogsItems;
import org.openapitools.model.CatalogsItemsBatch;
import org.openapitools.model.CatalogsItemsBatchRequest;
import org.openapitools.model.CatalogsProductGroup;
import org.openapitools.model.CatalogsProductGroupCreateRequest;
import org.openapitools.model.CatalogsProductGroupUpdateRequest;
import org.openapitools.model.Error;
import org.openapitools.model.Paginated;
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
    @Client("${context-path}")
    HttpClient client;

    @Inject
    CatalogsController controller;

    /**
     * This test is used to validate the implementation of catalogsProductGroupsCreate() method
     *
     * The method should: Create product group
     *
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Create product group to use in Catalogs.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void catalogsProductGroupsCreateMethodTest() {
        // given
        CatalogsProductGroupCreateRequest catalogsProductGroupCreateRequest = new CatalogsProductGroupCreateRequest("2680059592705", "example", null);

        // when
        Object result = controller.catalogsProductGroupsCreate(catalogsProductGroupCreateRequest).block();

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
        CatalogsProductGroupCreateRequest body = new CatalogsProductGroupCreateRequest("2680059592705", "example", null);
        String uri = UriTemplate.of("/catalogs/product_groups").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .contentType("application/json")
            .accept("application/json");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, Object.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of catalogsProductGroupsDelete() method
     *
     * The method should: Delete product group
     *
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Delete a product group from being in use in Catalogs.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void catalogsProductGroupsDeleteMethodTest() {
        // given
        String productGroupId = "example";

        // when
        controller.catalogsProductGroupsDelete(productGroupId).block();

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

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request); // To retrieve body you must specify required type (e.g. Map.class) as second argument 

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of catalogsProductGroupsList() method
     *
     * The method should: Get product groups list
     *
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Get a list of product groups for a given Catalogs Feed Id.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void catalogsProductGroupsListMethodTest() {
        // given
        String feedId = "example";
        String bookmark = "example";
        Integer pageSize = 25;

        // when
        Paginated result = controller.catalogsProductGroupsList(feedId, bookmark, pageSize).block();

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
            .add("bookmark", "example") // The query parameter format should be 
            .add("page_size", String.valueOf(25)); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, Paginated.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of catalogsProductGroupsUpdate() method
     *
     * The method should: Update product group
     *
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Update product group to use in Catalogs.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void catalogsProductGroupsUpdateMethodTest() {
        // given
        String productGroupId = "example";
        CatalogsProductGroupUpdateRequest catalogsProductGroupUpdateRequest = new CatalogsProductGroupUpdateRequest("2680059592705", "example", null);

        // when
        CatalogsProductGroup result = controller.catalogsProductGroupsUpdate(productGroupId, catalogsProductGroupUpdateRequest).block();

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
        CatalogsProductGroupUpdateRequest body = new CatalogsProductGroupUpdateRequest("2680059592705", "example", null);
        String uri = UriTemplate.of("/catalogs/product_groups/{product_group_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("product_group_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.PATCH(uri, body)
            .contentType("application/json")
            .accept("application/json");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, CatalogsProductGroup.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of feedProcessingResultsList() method
     *
     * The method should: List processing results for a given feed
     *
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Fetch a feed processing results owned by the owner user account.
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

        // when
        Paginated result = controller.feedProcessingResultsList(feedId, bookmark, pageSize).block();

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
            .add("page_size", String.valueOf(25)); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, Paginated.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of feedsCreate() method
     *
     * The method should: Create feed
     *
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Create a new feed owned by the \&quot;operating user_account\&quot;.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void feedsCreateMethodTest() {
        // given
        CatalogsFeedsCreateRequest catalogsFeedsCreateRequest = new CatalogsFeedsCreateRequest("example", CatalogsFormat.fromValue("TSV"), "example");

        // when
        CatalogsFeed result = controller.feedsCreate(catalogsFeedsCreateRequest).block();

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
        CatalogsFeedsCreateRequest body = new CatalogsFeedsCreateRequest("example", CatalogsFormat.fromValue("TSV"), "example");
        String uri = UriTemplate.of("/catalogs/feeds").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .contentType("application/json")
            .accept("application/json");

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
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Delete a feed owned by the \&quot;operating user_account\&quot;.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void feedsDeleteMethodTest() {
        // given
        String feedId = "example";

        // when
        controller.feedsDelete(feedId).block();

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
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Get a single feed owned by the \&quot;operating user_account\&quot;.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void feedsGetMethodTest() {
        // given
        String feedId = "example";

        // when
        CatalogsFeed result = controller.feedsGet(feedId).block();

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
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Fetch feeds owned by the \&quot;operating user_account\&quot;.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void feedsListMethodTest() {
        // given
        String bookmark = "example";
        Integer pageSize = 25;

        // when
        Paginated result = controller.feedsList(bookmark, pageSize).block();

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
            .add("page_size", String.valueOf(25)); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, Paginated.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of feedsUpdate() method
     *
     * The method should: Update feed
     *
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Update a feed owned by the \&quot;operating user_account\&quot;.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void feedsUpdateMethodTest() {
        // given
        String feedId = "example";
        CatalogsFeedsUpdateRequest catalogsFeedsUpdateRequest = new CatalogsFeedsUpdateRequest();

        // when
        CatalogsFeed result = controller.feedsUpdate(feedId, catalogsFeedsUpdateRequest).block();

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
        CatalogsFeedsUpdateRequest body = new CatalogsFeedsUpdateRequest();
        String uri = UriTemplate.of("/catalogs/feeds/{feed_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("feed_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.PATCH(uri, body)
            .contentType("application/json")
            .accept("application/json");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, CatalogsFeed.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of itemsBatchGet() method
     *
     * The method should: Get catalogs items batch
     *
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Get a single catalogs items batch created by the \&quot;operating user_account\&quot;.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void itemsBatchGetMethodTest() {
        // given
        String batchId = "595953100599279259-66753b9bb65c46c49bd8503b27fecf9e";

        // when
        CatalogsItemsBatch result = controller.itemsBatchGet(batchId).block();

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

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, CatalogsItemsBatch.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of itemsBatchPost() method
     *
     * The method should: Perform an operation on an item batch
     *
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  This endpoint supports multiple operations on a set of one or more catalog items.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void itemsBatchPostMethodTest() {
        // given
        CatalogsItemsBatchRequest catalogsItemsBatchRequest = new CatalogsItemsBatchRequest();

        // when
        CatalogsItemsBatch result = controller.itemsBatchPost(catalogsItemsBatchRequest).block();

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
        CatalogsItemsBatchRequest body = new CatalogsItemsBatchRequest();
        String uri = UriTemplate.of("/catalogs/items/batch").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .contentType("application/json")
            .accept("application/json");

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
     * Get the items of the catalog created by the \&quot;operating user_account\&quot;
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void itemsGetMethodTest() {
        // given
        String country = "US";
        List<String> itemIds = Arrays.asList("example");
        String language = "EN";

        // when
        CatalogsItems result = controller.itemsGet(country, itemIds, language).block();

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
            .add("country", "US") // The query parameter format should be 
            .add("item_ids", Arrays.asList("example")) // The query format should be multi
            .add("language", "EN"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, CatalogsItems.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
