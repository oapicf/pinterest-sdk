import { AdvertiserDefinedEventMappingType } from './advertiser-defined-event-mapping-type';


/**
 * Advertiser defined event input for create/update operations
 */
export interface AdvertiserDefinedEventInput { 
  /**
   * Pinterest standard event type to map this custom event to for campaign optimization and reporting
   */
  mapped_conversion_type: AdvertiserDefinedEventMappingType;
  /**
   * Raw string name of the event
   */
  name: string;
}
export namespace AdvertiserDefinedEventInput {
}


