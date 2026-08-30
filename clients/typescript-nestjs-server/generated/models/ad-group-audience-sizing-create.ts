import { AdGroupAudienceSizingCreativeTypes } from './ad-group-audience-sizing-creative-types';
import { AdGroupAudienceSizingKeyword } from './ad-group-audience-sizing-keyword';
import { AdgroupPlacementGroupType } from './adgroup-placement-group-type';
import { TargetingSpecOptimal } from './targeting-spec-optimal';


/**
 * Resource create operation model.
 */
export interface AdGroupAudienceSizingCreate { 
  /**
   * Enable auto-targeting for ad group. Default value is True. Also known as [Pinterest Performance+ targeting](https://help.pinterest.com/en/business/article/performance-plus-targeting).
   */
  auto_targeting_enabled?: boolean;
  /**
   * Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
   */
  creative_types?: Array<AdGroupAudienceSizingCreativeTypes> | null;
  /**
   * Array of keyword objects. If the keywords field is missing, all keywords will be targeted.
   */
  keywords?: Array<AdGroupAudienceSizingKeyword> | null;
  /**
   * [Placement group](/docs/redoc/#section/Placement-group).
   */
  placement_group?: AdgroupPlacementGroupType;
  /**
   * Targeted product group IDs. **Note:** This can only be combined with shopping/catalog sales campaigns. For more information, [click here](https://help.pinterest.com/en/business/article/shopping-ads#section-14571). SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored.
   */
  product_group_ids?: Array<string> | null;
  targeting_spec?: TargetingSpecOptimal;
}
export namespace AdGroupAudienceSizingCreate {
}


