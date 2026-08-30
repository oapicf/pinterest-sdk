-module(openapi_schedules_create_200_response_inner).

-include("openapi.hrl").

-export([openapi_schedules_create_200_response_inner/0]).

-export([openapi_schedules_create_200_response_inner/1]).

-export_type([openapi_schedules_create_200_response_inner/0]).

-type openapi_schedules_create_200_response_inner() ::
  [ {'data', openapi_schedules_create_200_response_inner_data:openapi_schedules_create_200_response_inner_data() }
  ].


openapi_schedules_create_200_response_inner() ->
    openapi_schedules_create_200_response_inner([]).

openapi_schedules_create_200_response_inner(Fields) ->
  Default = [ {'data', openapi_schedules_create_200_response_inner_data:openapi_schedules_create_200_response_inner_data() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

