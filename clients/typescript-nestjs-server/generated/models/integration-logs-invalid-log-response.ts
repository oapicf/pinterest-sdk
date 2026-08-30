import { IntegrationLogsInvalidLogResponseRejectedLogsItems } from './integration-logs-invalid-log-response-rejected-logs-items';


/**
 * Schema describing the response when a log has invalid fields.
 */
export interface IntegrationLogsInvalidLogResponse { 
  rejected_logs?: Array<IntegrationLogsInvalidLogResponseRejectedLogsItems>;
}

