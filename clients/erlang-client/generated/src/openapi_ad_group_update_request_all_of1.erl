-module(openapi_ad_group_update_request_all_of1).

-export([encode/1]).

-export_type([openapi_ad_group_update_request_all_of1/0]).

-type openapi_ad_group_update_request_all_of1() ::
    #{ 'bid_multiplier' => integer(),
       'id' := binary(),
       'targeting_spec_operations' => list()
     }.

encode(#{ 'bid_multiplier' := BidMultiplier,
          'id' := Id,
          'targeting_spec_operations' := TargetingSpecOperations
        }) ->
    #{ 'bid_multiplier' => BidMultiplier,
       'id' => Id,
       'targeting_spec_operations' => TargetingSpecOperations
     }.
