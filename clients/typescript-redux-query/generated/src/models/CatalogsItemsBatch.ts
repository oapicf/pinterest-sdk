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

import {
    CatalogsCreativeAssetsItemsBatch,
    CatalogsCreativeAssetsItemsBatchFromJSON,
    CatalogsCreativeAssetsItemsBatchToJSON,
    CatalogsHotelItemsBatch,
    CatalogsHotelItemsBatchFromJSON,
    CatalogsHotelItemsBatchToJSON,
    CatalogsRetailItemsBatch,
    CatalogsRetailItemsBatchFromJSON,
    CatalogsRetailItemsBatchToJSON,
} from './';

/**
 * @type CatalogsItemsBatch
 * Object describing the catalogs items batch
 * @export
 */
export type CatalogsItemsBatch = CatalogsCreativeAssetsItemsBatch | CatalogsHotelItemsBatch | CatalogsRetailItemsBatch;


export function CatalogsItemsBatchFromJSON(json: any): CatalogsItemsBatch {
  switch (json.catalogType) {
  case 'CREATIVE_ASSETS': return CatalogsCreativeAssetsItemsBatchFromJSON(json);
  case 'HOTEL': return CatalogsHotelItemsBatchFromJSON(json);
  case 'RETAIL': return CatalogsRetailItemsBatchFromJSON(json);
  default: throw new Error("Unexpected catalogType value.");
  }
}

export function CatalogsItemsBatchToJSON(value?: CatalogsItemsBatch): any {
    if (value === undefined) {
        return undefined;
    }

    switch (value.catalogType) {
    case 'CREATIVE_ASSETS': return CatalogsCreativeAssetsItemsBatchToJSON(<CatalogsCreativeAssetsItemsBatch>value);
    case 'HOTEL': return CatalogsHotelItemsBatchToJSON(<CatalogsHotelItemsBatch>value);
    case 'RETAIL': return CatalogsRetailItemsBatchToJSON(<CatalogsRetailItemsBatch>value);
    default: throw new Error("Unexpected catalogType value.");
    }
}

