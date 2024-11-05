-module(openapi_business_access_error).

-include("openapi.hrl").

-export([openapi_business_access_error/0]).

-export([openapi_business_access_error/1]).

-export_type([openapi_business_access_error/0]).

-type openapi_business_access_error() ::
  [ {'code', integer() }
  | {'message', binary() }
  ].


openapi_business_access_error() ->
    openapi_business_access_error([]).

openapi_business_access_error(Fields) ->
  Default = [ {'code', integer() }
            , {'message', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

