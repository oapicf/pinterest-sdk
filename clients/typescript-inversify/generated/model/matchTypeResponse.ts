/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


/**
 * Keyword match type
 */
export type MatchTypeResponse = 'BROAD' | 'PHRASE' | 'EXACT' | 'EXACT_NEGATIVE' | 'PHRASE_NEGATIVE' | 'null';

export const MatchTypeResponse = {
    Broad: 'BROAD' as MatchTypeResponse,
    Phrase: 'PHRASE' as MatchTypeResponse,
    Exact: 'EXACT' as MatchTypeResponse,
    ExactNegative: 'EXACT_NEGATIVE' as MatchTypeResponse,
    PhraseNegative: 'PHRASE_NEGATIVE' as MatchTypeResponse,
    Null: 'null' as MatchTypeResponse
}