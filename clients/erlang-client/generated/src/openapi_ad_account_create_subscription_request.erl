-module(openapi_ad_account_create_subscription_request).

-export([encode/1]).

-export_type([openapi_ad_account_create_subscription_request/0]).

-type openapi_ad_account_create_subscription_request() ::
    #{ 'webhook_url' := binary(),
       'lead_form_id' => binary(),
       'partner_access_token' => binary(),
       'partner_refresh_token' => binary()
     }.

encode(#{ 'webhook_url' := WebhookUrl,
          'lead_form_id' := LeadFormId,
          'partner_access_token' := PartnerAccessToken,
          'partner_refresh_token' := PartnerRefreshToken
        }) ->
    #{ 'webhook_url' => WebhookUrl,
       'lead_form_id' => LeadFormId,
       'partner_access_token' => PartnerAccessToken,
       'partner_refresh_token' => PartnerRefreshToken
     }.
