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

/**
 * An invite object if the invite/request was successfully created. Will only be provided if the an invite/request is successfully created.
 */
export interface CreateInvitesResultsResponseArrayItemsInnerInvite {
    /**
     * Unique identifier of the invite/request.
     */
    id?: string;

    /**
     * Metadata for the member/partner that was sent the invite/request.
     */
    user?: models.BusinessAccessUserSummary;

}
