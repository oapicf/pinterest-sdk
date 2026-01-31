-module(openapi_ad_group_id_filter).

-export([encode/1]).

-export_type([openapi_ad_group_id_filter/0]).

-type openapi_ad_group_id_filter() ::
    #{ 'ad_group_ids' => list()
     }.

encode(#{ 'ad_group_ids' := AdGroupIds
        }) ->
    #{ 'ad_group_ids' => AdGroupIds
     }.
