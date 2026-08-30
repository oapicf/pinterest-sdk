

/**
 * Details of an issue with a quality component.
 */
export interface QualityComponentIssue { 
  /**
   * Unique identifier for the issue check.
   */
  id: string;
  /**
   * Human-readable name of the issue.
   */
  name: string;
  /**
   * Detailed reason for the issue.
   */
  reason: string;
}

