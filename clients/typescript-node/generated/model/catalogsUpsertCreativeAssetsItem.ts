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
import { CatalogsCreativeAssetsAttributes } from './catalogsCreativeAssetsAttributes';

/**
* A creative assets item to be upserted.
*/
export class CatalogsUpsertCreativeAssetsItem {
    /**
    * The catalog creative assets id in the merchant namespace
    */
    'creativeAssetsId': string;
    'operation': CatalogsUpsertCreativeAssetsItem.OperationEnum;
    'attributes': CatalogsCreativeAssetsAttributes;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "creativeAssetsId",
            "baseName": "creative_assets_id",
            "type": "string"
        },
        {
            "name": "operation",
            "baseName": "operation",
            "type": "CatalogsUpsertCreativeAssetsItem.OperationEnum"
        },
        {
            "name": "attributes",
            "baseName": "attributes",
            "type": "CatalogsCreativeAssetsAttributes"
        }    ];

    static getAttributeTypeMap() {
        return CatalogsUpsertCreativeAssetsItem.attributeTypeMap;
    }
}

export namespace CatalogsUpsertCreativeAssetsItem {
    export enum OperationEnum {
        Upsert = <any> 'UPSERT'
    }
}
