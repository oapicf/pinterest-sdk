//
// TargetingTemplateAudienceSizingReachEstimate.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct TargetingTemplateAudienceSizingReachEstimate: Codable, JSONEncodable, Hashable {

    public var estimate: Int64?
    public var lowerBound: Int64?
    public var upperBound: Int64?

    public init(estimate: Int64? = nil, lowerBound: Int64? = nil, upperBound: Int64? = nil) {
        self.estimate = estimate
        self.lowerBound = lowerBound
        self.upperBound = upperBound
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case estimate
        case lowerBound = "lower_bound"
        case upperBound = "upper_bound"
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(estimate, forKey: .estimate)
        try container.encodeIfPresent(lowerBound, forKey: .lowerBound)
        try container.encodeIfPresent(upperBound, forKey: .upperBound)
    }
}

