{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.Catalogs where

import           Import


-- | Create product group
--
-- &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Create product group to use in Catalogs.
-- operationId: catalogsProductGroups/create
postCatalogsProductGroupsR :: Handler Value
postCatalogsProductGroupsR = notImplemented

-- | Delete product group
--
-- &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Delete a product group from being in use in Catalogs.
-- operationId: catalogsProductGroups/delete
deleteCatalogsProductGroupsByTextR :: Text -- ^ Unique identifier of a product group
                                   -> Handler Value
deleteCatalogsProductGroupsByTextR productGroupId = notImplemented

-- | Get product groups list
--
-- &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Get a list of product groups for a given Catalogs Feed Id.
-- operationId: catalogsProductGroups/list
getCatalogsProductGroupsR :: Handler Value
getCatalogsProductGroupsR = notImplemented

-- | Update product group
--
-- &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Update product group to use in Catalogs.
-- operationId: catalogsProductGroups/update
patchCatalogsProductGroupsByTextR :: Text -- ^ Unique identifier of a product group
                                  -> Handler Value
patchCatalogsProductGroupsByTextR productGroupId = notImplemented

-- | List processing results for a given feed
--
-- &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Fetch a feed processing results owned by the owner user account.
-- operationId: feedProcessingResults/list
getCatalogsFeedsByTextProcessingResultsR :: Text -- ^ Unique identifier of a feed
                                         -> Handler Value
getCatalogsFeedsByTextProcessingResultsR feedId = notImplemented

-- | Create feed
--
-- &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Create a new feed owned by the \&quot;operating user_account\&quot;.
-- operationId: feeds/create
postCatalogsFeedsR :: Handler Value
postCatalogsFeedsR = notImplemented

-- | Delete feed
--
-- &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Delete a feed owned by the \&quot;operating user_account\&quot;.
-- operationId: feeds/delete
deleteCatalogsFeedsByTextR :: Text -- ^ Unique identifier of a feed
                           -> Handler Value
deleteCatalogsFeedsByTextR feedId = notImplemented

-- | Get feed
--
-- &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Get a single feed owned by the \&quot;operating user_account\&quot;.
-- operationId: feeds/get
getCatalogsFeedsByTextR :: Text -- ^ Unique identifier of a feed
                        -> Handler Value
getCatalogsFeedsByTextR feedId = notImplemented

-- | List feeds
--
-- &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Fetch feeds owned by the \&quot;operating user_account\&quot;.
-- operationId: feeds/list
getCatalogsFeedsR :: Handler Value
getCatalogsFeedsR = notImplemented

-- | Update feed
--
-- &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Update a feed owned by the \&quot;operating user_account\&quot;.
-- operationId: feeds/update
patchCatalogsFeedsByTextR :: Text -- ^ Unique identifier of a feed
                          -> Handler Value
patchCatalogsFeedsByTextR feedId = notImplemented

-- | Get catalogs items
--
-- Get the items of the catalog created by the \&quot;operating user_account\&quot;
-- operationId: items/get
getCatalogsItemsR :: Handler Value
getCatalogsItemsR = notImplemented

-- | Get catalogs items batch
--
-- &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Get a single catalogs items batch created by the \&quot;operating user_account\&quot;.
-- operationId: itemsBatch/get
getCatalogsItemsBatchByTextR :: Text -- ^ Id of a catalogs items batch to fetch
                             -> Handler Value
getCatalogsItemsBatchByTextR batchId = notImplemented

-- | Perform an operation on an item batch
--
-- &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  This endpoint supports multiple operations on a set of one or more catalog items.
-- operationId: itemsBatch/post
postCatalogsItemsBatchR :: Handler Value
postCatalogsItemsBatchR = notImplemented
