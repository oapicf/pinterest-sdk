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
import { AdAccountOwner } from './adAccountOwner';
import { BusinessAccessRole } from './businessAccessRole';
import { Country } from './country';
import { Currency } from './currency';

export class AdAccount {
    'id'?: string;
    'name'?: string;
    'owner'?: AdAccountOwner;
    'country'?: Country;
    'currency'?: Currency;
    'permissions'?: Array<BusinessAccessRole>;
    /**
    * Creation time. Unix timestamp in seconds.
    */
    'createdTime'?: number | null;
    /**
    * Last update time. Unix timestamp in seconds.
    */
    'updatedTime'?: number | null;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "string"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "owner",
            "baseName": "owner",
            "type": "AdAccountOwner"
        },
        {
            "name": "country",
            "baseName": "country",
            "type": "Country"
        },
        {
            "name": "currency",
            "baseName": "currency",
            "type": "Currency"
        },
        {
            "name": "permissions",
            "baseName": "permissions",
            "type": "Array<BusinessAccessRole>"
        },
        {
            "name": "createdTime",
            "baseName": "created_time",
            "type": "number"
        },
        {
            "name": "updatedTime",
            "baseName": "updated_time",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return AdAccount.attributeTypeMap;
    }
}

export namespace AdAccount {
}