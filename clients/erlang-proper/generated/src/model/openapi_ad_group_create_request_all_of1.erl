-module(openapi_ad_group_create_request_all_of1).

-include("openapi.hrl").

-export([openapi_ad_group_create_request_all_of1/0]).

-export([openapi_ad_group_create_request_all_of1/1]).

-export_type([openapi_ad_group_create_request_all_of1/0]).

-type openapi_ad_group_create_request_all_of1() ::
  [ {'auto_targeting_enabled', boolean() }
  | {'bid_multiplier', integer() }
  | {'budget_type', openapi_budget_type:openapi_budget_type() }
  | {'pacing_delivery_type', openapi_pacing_delivery_type:openapi_pacing_delivery_type() }
  ].


openapi_ad_group_create_request_all_of1() ->
    openapi_ad_group_create_request_all_of1([]).

openapi_ad_group_create_request_all_of1(Fields) ->
  Default = [ {'auto_targeting_enabled', boolean() }
            , {'bid_multiplier', integer() }
            , {'budget_type', openapi_budget_type:openapi_budget_type() }
            , {'pacing_delivery_type', openapi_pacing_delivery_type:openapi_pacing_delivery_type() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

