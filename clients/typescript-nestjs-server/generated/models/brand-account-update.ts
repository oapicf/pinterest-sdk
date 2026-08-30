import { Country } from './country';
import { BrandAccountProfileImageUpdate } from './brand-account-profile-image-update';


/**
 * Resource create or update operation model.
 */
export interface BrandAccountUpdate { 
  /**
   * Brand Account about information
   */
  about?: string;
  country?: Country;
  /**
   * Brand Account name
   */
  name?: string;
  profile_image?: BrandAccountProfileImageUpdate;
  /**
   * Brand Account username
   */
  username?: string;
  /**
   * Brand Account website
   */
  website?: string;
}
export namespace BrandAccountUpdate {
}


