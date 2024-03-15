-module(openapi_customer_list_update_request).

-export([encode/1]).

-export_type([openapi_customer_list_update_request/0]).

-type openapi_customer_list_update_request() ::
    #{ 'records' := binary(),
       'operation_type' := openapi_user_list_operation_type:openapi_user_list_operation_type(),
       'exceptions' => openapi_exception:openapi_exception()
     }.

encode(#{ 'records' := Records,
          'operation_type' := OperationType,
          'exceptions' := Exceptions
        }) ->
    #{ 'records' => Records,
       'operation_type' => OperationType,
       'exceptions' => Exceptions
     }.
