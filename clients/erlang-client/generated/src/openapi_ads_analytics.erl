-module(openapi_ads_analytics).

-export([encode/1]).

-export_type([openapi_ads_analytics/0]).

-type openapi_ads_analytics() ::
    #{ 'AD_ID' := binary(),
       'DATE' => calendar:date()
     }.

encode(#{ 'AD_ID' := ADID,
          'DATE' := DATE
        }) ->
    #{ 'AD_ID' => ADID,
       'DATE' => DATE
     }.
