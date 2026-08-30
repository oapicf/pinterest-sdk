import { EventProcessingStatus } from './event-processing-status';


export interface ConversionApiResponseEventsItems { 
  /**
   * Error message containing more information about why the event failed to be processed.
   */
  error_message?: string | null;
  /**
   * Whether the event was processed successfully.
   */
  status: EventProcessingStatus;
  /**
   * Warning messages about any fields in the event which are not standard. These are not critical to event processing.
   */
  warning_message?: string | null;
}
export namespace ConversionApiResponseEventsItems {
}


