{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.Bulk where

import           Import


-- | Get advertiser entities in bulk
--
-- Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads, and/or keywords; can filter by campaigns. Though the entities may be active, archived, or paused, only active entities will return data.
-- operationId: bulkDownload/create
postAdAccountsByTextBulkDownloadR :: Text -- ^ Unique identifier of an ad account.
                                  -> Handler Value
postAdAccountsByTextBulkDownloadR adAccountId = notImplemented

-- | Download advertiser entities in bulk
--
-- Get the status of a bulk request by &lt;code&gt;request_id&lt;/code&gt;, along with a download URL that will allow you to download the new or updated entity data (campaigns, ad groups, product groups, ads, or keywords).
-- operationId: bulkRequest/get
getAdAccountsByTextBulkByTextR :: Text -- ^ Unique identifier of an ad account.
                               -> Text -- ^ Unique identifier of a bulk upsert request.
                               -> Handler Value
getAdAccountsByTextBulkByTextR adAccountId bulkRequestId = notImplemented

-- | Create/update ad entities in bulk
--
-- Either create or update any combination of campaigns, ad groups, product groups, ads, or keywords. Note that this request will be processed asynchronously; the response will include a &lt;code&gt;request_id&lt;/code&gt; that can be used to obtain the status of the request.
-- operationId: bulkUpsert/create
postAdAccountsByTextBulkUpsertR :: Text -- ^ Unique identifier of an ad account.
                                -> Handler Value
postAdAccountsByTextBulkUpsertR adAccountId = notImplemented
