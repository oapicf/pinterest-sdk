import { AdgroupTrackingFeatureType } from './adgroup-tracking-feature-type';


export interface AdgroupTrackingFeatures { 
  /**
   * Tracking features. To clear this field, set to null.
   */
  enabled?: Array<AdgroupTrackingFeatureType>;
}

