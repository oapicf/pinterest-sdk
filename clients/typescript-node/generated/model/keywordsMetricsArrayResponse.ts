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

import { RequestFile } from './models';
import { KeywordMetricsResponse } from './keywordMetricsResponse';

export class KeywordsMetricsArrayResponse {
    'data'?: Array<KeywordMetricsResponse>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "data",
            "baseName": "data",
            "type": "Array<KeywordMetricsResponse>"
        }    ];

    static getAttributeTypeMap() {
        return KeywordsMetricsArrayResponse.attributeTypeMap;
    }
}
