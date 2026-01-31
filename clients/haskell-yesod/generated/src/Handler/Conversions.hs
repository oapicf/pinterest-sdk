{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.Conversions where

import           Import


-- | Get advertiser defined events
--
-- &lt;p&gt;Get advertiser defined events for the given ad account.&lt;/p&gt;
-- operationId: advertiserDefinedEvents/get
getAdAccountsByTextAdvertiserDefinedEventsR :: Text -- ^ Unique identifier of an ad account.
                                            -> Handler Value
getAdAccountsByTextAdvertiserDefinedEventsR adAccountId = notImplemented
