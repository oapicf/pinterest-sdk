import { BrandAccountProfileImage } from './brand-account-profile-image';
import { Country } from './country';


/**
 * Resource create operation model.
 */
export interface BrandAccountCreate { 
  /**
   * Brand Account about information
   */
  about?: string;
  country: Country;
  /**
   * Brand Account name
   */
  name: string;
  profile_image?: BrandAccountProfileImage;
  /**
   * Brand Account username
   */
  username: string;
  /**
   * Brand Account website
   */
  website?: string;
}
export namespace BrandAccountCreate {
}


