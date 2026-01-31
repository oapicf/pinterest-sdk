{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.Audiences where

import           Import


-- | Create audience
--
-- Create an audience you can use in targeting for specific ad groups. Targeting combines customer information with the ways users interact with Pinterest to help you reach specific groups of users; you can include or exclude specific &#x60;audience_ids&#x60; when you create an ad group. &lt;p/&gt; Learn about &lt;a href&#x3D;\&quot;/docs/work-with-targets-and-audiences/create-audiences/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;creating different kinds of audiences&lt;/a&gt;.
-- operationId: audiences/create
postAdAccountsByTextAudiencesR :: Text -- ^ Unique identifier of an ad account.
                               -> Handler Value
postAdAccountsByTextAudiencesR adAccountId = notImplemented

-- | Get audience
--
-- Get a specific audience given the audience ID.
-- operationId: audiences/get
getAdAccountsByTextAudiencesByTextR :: Text -- ^ Unique identifier of an ad account.
                                    -> Text -- ^ Unique identifier of an audience
                                    -> Handler Value
getAdAccountsByTextAudiencesByTextR adAccountId audienceId = notImplemented

-- | List audiences
--
-- Get list of audiences for the ad account.
-- operationId: audiences/list
getAdAccountsByTextAudiencesR :: Text -- ^ Unique identifier of an ad account.
                              -> Handler Value
getAdAccountsByTextAudiencesR adAccountId = notImplemented

-- | Update audience
--
-- Update (edit or remove) an existing targeting audience.
-- operationId: audiences/update
patchAdAccountsByTextAudiencesByTextR :: Text -- ^ Unique identifier of an ad account.
                                      -> Text -- ^ Unique identifier of an audience
                                      -> Handler Value
patchAdAccountsByTextAudiencesByTextR adAccountId audienceId = notImplemented
