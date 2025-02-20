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
import { CatalogsType } from './catalogsType';

/**
* Catalog entity
*/
export class Catalog {
    'createdAt': Date;
    /**
    * ID of the catalog entity.
    */
    'id': string;
    'updatedAt': Date;
    /**
    * A human-friendly name associated to a catalog entity.
    */
    'name': string | null;
    'catalogType': CatalogsType;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "createdAt",
            "baseName": "created_at",
            "type": "Date"
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "string"
        },
        {
            "name": "updatedAt",
            "baseName": "updated_at",
            "type": "Date"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "catalogType",
            "baseName": "catalog_type",
            "type": "CatalogsType"
        }    ];

    static getAttributeTypeMap() {
        return Catalog.attributeTypeMap;
    }
}

export namespace Catalog {
}
