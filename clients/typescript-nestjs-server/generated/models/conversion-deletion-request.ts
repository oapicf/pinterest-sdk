import { ConversionDeletionRequestStatus } from './conversion-deletion-request-status';


/**
 * Conversion deletion request
 */
export interface ConversionDeletionRequest { 
  /**
   * Timestamp when the conversion deletion request was succesfully created.
   */
  readonly created_time: string;
  /**
   * Timestamp when the conversion deletion request was processed.
   */
  readonly processed_time?: string | null;
  /**
   * Unique identifier of the conversion deletion request
   */
  request_id: string;
  /**
   * Represents the status of the conversion deletion request. \"PENDING\" or \"SUBMITTED\". \"PENDING\" meaning the Advertiser can cancel the request. The advertiser has a 7 day time window after the conversion deletion request was submitted to cancel it. \"SUBMITTED\" meaning that the Data Deletion process has begun and can no longer be canceled.
   */
  readonly status: ConversionDeletionRequestStatus;
}
export namespace ConversionDeletionRequest {
}


