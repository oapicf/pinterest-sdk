-module(openapi_product_group_analytics_response_inner).

-export([encode/1]).

-export_type([openapi_product_group_analytics_response_inner/0]).

-type openapi_product_group_analytics_response_inner() ::
    #{ 'PRODUCT_GROUP_ID' := binary(),
       'DATE' => calendar:date()
     }.

encode(#{ 'PRODUCT_GROUP_ID' := PRODUCTGROUPID,
          'DATE' := DATE
        }) ->
    #{ 'PRODUCT_GROUP_ID' => PRODUCTGROUPID,
       'DATE' => DATE
     }.
