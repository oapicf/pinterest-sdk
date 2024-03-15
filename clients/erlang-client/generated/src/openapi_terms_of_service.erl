-module(openapi_terms_of_service).

-export([encode/1]).

-export_type([openapi_terms_of_service/0]).

-type openapi_terms_of_service() ::
    #{ 'id' => binary(),
       'html' => binary(),
       'has_accepted' => boolean(),
       'ad_account_id' => binary()
     }.

encode(#{ 'id' := Id,
          'html' := Html,
          'has_accepted' := HasAccepted,
          'ad_account_id' := AdAccountId
        }) ->
    #{ 'id' => Id,
       'html' => Html,
       'has_accepted' => HasAccepted,
       'ad_account_id' => AdAccountId
     }.
