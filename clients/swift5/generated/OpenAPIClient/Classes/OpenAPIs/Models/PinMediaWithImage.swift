//
// PinMediaWithImage.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** Pin with image. */
public struct PinMediaWithImage: Codable, JSONEncodable, Hashable {

    public var mediaType: String?
    public var images: PinMediaWithImageAllOfImages?

    public init(mediaType: String? = nil, images: PinMediaWithImageAllOfImages? = nil) {
        self.mediaType = mediaType
        self.images = images
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case mediaType = "media_type"
        case images
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(mediaType, forKey: .mediaType)
        try container.encodeIfPresent(images, forKey: .images)
    }
}

