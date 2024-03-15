{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.Audiences where

import           Import


-- | Create audience
--
-- Create an audience you can use in targeting for specific ad groups. Targeting combines customer information with the ways users interact with Pinterest to help you reach specific groups of users; you can include or exclude specific audience_ids when you create an ad group. &lt;p/&gt; For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/audience-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Audience targeting&lt;/a&gt;.
-- operationId: audiences/create
postAdAccountsByTextAudiencesR :: Text -- ^ Unique identifier of an ad account.
                               -> Handler Value
postAdAccountsByTextAudiencesR adAccountId = notImplemented

-- | Create custom audience
--
-- Create a custom audience and find the audiences you want your ads to reach.
-- operationId: audiences/createCustom
postAdAccountsByTextAudiencesCustomR :: Text -- ^ Unique identifier of an ad account.
                                     -> Handler Value
postAdAccountsByTextAudiencesCustomR adAccountId = notImplemented

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
