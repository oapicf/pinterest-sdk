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
* The result, and link out, based on the user’s choice.
*/
export class QuizPinResult {
    'organicPinId'?: string;
    'androidDeepLink'?: string;
    'iosDeepLink'?: string;
    'destinationUrl'?: string;
    'resultId'?: number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "organicPinId",
            "baseName": "organic_pin_id",
            "type": "string"
        },
        {
            "name": "androidDeepLink",
            "baseName": "android_deep_link",
            "type": "string"
        },
        {
            "name": "iosDeepLink",
            "baseName": "ios_deep_link",
            "type": "string"
        },
        {
            "name": "destinationUrl",
            "baseName": "destination_url",
            "type": "string"
        },
        {
            "name": "resultId",
            "baseName": "result_id",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return QuizPinResult.attributeTypeMap;
    }
}

