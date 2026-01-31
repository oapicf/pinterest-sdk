-module(openapi_targeting_type_filter).

-include("openapi.hrl").

-export([openapi_targeting_type_filter/0]).

-export([openapi_targeting_type_filter/1]).

-export_type([openapi_targeting_type_filter/0]).

-type openapi_targeting_type_filter() ::
  [ {'targeting_types', list(binary()) }
  ].


openapi_targeting_type_filter() ->
    openapi_targeting_type_filter([]).

openapi_targeting_type_filter(Fields) ->
  Default = [ {'targeting_types', list(binary(), 1, 5) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

