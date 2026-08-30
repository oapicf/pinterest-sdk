import { AudienceAccountType } from './audience-account-type';


export interface SharedAudienceAccount { 
  /**
   * Account ID (ad account or business ID).
   */
  account_id: string;
  /**
   * Account name.
   */
  account_name: string;
  /**
   * account type
   */
  account_type: AudienceAccountType;
  /**
   * Epoch timestamp in seconds for the shared audience event
   */
  shared_on_timestamp: number;
}
export namespace SharedAudienceAccount {
}


