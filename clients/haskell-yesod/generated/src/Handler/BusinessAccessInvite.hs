{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.BusinessAccessInvite where

import           Import


-- | Create a request to access an existing partner&#39;s assets.
--
-- Create a request to access an existing partner&#39;s assets with the specified permissions. The request will be sent to the partner for approval. The assets that can be requested are ad accounts and profiles.
-- operationId: assetAccessRequests/create
postBusinessesByTextRequestsAssetsAccessR :: Text -- ^ Unique identifier of the requesting business.
                                          -> Handler Value
postBusinessesByTextRequestsAssetsAccessR businessId = notImplemented

-- | Cancel invites/requests
--
-- Cancel membership/partnership invites and/or requests.
-- operationId: cancelInvitesOrRequests
deleteBusinessesByTextInvitesR :: Text -- ^ Business id
                               -> Handler Value
deleteBusinessesByTextInvitesR businessId = notImplemented

-- | Update invite/request with an asset permission
--
-- Assign asset permissions information to an existing invite/request. Can be used to: - Request access to a partner&#39;s asset. Note: This is only for when no existing partnership exists. If an existing   partnership exists, use \&quot;Create a request to access an existing partner&#39;s assets\&quot; to request access to your   partner&#39;s assets.     - invite_type&#x3D;\&quot;PARTNER_REQUEST\&quot; - Invite a partner to access your business assets. Note: This is only for when there is no existing partnership.   If there is an existing partnership, use \&quot;Assign/Update partner asset permissions\&quot; to assign a partner access to   new assets.     - invite_type&#x3D;\&quot;PARTNER_INVITE\&quot; - Invite a member to access your business assets. Note: This is only for when there is no existing membership.   If there is an existing membership, use \&quot;Assign/Update member asset permissions\&quot; to assign a member access to new   assets.     - invite_type&#x3D;\&quot;MEMBER_INVITE\&quot;  To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview.
-- operationId: createAssetInvites
postBusinessesByTextInvitesAssetsAccessR :: Text -- ^ Unique identifier of the requesting business.
                                         -> Handler Value
postBusinessesByTextInvitesAssetsAccessR businessId = notImplemented

-- | Create invites or requests
--
-- Create batch invites or requests. Can create batch invites or requests as described below. - Invite members to join the business. This would required specifying the following:     - invite_type&#x3D;\&quot;MEMBER_INVITE\&quot;     - business_role&#x3D;\&quot;EMPLOYEE\&quot; OR business_role&#x3D;\&quot;BIZ_ADMIN\&quot; (To learn more about business roles, visit     https://help.pinterest.com/en/business/article/profile-permissions-in-business-access.)     - members - Invite partners to access your business assets. This would require specifying the following:     - invite_type&#x3D;\&quot;PARTNER_INVITE\&quot;     - business_role&#x3D;\&quot;PARTNER\&quot;     - partners - Request to be a partner so you can access their assets. This would require specifying the following:     - invite_type&#x3D;\&quot;PARTNER_REQUEST\&quot;     - business_role&#x3D;\&quot;PARTNER\&quot;     - partners
-- operationId: createMembershipOrPartnershipInvites
postBusinessesByTextInvitesR :: Text -- ^ Business id
                             -> Handler Value
postBusinessesByTextInvitesR businessId = notImplemented

-- | Get invites/requests
--
-- Get the membership/partnership invites and/or requests for the authorized user.
-- operationId: get/invites
getBusinessesByTextInvitesR :: Text -- ^ Unique identifier of the requesting business.
                            -> Handler Value
getBusinessesByTextInvitesR businessId = notImplemented

-- | Accept or decline an invite/request
--
-- Accept or decline invites or requests.
-- operationId: respondBusinessAccessInvites
patchBusinessesInvitesR :: Handler Value
patchBusinessesInvitesR = notImplemented
