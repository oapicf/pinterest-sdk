-module(openapi_schedule_batch_update).

-include("openapi.hrl").

-export([openapi_schedule_batch_update/0]).

-export([openapi_schedule_batch_update/1]).

-export_type([openapi_schedule_batch_update/0]).

-type openapi_schedule_batch_update() ::
  [ {'delta_value', openapi_schedule_delta_value:openapi_schedule_delta_value() }
  | {'end_timestamp', integer() }
  | {'entity_id', binary() }
  | {'entity_type', openapi_ad_account_entity_type:openapi_ad_account_entity_type() }
  | {'id', binary() }
  | {'name', binary() }
  | {'schedule_action', openapi_schedule_action:openapi_schedule_action() }
  | {'schedule_id', binary() }
  | {'schedule_status', openapi_schedule_status:openapi_schedule_status() }
  | {'schedule_type', openapi_schedule_type:openapi_schedule_type() }
  | {'start_timestamp', integer() }
  ].


openapi_schedule_batch_update() ->
    openapi_schedule_batch_update([]).

openapi_schedule_batch_update(Fields) ->
  Default = [ {'delta_value', openapi_schedule_delta_value:openapi_schedule_delta_value() }
            , {'end_timestamp', integer() }
            , {'entity_id', binary() }
            , {'entity_type', openapi_ad_account_entity_type:openapi_ad_account_entity_type() }
            , {'id', binary() }
            , {'name', binary() }
            , {'schedule_action', openapi_schedule_action:openapi_schedule_action() }
            , {'schedule_id', binary() }
            , {'schedule_status', openapi_schedule_status:openapi_schedule_status() }
            , {'schedule_type', openapi_schedule_type:openapi_schedule_type() }
            , {'start_timestamp', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

