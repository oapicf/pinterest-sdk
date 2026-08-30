-module(openapi_campaign_update_request_all_of2).

-include("openapi.hrl").

-export([openapi_campaign_update_request_all_of2/0]).

-export([openapi_campaign_update_request_all_of2/1]).

-export_type([openapi_campaign_update_request_all_of2/0]).

-type openapi_campaign_update_request_all_of2() ::
  [ {'bid_options', openapi_campaign_bid_options_update:openapi_campaign_bid_options_update() }
  | {'intended_promotion_type', openapi_intended_promotion_type:openapi_intended_promotion_type() }
  | {'is_ltv_optimized', boolean() }
  | {'is_performance_plus', boolean() }
  | {'is_top_of_search', boolean() }
  | {'objective_type', openapi_objective_type:openapi_objective_type() }
  ].


openapi_campaign_update_request_all_of2() ->
    openapi_campaign_update_request_all_of2([]).

openapi_campaign_update_request_all_of2(Fields) ->
  Default = [ {'bid_options', openapi_campaign_bid_options_update:openapi_campaign_bid_options_update() }
            , {'intended_promotion_type', openapi_intended_promotion_type:openapi_intended_promotion_type() }
            , {'is_ltv_optimized', boolean() }
            , {'is_performance_plus', boolean() }
            , {'is_top_of_search', boolean() }
            , {'objective_type', openapi_objective_type:openapi_objective_type() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

