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

import { AdGroupAudienceSizingRequestKeywordsInner } from '../models/AdGroupAudienceSizingRequestKeywordsInner';
import { PlacementGroupType } from '../models/PlacementGroupType';
import { TargetingSpec } from '../models/TargetingSpec';
import { HttpFile } from '../http/http';

export class AdGroupAudienceSizingRequest {
    /**
    * Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
    */
    'autoTargetingEnabled'?: boolean;
    /**
    * <a href=\"/docs/redoc/#section/Placement-group\">Placement group</a>.
    */
    'placementGroup'?: PlacementGroupType;
    /**
    * Pin creative types filter. </p><strong>Note:</strong> SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
    */
    'creativeTypes'?: Array<AdGroupAudienceSizingRequestCreativeTypesEnum> | null;
    'targetingSpec'?: TargetingSpec;
    /**
    * Targeted product group IDs. </p><strong>Note:</strong> This can only be combined with shopping/catalog sales campaigns. For more information, <a href=\"https://help.pinterest.com/en/business/article/shopping-ads#section-14571\" target=\"_blank\">click here</a>. SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored.
    */
    'productGroupIds'?: Array<string> | null;
    /**
    * Array of keyword objects. If the keywords field is missing, all keywords will be targeted.
    */
    'keywords'?: Array<AdGroupAudienceSizingRequestKeywordsInner> | null;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "autoTargetingEnabled",
            "baseName": "auto_targeting_enabled",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "placementGroup",
            "baseName": "placement_group",
            "type": "PlacementGroupType",
            "format": ""
        },
        {
            "name": "creativeTypes",
            "baseName": "creative_types",
            "type": "Array<AdGroupAudienceSizingRequestCreativeTypesEnum>",
            "format": ""
        },
        {
            "name": "targetingSpec",
            "baseName": "targeting_spec",
            "type": "TargetingSpec",
            "format": ""
        },
        {
            "name": "productGroupIds",
            "baseName": "product_group_ids",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "keywords",
            "baseName": "keywords",
            "type": "Array<AdGroupAudienceSizingRequestKeywordsInner>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return AdGroupAudienceSizingRequest.attributeTypeMap;
    }

    public constructor() {
    }
}


export enum AdGroupAudienceSizingRequestCreativeTypesEnum {
    Regular = 'REGULAR',
    Video = 'VIDEO',
    Shopping = 'SHOPPING',
    Carousel = 'CAROUSEL',
    MaxVideo = 'MAX_VIDEO',
    ShopThePin = 'SHOP_THE_PIN',
    Collection = 'COLLECTION',
    Idea = 'IDEA'
}
