// tslint:disable
/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import type {
    UserListType,
} from './';

/**
 * @export
 * @interface CustomerListRequest
 */
export interface CustomerListRequest {
    /**
     * Customer list name.
     * @type {string}
     * @memberof CustomerListRequest
     */
    name: string;
    /**
     * Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.
     * @type {string}
     * @memberof CustomerListRequest
     */
    records: string;
    /**
     * @type {UserListType}
     * @memberof CustomerListRequest
     */
    list_type?: UserListType;
    /**
     * Customer list errors.
     * @type {object}
     * @memberof CustomerListRequest
     */
    exceptions?: object;
}

