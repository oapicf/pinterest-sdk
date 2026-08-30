import { TrendingPin } from './trending-pin';


/**
 * Individual trending topic within an interest category
 */
export interface TrendingTopic { 
  /**
   * Description of the trending topic
   */
  description: string;
  /**
   * Unique identifier for the trending topic
   */
  id: string;
  /**
   * Month-over-month growth percentage
   */
  percent_growth_mom?: number;
  /**
   * Array of pin images related to this trend (up to 6)
   */
  pins: Array<TrendingPin>;
  /**
   * List of related interest categories
   */
  related_interests: Array<string>;
  /**
   * List of related search terms
   */
  related_searches: Array<string>;
  /**
   * Time series data showing trend values over time, with dates as keys and values as numeric
   */
  time_series: { [key: string]: number; };
  /**
   * Title of the trending topic
   */
  title: string;
}

