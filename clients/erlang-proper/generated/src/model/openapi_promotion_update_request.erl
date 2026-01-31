-module(openapi_promotion_update_request).

-include("openapi.hrl").

-export([openapi_promotion_update_request/0]).

-export([openapi_promotion_update_request/1]).

-export_type([openapi_promotion_update_request/0]).

-type openapi_promotion_update_request() ::
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
  | {'id', binary() }
  | {'status', openapi_entity_status:openapi_entity_status() }
  ].


openapi_promotion_update_request() ->
    openapi_promotion_update_request([]).

openapi_promotion_update_request(Fields) ->
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
            , {'id', binary() }
            , {'status', openapi_entity_status:openapi_entity_status() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

