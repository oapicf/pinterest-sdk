-module(openapi_all_of).

-export([encode/1]).

-export_type([openapi_all_of/0]).

-type openapi_all_of() ::
    #{ 'all_of' := list()
     }.

encode(#{ 'all_of' := AllOf
        }) ->
    #{ 'all_of' => AllOf
     }.
