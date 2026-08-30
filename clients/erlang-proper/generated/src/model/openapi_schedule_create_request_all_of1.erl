-module(openapi_schedule_create_request_all_of1).

-include("openapi.hrl").

-export([openapi_schedule_create_request_all_of1/0]).

-export([openapi_schedule_create_request_all_of1/1]).

-export_type([openapi_schedule_create_request_all_of1/0]).

-type openapi_schedule_create_request_all_of1() ::
  [ {'entity_id', binary() }
  | {'entity_type', binary() }
  ].


openapi_schedule_create_request_all_of1() ->
    openapi_schedule_create_request_all_of1([]).

openapi_schedule_create_request_all_of1(Fields) ->
  Default = [ {'entity_id', binary() }
            , {'entity_type', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

