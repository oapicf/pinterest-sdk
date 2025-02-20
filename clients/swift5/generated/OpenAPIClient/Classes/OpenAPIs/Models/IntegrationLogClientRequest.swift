//
// IntegrationLogClientRequest.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** HTTP request details included in the log sent by the client. */
public struct IntegrationLogClientRequest: Codable, JSONEncodable, Hashable {

    public enum Method: String, Codable, CaseIterable {
        case _get = "GET"
        case head = "HEAD"
        case post = "POST"
        case put = "PUT"
        case delete = "DELETE"
        case connect = "CONNECT"
        case options = "OPTIONS"
        case trace = "TRACE"
        case patch = "PATCH"
    }
    public var method: Method
    /** HTTP request host from host header. */
    public var host: String
    /** HTTP request path. */
    public var path: String
    /** HTTP request headers as key-value pairs. */
    public var requestHeaders: [String: String]?
    /** HTTP response headers as key-value pairs. */
    public var responseHeaders: [String: String]?
    public var responseStatusCode: Int?

    public init(method: Method, host: String, path: String, requestHeaders: [String: String]? = nil, responseHeaders: [String: String]? = nil, responseStatusCode: Int? = nil) {
        self.method = method
        self.host = host
        self.path = path
        self.requestHeaders = requestHeaders
        self.responseHeaders = responseHeaders
        self.responseStatusCode = responseStatusCode
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case method
        case host
        case path
        case requestHeaders = "request_headers"
        case responseHeaders = "response_headers"
        case responseStatusCode = "response_status_code"
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(method, forKey: .method)
        try container.encode(host, forKey: .host)
        try container.encode(path, forKey: .path)
        try container.encodeIfPresent(requestHeaders, forKey: .requestHeaders)
        try container.encodeIfPresent(responseHeaders, forKey: .responseHeaders)
        try container.encodeIfPresent(responseStatusCode, forKey: .responseStatusCode)
    }
}

