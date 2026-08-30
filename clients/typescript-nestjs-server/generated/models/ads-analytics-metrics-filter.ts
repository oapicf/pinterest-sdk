import { AdsAnalyticsFilterColumn } from './ads-analytics-filter-column';
import { AdsAnalyticsFilterOperator } from './ads-analytics-filter-operator';


export interface AdsAnalyticsMetricsFilter { 
  field: AdsAnalyticsFilterColumn;
  operator: AdsAnalyticsFilterOperator;
  /**
   * List of values for filtering
   */
  values: Array<number>;
}
export namespace AdsAnalyticsMetricsFilter {
}


