-module(openapi_promotion_common).

-include("openapi.hrl").

-export([openapi_promotion_common/0]).

-export([openapi_promotion_common/1]).

-export_type([openapi_promotion_common/0]).

-type openapi_promotion_common() ::
  [ {'discount_status', binary() }
  | {'end_time', integer() }
  | {'external_id', binary() }
  | {'platform_type', binary() }
  | {'promotion_code', binary() }
  | {'promotion_custom_id', binary() }
  | {'promotion_title', binary() }
  | {'promotion_type', openapi_promotion_type:openapi_promotion_type() }
  | {'start_time', integer() }
  | {'template_values', list(openapi_promotion_template_value:openapi_promotion_template_value()) }
  ].


openapi_promotion_common() ->
    openapi_promotion_common([]).

openapi_promotion_common(Fields) ->
  Default = [ {'discount_status', elements([<<"OTHER">>, <<"ACTIVE">>, <<"PAUSED">>, <<"SCHEDULED">>, <<"EXPIRED">>]) }
            , {'end_time', integer() }
            , {'external_id', binary() }
            , {'platform_type', binary() }
            , {'promotion_code', binary() }
            , {'promotion_custom_id', binary() }
            , {'promotion_title', binary() }
            , {'promotion_type', openapi_promotion_type:openapi_promotion_type() }
            , {'start_time', integer() }
            , {'template_values', list(openapi_promotion_template_value:openapi_promotion_template_value(), 0, 2) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

