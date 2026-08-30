{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.TargetingTemplate where

import           Import


-- | Create targeting templates
--
-- Targeting templates allow advertisers to save a set of targeting details including audience lists, keywords &amp; interest, demographics, and placements to use more than once during the campaign creation process.  Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse performance targeting from prior campaigns for new campaigns.
-- operationId: targetingTemplate/create
postAdAccountsByTextTargetingTemplatesR :: Text -- ^ Unique identifier of an ad account.
                                        -> Handler Value
postAdAccountsByTextTargetingTemplatesR adAccountId = notImplemented

-- | List targeting templates
--
-- Get a list of the targeting templates in the specified &#x60;ad_account_id&#x60;
-- operationId: targetingTemplate/list
getAdAccountsByTextTargetingTemplatesR :: Text -- ^ Unique identifier of an ad account.
                                       -> Handler Value
getAdAccountsByTextTargetingTemplatesR adAccountId = notImplemented

-- | Update targeting templates
--
-- Update the targeting template given advertiser ID and targeting template ID
-- operationId: targetingTemplate/update
patchAdAccountsByTextTargetingTemplatesR :: Text -- ^ Unique identifier of an ad account.
                                         -> Handler Value
patchAdAccountsByTextTargetingTemplatesR adAccountId = notImplemented
