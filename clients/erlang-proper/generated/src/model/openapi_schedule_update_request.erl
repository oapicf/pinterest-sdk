-module(openapi_schedule_update_request).

-include("openapi.hrl").

-export([openapi_schedule_update_request/0]).

-export([openapi_schedule_update_request/1]).

-export_type([openapi_schedule_update_request/0]).

-type openapi_schedule_update_request() ::
  [ {'entity_id', binary() }
  | {'entity_type', binary() }
  | {'id', binary() }
  | {'delta_value', openapi_schedule_common_delta_value:openapi_schedule_common_delta_value() }
  | {'end_timestamp', integer() }
  | {'name', binary() }
  | {'schedule_action', openapi_schedule_action:openapi_schedule_action() }
  | {'schedule_status', openapi_schedule_status:openapi_schedule_status() }
  | {'schedule_type', openapi_schedule_type:openapi_schedule_type() }
  | {'start_timestamp', integer() }
  ].


openapi_schedule_update_request() ->
    openapi_schedule_update_request([]).

openapi_schedule_update_request(Fields) ->
  Default = [ {'entity_id', binary() }
            , {'entity_type', binary() }
            , {'id', binary() }
            , {'delta_value', openapi_schedule_common_delta_value:openapi_schedule_common_delta_value() }
            , {'end_timestamp', integer() }
            , {'name', binary() }
            , {'schedule_action', openapi_schedule_action:openapi_schedule_action() }
            , {'schedule_status', openapi_schedule_status:openapi_schedule_status() }
            , {'schedule_type', openapi_schedule_type:openapi_schedule_type() }
            , {'start_timestamp', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

