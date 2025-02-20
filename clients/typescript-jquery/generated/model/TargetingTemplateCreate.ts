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

export interface TargetingTemplateCreate {
    /**
     * Name of targeting template.
     */
    name: string;

    /**
     * Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
     */
    auto_targeting_enabled?: boolean;

    targeting_attributes: models.TargetingSpec;

    placement_group?: models.PlacementGroupType;

    keywords?: Array<models.TargetingTemplateKeyword>;

    tracking_urls?: models.TrackingUrls;

}
export namespace TargetingTemplateCreate {
}
