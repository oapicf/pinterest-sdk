import { TargetingTemplateStatus } from './targeting-template-status';


export interface CustomerSegment { 
  /**
   * The ID of the ad account that this customer segment belongs to.
   */
  readonly ad_account_id?: string;
  /**
   * Audience IDs included in the customer segment.
   */
  audience_ids: Array<string>;
  /**
   * Customer segment created time. Unix timestamp in seconds.
   */
  readonly created_time?: number;
  /**
   * Customer segment ID.
   */
  readonly id?: string;
  /**
   * Customer segment name.
   */
  name: string;
  /**
   * Indicates whether the customer segment is active or deleted.
   */
  readonly status?: TargetingTemplateStatus;
  /**
   * Customer segment updated time. Unix timestamp in seconds.
   */
  readonly updated_time?: number;
}
export namespace CustomerSegment {
}


