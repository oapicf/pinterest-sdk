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

import { HttpFile } from '../http/http';

/**
* The operation performed by the batch. The DELETE_DISCONTINUED operation only updates availablity to \"Out of Stock\".
*/
export enum BatchOperation {
    Update = 'UPDATE',
    Upsert = 'UPSERT',
    Create = 'CREATE',
    DeleteDiscontinued = 'DELETE_DISCONTINUED',
    Delete = 'DELETE'
}