//
// CatalogsRetailBatchRequest.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** A request object that can have multiple operations on a single retail batch */
public struct CatalogsRetailBatchRequest: Codable, JSONEncodable, Hashable {

    public enum CatalogType: String, Codable, CaseIterable {
        case retail = "RETAIL"
    }
    static let itemsRule = ArrayRule(minItems: 1, maxItems: 1000, uniqueItems: false)
    public var catalogType: CatalogType
    public var country: Country
    public var language: CatalogsItemsRequestLanguage
    /** Array with catalogs item operations */
    public var items: [CatalogsRetailBatchRequestItemsInner]

    public init(catalogType: CatalogType, country: Country, language: CatalogsItemsRequestLanguage, items: [CatalogsRetailBatchRequestItemsInner]) {
        self.catalogType = catalogType
        self.country = country
        self.language = language
        self.items = items
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case catalogType = "catalog_type"
        case country
        case language
        case items
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(catalogType, forKey: .catalogType)
        try container.encode(country, forKey: .country)
        try container.encode(language, forKey: .language)
        try container.encode(items, forKey: .items)
    }
}

