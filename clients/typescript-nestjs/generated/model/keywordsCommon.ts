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
import { MatchTypeResponse } from './matchTypeResponse';


export interface KeywordsCommon { 
    /**
     * Keyword custom bid in microcurrency - null if inherited from parent ad group.
     */
    bid?: number | null;
    match_type: MatchTypeResponse | null;
    /**
     * Keyword value (120 chars max).
     */
    value: string;
}
export namespace KeywordsCommon {
}

