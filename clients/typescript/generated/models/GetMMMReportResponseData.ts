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

import { HttpFile } from '../http/http';

export class GetMMMReportResponseData {
    'reportStatus'?: GetMMMReportResponseDataReportStatusEnum;
    'url'?: string | null;
    'size'?: number | null;

    static readonly discriminator: string | undefined = undefined;

    static readonly mapping: {[index: string]: string} | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "reportStatus",
            "baseName": "report_status",
            "type": "GetMMMReportResponseDataReportStatusEnum",
            "format": ""
        },
        {
            "name": "url",
            "baseName": "url",
            "type": "string",
            "format": ""
        },
        {
            "name": "size",
            "baseName": "size",
            "type": "number",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return GetMMMReportResponseData.attributeTypeMap;
    }

    public constructor() {
    }
}

export enum GetMMMReportResponseDataReportStatusEnum {
    DoesNotExist = 'DOES_NOT_EXIST',
    Finished = 'FINISHED',
    InProgress = 'IN_PROGRESS',
    Expired = 'EXPIRED',
    Failed = 'FAILED',
    Cancelled = 'CANCELLED'
}

