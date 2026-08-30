import { IntegrationRecord } from './integration-record';


export interface IntegrationsGetList200Response { 
  bookmark?: string | null;
  items: Array<IntegrationRecord>;
}

