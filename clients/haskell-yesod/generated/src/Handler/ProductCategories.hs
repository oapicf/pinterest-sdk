{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.ProductCategories where

import           Import


-- | Get featured topics
--
--   Enables advertisers to pull top five trending topics by interest and market, at full parity with the Pinterest Trends UI.
-- operationId: trendsFeaturedTopics/list
getTrendsTopicsFeaturedR :: Handler Value
getTrendsTopicsFeaturedR = notImplemented

-- | Get product category details
--
--   Enables advertisers to retrieve demographic information, related pins, and trend lines for specified product categories
-- operationId: trendsProductCategoriesDetails/list
getTrendsProductCategoriesDetailsR :: Handler Value
getTrendsProductCategoriesDetailsR = notImplemented

-- | Get a list of growing Shopping Product Categories
--
--   Get a list of growing Shopping Product Categories in ranked order allowing filtering by engagement type, vertical, age, and gender.
-- operationId: trendsProductCategoriesTrending/list
getTrendsProductCategoriesTrendingR :: Handler Value
getTrendsProductCategoriesTrendingR = notImplemented
