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
    CatalogsFeedIngestionErrors,
    CatalogsFeedIngestionErrorsFromJSON,
    CatalogsFeedIngestionErrorsToJSON,
    CatalogsFeedIngestionInfo,
    CatalogsFeedIngestionInfoFromJSON,
    CatalogsFeedIngestionInfoToJSON,
    CatalogsFeedIngestionWarnings,
    CatalogsFeedIngestionWarningsFromJSON,
    CatalogsFeedIngestionWarningsToJSON,
} from './';

/**
 * 
 * @export
 * @interface CatalogsFeedIngestionDetails
 */
export interface CatalogsFeedIngestionDetails  {
    /**
     * 
     * @type {CatalogsFeedIngestionErrors}
     * @memberof CatalogsFeedIngestionDetails
     */
    errors: CatalogsFeedIngestionErrors;
    /**
     * 
     * @type {CatalogsFeedIngestionInfo}
     * @memberof CatalogsFeedIngestionDetails
     */
    info: CatalogsFeedIngestionInfo;
    /**
     * 
     * @type {CatalogsFeedIngestionWarnings}
     * @memberof CatalogsFeedIngestionDetails
     */
    warnings: CatalogsFeedIngestionWarnings;
}

export function CatalogsFeedIngestionDetailsFromJSON(json: any): CatalogsFeedIngestionDetails {
    return {
        'errors': CatalogsFeedIngestionErrorsFromJSON(json['errors']),
        'info': CatalogsFeedIngestionInfoFromJSON(json['info']),
        'warnings': CatalogsFeedIngestionWarningsFromJSON(json['warnings']),
    };
}

export function CatalogsFeedIngestionDetailsToJSON(value?: CatalogsFeedIngestionDetails): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'errors': CatalogsFeedIngestionErrorsToJSON(value.errors),
        'info': CatalogsFeedIngestionInfoToJSON(value.info),
        'warnings': CatalogsFeedIngestionWarningsToJSON(value.warnings),
    };
}


