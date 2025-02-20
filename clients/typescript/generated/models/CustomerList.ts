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

export class CustomerList {
    /**
    * Associated ad account ID.
    */
    'adAccountId'?: string;
    /**
    * Creation time. Unix timestamp in seconds.
    */
    'createdTime'?: number;
    /**
    * Customer list ID.
    */
    'id'?: string;
    /**
    * Customer list name.
    */
    'name'?: string;
    /**
    * Total number of list updates.  List creation counts as one batch. Each <a href=\"/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT\">Append</a> or <a href=\"/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT\">Remove API</a> call counts as another. List creation via the Ads Manager UI could result in more than one batch since the UI breaks up large lists.
    */
    'numBatches'?: number;
    /**
    * Number of removed user records. In a <a href=\"/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT\">Remove API</a> call, this counter increases even if the user is not found in the list.
    */
    'numRemovedUserRecords'?: number;
    /**
    * Number of uploaded user records. In an <a href=\"/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT\">Append API</a> call, this counter increases even if the uploaded user is already in the list.
    */
    'numUploadedUserRecords'?: number;
    /**
    * Customer list status. TOO_SMALL - the list has less than 100 Pinterest users.
    */
    'status'?: CustomerListStatusEnum;
    /**
    * Always \"customerlist\".
    */
    'type'?: string;
    /**
    * Last update time. Unix timestamp in seconds.
    */
    'updatedTime'?: number;
    /**
    * Customer list errors
    */
    'exceptions'?: any;

    static readonly discriminator: string | undefined = undefined;

    static readonly mapping: {[index: string]: string} | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "adAccountId",
            "baseName": "ad_account_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "createdTime",
            "baseName": "created_time",
            "type": "number",
            "format": ""
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "string",
            "format": ""
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string",
            "format": ""
        },
        {
            "name": "numBatches",
            "baseName": "num_batches",
            "type": "number",
            "format": ""
        },
        {
            "name": "numRemovedUserRecords",
            "baseName": "num_removed_user_records",
            "type": "number",
            "format": ""
        },
        {
            "name": "numUploadedUserRecords",
            "baseName": "num_uploaded_user_records",
            "type": "number",
            "format": ""
        },
        {
            "name": "status",
            "baseName": "status",
            "type": "CustomerListStatusEnum",
            "format": ""
        },
        {
            "name": "type",
            "baseName": "type",
            "type": "string",
            "format": ""
        },
        {
            "name": "updatedTime",
            "baseName": "updated_time",
            "type": "number",
            "format": ""
        },
        {
            "name": "exceptions",
            "baseName": "exceptions",
            "type": "any",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return CustomerList.attributeTypeMap;
    }

    public constructor() {
    }
}

export enum CustomerListStatusEnum {
    Processing = 'PROCESSING',
    Ready = 'READY',
    TooSmall = 'TOO_SMALL',
    Uploading = 'UPLOADING'
}

