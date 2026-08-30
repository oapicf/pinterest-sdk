-module(openapi_dynamic_titles_process_csv).

-export([encode/1]).

-export_type([openapi_dynamic_titles_process_csv/0]).

-type openapi_dynamic_titles_process_csv() ::
    #{ 'errors' => list(),
       'status' => binary()
     }.

encode(#{ 'errors' := Errors,
          'status' := Status
        }) ->
    #{ 'errors' => Errors,
       'status' => Status
     }.
