-module(openapi_customer_list_update_with_required_body).

-export([encode/1]).

-export_type([openapi_customer_list_update_with_required_body/0]).

-type openapi_customer_list_update_with_required_body() ::
    #{ 'operation_type' := openapi_user_list_operation_type:openapi_user_list_operation_type(),
       'records' => binary(),
       'records_v2' => list()
     }.

encode(#{ 'operation_type' := OperationType,
          'records' := Records,
          'records_v2' := RecordsV2
        }) ->
    #{ 'operation_type' => OperationType,
       'records' => Records,
       'records_v2' => RecordsV2
     }.
