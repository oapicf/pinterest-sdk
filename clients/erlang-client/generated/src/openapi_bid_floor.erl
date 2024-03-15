-module(openapi_bid_floor).

-export([encode/1]).

-export_type([openapi_bid_floor/0]).

-type openapi_bid_floor() ::
    #{ 'bid_floors' => list(),
       'type' => binary()
     }.

encode(#{ 'bid_floors' := BidFloors,
          'type' := Type
        }) ->
    #{ 'bid_floors' => BidFloors,
       'type' => Type
     }.
