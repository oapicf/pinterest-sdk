-module(openapi_shared_audiences_for_business_list_200_response).

-include("openapi.hrl").

-export([openapi_shared_audiences_for_business_list_200_response/0]).

-export([openapi_shared_audiences_for_business_list_200_response/1]).

-export_type([openapi_shared_audiences_for_business_list_200_response/0]).

-type openapi_shared_audiences_for_business_list_200_response() ::
  [ {'bookmark', binary() }
  | {'items', list(openapi_audience:openapi_audience()) }
  ].


openapi_shared_audiences_for_business_list_200_response() ->
    openapi_shared_audiences_for_business_list_200_response([]).

openapi_shared_audiences_for_business_list_200_response(Fields) ->
  Default = [ {'bookmark', binary() }
            , {'items', list(openapi_audience:openapi_audience()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

