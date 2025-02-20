/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
import { AdAccountCreateSubscriptionRequestPartnerMetadata } from './adAccountCreateSubscriptionRequestPartnerMetadata';


export interface AdAccountCreateSubscriptionRequest { 
    /**
     * Standard HTTPS webhook URL.
     */
    webhook_url: string;
    /**
     * Lead form ID.
     */
    lead_form_id?: string;
    /**
     * Partner access token. Only for clients that requires authentication. We recommend to avoid this param.
     */
    partner_access_token?: string;
    /**
     * Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param.
     */
    partner_refresh_token?: string;
    partner_metadata?: AdAccountCreateSubscriptionRequestPartnerMetadata;
}
