{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.Media where

import           Import


-- | Register media upload
--
-- Register your intent to upload media.  The response includes all of the information needed to upload the media to Pinterest.  To upload the media, make an HTTP POST request (using &#x60;curl&#x60;, for example) to &#x60;upload_url&#x60; using the &#x60;Content-Type&#x60; header value. Send the media file&#39;s contents as the request&#39;s &#x60;file&#x60; parameter and also include all of the parameters from &#x60;upload_parameters&#x60;.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.
-- operationId: media/create
postMediaR :: Handler Value
postMediaR = notImplemented

-- | Get media upload details
--
-- Get details for a registered media upload, including its current status.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.
-- operationId: media/get
getMediaByTextR :: Text -- ^ Unique identifier for this media upload. Used to track status and for attaching during Pin creation.
                -> Handler Value
getMediaByTextR mediaId = notImplemented

-- | List media uploads
--
-- List media uploads filtered by given parameters.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.
-- operationId: media/list
getMediaR :: Handler Value
getMediaR = notImplemented
