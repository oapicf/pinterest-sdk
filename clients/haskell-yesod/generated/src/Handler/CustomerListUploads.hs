{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.CustomerListUploads where

import           Import


-- | Create customer list upload
--
-- Create a customer list upload request for multipart S3 upload.  Note: Each part must be at least 5mb; however the last part can be any size greater than 0. Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.  **Please review the [update customer list endpoint](/docs/api/v5/customer_lists-update/) documentation for additional information.**
-- operationId: customerListUploads/create
postAdAccountsByTextCustomerListsByTextUploadsR :: Text -- ^ 
                                                -> Text -- ^ Customer list ID.
                                                -> Handler Value
postAdAccountsByTextCustomerListsByTextUploadsR adAccountId customerListId = notImplemented

-- | Get customer list upload
--
-- Get the metadata for a given upload by its ID.
-- operationId: customerListUploads/get
getAdAccountsByTextCustomerListsByTextUploadsByTextR :: Text -- ^ 
                                                     -> Text -- ^ Customer list ID.
                                                     -> Text -- ^ Customer List Upload ID.
                                                     -> Handler Value
getAdAccountsByTextCustomerListsByTextUploadsByTextR adAccountId customerListId customerListUploadId = notImplemented

-- | Run customer list upload
--
-- Begin processing a customer list upload.
-- operationId: customerListUploads/run
postAdAccountsByTextCustomerListsByTextUploadsByTextRunR :: Text -- ^ 
                                                         -> Text -- ^ Customer list ID.
                                                         -> Text -- ^ Customer List Upload ID.
                                                         -> Handler Value
postAdAccountsByTextCustomerListsByTextUploadsByTextRunR adAccountId customerListId customerListUploadId = notImplemented
