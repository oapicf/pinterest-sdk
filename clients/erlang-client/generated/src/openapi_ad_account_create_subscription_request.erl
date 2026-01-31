-module(openapi_ad_account_create_subscription_request).

-export([encode/1]).

-export_type([openapi_ad_account_create_subscription_request/0]).

-type openapi_ad_account_create_subscription_request() ::
    #{ 'lead_form_id' => binary(),
       'partner_access_token' => binary(),
       'partner_metadata' => openapi_ad_account_create_subscription_request_partner_metadata:openapi_ad_account_create_subscription_request_partner_metadata(),
       'partner_refresh_token' => binary(),
       'webhook_url' := binary()
     }.

encode(#{ 'lead_form_id' := LeadFormId,
          'partner_access_token' := PartnerAccessToken,
          'partner_metadata' := PartnerMetadata,
          'partner_refresh_token' := PartnerRefreshToken,
          'webhook_url' := WebhookUrl
        }) ->
    #{ 'lead_form_id' => LeadFormId,
       'partner_access_token' => PartnerAccessToken,
       'partner_metadata' => PartnerMetadata,
       'partner_refresh_token' => PartnerRefreshToken,
       'webhook_url' => WebhookUrl
     }.
