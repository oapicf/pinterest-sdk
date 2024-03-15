-module(openapi_bid_floor_request).

-export([encode/1]).

-export_type([openapi_bid_floor_request/0]).

-type openapi_bid_floor_request() ::
    #{ 'bid_floor_specs' := list(),
       'targeting_spec' => openapi_targeting_spec:openapi_targeting_spec()
     }.

encode(#{ 'bid_floor_specs' := BidFloorSpecs,
          'targeting_spec' := TargetingSpec
        }) ->
    #{ 'bid_floor_specs' => BidFloorSpecs,
       'targeting_spec' => TargetingSpec
     }.
