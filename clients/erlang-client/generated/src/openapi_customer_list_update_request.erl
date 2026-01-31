-module(openapi_customer_list_update_request).

-export([encode/1]).

-export_type([openapi_customer_list_update_request/0]).

-type openapi_customer_list_update_request() ::
    #{ 'operation_type' := openapi_user_list_operation_type:openapi_user_list_operation_type(),
       'records' := binary()
     }.

encode(#{ 'operation_type' := OperationType,
          'records' := Records
        }) ->
    #{ 'operation_type' => OperationType,
       'records' => Records
     }.
