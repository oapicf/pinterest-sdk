import { ConversionTagTypeOptimal } from './conversion-tag-type-optimal';


/**
 * Advertiser defined event
 */
export interface AdvertiserDefinedEvent { 
  /**
   * Standard type mapped to ADE for optimization
   */
  mapped_conversion_type?: ConversionTagTypeOptimal;
  /**
   * Raw string name of the event, usually logged as raw_event_name in our dataset
   */
  name?: string;
}
export namespace AdvertiserDefinedEvent {
}


