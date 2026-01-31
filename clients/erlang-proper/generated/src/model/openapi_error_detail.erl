-module(openapi_error_detail).

-include("openapi.hrl").

-export([openapi_error_detail/0]).

-export([openapi_error_detail/1]).

-export_type([openapi_error_detail/0]).

-type openapi_error_detail() ::
  [ {'count', integer() }
  | {'error_code', integer() }
  | {'message', binary() }
  ].


openapi_error_detail() ->
    openapi_error_detail([]).

openapi_error_detail(Fields) ->
  Default = [ {'count', integer() }
            , {'error_code', integer() }
            , {'message', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

