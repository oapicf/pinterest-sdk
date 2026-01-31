-module(openapi_targeting_spec_operation_string).

-include("openapi.hrl").

-export([openapi_targeting_spec_operation_string/0]).

-export([openapi_targeting_spec_operation_string/1]).

-export_type([openapi_targeting_spec_operation_string/0]).

-type openapi_targeting_spec_operation_string() ::
  [ {'field', binary() }
  | {'operation', binary() }
  | {'value', binary() }
  ].


openapi_targeting_spec_operation_string() ->
    openapi_targeting_spec_operation_string([]).

openapi_targeting_spec_operation_string(Fields) ->
  Default = [ {'field', binary() }
            , {'operation', elements([<<"SET">>]) }
            , {'value', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

