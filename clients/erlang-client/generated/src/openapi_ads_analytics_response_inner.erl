-module(openapi_ads_analytics_response_inner).

-export([encode/1]).

-export_type([openapi_ads_analytics_response_inner/0]).

-type openapi_ads_analytics_response_inner() ::
    #{ 'AD_ID' := binary(),
       'DATE' => calendar:date()
     }.

encode(#{ 'AD_ID' := ADID,
          'DATE' := DATE
        }) ->
    #{ 'AD_ID' => ADID,
       'DATE' => DATE
     }.
