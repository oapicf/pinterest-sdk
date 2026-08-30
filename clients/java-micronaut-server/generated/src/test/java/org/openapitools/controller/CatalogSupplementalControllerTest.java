package org.openapitools.controller;

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
 * API tests for CatalogSupplementalController
 */
@MicronautTest
public class CatalogSupplementalControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    CatalogSupplementalController controller;

    /**
     * This test is used to validate the implementation of catalogsLocalInventoryItemsBatchOperate() method
     *
     * The method should: Operate on local inventory item batch
     *
     * Managing local inventory information in batches supporting CREATE, UPDATE, UPSERT, DELETE operations. Up to 1000 items per request to match catalogs/items.  - Must provide both item_id and store_code to identify a local inventory item.  - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void catalogsLocalInventoryItemsBatchOperateMethodTest() {
        // given
        String catalogId = "example";
        LocalInventoryItemsBatchCreate localInventoryItemsBatchCreate = new LocalInventoryItemsBatchCreate(Arrays.asList());
        String adAccountId = "example";

        // when
        SupplementalItemsBatchResponse result = controller.catalogsLocalInventoryItemsBatchOperate(catalogId, localInventoryItemsBatchCreate, adAccountId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/catalogs/{catalog_id}/local_inventory_items/batch' to the features of catalogsLocalInventoryItemsBatchOperate() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void catalogsLocalInventoryItemsBatchOperateClientApiTest() throws IOException {
        // given
        LocalInventoryItemsBatchCreate body = new LocalInventoryItemsBatchCreate(Arrays.asList());
        String uri = UriTemplate.of("/catalogs/{catalog_id}/local_inventory_items/batch").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("catalog_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@3952a8da");
        request.getParameters()
            .add("ad_account_id", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, SupplementalItemsBatchResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of catalogsLocalInventoryItemsPost() method
     *
     * The method should: Get local inventory items (POST)
     *
     * Get local inventory items for a catalog owned by the \&quot;operation user_account\&quot;.  - Must provide an array of {item_id, store_code} pairs in item filters to identify local inventory items.  - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void catalogsLocalInventoryItemsPostMethodTest() {
        // given
        String catalogId = "example";
        LocalInventoryItemsGetCreate localInventoryItemsGetCreate = new LocalInventoryItemsGetCreate(Arrays.asList());
        String adAccountId = "example";

        // when
        LocalInventoryItemsGet result = controller.catalogsLocalInventoryItemsPost(catalogId, localInventoryItemsGetCreate, adAccountId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/catalogs/{catalog_id}/local_inventory_items/query' to the features of catalogsLocalInventoryItemsPost() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void catalogsLocalInventoryItemsPostClientApiTest() throws IOException {
        // given
        LocalInventoryItemsGetCreate body = new LocalInventoryItemsGetCreate(Arrays.asList());
        String uri = UriTemplate.of("/catalogs/{catalog_id}/local_inventory_items/query").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("catalog_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@45577977");
        request.getParameters()
            .add("ad_account_id", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, LocalInventoryItemsGet.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of catalogsLocalStoresCreate() method
     *
     * The method should: Create local stores
     *
     * Create a local store for a catalog owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void catalogsLocalStoresCreateMethodTest() {
        // given
        String catalogId = "example";
        List<@Valid LocalStoreCreate> localStoreCreate = Arrays.asList();
        String adAccountId = "example";

        // when
        List<CatalogsLocalStoresCreate200ResponseInner> result = controller.catalogsLocalStoresCreate(catalogId, localStoreCreate, adAccountId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/catalogs/{catalog_id}/local_stores' to the features of catalogsLocalStoresCreate() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void catalogsLocalStoresCreateClientApiTest() throws IOException {
        // given
        List<@Valid LocalStoreCreate> body = Arrays.asList();
        String uri = UriTemplate.of("/catalogs/{catalog_id}/local_stores").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("catalog_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@45a948c7");
        request.getParameters()
            .add("ad_account_id", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, Argument.of(List.class, CatalogsLocalStoresCreate200ResponseInner.class));

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of catalogsLocalStoresDelete() method
     *
     * The method should: Delete local stores
     *
     *   Delete multiple local stores for a catalog owned by the \&quot;operation user_account\&quot;.   - By default, the \&quot;operation user_account\&quot; is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void catalogsLocalStoresDeleteMethodTest() {
        // given
        String catalogId = "example";
        List<@Pattern(regexp = "^\\d+$")String> ids = Arrays.asList("example");
        String adAccountId = "example";

        // when
        List<CatalogsLocalStoresDelete200ResponseInner> result = controller.catalogsLocalStoresDelete(catalogId, ids, adAccountId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/catalogs/{catalog_id}/local_stores' to the features of catalogsLocalStoresDelete() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void catalogsLocalStoresDeleteClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/catalogs/{catalog_id}/local_stores").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("catalog_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.DELETE(uri)
            .accept("[Ljava.lang.String;@3416a8eb");
        request.getParameters()
            .add("ids", String.valueOf(Arrays.asList("example"))) // The query parameter format should be csv
            .add("ad_account_id", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, Argument.of(List.class, CatalogsLocalStoresDelete200ResponseInner.class));

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of catalogsLocalStoresList() method
     *
     * The method should: List local stores
     *
     * Fetch local stores for a catalog owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void catalogsLocalStoresListMethodTest() {
        // given
        String catalogId = "example";
        List<@Pattern(regexp = "^\\d+$")String> ids = Arrays.asList("example");
        String adAccountId = "example";
        String bookmark = "example";
        Integer pageSize = 25;

        // when
        CatalogsLocalStoresList200Response result = controller.catalogsLocalStoresList(catalogId, ids, adAccountId, bookmark, pageSize).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/catalogs/{catalog_id}/local_stores' to the features of catalogsLocalStoresList() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void catalogsLocalStoresListClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/catalogs/{catalog_id}/local_stores").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("catalog_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@18aed2cb");
        request.getParameters()
            .add("ids", String.valueOf(Arrays.asList("example"))) // The query parameter format should be csv
            .add("ad_account_id", "example") // The query parameter format should be 
            .add("bookmark", "example") // The query parameter format should be 
            .add("page_size", String.valueOf(25)); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, CatalogsLocalStoresList200Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of catalogsLocalStoresUpdate() method
     *
     * The method should: Update local stores
     *
     *   Update a local store for a catalog owned by the \&quot;operation user_account\&quot;.   - By default, the \&quot;operation user_account\&quot; is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void catalogsLocalStoresUpdateMethodTest() {
        // given
        String catalogId = "example";
        List<@Valid LocalStoreBatchUpdate> localStoreBatchUpdate = Arrays.asList();
        String adAccountId = "example";

        // when
        List<CatalogsLocalStoresCreate200ResponseInner> result = controller.catalogsLocalStoresUpdate(catalogId, localStoreBatchUpdate, adAccountId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/catalogs/{catalog_id}/local_stores' to the features of catalogsLocalStoresUpdate() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void catalogsLocalStoresUpdateClientApiTest() throws IOException {
        // given
        List<@Valid LocalStoreBatchUpdate> body = Arrays.asList();
        String uri = UriTemplate.of("/catalogs/{catalog_id}/local_stores").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("catalog_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.PATCH(uri, body)
            .accept("[Ljava.lang.String;@68fcb338");
        request.getParameters()
            .add("ad_account_id", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, Argument.of(List.class, CatalogsLocalStoresCreate200ResponseInner.class));

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of catalogsSupplementalItemsBatchGet() method
     *
     * The method should: Get supplemental items batch status
     *
     * Fetch the status and results of a supplemental items batch operation. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void catalogsSupplementalItemsBatchGetMethodTest() {
        // given
        String catalogId = "example";
        String batchId = "example";
        String adAccountId = "example";

        // when
        SupplementalItemsBatchResponse result = controller.catalogsSupplementalItemsBatchGet(catalogId, batchId, adAccountId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/catalogs/{catalog_id}/supplemental_items/batch/{batch_id}' to the features of catalogsSupplementalItemsBatchGet() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void catalogsSupplementalItemsBatchGetClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/catalogs/{catalog_id}/supplemental_items/batch/{batch_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("catalog_id", "example");
            put("batch_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@6aa0c66");
        request.getParameters()
            .add("ad_account_id", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, SupplementalItemsBatchResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
