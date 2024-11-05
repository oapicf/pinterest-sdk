{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.BusinessAccessRelationships where

import           Import


-- | Terminate business memberships
--
-- Terminate memberships between the specified members and your business.
-- operationId: deleteBusinessMembership
deleteBusinessesByTextMembersR :: Text -- ^ Business id
                               -> Handler Value
deleteBusinessesByTextMembersR businessId = notImplemented

-- | Terminate business partnerships
--
-- Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.
-- operationId: deleteBusinessPartners
deleteBusinessesByTextPartnersR :: Text -- ^ Unique identifier of the requesting business.
                                -> Handler Value
deleteBusinessesByTextPartnersR businessId = notImplemented

-- | List business employers for user
--
-- Get all of the viewing user&#39;s business employers.
-- operationId: get/businessEmployers
getBusinessesEmployersR :: Handler Value
getBusinessesEmployersR = notImplemented

-- | Get business members
--
-- Get all members of the specified business. The return response will include the member&#39;s business_role and assets they have access to if assets_summary&#x3D;TRUE
-- operationId: get/businessMembers
getBusinessesByTextMembersR :: Text -- ^ Unique identifier of the requesting business.
                            -> Handler Value
getBusinessesByTextMembersR businessId = notImplemented

-- | Get business partners
--
-- Get all partners of the specified business.  If the assets_summary&#x3D;TRUE and: - partner_type&#x3D;INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type&#x3D;EXTERNAL, the business assets returned are your partner&#39;s business assets the partner has granted you   access to.
-- operationId: get/businessPartners
getBusinessesByTextPartnersR :: Text -- ^ Unique identifier of the requesting business.
                             -> Handler Value
getBusinessesByTextPartnersR businessId = notImplemented

-- | Update member&#39;s business role
--
-- Update a member&#39;s business role within the business.
-- operationId: update/businessMemberships
patchBusinessesByTextMembersR :: Text -- ^ Business id
                              -> Handler Value
patchBusinessesByTextMembersR businessId = notImplemented
