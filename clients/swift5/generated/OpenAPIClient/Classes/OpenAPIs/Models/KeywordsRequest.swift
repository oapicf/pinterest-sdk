//
// KeywordsRequest.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct KeywordsRequest: Codable, JSONEncodable, Hashable {

    static let parentIdRule = StringRule(minLength: nil, maxLength: nil, pattern: "/^((AG)|C)?\\d+$/")
    /** Keyword JSON array. Each array element has 3 fields */
    public var keywords: [KeywordsCommon]
    /** Keyword parent entity ID (advertiser, campaign, ad group). */
    public var parentId: String

    public init(keywords: [KeywordsCommon], parentId: String) {
        self.keywords = keywords
        self.parentId = parentId
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case keywords
        case parentId = "parent_id"
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(keywords, forKey: .keywords)
        try container.encode(parentId, forKey: .parentId)
    }
}
