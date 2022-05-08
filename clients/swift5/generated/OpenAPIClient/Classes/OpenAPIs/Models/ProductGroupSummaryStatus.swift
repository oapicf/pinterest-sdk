//
// ProductGroupSummaryStatus.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** Summary status for product group */
public enum ProductGroupSummaryStatus: String, Codable, CaseIterable {
    case running = "RUNNING"
    case paused = "PAUSED"
    case excluded = "EXCLUDED"
    case archived = "ARCHIVED"
}