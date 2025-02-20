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

import { BulkUpsertRequestCreate } from '../models/BulkUpsertRequestCreate';
import { BulkUpsertRequestUpdate } from '../models/BulkUpsertRequestUpdate';
import { HttpFile } from '../http/http';

/**
* Two set of objects to be managed asyncronusly by bulk. One for creations, one for modifications.
*/
export class BulkUpsertRequest {
    'create'?: BulkUpsertRequestCreate;
    'update'?: BulkUpsertRequestUpdate;

    static readonly discriminator: string | undefined = undefined;

    static readonly mapping: {[index: string]: string} | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "create",
            "baseName": "create",
            "type": "BulkUpsertRequestCreate",
            "format": ""
        },
        {
            "name": "update",
            "baseName": "update",
            "type": "BulkUpsertRequestUpdate",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return BulkUpsertRequest.attributeTypeMap;
    }

    public constructor() {
    }
}
