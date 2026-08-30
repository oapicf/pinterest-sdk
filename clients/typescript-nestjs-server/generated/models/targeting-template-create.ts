import { TargetingTemplateKeyword } from './targeting-template-keyword';
import { TrackingUrls } from './tracking-urls';
import { PlacementGroupType } from './placement-group-type';
import { TargetingSpecOptimal } from './targeting-spec-optimal';


/**
 * Resource create operation model.
 */
export interface TargetingTemplateCreate { 
  /**
   * Enable auto-targeting for ad group. Also known as [\"expanded targeting\"](https://help.pinterest.com/en/business/article/expanded-targeting).
   */
  auto_targeting_enabled?: boolean;
  keywords?: Array<TargetingTemplateKeyword>;
  /**
   * targeting template name
   */
  name: string;
  placement_group?: PlacementGroupType;
  /**
   * targeting profile attributes
   */
  targeting_attributes: TargetingSpecOptimal;
  tracking_urls?: TrackingUrls | null;
}
export namespace TargetingTemplateCreate {
}


