-module(openapi_targeting_spec_operation_geo).

-include("openapi.hrl").

-export([openapi_targeting_spec_operation_geo/0]).

-export([openapi_targeting_spec_operation_geo/1]).

-export_type([openapi_targeting_spec_operation_geo/0]).

-type openapi_targeting_spec_operation_geo() ::
  [ {'field', binary() }
  | {'operation', openapi_targeting_spec_list_operation:openapi_targeting_spec_list_operation() }
  | {'values', list(binary()) }
  ].


openapi_targeting_spec_operation_geo() ->
    openapi_targeting_spec_operation_geo([]).

openapi_targeting_spec_operation_geo(Fields) ->
  Default = [ {'field', elements([<<"GEO">>]) }
            , {'operation', openapi_targeting_spec_list_operation:openapi_targeting_spec_list_operation() }
            , {'values', list(binary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

