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

export interface TargetingTemplateGetResponseData {
    /**
     * targeting template name
     */
    name?: string;

    /**
     * Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
     */
    auto_targeting_enabled?: boolean;

    targeting_attributes?: models.TargetingSpec;

    placement_group?: models.PlacementGroupType;

    keywords?: Array<models.TargetingTemplateKeyword>;

    tracking_urls?: models.TrackingUrls;

    /**
     * Targeting template ID.
     */
    id?: string;

    /**
     * Targeting template created time. Unix timestamp in seconds.
     */
    created_time?: number;

    /**
     * Targeting template updated time.Unix timestamp in seconds.
     */
    updated_time?: number;

    /**
     * The ID of the advertiser that this targeting template belongs to.
     */
    ad_account_id?: string;

    /**
     * Indicate targeting template is active or Deleted
     */
    status?: TargetingTemplateGetResponseData.StatusEnum;

    sizing?: models.TargetingTemplateAudienceSizing;

    /**
     * Inform if the targeting template is valid (ex. would be false if has revoked audience)
     */
    valid?: boolean;

}
export namespace TargetingTemplateGetResponseData {
    export enum StatusEnum {
        Active = <any> 'ACTIVE',
        Deleted = <any> 'DELETED'
    }
}
