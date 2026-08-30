import { ConversionDeletionRequestTargets } from './conversion-deletion-request-targets';


/**
 * Resource create operation model.
 */
export interface ConversionDeletionRequestCreate { 
  /**
   * Object containing the targets of the conversion deletion request. Users can be identified with user_emails, epiks, or both within the same request.
   */
  deletion_targets: ConversionDeletionRequestTargets;
}

