//
// MatchTypeResponse.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** Keyword match type */
public enum MatchTypeResponse: String, Codable, CaseIterable {
    case broad = "BROAD"
    case phrase = "PHRASE"
    case exact = "EXACT"
    case exactNegative = "EXACT_NEGATIVE"
    case phraseNegative = "PHRASE_NEGATIVE"
    case null = "null"
}