//
// CatalogsVerticalsListProductsByCatalogBasedFilterRequest.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** Request object to list products for a given catalog_id and product group filter. */
public enum CatalogsVerticalsListProductsByCatalogBasedFilterRequest: Codable, JSONEncodable, Hashable {
    case typeCatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest(CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest)
    case typeCatalogsHotelListProductsByCatalogBasedFilterRequest(CatalogsHotelListProductsByCatalogBasedFilterRequest)
    case typeCatalogsRetailListProductsByCatalogBasedFilterRequest(CatalogsRetailListProductsByCatalogBasedFilterRequest)

    public func encode(to encoder: Encoder) throws {
        var container = encoder.singleValueContainer()
        switch self {
        case .typeCatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest(let value):
            try container.encode(value)
        case .typeCatalogsHotelListProductsByCatalogBasedFilterRequest(let value):
            try container.encode(value)
        case .typeCatalogsRetailListProductsByCatalogBasedFilterRequest(let value):
            try container.encode(value)
        }
    }

    public init(from decoder: Decoder) throws {
        let container = try decoder.singleValueContainer()
        if let value = try? container.decode(CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest.self) {
            self = .typeCatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest(value)
        } else if let value = try? container.decode(CatalogsHotelListProductsByCatalogBasedFilterRequest.self) {
            self = .typeCatalogsHotelListProductsByCatalogBasedFilterRequest(value)
        } else if let value = try? container.decode(CatalogsRetailListProductsByCatalogBasedFilterRequest.self) {
            self = .typeCatalogsRetailListProductsByCatalogBasedFilterRequest(value)
        } else {
            throw DecodingError.typeMismatch(Self.Type.self, .init(codingPath: decoder.codingPath, debugDescription: "Unable to decode instance of CatalogsVerticalsListProductsByCatalogBasedFilterRequest"))
        }
    }
}

