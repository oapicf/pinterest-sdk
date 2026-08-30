-module(openapi_targeting_spec_operation_location).

-include("openapi.hrl").

-export([openapi_targeting_spec_operation_location/0]).

-export([openapi_targeting_spec_operation_location/1]).

-export_type([openapi_targeting_spec_operation_location/0]).

-type openapi_targeting_spec_operation_location() ::
  [ {'field', binary() }
  | {'operation', openapi_targeting_spec_list_operation:openapi_targeting_spec_list_operation() }
  | {'values', list(binary()) }
  ].


openapi_targeting_spec_operation_location() ->
    openapi_targeting_spec_operation_location([]).

openapi_targeting_spec_operation_location(Fields) ->
  Default = [ {'field', elements([<<"LOCATION">>]) }
            , {'operation', openapi_targeting_spec_list_operation:openapi_targeting_spec_list_operation() }
            , {'values', list(binary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

