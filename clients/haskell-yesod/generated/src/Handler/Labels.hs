{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.Labels where

import           Import


-- | Apply label to entity
--
--   [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Apply a label to one or more campaigns.   Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/) in addition to campaigns.   Currently, you can apply **brand** and **custom** labels. Future releases will provide more options.    **Note:** You can only apply one brand label to a campaign. You can apply up to 30 custom labels to a campaign.
-- operationId: labels/apply
postAdAccountsByTextLabelsByTextApplyR :: Text -- ^ 
                                       -> Text -- ^ Label ID.
                                       -> Handler Value
postAdAccountsByTextLabelsByTextApplyR adAccountId labelId = notImplemented

-- | Create labels
--
-- [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Apply one or more labels to a campaign. Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/). Currently, you can apply brand and custom labels. Future releases will provide more options.  **Note:** You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.
-- operationId: labels/create
postAdAccountsByTextLabelsR :: Text -- ^ Unique identifier of an ad account.
                            -> Handler Value
postAdAccountsByTextLabelsR adAccountId = notImplemented

-- | List labels
--
-- [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  See a list of labels for assets that your account owns, and filter the list by different criteria. If no filter is provided, it will default to labels associated with the ad account id.
-- operationId: labels/list
getAdAccountsByTextLabelsR :: Text -- ^ Unique identifier of an ad account.
                           -> Handler Value
getAdAccountsByTextLabelsR adAccountId = notImplemented

-- | Remove label from entities
--
--   [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Remove a label from one or more entities.
-- operationId: labels/remove
postAdAccountsByTextLabelsByTextRemoveR :: Text -- ^ 
                                        -> Text -- ^ Label ID.
                                        -> Handler Value
postAdAccountsByTextLabelsByTextRemoveR adAccountId labelId = notImplemented

-- | Update labels
--
-- [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Change the properties of one or more labels.
-- operationId: labels/update
patchAdAccountsByTextLabelsR :: Text -- ^ Unique identifier of an ad account.
                             -> Handler Value
patchAdAccountsByTextLabelsR adAccountId = notImplemented
