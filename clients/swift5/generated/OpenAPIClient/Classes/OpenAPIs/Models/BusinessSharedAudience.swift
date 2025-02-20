//
// BusinessSharedAudience.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct BusinessSharedAudience: Codable, JSONEncodable, Hashable {

    static let audienceIdRule = StringRule(minLength: nil, maxLength: nil, pattern: "/^\\d+$/")
    /** Unique identifier of an audience */
    public var audienceId: String
    public var operationType: OperationType
    /** List of business IDs to share with or revoke from. */
    public var recipientBusinessIds: [String]

    public init(audienceId: String, operationType: OperationType, recipientBusinessIds: [String]) {
        self.audienceId = audienceId
        self.operationType = operationType
        self.recipientBusinessIds = recipientBusinessIds
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case audienceId = "audience_id"
        case operationType = "operation_type"
        case recipientBusinessIds = "recipient_business_ids"
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(audienceId, forKey: .audienceId)
        try container.encode(operationType, forKey: .operationType)
        try container.encode(recipientBusinessIds, forKey: .recipientBusinessIds)
    }
}

