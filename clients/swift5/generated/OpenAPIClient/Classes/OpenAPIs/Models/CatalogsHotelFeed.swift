//
// CatalogsHotelFeed.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** Catalogs Hotel Feed object */
public struct CatalogsHotelFeed: Codable, JSONEncodable, Hashable {

    static let catalogIdRule = StringRule(minLength: nil, maxLength: nil, pattern: "/^\\d+$/")
    public var createdAt: Date?
    public var id: String?
    public var updatedAt: Date?
    /** A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future. */
    public var name: String?
    public var format: CatalogsFormat
    public var catalogType: CatalogsType
    public var credentials: CatalogsFeedCredentials?
    /** The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. */
    public var location: String
    public var preferredProcessingSchedule: CatalogsFeedProcessingSchedule?
    public var status: CatalogsStatus
    public var defaultCurrency: NullableCurrency?
    /** The locale used within a feed for product descriptions. */
    public var defaultLocale: String
    /** Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. */
    public var catalogId: String?

    public init(createdAt: Date? = nil, id: String? = nil, updatedAt: Date? = nil, name: String?, format: CatalogsFormat, catalogType: CatalogsType, credentials: CatalogsFeedCredentials?, location: String, preferredProcessingSchedule: CatalogsFeedProcessingSchedule?, status: CatalogsStatus, defaultCurrency: NullableCurrency?, defaultLocale: String, catalogId: String?) {
        self.createdAt = createdAt
        self.id = id
        self.updatedAt = updatedAt
        self.name = name
        self.format = format
        self.catalogType = catalogType
        self.credentials = credentials
        self.location = location
        self.preferredProcessingSchedule = preferredProcessingSchedule
        self.status = status
        self.defaultCurrency = defaultCurrency
        self.defaultLocale = defaultLocale
        self.catalogId = catalogId
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case createdAt = "created_at"
        case id
        case updatedAt = "updated_at"
        case name
        case format
        case catalogType = "catalog_type"
        case credentials
        case location
        case preferredProcessingSchedule = "preferred_processing_schedule"
        case status
        case defaultCurrency = "default_currency"
        case defaultLocale = "default_locale"
        case catalogId = "catalog_id"
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(createdAt, forKey: .createdAt)
        try container.encodeIfPresent(id, forKey: .id)
        try container.encodeIfPresent(updatedAt, forKey: .updatedAt)
        try container.encode(name, forKey: .name)
        try container.encode(format, forKey: .format)
        try container.encode(catalogType, forKey: .catalogType)
        try container.encode(credentials, forKey: .credentials)
        try container.encode(location, forKey: .location)
        try container.encode(preferredProcessingSchedule, forKey: .preferredProcessingSchedule)
        try container.encode(status, forKey: .status)
        try container.encode(defaultCurrency, forKey: .defaultCurrency)
        try container.encode(defaultLocale, forKey: .defaultLocale)
        try container.encode(catalogId, forKey: .catalogId)
    }
}
