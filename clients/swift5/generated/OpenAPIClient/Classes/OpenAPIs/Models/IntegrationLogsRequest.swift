//
// IntegrationLogsRequest.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** Batch of logs sent from an integration application. */
public struct IntegrationLogsRequest: Codable, JSONEncodable, Hashable {

    static let logsRule = ArrayRule(minItems: 1, maxItems: 250, uniqueItems: false)
    public var logs: [IntegrationLog]

    public init(logs: [IntegrationLog]) {
        self.logs = logs
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case logs
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(logs, forKey: .logs)
    }
}

