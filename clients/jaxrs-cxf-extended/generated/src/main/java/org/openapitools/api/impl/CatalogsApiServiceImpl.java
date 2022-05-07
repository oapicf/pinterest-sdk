package org.openapitools.api.impl;

import org.openapitools.api.*;
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

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;

/**
 * Pinterest REST API
 *
 * <p>Pinterest's REST API
 *
 */
public class CatalogsApiServiceImpl implements CatalogsApi {
    /**
     * Create product group
     *
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Create product group to use in Catalogs.
     *
     */
    @Override
    public Object catalogsProductGroupsCreate(CatalogsProductGroupCreateRequest catalogsProductGroupCreateRequest) {
        // TODO: Implement...
        return null;
    }

    /**
     * Delete product group
     *
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Delete a product group from being in use in Catalogs.
     *
     */
    @Override
    public void catalogsProductGroupsDelete(String productGroupId) {
        // TODO: Implement...

    }

    /**
     * Get product groups list
     *
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Get a list of product groups for a given Catalogs Feed Id.
     *
     */
    @Override
    public Paginated catalogsProductGroupsList(String feedId, String bookmark, Integer pageSize) {
        // TODO: Implement...
        return null;
    }

    /**
     * Update product group
     *
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Update product group to use in Catalogs.
     *
     */
    @Override
    public CatalogsProductGroup catalogsProductGroupsUpdate(String productGroupId, CatalogsProductGroupUpdateRequest catalogsProductGroupUpdateRequest) {
        // TODO: Implement...
        return null;
    }

    /**
     * List processing results for a given feed
     *
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Fetch a feed processing results owned by the owner user account.
     *
     */
    @Override
    public Paginated feedProcessingResultsList(String feedId, String bookmark, Integer pageSize) {
        // TODO: Implement...
        return null;
    }

    /**
     * Create feed
     *
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Create a new feed owned by the \&quot;operating user_account\&quot;.
     *
     */
    @Override
    public CatalogsFeed feedsCreate(CatalogsFeedsCreateRequest catalogsFeedsCreateRequest) {
        // TODO: Implement...
        return null;
    }

    /**
     * Delete feed
     *
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Delete a feed owned by the \&quot;operating user_account\&quot;.
     *
     */
    @Override
    public void feedsDelete(String feedId) {
        // TODO: Implement...

    }

    /**
     * Get feed
     *
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Get a single feed owned by the \&quot;operating user_account\&quot;.
     *
     */
    @Override
    public CatalogsFeed feedsGet(String feedId) {
        // TODO: Implement...
        return null;
    }

    /**
     * List feeds
     *
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Fetch feeds owned by the \&quot;operating user_account\&quot;.
     *
     */
    @Override
    public Paginated feedsList(String bookmark, Integer pageSize) {
        // TODO: Implement...
        return null;
    }

    /**
     * Update feed
     *
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Update a feed owned by the \&quot;operating user_account\&quot;.
     *
     */
    @Override
    public CatalogsFeed feedsUpdate(String feedId, CatalogsFeedsUpdateRequest catalogsFeedsUpdateRequest) {
        // TODO: Implement...
        return null;
    }

    /**
     * Get catalogs items batch
     *
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Get a single catalogs items batch created by the \&quot;operating user_account\&quot;.
     *
     */
    @Override
    public CatalogsItemsBatch itemsBatchGet(String batchId) {
        // TODO: Implement...
        return null;
    }

    /**
     * Perform an operation on an item batch
     *
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  This endpoint supports multiple operations on a set of one or more catalog items.
     *
     */
    @Override
    public CatalogsItemsBatch itemsBatchPost(CatalogsItemsBatchRequest catalogsItemsBatchRequest) {
        // TODO: Implement...
        return null;
    }

    /**
     * Get catalogs items
     *
     * Get the items of the catalog created by the \&quot;operating user_account\&quot;
     *
     */
    @Override
    public CatalogsItems itemsGet(String country, List<String> itemIds, String language) {
        // TODO: Implement...
        return null;
    }

}
