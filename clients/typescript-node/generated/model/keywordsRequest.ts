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
import { KeywordsCommon } from './keywordsCommon';

export class KeywordsRequest {
    /**
    * Keyword JSON array. Each array element has 3 fields
    */
    'keywords': Array<KeywordsCommon>;
    /**
    * Keyword parent entity ID (advertiser, campaign, ad group).
    */
    'parentId': string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "keywords",
            "baseName": "keywords",
            "type": "Array<KeywordsCommon>"
        },
        {
            "name": "parentId",
            "baseName": "parent_id",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return KeywordsRequest.attributeTypeMap;
    }
}
