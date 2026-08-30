import { ConversionApiResponseEventsItems } from './conversion-api-response-events-items';


/**
 * Conversion events.
 */
export interface ConversionEvents { 
  /**
   * Specific messages for each event received. The order will match the order in which the events were received in the request.
   */
  readonly events: Array<ConversionApiResponseEventsItems>;
  /**
   * Number of events that were successfully processed from the events.
   */
  readonly num_events_processed: number;
  /**
   * Total number of events received in the request.
   */
  readonly num_events_received: number;
}

