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

import * as models from './models';

export interface CreateAssetAccessRequestResponse {
    /**
     * A list of errors associated with the asset access requests. Will be returned if there is an error.
     */
    exceptions?: Array<models.CreateAssetAccessRequestErrorMessageInner>;

    invites?: { [key: string]: string; };

}
