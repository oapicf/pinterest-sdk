-module(openapi_targeting_spec_operation_locale).

-include("openapi.hrl").

-export([openapi_targeting_spec_operation_locale/0]).

-export([openapi_targeting_spec_operation_locale/1]).

-export_type([openapi_targeting_spec_operation_locale/0]).

-type openapi_targeting_spec_operation_locale() ::
  [ {'field', binary() }
  | {'operation', openapi_targeting_spec_list_operation:openapi_targeting_spec_list_operation() }
  | {'values', list(binary()) }
  ].


openapi_targeting_spec_operation_locale() ->
    openapi_targeting_spec_operation_locale([]).

openapi_targeting_spec_operation_locale(Fields) ->
  Default = [ {'field', elements([<<"LOCALE">>]) }
            , {'operation', openapi_targeting_spec_list_operation:openapi_targeting_spec_list_operation() }
            , {'values', list(binary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

