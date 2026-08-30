-module(openapi_lead_subscription_post_params).

-export([encode/1]).

-export_type([openapi_lead_subscription_post_params/0]).

-type openapi_lead_subscription_post_params() ::
    #{ 'ad_account_id' => binary(),
       'api_version' => binary(),
       'created_time' => integer(),
       'cryptographic_algorithm' => binary(),
       'cryptographic_key' => binary(),
       'id' => binary(),
       'lead_form_id' => binary(),
       'user_account_id' => binary(),
       'webhook_url' => binary(),
       'partner_access_token' => binary(),
       'partner_metadata' => openapi_partner_metadata:openapi_partner_metadata(),
       'partner_refresh_token' => binary()
     }.

encode(#{ 'ad_account_id' := AdAccountId,
          'api_version' := ApiVersion,
          'created_time' := CreatedTime,
          'cryptographic_algorithm' := CryptographicAlgorithm,
          'cryptographic_key' := CryptographicKey,
          'id' := Id,
          'lead_form_id' := LeadFormId,
          'user_account_id' := UserAccountId,
          'webhook_url' := WebhookUrl,
          'partner_access_token' := PartnerAccessToken,
          'partner_metadata' := PartnerMetadata,
          'partner_refresh_token' := PartnerRefreshToken
        }) ->
    #{ 'ad_account_id' => AdAccountId,
       'api_version' => ApiVersion,
       'created_time' => CreatedTime,
       'cryptographic_algorithm' => CryptographicAlgorithm,
       'cryptographic_key' => CryptographicKey,
       'id' => Id,
       'lead_form_id' => LeadFormId,
       'user_account_id' => UserAccountId,
       'webhook_url' => WebhookUrl,
       'partner_access_token' => PartnerAccessToken,
       'partner_metadata' => PartnerMetadata,
       'partner_refresh_token' => PartnerRefreshToken
     }.
