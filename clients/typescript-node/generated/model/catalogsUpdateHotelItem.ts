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
import { CatalogsUpdatableHotelAttributes } from './catalogsUpdatableHotelAttributes';

/**
* Object describing an hotel item batch record
*/
export class CatalogsUpdateHotelItem {
    /**
    * The catalog hotel item id in the merchant namespace
    */
    'hotelId': string;
    'operation': CatalogsUpdateHotelItem.OperationEnum;
    'attributes': CatalogsUpdatableHotelAttributes;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "hotelId",
            "baseName": "hotel_id",
            "type": "string"
        },
        {
            "name": "operation",
            "baseName": "operation",
            "type": "CatalogsUpdateHotelItem.OperationEnum"
        },
        {
            "name": "attributes",
            "baseName": "attributes",
            "type": "CatalogsUpdatableHotelAttributes"
        }    ];

    static getAttributeTypeMap() {
        return CatalogsUpdateHotelItem.attributeTypeMap;
    }
}

export namespace CatalogsUpdateHotelItem {
    export enum OperationEnum {
        Update = <any> 'UPDATE'
    }
}
