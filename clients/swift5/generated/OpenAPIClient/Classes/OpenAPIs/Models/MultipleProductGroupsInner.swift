//
// MultipleProductGroupsInner.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public enum MultipleProductGroupsInner: Codable, JSONEncodable, Hashable {
    case typeCatalogsProductGroupCreateRequest(CatalogsProductGroupCreateRequest)
    case typeCatalogsVerticalProductGroupCreateRequest(CatalogsVerticalProductGroupCreateRequest)

    public func encode(to encoder: Encoder) throws {
        var container = encoder.singleValueContainer()
        switch self {
        case .typeCatalogsProductGroupCreateRequest(let value):
            try container.encode(value)
        case .typeCatalogsVerticalProductGroupCreateRequest(let value):
            try container.encode(value)
        }
    }

    public init(from decoder: Decoder) throws {
        let container = try decoder.singleValueContainer()
        if let value = try? container.decode(CatalogsProductGroupCreateRequest.self) {
            self = .typeCatalogsProductGroupCreateRequest(value)
        } else if let value = try? container.decode(CatalogsVerticalProductGroupCreateRequest.self) {
            self = .typeCatalogsVerticalProductGroupCreateRequest(value)
        } else {
            throw DecodingError.typeMismatch(Self.Type.self, .init(codingPath: decoder.codingPath, debugDescription: "Unable to decode instance of MultipleProductGroupsInner"))
        }
    }
}

