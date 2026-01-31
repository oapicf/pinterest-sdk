{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.CustomerListUploads where

import           Import


-- | Create customer list upload
--
-- &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Closed beta&lt;/a&gt;  &lt;p&gt;Create a customer list upload request for multipart S3 upload.&lt;/p&gt; &lt;p&gt;Note: Each part must be at least 5mb; however the last part can be any size greater than 0. Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.&lt;/p&gt; &lt;p&gt;&lt;b&gt;Please review the &lt;u&gt;&lt;a href&#x3D;\&quot;/docs/api/v5/customer_lists-update/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;update customer list endpoint&lt;/a&gt;&lt;/u&gt; documentation for additional information.&lt;/b&gt;&lt;/p&gt;
-- operationId: customerListUploads/create
postAdAccountsByTextCustomerListsByTextUploadsR :: Text -- ^ Unique identifier of an ad account.
                                                -> Text -- ^ Unique identifier of a customer list
                                                -> Handler Value
postAdAccountsByTextCustomerListsByTextUploadsR adAccountId customerListId = notImplemented

-- | Get customer list upload
--
-- &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Closed beta&lt;/a&gt; &lt;p&gt;Get the metadata for a given upload by its ID.&lt;/p&gt;
-- operationId: customerListUploads/get
getAdAccountsByTextCustomerListsByTextUploadsByTextR :: Text -- ^ Unique identifier of an ad account.
                                                     -> Text -- ^ Unique identifier of a customer list
                                                     -> Text -- ^ Unique identifier of a customer list upload
                                                     -> Handler Value
getAdAccountsByTextCustomerListsByTextUploadsByTextR adAccountId customerListId customerListUploadId = notImplemented

-- | Run customer list upload
--
-- &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Closed beta&lt;/a&gt; &lt;p&gt;Begin processing a customer list upload.&lt;/p&gt;
-- operationId: customerListUploads/run
postAdAccountsByTextCustomerListsByTextUploadsByTextRunR :: Text -- ^ Unique identifier of an ad account.
                                                         -> Text -- ^ Unique identifier of a customer list
                                                         -> Text -- ^ Unique identifier of a customer list upload
                                                         -> Handler Value
postAdAccountsByTextCustomerListsByTextUploadsByTextRunR adAccountId customerListId customerListUploadId = notImplemented
