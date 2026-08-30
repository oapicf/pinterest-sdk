import { ConversionDeletionRequestUserEmailTargets } from './conversion-deletion-request-user-email-targets';
import { ConversionDeletionRequestEPIKTargets } from './conversion-deletion-request-epik-targets';


export interface ConversionDeletionRequestTargets { 
  /**
   * Array of plain text user emails.
   */
  user_emails: Array<string>;
  /**
   * Array of EPIKs (Encrypted Pinterest ID Keys). An EPIK is a user match type that utilizes 3P browser localStorage (similar to a third-party cookie).
   */
  epiks: Array<string>;
}

