//
// DeliveryMetricsResponseItemsInner.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct DeliveryMetricsResponseItemsInner: Codable, JSONEncodable, Hashable {

    public enum Category: String, Codable, CaseIterable {
        case ads = "ADS"
        case organic = "ORGANIC"
    }
    /** Metric's name. */
    public var name: String?
    /** Category name */
    public var category: Category?
    /** How the metric is defined. */
    public var definition: String?
    /** Display name, when available. If unavaible it will not be returned. Matches how the metric is named in our native tools like Pinterest Ads Manager. */
    public var displayName: String?

    public init(name: String? = nil, category: Category? = nil, definition: String? = nil, displayName: String? = nil) {
        self.name = name
        self.category = category
        self.definition = definition
        self.displayName = displayName
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case name
        case category
        case definition
        case displayName = "display_name"
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(name, forKey: .name)
        try container.encodeIfPresent(category, forKey: .category)
        try container.encodeIfPresent(definition, forKey: .definition)
        try container.encodeIfPresent(displayName, forKey: .displayName)
    }
}

