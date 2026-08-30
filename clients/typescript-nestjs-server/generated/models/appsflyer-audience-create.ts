import { AppsflyerPlatform } from './appsflyer-platform';


/**
 * Resource create operation model.
 */
export interface AppsflyerAudienceCreate { 
  /**
   * The name of the audience
   */
  name: string;
  /**
   * The platform of the audience
   */
  platform: AppsflyerPlatform;
}
export namespace AppsflyerAudienceCreate {
}


