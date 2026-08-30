

/**
 * Resource create operation model.
 */
export interface CustomerSegmentCreate { 
  /**
   * Audience IDs included in the customer segment.
   */
  audience_ids: Array<string>;
  /**
   * Customer segment name.
   */
  name: string;
}

