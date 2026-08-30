import { CatalogsFeedProcessingScheduleTimezone } from './catalogs-feed-processing-schedule-timezone';


/**
 * Daily processing schedule. This field is **OPTIONAL**. Use this to configure the preferred time for processing a feed (otherwise random).
 */
export interface CatalogsFeedProcessingSchedule { 
  /**
   * A time in format HH:MM with leading 0 (zero)
   */
  time: string;
  /**
   * The timezone considered for the processing schedule time.
   */
  timezone: CatalogsFeedProcessingScheduleTimezone | null;
}
export namespace CatalogsFeedProcessingSchedule {
}


