{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.AudienceSharing where

import           Import


-- | List accounts with access to an audience owned by an ad account
--
-- List all ad accounts and/or businesses that have access to a specific audience. The audience must be owned by the requesting ad account.
-- operationId: adAccountsAudiencesSharedAccounts/list
getAdAccountsByTextAudiencesSharedAccountsR :: Text -- ^ Unique identifier of an ad account.
                                            -> Handler Value
getAdAccountsByTextAudiencesSharedAccountsR adAccountId = notImplemented

-- | List accounts with access to an audience owned by a business
--
-- List all ad accounts and/or businesses that have access to a specific audience. The audience must either be owned by an ad account in the requesting business, or it must have been shared with the requesting business. If the requesting business is not the owner of the audience, only ad accounts owned by the requesting business will be returned.
-- operationId: businessAccountAudiencesSharedAccounts/list
getBusinessesByTextAudiencesSharedAccountsR :: Text -- ^ Unique identifier of the requesting business.
                                            -> Handler Value
getBusinessesByTextAudiencesSharedAccountsR businessId = notImplemented

-- | List received audiences for a business
--
-- Get a list of received audiences for the given business.
-- operationId: sharedAudiencesForBusiness/list
getBusinessesByTextAudiencesR :: Text -- ^ Unique identifier of the requesting business.
                              -> Handler Value
getBusinessesByTextAudiencesR businessId = notImplemented

-- | Update audience sharing between ad accounts
--
-- From an ad account, share a specific audience with another ad account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient ad account(s) must be in the same &lt;a href&#x3D;&#39;https://help.pinterest.com/en/business/article/create-and-manage-accounts&#39;&gt;Pinterest Business Hierarchy&lt;/a&gt; as the business owner of the ad account.&lt;br&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.
-- operationId: updateAdAccountToAdAccountSharedAudience
patchAdAccountsByTextAudiencesAdAccountsSharedR :: Text -- ^ Unique identifier of an ad account.
                                                -> Handler Value
patchAdAccountsByTextAudiencesAdAccountsSharedR adAccountId = notImplemented

-- | Update audience sharing from an ad account to businesses
--
-- From an ad account, share a specific audience with a business account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient business account must be in the same business hierarchy as the business owner of the ad account.&lt;br&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.
-- operationId: updateAdAccountToBusinessSharedAudience
patchAdAccountsByTextAudiencesBusinessesSharedR :: Text -- ^ Unique identifier of an ad account.
                                                -> Handler Value
patchAdAccountsByTextAudiencesBusinessesSharedR adAccountId = notImplemented

-- | Update audience sharing from a business to ad accounts
--
-- From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience. &lt;ul&gt; &lt;li&gt;If the business is the owner of the audience, it can share with any ad account within the same business hierarchy.&lt;/li&gt; &lt;li&gt;If the business is the recipient of the audience, it can share with any of its owned ad accounts.&lt;/li&gt; &lt;/ul&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.
-- operationId: updateBusinessToAdAccountSharedAudience
patchBusinessesByTextAudiencesAdAccountsSharedR :: Text -- ^ Unique identifier of the requesting business.
                                                -> Handler Value
patchBusinessesByTextAudiencesAdAccountsSharedR businessId = notImplemented

-- | Update audience sharing between businesses
--
-- From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.&lt;br&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.
-- operationId: updateBusinessToBusinessSharedAudience
patchBusinessesByTextAudiencesBusinessesSharedR :: Text -- ^ Unique identifier of the requesting business.
                                                -> Handler Value
patchBusinessesByTextAudiencesBusinessesSharedR businessId = notImplemented
