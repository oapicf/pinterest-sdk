-module(openapi_customer_list).

-export([encode/1]).

-export_type([openapi_customer_list/0]).

-type openapi_customer_list() ::
    #{ 'ad_account_id' => binary(),
       'created_time' => integer(),
       'exceptions' => maps:map(),
       'id' => binary(),
       'name' => binary(),
       'num_batches' => integer(),
       'num_removed_user_records' => integer(),
       'num_uploaded_user_records' => integer(),
       'status' => binary(),
       'type' => binary(),
       'updated_time' => integer()
     }.

encode(#{ 'ad_account_id' := AdAccountId,
          'created_time' := CreatedTime,
          'exceptions' := Exceptions,
          'id' := Id,
          'name' := Name,
          'num_batches' := NumBatches,
          'num_removed_user_records' := NumRemovedUserRecords,
          'num_uploaded_user_records' := NumUploadedUserRecords,
          'status' := Status,
          'type' := Type,
          'updated_time' := UpdatedTime
        }) ->
    #{ 'ad_account_id' => AdAccountId,
       'created_time' => CreatedTime,
       'exceptions' => Exceptions,
       'id' => Id,
       'name' => Name,
       'num_batches' => NumBatches,
       'num_removed_user_records' => NumRemovedUserRecords,
       'num_uploaded_user_records' => NumUploadedUserRecords,
       'status' => Status,
       'type' => Type,
       'updated_time' => UpdatedTime
     }.
