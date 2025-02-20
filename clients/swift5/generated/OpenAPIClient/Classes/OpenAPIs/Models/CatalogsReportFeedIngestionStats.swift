//
// CatalogsReportFeedIngestionStats.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct CatalogsReportFeedIngestionStats: Codable, JSONEncodable, Hashable {

    public enum ReportType: String, Codable, CaseIterable {
        case feedIngestionIssues = "FEED_INGESTION_ISSUES"
    }
    public enum Severity: String, Codable, CaseIterable {
        case warn = "WARN"
        case error = "ERROR"
    }
    static let catalogIdRule = StringRule(minLength: nil, maxLength: nil, pattern: "/^\\d+$/")
    public var reportType: ReportType?
    /** ID of the catalog entity. */
    public var catalogId: String?
    /** The event code that a diagnostics aggregated number references */
    public var code: Int?
    /** A human-friendly label for the event code (e.g, 'AVAILABILITY_INVALID') */
    public var codeLabel: String?
    /** Title message describing the diagnostic issue */
    public var message: String?
    /** Number of occurrences of the issue */
    public var occurrences: Int?
    /** An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue */
    public var severity: Severity?

    public init(reportType: ReportType? = nil, catalogId: String? = nil, code: Int? = nil, codeLabel: String? = nil, message: String? = nil, occurrences: Int? = nil, severity: Severity? = nil) {
        self.reportType = reportType
        self.catalogId = catalogId
        self.code = code
        self.codeLabel = codeLabel
        self.message = message
        self.occurrences = occurrences
        self.severity = severity
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case reportType = "report_type"
        case catalogId = "catalog_id"
        case code
        case codeLabel = "code_label"
        case message
        case occurrences
        case severity
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(reportType, forKey: .reportType)
        try container.encodeIfPresent(catalogId, forKey: .catalogId)
        try container.encodeIfPresent(code, forKey: .code)
        try container.encodeIfPresent(codeLabel, forKey: .codeLabel)
        try container.encodeIfPresent(message, forKey: .message)
        try container.encodeIfPresent(occurrences, forKey: .occurrences)
        try container.encodeIfPresent(severity, forKey: .severity)
    }
}

