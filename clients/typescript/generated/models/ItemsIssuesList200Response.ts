/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * OpenAPI spec version: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { CatalogsItemValidationIssues } from '../models/CatalogsItemValidationIssues';
import { HttpFile } from '../http/http';

export class ItemsIssuesList200Response {
    'items': Array<CatalogsItemValidationIssues>;
    'bookmark'?: string | null;

    static readonly discriminator: string | undefined = undefined;

    static readonly mapping: {[index: string]: string} | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "items",
            "baseName": "items",
            "type": "Array<CatalogsItemValidationIssues>",
            "format": ""
        },
        {
            "name": "bookmark",
            "baseName": "bookmark",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return ItemsIssuesList200Response.attributeTypeMap;
    }

    public constructor() {
    }
}
