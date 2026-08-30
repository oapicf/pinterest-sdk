-module(openapi_customer_segment_list_200_response).

-include("openapi.hrl").

-export([openapi_customer_segment_list_200_response/0]).

-export([openapi_customer_segment_list_200_response/1]).

-export_type([openapi_customer_segment_list_200_response/0]).

-type openapi_customer_segment_list_200_response() ::
  [ {'bookmark', binary() }
  | {'items', list(openapi_customer_segment:openapi_customer_segment()) }
  ].


openapi_customer_segment_list_200_response() ->
    openapi_customer_segment_list_200_response([]).

openapi_customer_segment_list_200_response(Fields) ->
  Default = [ {'bookmark', binary() }
            , {'items', list(openapi_customer_segment:openapi_customer_segment()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

