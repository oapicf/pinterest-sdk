//
// ItemResponse.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** Object describing an item record */
public struct ItemResponse: Codable, JSONEncodable, Hashable {

    public var catalogType: CatalogsType
    /** The catalog item id in the merchant namespace */
    public var itemId: String?
    /** The pins mapped to the item */
    public var pins: [Pin]?
    public var attributes: CatalogsHotelAttributes?
    /** The catalog hotel id in the merchant namespace */
    public var hotelId: String?
    /** Array with the errors for the item id requested */
    public var errors: [ItemValidationEvent]?

    public init(catalogType: CatalogsType, itemId: String? = nil, pins: [Pin]? = nil, attributes: CatalogsHotelAttributes? = nil, hotelId: String? = nil, errors: [ItemValidationEvent]? = nil) {
        self.catalogType = catalogType
        self.itemId = itemId
        self.pins = pins
        self.attributes = attributes
        self.hotelId = hotelId
        self.errors = errors
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case catalogType = "catalog_type"
        case itemId = "item_id"
        case pins
        case attributes
        case hotelId = "hotel_id"
        case errors
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(catalogType, forKey: .catalogType)
        try container.encodeIfPresent(itemId, forKey: .itemId)
        try container.encodeIfPresent(pins, forKey: .pins)
        try container.encodeIfPresent(attributes, forKey: .attributes)
        try container.encodeIfPresent(hotelId, forKey: .hotelId)
        try container.encodeIfPresent(errors, forKey: .errors)
    }
}
