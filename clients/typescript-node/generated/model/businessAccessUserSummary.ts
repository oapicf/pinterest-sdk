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
* Metadata of the member/partner that has access to the asset.
*/
export class BusinessAccessUserSummary {
    /**
    * Email of the business member/partner.
    */
    'email'?: string | null;
    /**
    * Unique identifier of the business member/partner.
    */
    'id'?: string | null;
    /**
    * Username of the business member/partner.
    */
    'username'?: string | null;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "email",
            "baseName": "email",
            "type": "string"
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "string"
        },
        {
            "name": "username",
            "baseName": "username",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return BusinessAccessUserSummary.attributeTypeMap;
    }
}

