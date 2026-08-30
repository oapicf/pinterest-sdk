import { AdvertiserDefinedEventInput } from './advertiser-defined-event-input';


/**
 * Request body for creating or updating advertiser defined events
 */
export interface AdvertiserDefinedEventsCreateRequest { 
  /**
   * List of advertiser defined events to create or update
   */
  items: Array<AdvertiserDefinedEventInput>;
}

