-module(openapi_conversion_deletion_request).

-export([encode/1]).

-export_type([openapi_conversion_deletion_request/0]).

-type openapi_conversion_deletion_request() ::
    #{ 'created_time' := calendar:date(),
       'processed_time' => calendar:date(),
       'request_id' := binary(),
       'status' := openapi_conversion_deletion_request_status:openapi_conversion_deletion_request_status()
     }.

encode(#{ 'created_time' := CreatedTime,
          'processed_time' := ProcessedTime,
          'request_id' := RequestId,
          'status' := Status
        }) ->
    #{ 'created_time' => CreatedTime,
       'processed_time' => ProcessedTime,
       'request_id' => RequestId,
       'status' => Status
     }.
