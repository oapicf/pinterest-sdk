import { ConversionTagType } from './conversion-tag-type';


export interface ConversionEventResponse { 
  /**
   * Id of the ad account.
   */
  ad_account_id?: string;
  conversion_event?: ConversionTagType;
  /**
   * Id of the tag.
   */
  conversion_tag_id?: string;
  /**
   * Creation date in epoch format.
   */
  created_time?: number;
  /**
   * For advertiser-defined events, the reporting event label shown in optimization UIs.
   */
  reporting_conversion_event?: string;
}
export namespace ConversionEventResponse {
}


