-module(openapi_customer_list_update_with_required_body).

-include("openapi.hrl").

-export([openapi_customer_list_update_with_required_body/0]).

-export([openapi_customer_list_update_with_required_body/1]).

-export_type([openapi_customer_list_update_with_required_body/0]).

-type openapi_customer_list_update_with_required_body() ::
  [ {'operation_type', openapi_user_list_operation_type:openapi_user_list_operation_type() }
  | {'records', binary() }
  | {'records_v2', list(openapi_customer_list_record_row:openapi_customer_list_record_row()) }
  ].


openapi_customer_list_update_with_required_body() ->
    openapi_customer_list_update_with_required_body([]).

openapi_customer_list_update_with_required_body(Fields) ->
  Default = [ {'operation_type', openapi_user_list_operation_type:openapi_user_list_operation_type() }
            , {'records', binary() }
            , {'records_v2', list(openapi_customer_list_record_row:openapi_customer_list_record_row()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

