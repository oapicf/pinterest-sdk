import { PinAnalyticsDailyMetrics } from './pin-analytics-daily-metrics';


export interface PinAnalyticsMetricsResponse { 
  /**
   * Array with the requested daily metric records
   */
  daily_metrics?: Array<PinAnalyticsDailyMetrics>;
  /**
   * The lifetime metric name and value.
   */
  lifetime_metrics?: { [key: string]: number; };
  /**
   * The metric name and value over the requested period for each requested metric
   */
  summary_metrics?: { [key: string]: number; };
}

