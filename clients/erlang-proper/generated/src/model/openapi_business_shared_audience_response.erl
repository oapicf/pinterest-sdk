-module(openapi_business_shared_audience_response).

-include("openapi.hrl").

-export([openapi_business_shared_audience_response/0]).

-export([openapi_business_shared_audience_response/1]).

-export_type([openapi_business_shared_audience_response/0]).

-type openapi_business_shared_audience_response() ::
  [ {'audience_id', binary() }
  | {'permissions', list(openapi_role:openapi_role()) }
  | {'recipient_business_ids', list(binary()) }
  ].


openapi_business_shared_audience_response() ->
    openapi_business_shared_audience_response([]).

openapi_business_shared_audience_response(Fields) ->
  Default = [ {'audience_id', binary() }
            , {'permissions', list(openapi_role:openapi_role()) }
            , {'recipient_business_ids', list(binary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

