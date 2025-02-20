//
// CatalogsDeleteCreativeAssetsItem.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** A creative assets item to be deleted */
public struct CatalogsDeleteCreativeAssetsItem: Codable, JSONEncodable, Hashable {

    public enum Operation: String, Codable, CaseIterable {
        case delete = "DELETE"
    }
    /** The catalog creative assets id in the merchant namespace */
    public var creativeAssetsId: String
    public var operation: Operation

    public init(creativeAssetsId: String, operation: Operation) {
        self.creativeAssetsId = creativeAssetsId
        self.operation = operation
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case creativeAssetsId = "creative_assets_id"
        case operation
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(creativeAssetsId, forKey: .creativeAssetsId)
        try container.encode(operation, forKey: .operation)
    }
}

