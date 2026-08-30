-module(openapi_ad_groups_analytics_metrics).

-export([encode/1]).

-export_type([openapi_ad_groups_analytics_metrics/0]).

-type openapi_ad_groups_analytics_metrics() ::
    #{ 'AD_GROUP_ID' => binary(),
       'DATE' => calendar:date()
     }.

encode(#{ 'AD_GROUP_ID' := ADGROUPID,
          'DATE' := DATE
        }) ->
    #{ 'AD_GROUP_ID' => ADGROUPID,
       'DATE' => DATE
     }.
