-module(openapi_customer_list_upload_create_request).

-export([encode/1]).

-export_type([openapi_customer_list_upload_create_request/0]).

-type openapi_customer_list_upload_create_request() ::
    #{ 'operation' := openapi_user_list_operation_type:openapi_user_list_operation_type(),
       'total_parts' := integer()
     }.

encode(#{ 'operation' := Operation,
          'total_parts' := TotalParts
        }) ->
    #{ 'operation' => Operation,
       'total_parts' => TotalParts
     }.
