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

import type {
    CatalogsCreateRetailItem,
    CatalogsDeleteRetailItem,
    CatalogsUpdateRetailItem,
    CatalogsUpsertRetailItem,
    ItemAttributesRequest,
    UpdateMaskFieldType,
} from './';

/**
 * @export
 * @interface CatalogsRetailBatchRequestItemsInner
 */
export interface CatalogsRetailBatchRequestItemsInner {
    /**
     * The catalog item id in the merchant namespace
     * @type {string}
     * @memberof CatalogsRetailBatchRequestItemsInner
     */
    item_id: string;
    /**
     * @type {string}
     * @memberof CatalogsRetailBatchRequestItemsInner
     */
    operation: CatalogsRetailBatchRequestItemsInnerOperationEnum;
    /**
     * @type {ItemAttributesRequest}
     * @memberof CatalogsRetailBatchRequestItemsInner
     */
    attributes: ItemAttributesRequest;
    /**
     * The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.
     * @type {Array<UpdateMaskFieldType>}
     * @memberof CatalogsRetailBatchRequestItemsInner
     */
    update_mask?: Array<UpdateMaskFieldType> | null;
}

/**
 * @export
 * @enum {string}
 */
export enum CatalogsRetailBatchRequestItemsInnerOperationEnum {
    Delete = 'DELETE'
}

