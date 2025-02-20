//
// CatalogsFeedsCreateRequest.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** Request object for creating a feed. Please, be aware that \&quot;default_country\&quot; and \&quot;default_locale\&quot; are not required in the spec for forward compatibility but for now the API will not accept requests without those fields. */
public struct CatalogsFeedsCreateRequest: Codable, JSONEncodable, Hashable {

    static let locationRule = StringRule(minLength: nil, maxLength: nil, pattern: "/^(http|https|ftp|sftp):\/\//")
    public var defaultCurrency: NullableCurrency?
    /** A human-friendly name associated to a given feed. */
    public var name: String
    public var format: CatalogsFormat
    public var defaultLocale: CatalogsFeedsCreateRequestDefaultLocale?
    public var credentials: CatalogsFeedCredentials?
    /** The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. */
    public var location: String
    public var preferredProcessingSchedule: CatalogsFeedProcessingSchedule?
    public var defaultCountry: Country?
    public var defaultAvailability: ProductAvailabilityType?
    public var status: CatalogsStatus?

    public init(defaultCurrency: NullableCurrency? = nil, name: String, format: CatalogsFormat, defaultLocale: CatalogsFeedsCreateRequestDefaultLocale? = nil, credentials: CatalogsFeedCredentials? = nil, location: String, preferredProcessingSchedule: CatalogsFeedProcessingSchedule? = nil, defaultCountry: Country? = nil, defaultAvailability: ProductAvailabilityType? = nil, status: CatalogsStatus? = nil) {
        self.defaultCurrency = defaultCurrency
        self.name = name
        self.format = format
        self.defaultLocale = defaultLocale
        self.credentials = credentials
        self.location = location
        self.preferredProcessingSchedule = preferredProcessingSchedule
        self.defaultCountry = defaultCountry
        self.defaultAvailability = defaultAvailability
        self.status = status
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case defaultCurrency = "default_currency"
        case name
        case format
        case defaultLocale = "default_locale"
        case credentials
        case location
        case preferredProcessingSchedule = "preferred_processing_schedule"
        case defaultCountry = "default_country"
        case defaultAvailability = "default_availability"
        case status
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(defaultCurrency, forKey: .defaultCurrency)
        try container.encode(name, forKey: .name)
        try container.encode(format, forKey: .format)
        try container.encodeIfPresent(defaultLocale, forKey: .defaultLocale)
        try container.encodeIfPresent(credentials, forKey: .credentials)
        try container.encode(location, forKey: .location)
        try container.encodeIfPresent(preferredProcessingSchedule, forKey: .preferredProcessingSchedule)
        try container.encodeIfPresent(defaultCountry, forKey: .defaultCountry)
        try container.encodeIfPresent(defaultAvailability, forKey: .defaultAvailability)
        try container.encodeIfPresent(status, forKey: .status)
    }
}

