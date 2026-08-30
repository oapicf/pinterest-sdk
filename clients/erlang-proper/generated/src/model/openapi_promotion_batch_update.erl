-module(openapi_promotion_batch_update).

-include("openapi.hrl").

-export([openapi_promotion_batch_update/0]).

-export([openapi_promotion_batch_update/1]).

-export_type([openapi_promotion_batch_update/0]).

-type openapi_promotion_batch_update() ::
  [ {'discount_status', openapi_discount_status:openapi_discount_status() }
  | {'end_time', integer() }
  | {'external_id', binary() }
  | {'id', binary() }
  | {'platform_type', binary() }
  | {'promotion_code', binary() }
  | {'promotion_custom_id', binary() }
  | {'promotion_title', binary() }
  | {'promotion_type', openapi_promotion_type:openapi_promotion_type() }
  | {'start_time', integer() }
  | {'template_values', list(openapi_promotion_template_value:openapi_promotion_template_value()) }
  ].


openapi_promotion_batch_update() ->
    openapi_promotion_batch_update([]).

openapi_promotion_batch_update(Fields) ->
  Default = [ {'discount_status', openapi_discount_status:openapi_discount_status() }
            , {'end_time', integer() }
            , {'external_id', binary() }
            , {'id', binary() }
            , {'platform_type', binary() }
            , {'promotion_code', binary() }
            , {'promotion_custom_id', binary() }
            , {'promotion_title', binary() }
            , {'promotion_type', openapi_promotion_type:openapi_promotion_type() }
            , {'start_time', integer() }
            , {'template_values', list(openapi_promotion_template_value:openapi_promotion_template_value(), 0, 2) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

