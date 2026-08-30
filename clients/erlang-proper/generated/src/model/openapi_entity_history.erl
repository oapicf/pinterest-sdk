-module(openapi_entity_history).

-include("openapi.hrl").

-export([openapi_entity_history/0]).

-export([openapi_entity_history/1]).

-export_type([openapi_entity_history/0]).

-type openapi_entity_history() ::
  [ {'change_timestamp', integer() }
  | {'data_changes', list(openapi_entity_data_change_history:openapi_entity_data_change_history()) }
  | {'entity_id', binary() }
  | {'entity_name', binary() }
  | {'ldap', binary() }
  | {'operation', openapi_change_history_operation_type:openapi_change_history_operation_type() }
  | {'user_id', binary() }
  ].


openapi_entity_history() ->
    openapi_entity_history([]).

openapi_entity_history(Fields) ->
  Default = [ {'change_timestamp', integer() }
            , {'data_changes', list(openapi_entity_data_change_history:openapi_entity_data_change_history()) }
            , {'entity_id', binary() }
            , {'entity_name', binary() }
            , {'ldap', binary() }
            , {'operation', openapi_change_history_operation_type:openapi_change_history_operation_type() }
            , {'user_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

