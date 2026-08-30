import { QualityComponentIssue } from './quality-component-issue';


/**
 * Metrics for a specific event type within a quality component.
 */
export interface QualityComponentDetails { 
  /**
   * Coverage percentage for this event type.
   */
  coverage: number;
  /**
   * List of issues detected for this event type, if any.
   */
  issues?: Array<QualityComponentIssue>;
  /**
   * Overlap percentage for this event type. Only populated for external_event_id
   */
  overlap?: number;
}

