package org.openapitools.api;

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
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import jakarta.inject.Inject;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for CatalogsApi
 */
@MicronautTest
public class CatalogsApiTest {

    @Inject
    CatalogsApi api;

    
    /**
     * Create product group
     *
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Create product group to use in Catalogs.
     */
    @Test
    public void catalogsProductGroupsCreateTest() {
        CatalogsProductGroupCreateRequest catalogsProductGroupCreateRequest = null;
        // Object response = api.catalogsProductGroupsCreate(catalogsProductGroupCreateRequest).block();
        // Mono<Object> asyncResponse = api.catalogsProductGroupsCreate(catalogsProductGroupCreateRequest);
        // TODO: test validations
    }

    
    /**
     * Delete product group
     *
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Delete a product group from being in use in Catalogs.
     */
    @Test
    public void catalogsProductGroupsDeleteTest() {
        String productGroupId = null;
        // api.catalogsProductGroupsDelete(productGroupId).block();
        // Mono<Object> asyncResponse = api.catalogsProductGroupsDelete(productGroupId);
        // TODO: test validations
    }

    
    /**
     * Get product groups list
     *
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Get a list of product groups for a given Catalogs Feed Id.
     */
    @Test
    public void catalogsProductGroupsListTest() {
        String feedId = null;
        String bookmark = null;
        Integer pageSize = null;
        // Paginated response = api.catalogsProductGroupsList(feedId, bookmark, pageSize).block();
        // Mono<Paginated> asyncResponse = api.catalogsProductGroupsList(feedId, bookmark, pageSize);
        // TODO: test validations
    }

    
    /**
     * Update product group
     *
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Update product group to use in Catalogs.
     */
    @Test
    public void catalogsProductGroupsUpdateTest() {
        String productGroupId = null;
        CatalogsProductGroupUpdateRequest catalogsProductGroupUpdateRequest = null;
        // CatalogsProductGroup response = api.catalogsProductGroupsUpdate(productGroupId, catalogsProductGroupUpdateRequest).block();
        // Mono<CatalogsProductGroup> asyncResponse = api.catalogsProductGroupsUpdate(productGroupId, catalogsProductGroupUpdateRequest);
        // TODO: test validations
    }

    
    /**
     * List processing results for a given feed
     *
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Fetch a feed processing results owned by the owner user account.
     */
    @Test
    public void feedProcessingResultsListTest() {
        String feedId = null;
        String bookmark = null;
        Integer pageSize = null;
        // Paginated response = api.feedProcessingResultsList(feedId, bookmark, pageSize).block();
        // Mono<Paginated> asyncResponse = api.feedProcessingResultsList(feedId, bookmark, pageSize);
        // TODO: test validations
    }

    
    /**
     * Create feed
     *
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Create a new feed owned by the \&quot;operating user_account\&quot;.
     */
    @Test
    public void feedsCreateTest() {
        CatalogsFeedsCreateRequest catalogsFeedsCreateRequest = null;
        // CatalogsFeed response = api.feedsCreate(catalogsFeedsCreateRequest).block();
        // Mono<CatalogsFeed> asyncResponse = api.feedsCreate(catalogsFeedsCreateRequest);
        // TODO: test validations
    }

    
    /**
     * Delete feed
     *
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Delete a feed owned by the \&quot;operating user_account\&quot;.
     */
    @Test
    public void feedsDeleteTest() {
        String feedId = null;
        // api.feedsDelete(feedId).block();
        // Mono<Object> asyncResponse = api.feedsDelete(feedId);
        // TODO: test validations
    }

    
    /**
     * Get feed
     *
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Get a single feed owned by the \&quot;operating user_account\&quot;.
     */
    @Test
    public void feedsGetTest() {
        String feedId = null;
        // CatalogsFeed response = api.feedsGet(feedId).block();
        // Mono<CatalogsFeed> asyncResponse = api.feedsGet(feedId);
        // TODO: test validations
    }

    
    /**
     * List feeds
     *
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Fetch feeds owned by the \&quot;operating user_account\&quot;.
     */
    @Test
    public void feedsListTest() {
        String bookmark = null;
        Integer pageSize = null;
        // Paginated response = api.feedsList(bookmark, pageSize).block();
        // Mono<Paginated> asyncResponse = api.feedsList(bookmark, pageSize);
        // TODO: test validations
    }

    
    /**
     * Update feed
     *
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Update a feed owned by the \&quot;operating user_account\&quot;.
     */
    @Test
    public void feedsUpdateTest() {
        String feedId = null;
        CatalogsFeedsUpdateRequest catalogsFeedsUpdateRequest = null;
        // CatalogsFeed response = api.feedsUpdate(feedId, catalogsFeedsUpdateRequest).block();
        // Mono<CatalogsFeed> asyncResponse = api.feedsUpdate(feedId, catalogsFeedsUpdateRequest);
        // TODO: test validations
    }

    
    /**
     * Get catalogs items batch
     *
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Get a single catalogs items batch created by the \&quot;operating user_account\&quot;.
     */
    @Test
    public void itemsBatchGetTest() {
        String batchId = null;
        // CatalogsItemsBatch response = api.itemsBatchGet(batchId).block();
        // Mono<CatalogsItemsBatch> asyncResponse = api.itemsBatchGet(batchId);
        // TODO: test validations
    }

    
    /**
     * Perform an operation on an item batch
     *
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  This endpoint supports multiple operations on a set of one or more catalog items.
     */
    @Test
    public void itemsBatchPostTest() {
        CatalogsItemsBatchRequest catalogsItemsBatchRequest = null;
        // CatalogsItemsBatch response = api.itemsBatchPost(catalogsItemsBatchRequest).block();
        // Mono<CatalogsItemsBatch> asyncResponse = api.itemsBatchPost(catalogsItemsBatchRequest);
        // TODO: test validations
    }

    
    /**
     * Get catalogs items
     *
     * Get the items of the catalog created by the \&quot;operating user_account\&quot;
     */
    @Test
    public void itemsGetTest() {
        String country = null;
        List<String> itemIds = null;
        String language = null;
        // CatalogsItems response = api.itemsGet(country, itemIds, language).block();
        // Mono<CatalogsItems> asyncResponse = api.itemsGet(country, itemIds, language);
        // TODO: test validations
    }

    
}
