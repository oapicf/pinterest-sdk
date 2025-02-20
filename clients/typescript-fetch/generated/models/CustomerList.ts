/* tslint:disable */
/* eslint-disable */
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

import { mapValues } from '../runtime';
/**
 * 
 * @export
 * @interface CustomerList
 */
export interface CustomerList {
    /**
     * Associated ad account ID.
     * @type {string}
     * @memberof CustomerList
     */
    adAccountId?: string;
    /**
     * Creation time. Unix timestamp in seconds.
     * @type {number}
     * @memberof CustomerList
     */
    createdTime?: number;
    /**
     * Customer list ID.
     * @type {string}
     * @memberof CustomerList
     */
    id?: string;
    /**
     * Customer list name.
     * @type {string}
     * @memberof CustomerList
     */
    name?: string;
    /**
     * Total number of list updates.  List creation counts as one batch. Each <a href="/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT">Append</a> or <a href="/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT">Remove API</a> call counts as another. List creation via the Ads Manager UI could result in more than one batch since the UI breaks up large lists.
     * @type {number}
     * @memberof CustomerList
     */
    numBatches?: number;
    /**
     * Number of removed user records. In a <a href="/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT">Remove API</a> call, this counter increases even if the user is not found in the list.
     * @type {number}
     * @memberof CustomerList
     */
    numRemovedUserRecords?: number;
    /**
     * Number of uploaded user records. In an <a href="/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT">Append API</a> call, this counter increases even if the uploaded user is already in the list.
     * @type {number}
     * @memberof CustomerList
     */
    numUploadedUserRecords?: number;
    /**
     * Customer list status. TOO_SMALL - the list has less than 100 Pinterest users.
     * @type {string}
     * @memberof CustomerList
     */
    status?: CustomerListStatusEnum;
    /**
     * Always "customerlist".
     * @type {string}
     * @memberof CustomerList
     */
    type?: string;
    /**
     * Last update time. Unix timestamp in seconds.
     * @type {number}
     * @memberof CustomerList
     */
    updatedTime?: number;
    /**
     * Customer list errors
     * @type {object}
     * @memberof CustomerList
     */
    exceptions?: object;
}


/**
 * @export
 */
export const CustomerListStatusEnum = {
    Processing: 'PROCESSING',
    Ready: 'READY',
    TooSmall: 'TOO_SMALL',
    Uploading: 'UPLOADING'
} as const;
export type CustomerListStatusEnum = typeof CustomerListStatusEnum[keyof typeof CustomerListStatusEnum];


/**
 * Check if a given object implements the CustomerList interface.
 */
export function instanceOfCustomerList(value: object): value is CustomerList {
    return true;
}

export function CustomerListFromJSON(json: any): CustomerList {
    return CustomerListFromJSONTyped(json, false);
}

export function CustomerListFromJSONTyped(json: any, ignoreDiscriminator: boolean): CustomerList {
    if (json == null) {
        return json;
    }
    return {
        
        'adAccountId': json['ad_account_id'] == null ? undefined : json['ad_account_id'],
        'createdTime': json['created_time'] == null ? undefined : json['created_time'],
        'id': json['id'] == null ? undefined : json['id'],
        'name': json['name'] == null ? undefined : json['name'],
        'numBatches': json['num_batches'] == null ? undefined : json['num_batches'],
        'numRemovedUserRecords': json['num_removed_user_records'] == null ? undefined : json['num_removed_user_records'],
        'numUploadedUserRecords': json['num_uploaded_user_records'] == null ? undefined : json['num_uploaded_user_records'],
        'status': json['status'] == null ? undefined : json['status'],
        'type': json['type'] == null ? undefined : json['type'],
        'updatedTime': json['updated_time'] == null ? undefined : json['updated_time'],
        'exceptions': json['exceptions'] == null ? undefined : json['exceptions'],
    };
}

  export function CustomerListToJSON(json: any): CustomerList {
      return CustomerListToJSONTyped(json, false);
  }

  export function CustomerListToJSONTyped(value?: CustomerList | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'ad_account_id': value['adAccountId'],
        'created_time': value['createdTime'],
        'id': value['id'],
        'name': value['name'],
        'num_batches': value['numBatches'],
        'num_removed_user_records': value['numRemovedUserRecords'],
        'num_uploaded_user_records': value['numUploadedUserRecords'],
        'status': value['status'],
        'type': value['type'],
        'updated_time': value['updatedTime'],
        'exceptions': value['exceptions'],
    };
}

