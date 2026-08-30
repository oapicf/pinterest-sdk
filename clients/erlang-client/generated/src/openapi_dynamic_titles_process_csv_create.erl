-module(openapi_dynamic_titles_process_csv_create).

-export([encode/1]).

-export_type([openapi_dynamic_titles_process_csv_create/0]).

-type openapi_dynamic_titles_process_csv_create() ::
    #{ 'request_id' := binary()
     }.

encode(#{ 'request_id' := RequestId
        }) ->
    #{ 'request_id' => RequestId
     }.
