//
// AudienceCreateCustomRequest.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct AudienceCreateCustomRequest: Codable, JSONEncodable, Hashable {

    static let adAccountIdRule = StringRule(minLength: nil, maxLength: nil, pattern: "/^\\d+$/")
    /** Ad account ID. */
    public var adAccountId: String?
    /** Audience name. */
    public var name: String
    public var rule: AudienceRule
    public var sharingType: AudienceSharingType
    public var dataParty: AudienceDataParty
    public var category: String?

    public init(adAccountId: String? = nil, name: String, rule: AudienceRule, sharingType: AudienceSharingType, dataParty: AudienceDataParty, category: String? = nil) {
        self.adAccountId = adAccountId
        self.name = name
        self.rule = rule
        self.sharingType = sharingType
        self.dataParty = dataParty
        self.category = category
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case adAccountId = "ad_account_id"
        case name
        case rule
        case sharingType = "sharing_type"
        case dataParty = "data_party"
        case category
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(adAccountId, forKey: .adAccountId)
        try container.encode(name, forKey: .name)
        try container.encode(rule, forKey: .rule)
        try container.encode(sharingType, forKey: .sharingType)
        try container.encode(dataParty, forKey: .dataParty)
        try container.encodeIfPresent(category, forKey: .category)
    }
}
