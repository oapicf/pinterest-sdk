{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.Conversions where

import           Import


-- | Create advertiser defined events
--
-- Map advertiser defined events to standard events for the given ad account.
-- operationId: advertiserDefinedEvents/create
postAdAccountsByTextAdvertiserDefinedEventsR :: Text -- ^ Unique identifier of an ad account.
                                             -> Handler Value
postAdAccountsByTextAdvertiserDefinedEventsR adAccountId = notImplemented

-- | Delete advertiser defined events
--
-- Untrack advertiser defined events for the given ad account.
-- operationId: advertiserDefinedEvents/delete
deleteAdAccountsByTextAdvertiserDefinedEventsR :: Text -- ^ Unique identifier of an ad account.
                                               -> Handler Value
deleteAdAccountsByTextAdvertiserDefinedEventsR adAccountId = notImplemented

-- | Get advertiser defined events
--
-- Get advertiser defined events for the given ad account.
-- operationId: advertiserDefinedEvents/get
getAdAccountsByTextAdvertiserDefinedEventsR :: Text -- ^ Unique identifier of an ad account.
                                            -> Handler Value
getAdAccountsByTextAdvertiserDefinedEventsR adAccountId = notImplemented

-- | Update advertiser defined events
--
-- Update advertiser defined event names or mappings for the given ad account.
-- operationId: advertiserDefinedEvents/update
patchAdAccountsByTextAdvertiserDefinedEventsR :: Text -- ^ Unique identifier of an ad account.
                                              -> Handler Value
patchAdAccountsByTextAdvertiserDefinedEventsR adAccountId = notImplemented
