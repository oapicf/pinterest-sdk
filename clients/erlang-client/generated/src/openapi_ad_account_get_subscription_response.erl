-module(openapi_ad_account_get_subscription_response).

-export([encode/1]).

-export_type([openapi_ad_account_get_subscription_response/0]).

-type openapi_ad_account_get_subscription_response() ::
    #{ 'lead_form_id' => binary(),
       'webhook_url' => binary(),
       'ad_account_id' => binary(),
       'api_version' => binary(),
       'created_time' => integer(),
       'cryptographic_algorithm' => binary(),
       'cryptographic_key' => binary(),
       'id' => binary(),
       'user_account_id' => binary()
     }.

encode(#{ 'lead_form_id' := LeadFormId,
          'webhook_url' := WebhookUrl,
          'ad_account_id' := AdAccountId,
          'api_version' := ApiVersion,
          'created_time' := CreatedTime,
          'cryptographic_algorithm' := CryptographicAlgorithm,
          'cryptographic_key' := CryptographicKey,
          'id' := Id,
          'user_account_id' := UserAccountId
        }) ->
    #{ 'lead_form_id' => LeadFormId,
       'webhook_url' => WebhookUrl,
       'ad_account_id' => AdAccountId,
       'api_version' => ApiVersion,
       'created_time' => CreatedTime,
       'cryptographic_algorithm' => CryptographicAlgorithm,
       'cryptographic_key' => CryptographicKey,
       'id' => Id,
       'user_account_id' => UserAccountId
     }.
