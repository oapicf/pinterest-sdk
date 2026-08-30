import { ConversionEventsDataItems } from './conversion-events-data-items';


/**
 * Conversion events.
 */
export interface ConversionEventsCreate { 
  /**
   * A list of events (one or more) encapsulated by a data object.
   */
  data: Array<ConversionEventsDataItems>;
}

