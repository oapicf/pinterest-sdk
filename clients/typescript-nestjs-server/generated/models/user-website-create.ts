import { WebsiteVerificationMethod } from './website-verification-method';


/**
 * Resource create operation model.
 */
export interface UserWebsiteCreate { 
  /**
   * Method used to verify website ownership.
   */
  verification_method?: WebsiteVerificationMethod;
  /**
   * Website with path or domain only
   */
  website?: string;
}
export namespace UserWebsiteCreate {
}


