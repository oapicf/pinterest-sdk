//
// OrderLineError.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct OrderLineError: Codable, JSONEncodable, Hashable {

    public var data: OrderLine?
    public var errorMessages: [String]?

    public init(data: OrderLine? = nil, errorMessages: [String]? = nil) {
        self.data = data
        self.errorMessages = errorMessages
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case data
        case errorMessages = "error_messages"
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(data, forKey: .data)
        try container.encodeIfPresent(errorMessages, forKey: .errorMessages)
    }
}

