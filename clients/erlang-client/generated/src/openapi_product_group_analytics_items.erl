-module(openapi_product_group_analytics_items).

-export([encode/1]).

-export_type([openapi_product_group_analytics_items/0]).

-type openapi_product_group_analytics_items() ::
    #{ 'DATE' => calendar:date(),
       'PRODUCT_GROUP_ID' := binary()
     }.

encode(#{ 'DATE' := DATE,
          'PRODUCT_GROUP_ID' := PRODUCTGROUPID
        }) ->
    #{ 'DATE' => DATE,
       'PRODUCT_GROUP_ID' => PRODUCTGROUPID
     }.
