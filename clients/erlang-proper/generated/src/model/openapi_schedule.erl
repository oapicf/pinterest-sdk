-module(openapi_schedule).

-include("openapi.hrl").

-export([openapi_schedule/0]).

-export([openapi_schedule/1]).

-export_type([openapi_schedule/0]).

-type openapi_schedule() ::
  [ {'delta_value', openapi_schedule_delta_value:openapi_schedule_delta_value() }
  | {'end_timestamp', integer() }
  | {'entity_id', binary() }
  | {'entity_type', openapi_ad_account_entity_type:openapi_ad_account_entity_type() }
  | {'name', binary() }
  | {'schedule_action', openapi_schedule_action:openapi_schedule_action() }
  | {'schedule_id', binary() }
  | {'schedule_status', openapi_schedule_status:openapi_schedule_status() }
  | {'schedule_type', openapi_schedule_type:openapi_schedule_type() }
  | {'start_timestamp', integer() }
  ].


openapi_schedule() ->
    openapi_schedule([]).

openapi_schedule(Fields) ->
  Default = [ {'delta_value', openapi_schedule_delta_value:openapi_schedule_delta_value() }
            , {'end_timestamp', integer() }
            , {'entity_id', binary() }
            , {'entity_type', openapi_ad_account_entity_type:openapi_ad_account_entity_type() }
            , {'name', binary() }
            , {'schedule_action', openapi_schedule_action:openapi_schedule_action() }
            , {'schedule_id', binary() }
            , {'schedule_status', openapi_schedule_status:openapi_schedule_status() }
            , {'schedule_type', openapi_schedule_type:openapi_schedule_type() }
            , {'start_timestamp', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

