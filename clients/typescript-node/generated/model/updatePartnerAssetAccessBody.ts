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
import { UpdatePartnerAssetAccessBodyAccessesInner } from './updatePartnerAssetAccessBodyAccessesInner';

export class UpdatePartnerAssetAccessBody {
    'accesses': Array<UpdatePartnerAssetAccessBodyAccessesInner>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "accesses",
            "baseName": "accesses",
            "type": "Array<UpdatePartnerAssetAccessBodyAccessesInner>"
        }    ];

    static getAttributeTypeMap() {
        return UpdatePartnerAssetAccessBody.attributeTypeMap;
    }
}

