import { TargetingTemplateKeyword } from './targeting-template-keyword';
import { TargetingTemplateStatus } from './targeting-template-status';
import { TrackingUrls } from './tracking-urls';
import { PlacementGroupType } from './placement-group-type';
import { TargetingSpecOptimal } from './targeting-spec-optimal';
import { TargetingTemplateAudienceSizing } from './targeting-template-audience-sizing';


export interface TargetingTemplate { 
  /**
   * The ID of the advertiser that this targeting template belongs to.
   */
  readonly ad_account_id?: string;
  /**
   * Enable auto-targeting for ad group. Also known as [\"expanded targeting\"](https://help.pinterest.com/en/business/article/expanded-targeting).
   */
  auto_targeting_enabled?: boolean;
  /**
   * Targeting template created time. Unix timestamp in seconds.
   */
  readonly created_time?: number;
  /**
   * Targeting template ID.
   */
  readonly id?: string;
  keywords?: Array<TargetingTemplateKeyword>;
  /**
   * targeting template name
   */
  name: string;
  placement_group?: PlacementGroupType;
  readonly sizing?: TargetingTemplateAudienceSizing | null;
  /**
   * Indicate targeting template is active or Deleted
   */
  readonly status?: TargetingTemplateStatus;
  /**
   * targeting profile attributes
   */
  targeting_attributes: TargetingSpecOptimal;
  tracking_urls?: TrackingUrls | null;
  /**
   * Targeting template updated time.Unix timestamp in seconds.
   */
  readonly updated_time?: number;
  /**
   * Inform if the targeting template is valid (ex. would be false if has revoked audience)
   */
  readonly valid?: boolean | null;
}
export namespace TargetingTemplate {
}


