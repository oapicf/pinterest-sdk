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
import { CatalogsType } from './catalogsType';
import { ItemValidationEvent } from './itemValidationEvent';


/**
 * Object describing a hotel item error
 */
export interface CatalogsHotelItemErrorResponse { 
    catalog_type: CatalogsType;
    /**
     * The catalog hotel id in the merchant namespace
     */
    hotel_id?: string;
    /**
     * Array with the errors for the item id requested
     */
    errors?: Array<ItemValidationEvent>;
}
export namespace CatalogsHotelItemErrorResponse {
}
