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
import { CatalogsHotelItemsFilter } from './catalogsHotelItemsFilter';
import { CatalogsRetailItemsFilter } from './catalogsRetailItemsFilter';
import { CatalogsType } from './catalogsType';

export class CatalogsItemsFilters {
    'catalogType': CatalogsType;
    'itemIds': Array<string>;
    /**
    * Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog
    */
    'catalogId'?: string;
    'hotelIds': Array<string>;

    static discriminator: string | undefined = "catalogType";

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "catalogType",
            "baseName": "catalog_type",
            "type": "CatalogsType"
        },
        {
            "name": "itemIds",
            "baseName": "item_ids",
            "type": "Array<string>"
        },
        {
            "name": "catalogId",
            "baseName": "catalog_id",
            "type": "string"
        },
        {
            "name": "hotelIds",
            "baseName": "hotel_ids",
            "type": "Array<string>"
        }    ];

    static getAttributeTypeMap() {
        return CatalogsItemsFilters.attributeTypeMap;
    }
}

export namespace CatalogsItemsFilters {
}