import { ConversionTagConfigs } from './conversion-tag-configs';
import { EntityStatus } from './entity-status';
import { EnhancedMatchStatusType } from './enhanced-match-status-type';


export interface ConversionTagResponse { 
  /**
   * Tag code snippet.
   */
  readonly code_snippet?: string;
  readonly configs?: ConversionTagConfigs;
  /**
   * The enhanced match status of the tag
   */
  readonly enhanced_match_status?: EnhancedMatchStatusType | null;
  /**
   * Tag ID.
   */
  readonly id?: string;
  /**
   * Time for the last event fired.
   */
  readonly last_fired_time_ms?: number | null;
  /**
   * Conversion tag name.
   */
  name: string;
  /**
   * Version number.
   */
  readonly version?: string;
  /**
   * Ad account ID.
   */
  readonly ad_account_id: string;
  readonly status?: EntityStatus;
}
export namespace ConversionTagResponse {
}


