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

export class GetMMMReportResponseData {
    'reportStatus'?: GetMMMReportResponseData.ReportStatusEnum;
    'url'?: string | null;
    'size'?: number | null;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "reportStatus",
            "baseName": "report_status",
            "type": "GetMMMReportResponseData.ReportStatusEnum"
        },
        {
            "name": "url",
            "baseName": "url",
            "type": "string"
        },
        {
            "name": "size",
            "baseName": "size",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return GetMMMReportResponseData.attributeTypeMap;
    }
}

export namespace GetMMMReportResponseData {
    export enum ReportStatusEnum {
        DoesNotExist = <any> 'DOES_NOT_EXIST',
        Finished = <any> 'FINISHED',
        InProgress = <any> 'IN_PROGRESS',
        Expired = <any> 'EXPIRED',
        Failed = <any> 'FAILED',
        Cancelled = <any> 'CANCELLED'
    }
}
