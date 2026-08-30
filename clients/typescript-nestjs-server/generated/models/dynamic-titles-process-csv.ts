import { DynamicTitlesProcessCSVError } from './dynamic-titles-process-csv-error';


export interface DynamicTitlesProcessCSV { 
  /**
   * List of validation errors. Empty on success.
   */
  readonly errors?: Array<DynamicTitlesProcessCSVError>;
  /**
   * Processing status. Present on success.
   */
  readonly status?: string;
}

