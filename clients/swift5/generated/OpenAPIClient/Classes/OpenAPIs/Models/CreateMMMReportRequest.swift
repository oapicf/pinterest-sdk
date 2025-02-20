//
// CreateMMMReportRequest.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct CreateMMMReportRequest: Codable, JSONEncodable, Hashable {

    public enum Granularity: String, Codable, CaseIterable {
        case day = "DAY"
        case week = "WEEK"
    }
    public enum Level: String, Codable, CaseIterable {
        case campaignTargeting = "CAMPAIGN_TARGETING"
        case adGroupTargeting = "AD_GROUP_TARGETING"
    }
    static let startDateRule = StringRule(minLength: nil, maxLength: nil, pattern: "/^(\\d{4})-(\\d{2})-(\\d{2})$/")
    static let endDateRule = StringRule(minLength: nil, maxLength: nil, pattern: "/^(\\d{4})-(\\d{2})-(\\d{2})$/")
    static let targetingTypesRule = ArrayRule(minItems: 1, maxItems: 5, uniqueItems: false)
    /** Name of the Marketing Mix Modeling (MMM) report */
    public var reportName: String
    /** Metric report start date (UTC). Format: YYYY-MM-DD */
    public var startDate: String
    /** Metric report end date (UTC). Format: YYYY-MM-DD */
    public var endDate: String
    /** DAY - metrics are broken down daily.<br> WEEK - metrics are broken down weekly. */
    public var granularity: Granularity
    /** Level of the report */
    public var level: Level
    /** List of targeting types */
    public var targetingTypes: [MMMReportingTargetingType]
    /** Metric and entity columns */
    public var columns: [MMMReportingColumn]
    /** A List of countries for filtering */
    public var countries: [TargetingAdvertiserCountry]?

    public init(reportName: String, startDate: String, endDate: String, granularity: Granularity, level: Level, targetingTypes: [MMMReportingTargetingType], columns: [MMMReportingColumn], countries: [TargetingAdvertiserCountry]? = nil) {
        self.reportName = reportName
        self.startDate = startDate
        self.endDate = endDate
        self.granularity = granularity
        self.level = level
        self.targetingTypes = targetingTypes
        self.columns = columns
        self.countries = countries
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case reportName = "report_name"
        case startDate = "start_date"
        case endDate = "end_date"
        case granularity
        case level
        case targetingTypes = "targeting_types"
        case columns
        case countries
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(reportName, forKey: .reportName)
        try container.encode(startDate, forKey: .startDate)
        try container.encode(endDate, forKey: .endDate)
        try container.encode(granularity, forKey: .granularity)
        try container.encode(level, forKey: .level)
        try container.encode(targetingTypes, forKey: .targetingTypes)
        try container.encode(columns, forKey: .columns)
        try container.encodeIfPresent(countries, forKey: .countries)
    }
}

