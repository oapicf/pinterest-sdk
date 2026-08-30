-module(openapi_bid_floor_create).

-export([encode/1]).

-export_type([openapi_bid_floor_create/0]).

-type openapi_bid_floor_create() ::
    #{ 'bid_floor_specs' := list(),
       'targeting_spec' => openapi_targeting_spec_optimal:openapi_targeting_spec_optimal()
     }.

encode(#{ 'bid_floor_specs' := BidFloorSpecs,
          'targeting_spec' := TargetingSpec
        }) ->
    #{ 'bid_floor_specs' => BidFloorSpecs,
       'targeting_spec' => TargetingSpec
     }.
