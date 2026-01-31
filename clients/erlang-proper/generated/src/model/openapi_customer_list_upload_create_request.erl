-module(openapi_customer_list_upload_create_request).

-include("openapi.hrl").

-export([openapi_customer_list_upload_create_request/0]).

-export([openapi_customer_list_upload_create_request/1]).

-export_type([openapi_customer_list_upload_create_request/0]).

-type openapi_customer_list_upload_create_request() ::
  [ {'operation', openapi_user_list_operation_type:openapi_user_list_operation_type() }
  | {'total_parts', integer() }
  ].


openapi_customer_list_upload_create_request() ->
    openapi_customer_list_upload_create_request([]).

openapi_customer_list_upload_create_request(Fields) ->
  Default = [ {'operation', openapi_user_list_operation_type:openapi_user_list_operation_type() }
            , {'total_parts', integer(1, 10) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

