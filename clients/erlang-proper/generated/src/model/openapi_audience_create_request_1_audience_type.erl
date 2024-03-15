-module(openapi_audience_create_request_1_audience_type).

-include("openapi.hrl").

-export([openapi_audience_create_request_1_audience_type/0]).

-export([openapi_audience_create_request_1_audience_type/1]).

-export_type([openapi_audience_create_request_1_audience_type/0]).

-type openapi_audience_create_request_1_audience_type() ::
  [ 
  ].


openapi_audience_create_request_1_audience_type() ->
    openapi_audience_create_request_1_audience_type([]).

openapi_audience_create_request_1_audience_type(Fields) ->
  Default = [ 
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

