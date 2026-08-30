-module(openapi_entity_data_change_history).

-include("openapi.hrl").

-export([openapi_entity_data_change_history/0]).

-export([openapi_entity_data_change_history/1]).

-export_type([openapi_entity_data_change_history/0]).

-type openapi_entity_data_change_history() ::
  [ {'changed_field_id', binary() }
  | {'changed_field_name', binary() }
  | {'data_type', openapi_change_history_data_type:openapi_change_history_data_type() }
  | {'new_data_value', binary() }
  | {'old_data_value', binary() }
  ].


openapi_entity_data_change_history() ->
    openapi_entity_data_change_history([]).

openapi_entity_data_change_history(Fields) ->
  Default = [ {'changed_field_id', binary() }
            , {'changed_field_name', binary() }
            , {'data_type', openapi_change_history_data_type:openapi_change_history_data_type() }
            , {'new_data_value', binary() }
            , {'old_data_value', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

