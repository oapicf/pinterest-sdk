import { KeywordMetrics } from './keyword-metrics';


export interface KeywordMetricsResponse { 
  /**
   * Keyword name, e.g., \"keyword\":\"fashion outfits\"
   */
  keyword?: string;
  metrics?: KeywordMetrics;
}

