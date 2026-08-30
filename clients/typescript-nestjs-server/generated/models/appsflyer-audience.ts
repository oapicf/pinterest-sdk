import { AppsflyerPlatform } from './appsflyer-platform';


/**
 * Request model for creating an AppsFlyer audience
 */
export interface AppsflyerAudience { 
  /**
   * The ID of the audience container
   */
  readonly container_id: string;
  /**
   * The name of the audience
   */
  name: string;
  /**
   * The platform of the audience
   */
  platform: AppsflyerPlatform;
}
export namespace AppsflyerAudience {
}


