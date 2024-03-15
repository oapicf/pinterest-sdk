-module(openapi_customer_list_update_request).

-include("openapi.hrl").

-export([openapi_customer_list_update_request/0]).

-export([openapi_customer_list_update_request/1]).

-export_type([openapi_customer_list_update_request/0]).

-type openapi_customer_list_update_request() ::
  [ {'records', binary() }
  | {'operation_type', openapi_user_list_operation_type:openapi_user_list_operation_type() }
  | {'exceptions', openapi_exception:openapi_exception() }
  ].


openapi_customer_list_update_request() ->
    openapi_customer_list_update_request([]).

openapi_customer_list_update_request(Fields) ->
  Default = [ {'records', binary() }
            , {'operation_type', openapi_user_list_operation_type:openapi_user_list_operation_type() }
            , {'exceptions', openapi_exception:openapi_exception() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

