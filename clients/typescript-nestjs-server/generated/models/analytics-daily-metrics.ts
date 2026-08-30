import { DataStatus } from './data-status';


export interface AnalyticsDailyMetrics { 
  data_status?: DataStatus;
  /**
   * Metrics date (UTC): YYYY-MM-DD.
   */
  date?: string;
  metrics?: { [key: string]: number; };
}
export namespace AnalyticsDailyMetrics {
}


