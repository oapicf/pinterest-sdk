

/**
 * Processing record for an advertiser defined event operation
 */
export interface AdvertiserDefinedEventProcessingRecord { 
  /**
   * List of exception messages if the operation failed
   */
  exceptions?: Array<string>;
  /**
   * Name of the advertiser defined event
   */
  name: string;
  /**
   * Processing status (success or failure)
   */
  status: string;
}

