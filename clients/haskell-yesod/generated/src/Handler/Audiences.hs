{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.Audiences where

import           Import


-- | Create audience
--
-- Create a new audience for the ad account.
-- operationId: audiences/create
postAdAccountsByTextAudiencesR :: Text -- ^ Unique identifier of an ad account.
                               -> Handler Value
postAdAccountsByTextAudiencesR adAccountId = notImplemented

-- | Get audience
--
-- Get a specific audience given the audience ID.
-- operationId: audiences/get
getAdAccountsByTextAudiencesByTextR :: Text -- ^ Audience ID.
                                    -> Text -- ^ Unique identifier of an ad account.
                                    -> Handler Value
getAdAccountsByTextAudiencesByTextR audienceId adAccountId = notImplemented

-- | List audiences
--
-- Get list of audiences for the ad account.
-- operationId: audiences/list
getAdAccountsByTextAudiencesR :: Text -- ^ Unique identifier of an ad account.
                              -> Handler Value
getAdAccountsByTextAudiencesR adAccountId = notImplemented

-- | Update audience
--
-- Update an existing audience for the ad account.
-- operationId: audiences/update
patchAdAccountsByTextAudiencesByTextR :: Text -- ^ Audience ID.
                                      -> Text -- ^ Unique identifier of an ad account.
                                      -> Handler Value
patchAdAccountsByTextAudiencesByTextR audienceId adAccountId = notImplemented
