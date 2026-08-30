import { AnalyticsDailyMetrics } from './analytics-daily-metrics';


export interface AnalyticsMetricsResponse { 
  /**
   * Array with the requested daily metric records
   */
  daily_metrics?: Array<AnalyticsDailyMetrics>;
  /**
   * The metric name and value over the requested period for each requested metric
   */
  summary_metrics?: { [key: string]: number; };
}

