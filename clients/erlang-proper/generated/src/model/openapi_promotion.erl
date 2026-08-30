-module(openapi_promotion).

-include("openapi.hrl").

-export([openapi_promotion/0]).

-export([openapi_promotion/1]).

-export_type([openapi_promotion/0]).

-type openapi_promotion() ::
  [ {'ad_account_id', binary() }
  | {'discount_status', openapi_discount_status:openapi_discount_status() }
  | {'end_time', integer() }
  | {'external_id', binary() }
  | {'id', binary() }
  | {'platform_type', binary() }
  | {'promotion_code', binary() }
  | {'promotion_custom_id', binary() }
  | {'promotion_title', binary() }
  | {'promotion_type', openapi_promotion_type:openapi_promotion_type() }
  | {'start_time', integer() }
  | {'status', openapi_entity_status:openapi_entity_status() }
  | {'template_values', list(openapi_promotion_template_value:openapi_promotion_template_value()) }
  ].


openapi_promotion() ->
    openapi_promotion([]).

openapi_promotion(Fields) ->
  Default = [ {'ad_account_id', binary() }
            , {'discount_status', openapi_discount_status:openapi_discount_status() }
            , {'end_time', integer() }
            , {'external_id', binary() }
            , {'id', binary() }
            , {'platform_type', binary() }
            , {'promotion_code', binary() }
            , {'promotion_custom_id', binary() }
            , {'promotion_title', binary() }
            , {'promotion_type', openapi_promotion_type:openapi_promotion_type() }
            , {'start_time', integer() }
            , {'status', openapi_entity_status:openapi_entity_status() }
            , {'template_values', list(openapi_promotion_template_value:openapi_promotion_template_value(), 0, 2) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

