//
// PinMediaWithVideo.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** Pin with video. */
public struct PinMediaWithVideo: Codable, JSONEncodable, Hashable {

    public var mediaType: String?
    public var images: ImageMetadataImages?
    public var coverImageUrl: String?
    /** Video url (720p). </p><strong>Note:</strong> This field is limited and not available to all apps. */
    public var videoUrl: String?
    /** Duration (in milliseconds) */
    public var duration: Double?
    /** Height (in pixels) */
    public var height: Int?
    /** Width (in pixels) */
    public var width: Int?

    public init(mediaType: String? = nil, images: ImageMetadataImages? = nil, coverImageUrl: String? = nil, videoUrl: String? = nil, duration: Double? = nil, height: Int? = nil, width: Int? = nil) {
        self.mediaType = mediaType
        self.images = images
        self.coverImageUrl = coverImageUrl
        self.videoUrl = videoUrl
        self.duration = duration
        self.height = height
        self.width = width
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case mediaType = "media_type"
        case images
        case coverImageUrl = "cover_image_url"
        case videoUrl = "video_url"
        case duration
        case height
        case width
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(mediaType, forKey: .mediaType)
        try container.encodeIfPresent(images, forKey: .images)
        try container.encodeIfPresent(coverImageUrl, forKey: .coverImageUrl)
        try container.encodeIfPresent(videoUrl, forKey: .videoUrl)
        try container.encodeIfPresent(duration, forKey: .duration)
        try container.encodeIfPresent(height, forKey: .height)
        try container.encodeIfPresent(width, forKey: .width)
    }
}
