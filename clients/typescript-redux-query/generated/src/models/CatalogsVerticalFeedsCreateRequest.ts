// tslint:disable
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

import {
    CatalogsHotelFeedsCreateRequest,
    CatalogsHotelFeedsCreateRequestFromJSON,
    CatalogsHotelFeedsCreateRequestToJSON,
    CatalogsRetailFeedsCreateRequest,
    CatalogsRetailFeedsCreateRequestFromJSON,
    CatalogsRetailFeedsCreateRequestToJSON,
} from './';

/**
 * @type CatalogsVerticalFeedsCreateRequest
 * Request object for creating a feed.
 * @export
 */
export type CatalogsVerticalFeedsCreateRequest = CatalogsHotelFeedsCreateRequest | CatalogsRetailFeedsCreateRequest;


export function CatalogsVerticalFeedsCreateRequestFromJSON(json: any): CatalogsVerticalFeedsCreateRequest {
  switch (json.catalogType) {
  case 'HOTEL': return CatalogsHotelFeedsCreateRequestFromJSON(json);
  case 'RETAIL': return CatalogsRetailFeedsCreateRequestFromJSON(json);
  default: throw new Error("Unexpected catalogType value.");
  }
}

export function CatalogsVerticalFeedsCreateRequestToJSON(value?: CatalogsVerticalFeedsCreateRequest): any {
    if (value === undefined) {
        return undefined;
    }

    switch (value.catalogType) {
    case 'HOTEL': return CatalogsHotelFeedsCreateRequestToJSON(<CatalogsHotelFeedsCreateRequest>value);
    case 'RETAIL': return CatalogsRetailFeedsCreateRequestToJSON(<CatalogsRetailFeedsCreateRequest>value);
    default: throw new Error("Unexpected catalogType value.");
    }
}
