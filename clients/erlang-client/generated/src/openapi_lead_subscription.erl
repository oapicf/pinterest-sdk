-module(openapi_lead_subscription).

-export([encode/1]).

-export_type([openapi_lead_subscription/0]).

-type openapi_lead_subscription() ::
    #{ 'ad_account_id' => binary(),
       'api_version' => binary(),
       'created_time' => integer(),
       'cryptographic_algorithm' => binary(),
       'cryptographic_key' => binary(),
       'id' => binary(),
       'lead_form_id' => binary(),
       'user_account_id' => binary(),
       'webhook_url' => binary()
     }.

encode(#{ 'ad_account_id' := AdAccountId,
          'api_version' := ApiVersion,
          'created_time' := CreatedTime,
          'cryptographic_algorithm' := CryptographicAlgorithm,
          'cryptographic_key' := CryptographicKey,
          'id' := Id,
          'lead_form_id' := LeadFormId,
          'user_account_id' := UserAccountId,
          'webhook_url' := WebhookUrl
        }) ->
    #{ 'ad_account_id' => AdAccountId,
       'api_version' => ApiVersion,
       'created_time' => CreatedTime,
       'cryptographic_algorithm' => CryptographicAlgorithm,
       'cryptographic_key' => CryptographicKey,
       'id' => Id,
       'lead_form_id' => LeadFormId,
       'user_account_id' => UserAccountId,
       'webhook_url' => WebhookUrl
     }.
