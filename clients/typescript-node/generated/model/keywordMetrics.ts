/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { RequestFile } from './models';

/**
* Keyword metrics JSON
*/
export class KeywordMetrics {
    /**
    * Average cost per click
    */
    'avgCpcInMicroCurrency'?: number;
    /**
    * Keyword\'s search frequency. This value is based on keyword frequency in pepsi client response
    */
    'keywordQueryVolume'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "avgCpcInMicroCurrency",
            "baseName": "avg_cpc_in_micro_currency",
            "type": "number"
        },
        {
            "name": "keywordQueryVolume",
            "baseName": "keyword_query_volume",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return KeywordMetrics.attributeTypeMap;
    }
}

