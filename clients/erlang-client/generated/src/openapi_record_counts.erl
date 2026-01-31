-module(openapi_record_counts).

-export([encode/1]).

-export_type([openapi_record_counts/0]).

-type openapi_record_counts() ::
    #{ 'invalid' := integer(),
       'processed' := integer(),
       'valid' := integer()
     }.

encode(#{ 'invalid' := Invalid,
          'processed' := Processed,
          'valid' := Valid
        }) ->
    #{ 'invalid' => Invalid,
       'processed' => Processed,
       'valid' => Valid
     }.
