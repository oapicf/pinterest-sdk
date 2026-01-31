-module(openapi_targeting_spec_operation_list).

-include("openapi.hrl").

-export([openapi_targeting_spec_operation_list/0]).

-export([openapi_targeting_spec_operation_list/1]).

-export_type([openapi_targeting_spec_operation_list/0]).

-type openapi_targeting_spec_operation_list() ::
  [ {'field', binary() }
  | {'operation', binary() }
  | {'values', list(binary()) }
  ].


openapi_targeting_spec_operation_list() ->
    openapi_targeting_spec_operation_list([]).

openapi_targeting_spec_operation_list(Fields) ->
  Default = [ {'field', binary() }
            , {'operation', elements([<<"SET">>, <<"ADD">>, <<"REMOVE">>]) }
            , {'values', list(binary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

