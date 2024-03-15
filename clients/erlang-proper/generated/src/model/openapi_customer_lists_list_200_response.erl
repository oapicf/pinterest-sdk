-module(openapi_customer_lists_list_200_response).

-include("openapi.hrl").

-export([openapi_customer_lists_list_200_response/0]).

-export([openapi_customer_lists_list_200_response/1]).

-export_type([openapi_customer_lists_list_200_response/0]).

-type openapi_customer_lists_list_200_response() ::
  [ {'items', list(openapi_customer_list:openapi_customer_list()) }
  | {'bookmark', binary() }
  ].


openapi_customer_lists_list_200_response() ->
    openapi_customer_lists_list_200_response([]).

openapi_customer_lists_list_200_response(Fields) ->
  Default = [ {'items', list(openapi_customer_list:openapi_customer_list()) }
            , {'bookmark', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

