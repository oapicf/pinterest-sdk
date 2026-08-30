-module(openapi_targeting_spec_operation_interest).

-include("openapi.hrl").

-export([openapi_targeting_spec_operation_interest/0]).

-export([openapi_targeting_spec_operation_interest/1]).

-export_type([openapi_targeting_spec_operation_interest/0]).

-type openapi_targeting_spec_operation_interest() ::
  [ {'field', binary() }
  | {'operation', openapi_targeting_spec_list_operation:openapi_targeting_spec_list_operation() }
  | {'values', list(binary()) }
  ].


openapi_targeting_spec_operation_interest() ->
    openapi_targeting_spec_operation_interest([]).

openapi_targeting_spec_operation_interest(Fields) ->
  Default = [ {'field', elements([<<"INTEREST">>]) }
            , {'operation', openapi_targeting_spec_list_operation:openapi_targeting_spec_list_operation() }
            , {'values', list(binary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

