-module(openapi_customer_list_update_request).

-include("openapi.hrl").

-export([openapi_customer_list_update_request/0]).

-export([openapi_customer_list_update_request/1]).

-export_type([openapi_customer_list_update_request/0]).

-type openapi_customer_list_update_request() ::
  [ {'operation_type', openapi_user_list_operation_type:openapi_user_list_operation_type() }
  | {'records', binary() }
  ].


openapi_customer_list_update_request() ->
    openapi_customer_list_update_request([]).

openapi_customer_list_update_request(Fields) ->
  Default = [ {'operation_type', openapi_user_list_operation_type:openapi_user_list_operation_type() }
            , {'records', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

