-module(openapi_carting_retailer).

-export([encode/1]).

-export_type([openapi_carting_retailer/0]).

-type openapi_carting_retailer() ::
    #{ 'retailer_id' := binary(),
       'retailer_name' := binary()
     }.

encode(#{ 'retailer_id' := RetailerId,
          'retailer_name' := RetailerName
        }) ->
    #{ 'retailer_id' => RetailerId,
       'retailer_name' => RetailerName
     }.
