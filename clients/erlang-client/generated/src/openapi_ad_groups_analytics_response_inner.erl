-module(openapi_ad_groups_analytics_response_inner).

-export([encode/1]).

-export_type([openapi_ad_groups_analytics_response_inner/0]).

-type openapi_ad_groups_analytics_response_inner() ::
    #{ 'AD_GROUP_ID' := binary(),
       'DATE' => calendar:date()
     }.

encode(#{ 'AD_GROUP_ID' := ADGROUPID,
          'DATE' := DATE
        }) ->
    #{ 'AD_GROUP_ID' => ADGROUPID,
       'DATE' => DATE
     }.
