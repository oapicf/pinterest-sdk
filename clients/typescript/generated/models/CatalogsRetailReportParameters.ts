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

import { CatalogsHotelReportParametersReport } from '../models/CatalogsHotelReportParametersReport';
import { HttpFile } from '../http/http';

/**
* Parameters for retail report
*/
export class CatalogsRetailReportParameters {
    'catalogType': CatalogsRetailReportParametersCatalogTypeEnum;
    'report': CatalogsHotelReportParametersReport;

    static readonly discriminator: string | undefined = undefined;

    static readonly mapping: {[index: string]: string} | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "catalogType",
            "baseName": "catalog_type",
            "type": "CatalogsRetailReportParametersCatalogTypeEnum",
            "format": ""
        },
        {
            "name": "report",
            "baseName": "report",
            "type": "CatalogsHotelReportParametersReport",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return CatalogsRetailReportParameters.attributeTypeMap;
    }

    public constructor() {
    }
}

export enum CatalogsRetailReportParametersCatalogTypeEnum {
    Retail = 'RETAIL'
}

