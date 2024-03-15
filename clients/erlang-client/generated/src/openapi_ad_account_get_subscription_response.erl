-module(openapi_ad_account_get_subscription_response).

-export([encode/1]).

-export_type([openapi_ad_account_get_subscription_response/0]).

-type openapi_ad_account_get_subscription_response() ::
    #{ 'lead_form_id' => binary(),
       'webhook_url' => binary(),
       'id' => binary(),
       'user_account_id' => binary(),
       'ad_account_id' => binary(),
       'api_version' => binary(),
       'cryptographic_key' => binary(),
       'cryptographic_algorithm' => binary(),
       'created_time' => integer()
     }.

encode(#{ 'lead_form_id' := LeadFormId,
          'webhook_url' := WebhookUrl,
          'id' := Id,
          'user_account_id' := UserAccountId,
          'ad_account_id' := AdAccountId,
          'api_version' := ApiVersion,
          'cryptographic_key' := CryptographicKey,
          'cryptographic_algorithm' := CryptographicAlgorithm,
          'created_time' := CreatedTime
        }) ->
    #{ 'lead_form_id' => LeadFormId,
       'webhook_url' => WebhookUrl,
       'id' => Id,
       'user_account_id' => UserAccountId,
       'ad_account_id' => AdAccountId,
       'api_version' => ApiVersion,
       'cryptographic_key' => CryptographicKey,
       'cryptographic_algorithm' => CryptographicAlgorithm,
       'created_time' => CreatedTime
     }.
