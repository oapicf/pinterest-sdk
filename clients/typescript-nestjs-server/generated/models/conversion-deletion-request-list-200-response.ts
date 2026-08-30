import { ConversionDeletionRequest } from './conversion-deletion-request';


export interface ConversionDeletionRequestList200Response { 
  bookmark?: string | null;
  items: Array<ConversionDeletionRequest>;
}

