{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.ProductGroups where

import           Import


-- | Get catalog product groups
--
-- This endpoint is completely deprecated. Please use &lt;a href&#x3D;&#39;/docs/api/v5/#operation/catalogs_product_groups/list&#39;&gt;List product groups&lt;/a&gt; from Catalogs API instead.
-- operationId: adAccountsCatalogsProductGroups/list
getAdAccountsByTextProductGroupsCatalogsR :: Text -- ^ Unique identifier of an ad account.
                                          -> Handler Value
getAdAccountsByTextProductGroupsCatalogsR adAccountId = notImplemented
