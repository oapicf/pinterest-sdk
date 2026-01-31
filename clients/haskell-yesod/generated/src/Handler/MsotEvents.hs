{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.MsotEvents where

import           Import


-- | Send Measurement Source Of Truth (MSOT) attributed conversion events
--
-- &lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt; &lt;br&gt; &lt;p&gt;Advertisers or their measurement partners can send attributed MSOT conversion events to Pinterest based on their &lt;code&gt;ad_account_id&lt;/code&gt;. The request body should be a JSON object.&lt;/p&gt; - These events will NOT be used in Reporting.
-- operationId: msotEvents/create
postAdAccountsByTextMsotEventsR :: Text -- ^ Unique identifier of an ad account.
                                -> Handler Value
postAdAccountsByTextMsotEventsR adAccountId = notImplemented
