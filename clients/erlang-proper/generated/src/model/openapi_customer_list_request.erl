-module(openapi_customer_list_request).

-include("openapi.hrl").

-export([openapi_customer_list_request/0]).

-export([openapi_customer_list_request/1]).

-export_type([openapi_customer_list_request/0]).

-type openapi_customer_list_request() ::
  [ {'name', binary() }
  | {'records', binary() }
  | {'list_type', openapi_user_list_type:openapi_user_list_type() }
  | {'exceptions', map() }
  ].


openapi_customer_list_request() ->
    openapi_customer_list_request([]).

openapi_customer_list_request(Fields) ->
  Default = [ {'name', binary() }
            , {'records', binary() }
            , {'list_type', openapi_user_list_type:openapi_user_list_type() }
            , {'exceptions', map() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

