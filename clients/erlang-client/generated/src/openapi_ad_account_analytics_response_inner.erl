-module(openapi_ad_account_analytics_response_inner).

-export([encode/1]).

-export_type([openapi_ad_account_analytics_response_inner/0]).

-type openapi_ad_account_analytics_response_inner() ::
    #{ 'AD_ACCOUNT_ID' := binary(),
       'DATE' => calendar:date()
     }.

encode(#{ 'AD_ACCOUNT_ID' := ADACCOUNTID,
          'DATE' := DATE
        }) ->
    #{ 'AD_ACCOUNT_ID' => ADACCOUNTID,
       'DATE' => DATE
     }.
