/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * OpenAPI spec version: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { CatalogsFeedIngestionErrors } from '../models/CatalogsFeedIngestionErrors';
import { CatalogsFeedIngestionInfo } from '../models/CatalogsFeedIngestionInfo';
import { CatalogsFeedIngestionWarnings } from '../models/CatalogsFeedIngestionWarnings';
import { HttpFile } from '../http/http';

export class CatalogsFeedIngestionDetails {
    'errors': CatalogsFeedIngestionErrors;
    'info': CatalogsFeedIngestionInfo;
    'warnings': CatalogsFeedIngestionWarnings;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "errors",
            "baseName": "errors",
            "type": "CatalogsFeedIngestionErrors",
            "format": ""
        },
        {
            "name": "info",
            "baseName": "info",
            "type": "CatalogsFeedIngestionInfo",
            "format": ""
        },
        {
            "name": "warnings",
            "baseName": "warnings",
            "type": "CatalogsFeedIngestionWarnings",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return CatalogsFeedIngestionDetails.attributeTypeMap;
    }

    public constructor() {
    }
}
