-module(openapi_targeting_spec_operation_audience_exclude).

-include("openapi.hrl").

-export([openapi_targeting_spec_operation_audience_exclude/0]).

-export([openapi_targeting_spec_operation_audience_exclude/1]).

-export_type([openapi_targeting_spec_operation_audience_exclude/0]).

-type openapi_targeting_spec_operation_audience_exclude() ::
  [ {'field', binary() }
  | {'operation', openapi_targeting_spec_list_operation:openapi_targeting_spec_list_operation() }
  | {'values', list(binary()) }
  ].


openapi_targeting_spec_operation_audience_exclude() ->
    openapi_targeting_spec_operation_audience_exclude([]).

openapi_targeting_spec_operation_audience_exclude(Fields) ->
  Default = [ {'field', elements([<<"AUDIENCE_EXCLUDE">>]) }
            , {'operation', openapi_targeting_spec_list_operation:openapi_targeting_spec_list_operation() }
            , {'values', list(binary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

