//
// BusinessAccessRole.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** Permission role for business access. */
public enum BusinessAccessRole: String, Codable, CaseIterable {
    case owner = "OWNER"
    case admin = "ADMIN"
    case analyst = "ANALYST"
    case sosReader = "SOS_READER"
    case financeManager = "FINANCE_MANAGER"
    case audienceManager = "AUDIENCE_MANAGER"
    case campaignManager = "CAMPAIGN_MANAGER"
    case catalogsManager = "CATALOGS_MANAGER"
    case restrictedOwner = "RESTRICTED_OWNER"
    case profileManager = "PROFILE_MANAGER"
    case profilePublisher = "PROFILE_PUBLISHER"
    case resourcePinnerListOwner = "RESOURCE_PINNER_LIST_OWNER"
    case resourcePinnerListReader = "RESOURCE_PINNER_LIST_READER"
    case bizPinnerListSharer = "BIZ_PINNER_LIST_SHARER"
    case resourceConversionTagsReader = "RESOURCE_CONVERSION_TAGS_READER"
}