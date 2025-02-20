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
    CatalogsCreativeAssetsAttributes,
    CatalogsCreativeAssetsAttributesFromJSON,
    CatalogsCreativeAssetsAttributesToJSON,
    CatalogsType,
    CatalogsTypeFromJSON,
    CatalogsTypeToJSON,
    Pin,
    PinFromJSON,
    PinToJSON,
} from './';

/**
 * Object describing a hotel record
 * @export
 * @interface CatalogsCreativeAssetsItemResponse
 */
export interface CatalogsCreativeAssetsItemResponse  {
    /**
     * 
     * @type {CatalogsType}
     * @memberof CatalogsCreativeAssetsItemResponse
     */
    catalogType: CatalogsType;
    /**
     * The catalog creative assets id in the merchant namespace
     * @type {string}
     * @memberof CatalogsCreativeAssetsItemResponse
     */
    creativeAssetsId?: string;
    /**
     * The pins mapped to the item
     * @type {Array<Pin>}
     * @memberof CatalogsCreativeAssetsItemResponse
     */
    pins?: Array<Pin>;
    /**
     * 
     * @type {CatalogsCreativeAssetsAttributes}
     * @memberof CatalogsCreativeAssetsItemResponse
     */
    attributes?: CatalogsCreativeAssetsAttributes;
}

export function CatalogsCreativeAssetsItemResponseFromJSON(json: any): CatalogsCreativeAssetsItemResponse {
    return {
        'catalogType': CatalogsTypeFromJSON(json['catalog_type']),
        'creativeAssetsId': !exists(json, 'creative_assets_id') ? undefined : json['creative_assets_id'],
        'pins': !exists(json, 'pins') ? undefined : (json['pins'] as Array<any>).map(PinFromJSON),
        'attributes': !exists(json, 'attributes') ? undefined : CatalogsCreativeAssetsAttributesFromJSON(json['attributes']),
    };
}

export function CatalogsCreativeAssetsItemResponseToJSON(value?: CatalogsCreativeAssetsItemResponse): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'catalog_type': CatalogsTypeToJSON(value.catalogType),
        'creative_assets_id': value.creativeAssetsId,
        'pins': value.pins === undefined ? undefined : (value.pins as Array<any>).map(PinToJSON),
        'attributes': CatalogsCreativeAssetsAttributesToJSON(value.attributes),
    };
}



