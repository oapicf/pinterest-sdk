

export interface LeadSubscriptionCreate { 
  /**
   * Lead form ID.
   */
  lead_form_id?: string;
  /**
   * Standard HTTPS webhook URL.
   */
  webhook_url: string;
}

