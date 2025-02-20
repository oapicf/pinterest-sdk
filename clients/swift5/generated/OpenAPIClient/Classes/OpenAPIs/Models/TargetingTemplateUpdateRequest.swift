//
// TargetingTemplateUpdateRequest.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct TargetingTemplateUpdateRequest: Codable, JSONEncodable, Hashable {

    public enum OperationType: String, Codable, CaseIterable {
        case remove = "REMOVE"
    }
    static let idRule = StringRule(minLength: nil, maxLength: nil, pattern: "/^\\d+$/")
    public var operationType: OperationType
    /** Targeting template ID */
    public var id: String

    public init(operationType: OperationType, id: String) {
        self.operationType = operationType
        self.id = id
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case operationType = "operation_type"
        case id
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(operationType, forKey: .operationType)
        try container.encode(id, forKey: .id)
    }
}

