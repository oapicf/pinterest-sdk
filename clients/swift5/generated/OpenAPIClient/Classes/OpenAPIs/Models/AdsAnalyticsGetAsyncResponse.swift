//
// AdsAnalyticsGetAsyncResponse.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct AdsAnalyticsGetAsyncResponse: Codable, JSONEncodable, Hashable {

    public var reportStatus: BulkReportingJobStatus?
    public var url: String?
    public var size: Double?

    public init(reportStatus: BulkReportingJobStatus? = nil, url: String? = nil, size: Double? = nil) {
        self.reportStatus = reportStatus
        self.url = url
        self.size = size
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case reportStatus = "report_status"
        case url
        case size
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(reportStatus, forKey: .reportStatus)
        try container.encodeIfPresent(url, forKey: .url)
        try container.encodeIfPresent(size, forKey: .size)
    }
}
