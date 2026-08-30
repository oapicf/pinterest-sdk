import { IntegrationLog } from './integration-log';


/**
 * Resource create operation model.
 */
export interface IntegrationLogsRequestCreate { 
  logs: Array<IntegrationLog>;
}

