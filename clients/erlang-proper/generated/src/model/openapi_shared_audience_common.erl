-module(openapi_shared_audience_common).

-include("openapi.hrl").

-export([openapi_shared_audience_common/0]).

-export([openapi_shared_audience_common/1]).

-export_type([openapi_shared_audience_common/0]).

-type openapi_shared_audience_common() ::
  [ {'audience_id', binary() }
  | {'operation_type', openapi_operation_type:openapi_operation_type() }
  ].


openapi_shared_audience_common() ->
    openapi_shared_audience_common([]).

openapi_shared_audience_common(Fields) ->
  Default = [ {'audience_id', binary() }
            , {'operation_type', openapi_operation_type:openapi_operation_type() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

