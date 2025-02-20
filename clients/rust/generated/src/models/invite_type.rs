/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://openapi-generator.tech
 */

use crate::models;
use serde::{Deserialize, Serialize};

/// InviteType : The type of invite. <br>'MEMBER_INVITE' is to invite a member to access your business assets. <br>'PARTNER INVITE' is to invite a partner to access your business assets. <br>'PARTNER_REQUEST' is to request access a partner's business assets.
/// The type of invite. <br>'MEMBER_INVITE' is to invite a member to access your business assets. <br>'PARTNER INVITE' is to invite a partner to access your business assets. <br>'PARTNER_REQUEST' is to request access a partner's business assets.
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum InviteType {
    #[serde(rename = "MEMBER_INVITE")]
    MemberInvite,
    #[serde(rename = "PARTNER_INVITE")]
    PartnerInvite,
    #[serde(rename = "PARTNER_REQUEST")]
    PartnerRequest,

}

impl std::fmt::Display for InviteType {
    fn fmt(&self, f: &mut std::fmt::Formatter) -> std::fmt::Result {
        match self {
            Self::MemberInvite => write!(f, "MEMBER_INVITE"),
            Self::PartnerInvite => write!(f, "PARTNER_INVITE"),
            Self::PartnerRequest => write!(f, "PARTNER_REQUEST"),
        }
    }
}

impl Default for InviteType {
    fn default() -> InviteType {
        Self::MemberInvite
    }
}

