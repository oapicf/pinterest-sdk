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

import { RequestFile } from './models';

export class LeadsExportCreateResponse {
    /**
    * ID for the leads export job
    */
    'leadsExportId'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "leadsExportId",
            "baseName": "leads_export_id",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return LeadsExportCreateResponse.attributeTypeMap;
    }
}

