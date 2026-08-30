-module(openapi_ad_group_update_request_all_of1).

-include("openapi.hrl").

-export([openapi_ad_group_update_request_all_of1/0]).

-export([openapi_ad_group_update_request_all_of1/1]).

-export_type([openapi_ad_group_update_request_all_of1/0]).

-type openapi_ad_group_update_request_all_of1() ::
  [ {'bid_multiplier', integer() }
  | {'id', binary() }
  | {'targeting_spec_operations', list(openapi_targeting_spec_operations:openapi_targeting_spec_operations()) }
  ].


openapi_ad_group_update_request_all_of1() ->
    openapi_ad_group_update_request_all_of1([]).

openapi_ad_group_update_request_all_of1(Fields) ->
  Default = [ {'bid_multiplier', integer() }
            , {'id', binary() }
            , {'targeting_spec_operations', list(openapi_targeting_spec_operations:openapi_targeting_spec_operations()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

