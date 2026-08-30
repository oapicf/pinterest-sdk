import { IntegrationLogClientRequest } from './integration-log-client-request';
import { IntegrationLogLevel } from './integration-log-level';
import { IntegrationLogClientError } from './integration-log-client-error';
import { IntegrationLogEventType } from './integration-log-event-type';


/**
 * Schema for log sent from an integration application.
 */
export interface IntegrationLog { 
  advertiser_id?: string | null;
  /**
   * Version number of the integration application.
   */
  app_version_number?: string;
  /**
   * Timestamp in milliseconds of when the log was executed at the client.
   */
  client_timestamp: number;
  error?: IntegrationLogClientError;
  /**
   * Log event type
   */
  event_type: IntegrationLogEventType;
  external_business_id?: string | null;
  feed_profile_id?: string | null;
  /**
   * Log level type
   */
  log_level: IntegrationLogLevel;
  merchant_id?: string | null;
  /**
   * Explanation of the event that occured.
   */
  message?: string;
  /**
   * Version number of the platform the integration application is running on.
   */
  platform_version_number?: string;
  request?: IntegrationLogClientRequest;
  tag_id?: string | null;
}
export namespace IntegrationLog {
}


