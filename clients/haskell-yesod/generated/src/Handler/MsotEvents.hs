{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.MsotEvents where

import           Import


-- | Send Measurement Source Of Truth (MSOT) attributed conversion events
--
-- **This feature is currently in beta and not available to all apps.** If you are interested in joining the beta, reach out to your Pinterest account manager.  Advertisers or their measurement partners can send attributed MSOT conversion events to Pinterest based on their &#x60;ad_account_id&#x60;. The request body should be a JSON object.  - These events will not be used in Reporting.
-- operationId: msotEvents/create
postAdAccountsByTextMsotEventsR :: Text -- ^ Unique identifier of an ad account.
                                -> Handler Value
postAdAccountsByTextMsotEventsR adAccountId = notImplemented
