{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.Promotions where

import           Import


-- | Create promotions
--
-- Create multiple new promotions.
-- operationId: promotions/create
postAdAccountsByTextPromotionsR :: Text -- ^ Unique identifier of an ad account.
                                -> Handler Value
postAdAccountsByTextPromotionsR adAccountId = notImplemented

-- | Delete promotion by id
--
-- Delete a promotion within Pinterest.
-- operationId: promotions/delete
deleteAdAccountsByTextPromotionsByTextR :: Text -- ^ Unique identifier of an ad account.
                                        -> Text -- ^ Unique identifier of a promotion
                                        -> Handler Value
deleteAdAccountsByTextPromotionsByTextR adAccountId promotionId = notImplemented

-- | Get promotion by id
--
-- Get a promotion by its Pinterest-specific id. It must be associated with the provided ad account id.
-- operationId: promotions/get
getAdAccountsByTextPromotionsByTextR :: Text -- ^ Unique identifier of an ad account.
                                     -> Text -- ^ Unique identifier of a promotion
                                     -> Handler Value
getAdAccountsByTextPromotionsByTextR adAccountId promotionId = notImplemented

-- | Get promotions
--
-- Gets all promotions associated with an ad account ID that can be applied to an ad group. Can be either internally-saved promotions or external promotions imported from a commerce integration.
-- operationId: promotions/list
getAdAccountsByTextPromotionsR :: Text -- ^ Unique identifier of an ad account.
                               -> Handler Value
getAdAccountsByTextPromotionsR adAccountId = notImplemented

-- | Update promotions
--
-- Update multiple promotions.
-- operationId: promotions/update
patchAdAccountsByTextPromotionsR :: Text -- ^ Unique identifier of an ad account.
                                 -> Handler Value
patchAdAccountsByTextPromotionsR adAccountId = notImplemented
