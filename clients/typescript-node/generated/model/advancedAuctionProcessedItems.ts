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
import { AdvancedAuctionProcessedItem } from './advancedAuctionProcessedItem';

/**
* Response object containing the results of an operation on an item bid option
*/
export class AdvancedAuctionProcessedItems {
    /**
    * Catalog id pertaining to all items
    */
    'catalogId'?: string;
    /**
    * Array of advanced auction processed items
    */
    'items'?: Array<AdvancedAuctionProcessedItem>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "catalogId",
            "baseName": "catalog_id",
            "type": "string"
        },
        {
            "name": "items",
            "baseName": "items",
            "type": "Array<AdvancedAuctionProcessedItem>"
        }    ];

    static getAttributeTypeMap() {
        return AdvancedAuctionProcessedItems.attributeTypeMap;
    }
}

