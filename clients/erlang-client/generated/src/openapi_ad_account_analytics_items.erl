-module(openapi_ad_account_analytics_items).

-export([encode/1]).

-export_type([openapi_ad_account_analytics_items/0]).

-type openapi_ad_account_analytics_items() ::
    #{ 'AD_ACCOUNT_ID' := binary(),
       'DATE' => calendar:date()
     }.

encode(#{ 'AD_ACCOUNT_ID' := ADACCOUNTID,
          'DATE' := DATE
        }) ->
    #{ 'AD_ACCOUNT_ID' => ADACCOUNTID,
       'DATE' => DATE
     }.
