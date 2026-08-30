{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.CustomerSegment where

import           Import


-- | Create customer segments
--
-- Customer segments allow advertisers to define existing customers for Pinterest Performance+ campaigns. Customer segments are made up of audience lists.
-- operationId: customerSegment/create
postAdAccountsByTextCustomerSegmentsR :: Text -- ^ Unique identifier of an ad account.
                                      -> Handler Value
postAdAccountsByTextCustomerSegmentsR adAccountId = notImplemented

-- | List customer segments
--
-- Get a list of the customer segments in the specified &#x60;ad_account_id&#x60;.
-- operationId: customerSegment/list
getAdAccountsByTextCustomerSegmentsR :: Text -- ^ Unique identifier of an ad account.
                                     -> Handler Value
getAdAccountsByTextCustomerSegmentsR adAccountId = notImplemented

-- | Update customer segments
--
-- Update the customer segment given advertiser ID and customer segment ID
-- operationId: customerSegment/update
patchAdAccountsByTextCustomerSegmentsR :: Text -- ^ Unique identifier of an ad account.
                                       -> Handler Value
patchAdAccountsByTextCustomerSegmentsR adAccountId = notImplemented
