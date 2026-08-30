import { AiDisclosureItem } from './ai-disclosure-item';


/**
 * AI disclosure declarations the creator has made about the Pin.
 */
export interface AiDisclosuresUpdate { 
  /**
   * List of AI disclosure declarations the creator has made about this Pin.
   */
  values?: Array<AiDisclosureItem>;
}

