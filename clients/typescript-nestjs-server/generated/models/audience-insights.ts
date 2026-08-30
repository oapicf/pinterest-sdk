import { AudienceCategory } from './audience-category';
import { AudienceDemographics } from './audience-demographics';
import { AudienceInsightType } from './audience-insight-type';


/**
 * Audience interests and demographics.
 */
export interface AudienceInsights { 
  /**
   * Category interest distribution
   */
  categories?: Array<AudienceCategory>;
  /**
   * Generation date
   */
  date?: string | null;
  demographics?: AudienceDemographics;
  /**
   * Population count.
   */
  size?: number;
  /**
   * Indicates whether the audience size has been rounded up to the next highest upper boundary.
   */
  size_is_upper_bound?: boolean;
  type?: AudienceInsightType;
}
export namespace AudienceInsights {
}


