import { BusinessAccessRole } from './business-access-role';
import { Currency } from './currency';
import { Country } from './country';
import { AdAccountOwner } from './ad-account-owner';


export interface AdAccount { 
  country?: Country;
  /**
   *  Creation time. Unix timestamp in seconds.
   */
  readonly created_time?: number | null;
  currency?: Currency;
  id: string;
  /**
   * Ad account name.
   */
  name?: string;
  /**
   * Ad account owner
   */
  readonly owner?: AdAccountOwner;
  readonly permissions?: Array<BusinessAccessRole>;
  /**
   * The time zone of the ad account, in IANA format (e.g., \"America/Los_Angeles\"). Adding your local time zone lets you view your campaigns and ad reporting in your preferred time zone. Future reports will be available in both your local time zone and default UTC time zone. Historical data takes 1-2 months to backfill. Your billing and order lines will remain in UTC.
   */
  time_zone?: string;
  readonly updated_time?: number | null;
}
export namespace AdAccount {
}


