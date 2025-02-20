//
// DeletePartnerAssetsResultsResponseArray.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct DeletePartnerAssetsResultsResponseArray: Codable, JSONEncodable, Hashable {

    /** List of terminated asset access. */
    public var items: [DeletePartnerAssetsResult]?

    public init(items: [DeletePartnerAssetsResult]? = nil) {
        self.items = items
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case items
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(items, forKey: .items)
    }
}

