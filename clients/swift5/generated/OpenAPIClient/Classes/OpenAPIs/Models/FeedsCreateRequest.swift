//
// FeedsCreateRequest.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public enum FeedsCreateRequest: Codable, JSONEncodable, Hashable {
    case typeCatalogsFeedsCreateRequest(CatalogsFeedsCreateRequest)
    case typeCatalogsVerticalFeedsCreateRequest(CatalogsVerticalFeedsCreateRequest)

    public func encode(to encoder: Encoder) throws {
        var container = encoder.singleValueContainer()
        switch self {
        case .typeCatalogsFeedsCreateRequest(let value):
            try container.encode(value)
        case .typeCatalogsVerticalFeedsCreateRequest(let value):
            try container.encode(value)
        }
    }

    public init(from decoder: Decoder) throws {
        let container = try decoder.singleValueContainer()
        if let value = try? container.decode(CatalogsFeedsCreateRequest.self) {
            self = .typeCatalogsFeedsCreateRequest(value)
        } else if let value = try? container.decode(CatalogsVerticalFeedsCreateRequest.self) {
            self = .typeCatalogsVerticalFeedsCreateRequest(value)
        } else {
            throw DecodingError.typeMismatch(Self.Type.self, .init(codingPath: decoder.codingPath, debugDescription: "Unable to decode instance of FeedsCreateRequest"))
        }
    }
}
