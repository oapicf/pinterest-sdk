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
import { Country } from './country';

export class AdAccountCreateRequest {
    'country'?: Country;
    /**
    * Ad Account name.
    */
    'name'?: string;
    /**
    * Advertiser\'s owning user ID.
    */
    'ownerUserId'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "country",
            "baseName": "country",
            "type": "Country"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "ownerUserId",
            "baseName": "owner_user_id",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return AdAccountCreateRequest.attributeTypeMap;
    }
}

export namespace AdAccountCreateRequest {
}
