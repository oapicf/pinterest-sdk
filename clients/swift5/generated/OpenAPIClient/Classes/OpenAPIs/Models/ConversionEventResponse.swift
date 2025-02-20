//
// ConversionEventResponse.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct ConversionEventResponse: Codable, JSONEncodable, Hashable {

    static let conversionTagIdRule = StringRule(minLength: nil, maxLength: nil, pattern: "/^\\d+$/")
    static let adAccountIdRule = StringRule(minLength: nil, maxLength: nil, pattern: "/^\\d+$/")
    public var conversionEvent: ConversionTagType?
    /** Id of the tag. */
    public var conversionTagId: String?
    /** Id of the ad account. */
    public var adAccountId: String?
    /** Creation date in epoch format. */
    public var createdTime: Int?

    public init(conversionEvent: ConversionTagType? = nil, conversionTagId: String? = nil, adAccountId: String? = nil, createdTime: Int? = nil) {
        self.conversionEvent = conversionEvent
        self.conversionTagId = conversionTagId
        self.adAccountId = adAccountId
        self.createdTime = createdTime
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case conversionEvent = "conversion_event"
        case conversionTagId = "conversion_tag_id"
        case adAccountId = "ad_account_id"
        case createdTime = "created_time"
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(conversionEvent, forKey: .conversionEvent)
        try container.encodeIfPresent(conversionTagId, forKey: .conversionTagId)
        try container.encodeIfPresent(adAccountId, forKey: .adAccountId)
        try container.encodeIfPresent(createdTime, forKey: .createdTime)
    }
}

