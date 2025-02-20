/**
 * Pinterest REST API
 *
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
import { Keyword } from './keyword';
import { KeywordError } from './keywordError';


export interface KeywordsResponse { 
    errors?: Array<KeywordError>;
    keywords?: Array<Keyword>;
}

