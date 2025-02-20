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
import { CatalogsCreativeAssetsAttributes } from './catalogsCreativeAssetsAttributes';
import { CatalogsType } from './catalogsType';
import { ItemResponseAnyOf } from './itemResponseAnyOf';
import { ItemResponseAnyOf1 } from './itemResponseAnyOf1';
import { ItemValidationEvent } from './itemValidationEvent';
import { Pin } from './pin';


/**
 * Object describing an item record
 */
export interface ItemResponse { 
    catalog_type: CatalogsType;
    /**
     * The catalog item id in the merchant namespace
     */
    item_id?: string;
    /**
     * Array with the errors for the item id requested
     */
    errors?: Array<ItemValidationEvent>;
    /**
     * The catalog hotel id in the merchant namespace
     */
    hotel_id?: string;
    /**
     * The catalog creative assets id in the merchant namespace
     */
    creative_assets_id?: string;
}
export namespace ItemResponse {
}
