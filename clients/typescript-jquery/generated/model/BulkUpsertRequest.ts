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

import * as models from './models';

/**
 * Two set of objects to be managed asyncronusly by bulk. One for creations, one for modifications.
 */
export interface BulkUpsertRequest {
    create?: models.BulkUpsertRequestCreate;

    update?: models.BulkUpsertRequestUpdate;

}