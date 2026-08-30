-module(openapi_lead_subscription_post_params_create).

-export([encode/1]).

-export_type([openapi_lead_subscription_post_params_create/0]).

-type openapi_lead_subscription_post_params_create() ::
    #{ 'lead_form_id' => binary(),
       'webhook_url' := binary(),
       'partner_access_token' => binary(),
       'partner_metadata' => openapi_partner_metadata:openapi_partner_metadata(),
       'partner_refresh_token' => binary()
     }.

encode(#{ 'lead_form_id' := LeadFormId,
          'webhook_url' := WebhookUrl,
          'partner_access_token' := PartnerAccessToken,
          'partner_metadata' := PartnerMetadata,
          'partner_refresh_token' := PartnerRefreshToken
        }) ->
    #{ 'lead_form_id' => LeadFormId,
       'webhook_url' => WebhookUrl,
       'partner_access_token' => PartnerAccessToken,
       'partner_metadata' => PartnerMetadata,
       'partner_refresh_token' => PartnerRefreshToken
     }.
