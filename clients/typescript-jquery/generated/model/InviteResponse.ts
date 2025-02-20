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

export interface InviteResponse {
    assets_summary?: models.InviteAssetsSummary;

    /**
     * The access level a user would be granted on the business if the invite/request is accepted. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER.
     */
    business_roles?: Array<string>;

    /**
     * Metadata for the business that created the invite/request.
     */
    created_by_business?: models.BusinessAccessUserSummary;

    /**
     * Metadata for the user that created the invite/request.
     */
    created_by_user?: models.BusinessAccessUserSummary;

    /**
     * The time the invite/request was created. Returned in milliseconds.
     */
    created_time?: number;

    /**
     * Unique identifier of the invite/request.
     */
    id?: string;

    invite_data?: models.BaseInviteDataResponseInviteData;

    /**
     * Indicates whether the invite/request was received.
     */
    is_received_invite?: boolean;

    /**
     * Metadata for the member/partner that was sent the invite/request.
     */
    user?: models.BusinessAccessUserSummary;

}
