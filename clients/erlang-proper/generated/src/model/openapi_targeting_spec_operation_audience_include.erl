-module(openapi_targeting_spec_operation_audience_include).

-include("openapi.hrl").

-export([openapi_targeting_spec_operation_audience_include/0]).

-export([openapi_targeting_spec_operation_audience_include/1]).

-export_type([openapi_targeting_spec_operation_audience_include/0]).

-type openapi_targeting_spec_operation_audience_include() ::
  [ {'field', binary() }
  | {'operation', openapi_targeting_spec_list_operation:openapi_targeting_spec_list_operation() }
  | {'values', list(binary()) }
  ].


openapi_targeting_spec_operation_audience_include() ->
    openapi_targeting_spec_operation_audience_include([]).

openapi_targeting_spec_operation_audience_include(Fields) ->
  Default = [ {'field', elements([<<"AUDIENCE_INCLUDE">>]) }
            , {'operation', openapi_targeting_spec_list_operation:openapi_targeting_spec_list_operation() }
            , {'values', list(binary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

