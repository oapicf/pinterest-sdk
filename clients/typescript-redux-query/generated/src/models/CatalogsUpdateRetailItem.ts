// tslint:disable
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

import { exists, mapValues } from '../runtime';
import {
    UpdatableItemAttributes,
    UpdatableItemAttributesFromJSON,
    UpdatableItemAttributesToJSON,
    UpdateMaskFieldType,
    UpdateMaskFieldTypeFromJSON,
    UpdateMaskFieldTypeToJSON,
} from './';

/**
 * An item to be updated
 * @export
 * @interface CatalogsUpdateRetailItem
 */
export interface CatalogsUpdateRetailItem  {
    /**
     * The catalog item id in the merchant namespace
     * @type {string}
     * @memberof CatalogsUpdateRetailItem
     */
    itemId: string;
    /**
     * 
     * @type {string}
     * @memberof CatalogsUpdateRetailItem
     */
    operation: CatalogsUpdateRetailItemOperationEnum;
    /**
     * 
     * @type {UpdatableItemAttributes}
     * @memberof CatalogsUpdateRetailItem
     */
    attributes: UpdatableItemAttributes;
    /**
     * The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.
     * @type {Array<UpdateMaskFieldType>}
     * @memberof CatalogsUpdateRetailItem
     */
    updateMask?: Array<UpdateMaskFieldType>;
}

export function CatalogsUpdateRetailItemFromJSON(json: any): CatalogsUpdateRetailItem {
    return {
        'itemId': json['item_id'],
        'operation': json['operation'],
        'attributes': UpdatableItemAttributesFromJSON(json['attributes']),
        'updateMask': !exists(json, 'update_mask') ? undefined : (json['update_mask'] as Array<any>).map(UpdateMaskFieldTypeFromJSON),
    };
}

export function CatalogsUpdateRetailItemToJSON(value?: CatalogsUpdateRetailItem): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'item_id': value.itemId,
        'operation': value.operation,
        'attributes': UpdatableItemAttributesToJSON(value.attributes),
        'update_mask': value.updateMask === undefined ? undefined : (value.updateMask as Array<any>).map(UpdateMaskFieldTypeToJSON),
    };
}

/**
* @export
* @enum {string}
*/
export enum CatalogsUpdateRetailItemOperationEnum {
    Update = 'UPDATE'
}


