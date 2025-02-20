//
// UpdatePartnerResultsResponseArrayItemsInner.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct UpdatePartnerResultsResponseArrayItemsInner: Codable, JSONEncodable, Hashable {

    static let memberOrPartnerIdRule = StringRule(minLength: nil, maxLength: 18, pattern: "/^\\d+$/")
    public var exception: BusinessAccessError?
    public var memberOrPartnerId: String?

    public init(exception: BusinessAccessError? = nil, memberOrPartnerId: String? = nil) {
        self.exception = exception
        self.memberOrPartnerId = memberOrPartnerId
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case exception
        case memberOrPartnerId = "member_or_partner_id"
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(exception, forKey: .exception)
        try container.encodeIfPresent(memberOrPartnerId, forKey: .memberOrPartnerId)
    }
}

