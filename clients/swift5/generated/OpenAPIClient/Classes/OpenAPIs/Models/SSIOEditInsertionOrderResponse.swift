//
// SSIOEditInsertionOrderResponse.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct SSIOEditInsertionOrderResponse: Codable, JSONEncodable, Hashable {

    /** Salesforce order id */
    public var pinOrderId: String?

    public init(pinOrderId: String? = nil) {
        self.pinOrderId = pinOrderId
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case pinOrderId = "pin_order_id"
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(pinOrderId, forKey: .pinOrderId)
    }
}
