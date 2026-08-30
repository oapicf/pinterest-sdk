import { AdPinPreviewCreativeType } from './ad-pin-preview-creative-type';


/**
 * Ad preview source from an existing Pin.
 */
export interface AdPreviewSourcePinId { 
  /**
   * Creative type of the ad preview.
   */
  creative_type?: AdPinPreviewCreativeType;
  /**
   * Pin ID.
   */
  pin_id: string;
}
export namespace AdPreviewSourcePinId {
}


