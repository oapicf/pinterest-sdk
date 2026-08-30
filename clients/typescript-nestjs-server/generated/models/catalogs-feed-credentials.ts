

/**
 * This field is **OPTIONAL**. Use this if your feed file requires username and password.
 */
export interface CatalogsFeedCredentials { 
  /**
   * The required password for downloading a feed.
   */
  password: string;
  /**
   * The required username for downloading a feed.
   */
  username: string;
}

