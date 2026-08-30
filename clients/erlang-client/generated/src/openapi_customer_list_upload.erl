-module(openapi_customer_list_upload).

-export([encode/1]).

-export_type([openapi_customer_list_upload/0]).

-type openapi_customer_list_upload() ::
    #{ 'ad_account_id' := binary(),
       'creation_time' := integer(),
       'customer_list_id' := binary(),
       'error_counts' => list(),
       'id' := binary(),
       'operation' := openapi_user_list_operation_type:openapi_user_list_operation_type(),
       'record_counts' => openapi_record_counts:openapi_record_counts(),
       'state' := openapi_workload_state:openapi_workload_state(),
       'updated_time' := integer()
     }.

encode(#{ 'ad_account_id' := AdAccountId,
          'creation_time' := CreationTime,
          'customer_list_id' := CustomerListId,
          'error_counts' := ErrorCounts,
          'id' := Id,
          'operation' := Operation,
          'record_counts' := RecordCounts,
          'state' := State,
          'updated_time' := UpdatedTime
        }) ->
    #{ 'ad_account_id' => AdAccountId,
       'creation_time' => CreationTime,
       'customer_list_id' => CustomerListId,
       'error_counts' => ErrorCounts,
       'id' => Id,
       'operation' => Operation,
       'record_counts' => RecordCounts,
       'state' => State,
       'updated_time' => UpdatedTime
     }.
