-module(openapi_total_count_by_entity_status).

-include("openapi.hrl").

-export([openapi_total_count_by_entity_status/0]).

-export([openapi_total_count_by_entity_status/1]).

-export_type([openapi_total_count_by_entity_status/0]).

-type openapi_total_count_by_entity_status() ::
  [ {'ACTIVE', integer() }
  | {'ARCHIVED', integer() }
  | {'PAUSED', integer() }
  ].


openapi_total_count_by_entity_status() ->
    openapi_total_count_by_entity_status([]).

openapi_total_count_by_entity_status(Fields) ->
  Default = [ {'ACTIVE', integer() }
            , {'ARCHIVED', integer() }
            , {'PAUSED', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

