import { DataStatus } from './data-status';


/**
 * Array with metrics, status, and pin id for the requested metric
 */
export interface TopPinsAnalyticsResponsePinsItems { 
  data_status?: { [key: string]: DataStatus; };
  metrics?: { [key: string]: number; };
  /**
   * The pin id
   */
  pin_id?: string;
}

