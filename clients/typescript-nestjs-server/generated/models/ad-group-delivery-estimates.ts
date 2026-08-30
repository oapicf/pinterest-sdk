import { OptimizationType } from './optimization-type';
import { AdGroupAudienceSizingCreativeTypes } from './ad-group-audience-sizing-creative-types';
import { AdGroupDeliveryEstimatesKeywordsItems } from './ad-group-delivery-estimates-keywords-items';
import { OptimizationGoalMetadata } from './optimization-goal-metadata';
import { PlacementGroupType } from './placement-group-type';
import { TargetingSpecOptimal } from './targeting-spec-optimal';


/**
 * Ad group configuration for delivery estimates.
 */
export interface AdGroupDeliveryEstimates { 
  auto_targeting_enabled?: boolean;
  /**
   * Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
   */
  creative_types?: Array<AdGroupAudienceSizingCreativeTypes>;
  /**
   * Array of keyword objects. If the keywords field is missing, all keywords will be targeted.
   */
  keywords?: Array<AdGroupDeliveryEstimatesKeywordsItems> | null;
  /**
   * Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups.
   */
  monthly_frequency_cap?: number;
  optimization_goal_metadata?: OptimizationGoalMetadata;
  /**
   * Optimization type for ad group delivery. Defaults to WEB_CONVERSION for WEB_CONVERSION/AWARENESS objectives, CLICKTHROUGH otherwise.
   */
  optimization_type?: OptimizationType;
  placement_group?: PlacementGroupType;
  /**
   * [Targeted product group IDs](/docs/redoc/#section/AdGroup-Audience-Sizing) **Note:** This can only be combined with shopping/catalog sales campaigns.
   */
  product_group_ids?: Array<string>;
  targeting_spec?: TargetingSpecOptimal;
}
export namespace AdGroupDeliveryEstimates {
}


