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

import * as models from './models';

/**
 * A currency filter. This filter cannot be negated
 */
export interface CatalogsProductGroupCurrencyCriteria {
    values: models.NonNullableCatalogsCurrency;

    negated?: boolean;

}
export namespace CatalogsProductGroupCurrencyCriteria {
}
