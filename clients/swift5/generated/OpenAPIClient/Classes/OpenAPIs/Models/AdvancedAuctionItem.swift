//
// AdvancedAuctionItem.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct AdvancedAuctionItem: Codable, JSONEncodable, Hashable {

    /** The catalog retail item id in the merchant namespace */
    public var itemId: String
    public var country: Country
    public var language: Language
    public var bidOptions: AdvancedAuctionBidOptions

    public init(itemId: String, country: Country, language: Language, bidOptions: AdvancedAuctionBidOptions) {
        self.itemId = itemId
        self.country = country
        self.language = language
        self.bidOptions = bidOptions
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case itemId = "item_id"
        case country
        case language
        case bidOptions = "bid_options"
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(itemId, forKey: .itemId)
        try container.encode(country, forKey: .country)
        try container.encode(language, forKey: .language)
        try container.encode(bidOptions, forKey: .bidOptions)
    }
}

