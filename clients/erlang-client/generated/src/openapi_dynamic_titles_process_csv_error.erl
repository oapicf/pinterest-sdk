-module(openapi_dynamic_titles_process_csv_error).

-export([encode/1]).

-export_type([openapi_dynamic_titles_process_csv_error/0]).

-type openapi_dynamic_titles_process_csv_error() ::
    #{ 'error_type' => binary(),
       'row_number' => integer()
     }.

encode(#{ 'error_type' := ErrorType,
          'row_number' := RowNumber
        }) ->
    #{ 'error_type' => ErrorType,
       'row_number' => RowNumber
     }.
