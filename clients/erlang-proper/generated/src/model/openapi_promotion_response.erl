-module(openapi_promotion_response).

-include("openapi.hrl").

-export([openapi_promotion_response/0]).

-export([openapi_promotion_response/1]).

-export_type([openapi_promotion_response/0]).

-type openapi_promotion_response() ::
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
  | {'ad_account_id', binary() }
  | {'id', binary() }
  | {'status', openapi_entity_status:openapi_entity_status() }
  ].


openapi_promotion_response() ->
    openapi_promotion_response([]).

openapi_promotion_response(Fields) ->
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
            , {'ad_account_id', binary() }
            , {'id', binary() }
            , {'status', openapi_entity_status:openapi_entity_status() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

