-module(openapi_integration_log_client_error).

-export([encode/1]).

-export_type([openapi_integration_log_client_error/0]).

-type openapi_integration_log_client_error() ::
    #{ 'cause' => binary(),
       'column_number' => integer(),
       'file_name' => binary(),
       'line_number' => integer(),
       'message' => binary(),
       'message_detail' => binary(),
       'name' => binary(),
       'number' => integer(),
       'stack_trace' => binary()
     }.

encode(#{ 'cause' := Cause,
          'column_number' := ColumnNumber,
          'file_name' := FileName,
          'line_number' := LineNumber,
          'message' := Message,
          'message_detail' := MessageDetail,
          'name' := Name,
          'number' := Number,
          'stack_trace' := StackTrace
        }) ->
    #{ 'cause' => Cause,
       'column_number' => ColumnNumber,
       'file_name' => FileName,
       'line_number' => LineNumber,
       'message' => Message,
       'message_detail' => MessageDetail,
       'name' => Name,
       'number' => Number,
       'stack_trace' => StackTrace
     }.
