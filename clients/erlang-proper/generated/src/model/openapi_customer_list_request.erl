-module(openapi_customer_list_request).

-include("openapi.hrl").

-export([openapi_customer_list_request/0]).

-export([openapi_customer_list_request/1]).

-export_type([openapi_customer_list_request/0]).

-type openapi_customer_list_request() ::
  [ {'list_type', openapi_user_list_type:openapi_user_list_type() }
  | {'name', binary() }
  | {'records', binary() }
  ].


openapi_customer_list_request() ->
    openapi_customer_list_request([]).

openapi_customer_list_request(Fields) ->
  Default = [ {'list_type', openapi_user_list_type:openapi_user_list_type() }
            , {'name', binary() }
            , {'records', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

