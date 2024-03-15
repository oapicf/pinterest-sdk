{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.ProductGroupPromotions where

import           Import


-- | Create product group promotions
--
-- Add one or more product groups from your catalog to an existing ad group. (Product groups added to an ad group are a &#39;product group promotion.&#39;)
-- operationId: productGroupPromotions/create
postAdAccountsByTextProductGroupPromotionsR :: Text -- ^ Unique identifier of an ad account.
                                            -> Handler Value
postAdAccountsByTextProductGroupPromotionsR adAccountId = notImplemented

-- | Get a product group promotion by id
--
-- Get a product group promotion by id
-- operationId: productGroupPromotions/get
getAdAccountsByTextProductGroupPromotionsByTextR :: Text -- ^ Unique identifier of an ad account.
                                                 -> Text -- ^ Unique identifier of a product group promotion
                                                 -> Handler Value
getAdAccountsByTextProductGroupPromotionsByTextR adAccountId productGroupPromotionId = notImplemented

-- | Get product group promotions
--
-- List existing product group promotions associated with an ad account.  Include either ad_group_id or product_group_promotion_ids in your request.  &lt;b&gt;Note:&lt;/b&gt; ad_group_ids and product_group_promotion_ids are mutually exclusive parameters. Only provide one. If multiple options are provided, product_group_promotion_ids takes precedence over ad_group_ids. If none are provided, the endpoint returns an error.
-- operationId: productGroupPromotions/list
getAdAccountsByTextProductGroupPromotionsR :: Text -- ^ Unique identifier of an ad account.
                                           -> Handler Value
getAdAccountsByTextProductGroupPromotionsR adAccountId = notImplemented

-- | Update product group promotions
--
-- Update multiple existing Product Group Promotions (by product_group_id)
-- operationId: productGroupPromotions/update
patchAdAccountsByTextProductGroupPromotionsR :: Text -- ^ Unique identifier of an ad account.
                                             -> Handler Value
patchAdAccountsByTextProductGroupPromotionsR adAccountId = notImplemented

-- | Get product group analytics
--
-- Get analytics for the specified product groups in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
-- operationId: productGroups/analytics
getAdAccountsByTextProductGroupsAnalyticsR :: Text -- ^ Unique identifier of an ad account.
                                           -> Handler Value
getAdAccountsByTextProductGroupsAnalyticsR adAccountId = notImplemented
