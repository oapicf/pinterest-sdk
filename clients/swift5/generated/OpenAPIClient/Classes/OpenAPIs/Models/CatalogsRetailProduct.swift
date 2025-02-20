//
// CatalogsRetailProduct.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct CatalogsRetailProduct: Codable, JSONEncodable, Hashable {

    public enum CatalogType: String, Codable, CaseIterable {
        case retail = "RETAIL"
    }
    public var catalogType: CatalogType
    public var metadata: CatalogsRetailProductMetadata
    public var pin: Pin?

    public init(catalogType: CatalogType, metadata: CatalogsRetailProductMetadata, pin: Pin?) {
        self.catalogType = catalogType
        self.metadata = metadata
        self.pin = pin
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case catalogType = "catalog_type"
        case metadata
        case pin
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(catalogType, forKey: .catalogType)
        try container.encode(metadata, forKey: .metadata)
        try container.encode(pin, forKey: .pin)
    }
}

