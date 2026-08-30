import { PartnerMetadata } from './partner-metadata';


export interface LeadSubscriptionPostParamsCreate { 
  /**
   * Lead form ID.
   */
  lead_form_id?: string;
  /**
   * Standard HTTPS webhook URL.
   */
  webhook_url: string;
  /**
   * Partner access token. Only for clients that requires authentication. We recommend to avoid this param.
   */
  partner_access_token?: string;
  /**
   * Partner metadata. Only for clients that requires special handling. We recommend to avoid this param.
   */
  partner_metadata?: PartnerMetadata;
  /**
   * Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param.
   */
  partner_refresh_token?: string;
}

