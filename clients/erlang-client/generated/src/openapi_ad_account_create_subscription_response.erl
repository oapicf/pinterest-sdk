-module(openapi_ad_account_create_subscription_response).

-export([encode/1]).

-export_type([openapi_ad_account_create_subscription_response/0]).

-type openapi_ad_account_create_subscription_response() ::
    #{ 'id' => binary(),
       'cryptographic_key' => binary(),
       'cryptographic_algorithm' => binary(),
       'created_time' => integer()
     }.

encode(#{ 'id' := Id,
          'cryptographic_key' := CryptographicKey,
          'cryptographic_algorithm' := CryptographicAlgorithm,
          'created_time' := CreatedTime
        }) ->
    #{ 'id' => Id,
       'cryptographic_key' => CryptographicKey,
       'cryptographic_algorithm' => CryptographicAlgorithm,
       'created_time' => CreatedTime
     }.
