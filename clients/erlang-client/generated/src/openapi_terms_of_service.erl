-module(openapi_terms_of_service).

-export([encode/1]).

-export_type([openapi_terms_of_service/0]).

-type openapi_terms_of_service() ::
    #{ 'ad_account_id' => binary(),
       'has_accepted' => boolean(),
       'html' => binary(),
       'id' => binary()
     }.

encode(#{ 'ad_account_id' := AdAccountId,
          'has_accepted' := HasAccepted,
          'html' := Html,
          'id' := Id
        }) ->
    #{ 'ad_account_id' => AdAccountId,
       'has_accepted' => HasAccepted,
       'html' => Html,
       'id' => Id
     }.
