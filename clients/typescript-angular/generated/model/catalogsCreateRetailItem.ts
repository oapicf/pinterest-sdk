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
import { ItemAttributes } from './itemAttributes';


/**
 * An item to be created
 */
export interface CatalogsCreateRetailItem { 
    /**
     * The catalog item id in the merchant namespace
     */
    item_id: string;
    operation: CatalogsCreateRetailItem.OperationEnum;
    attributes: ItemAttributes;
}
export namespace CatalogsCreateRetailItem {
    export type OperationEnum = 'CREATE' | 'UPDATE' | 'UPSERT' | 'DELETE';
    export const OperationEnum = {
        Create: 'CREATE' as OperationEnum,
        Update: 'UPDATE' as OperationEnum,
        Upsert: 'UPSERT' as OperationEnum,
        Delete: 'DELETE' as OperationEnum
    };
}

