import { UserAccountType } from './user-account-type';


/**
 * User account model containing properties related to a user\'s account.
 */
export interface Account { 
  /**
   * Profile about description.
   */
  about?: string;
  /**
   * Type of account
   */
  account_type?: UserAccountType;
  /**
   *   User account board count.   **Note**: Board count on user account level may differ from counts found elsewhere due to attribution of collaborative Boards.
   */
  readonly board_count?: number | null;
  business_name?: string | null;
  /**
   * User account follower count.
   */
  readonly follower_count?: number | null;
  /**
   * User account following count.
   */
  readonly following_count?: number | null;
  /**
   * User account ID.
   */
  id?: string;
  /**
   * User account monthly views.
   */
  readonly monthly_views?: number | null;
  /**
   * User account pin count. This includes both created and saved pins.
   */
  readonly pin_count?: number | null;
  profile_image?: string;
  username?: string;
  website_url?: string;
}
export namespace Account {
}


