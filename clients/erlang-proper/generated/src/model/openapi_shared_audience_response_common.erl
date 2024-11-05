-module(openapi_shared_audience_response_common).

-include("openapi.hrl").

-export([openapi_shared_audience_response_common/0]).

-export([openapi_shared_audience_response_common/1]).

-export_type([openapi_shared_audience_response_common/0]).

-type openapi_shared_audience_response_common() ::
  [ {'audience_id', binary() }
  | {'permissions', list(openapi_role:openapi_role()) }
  ].


openapi_shared_audience_response_common() ->
    openapi_shared_audience_response_common([]).

openapi_shared_audience_response_common(Fields) ->
  Default = [ {'audience_id', binary() }
            , {'permissions', list(openapi_role:openapi_role()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

