-module(openapi_catalogs_local_stores_create_200_response_inner_data_one_of).

-export([encode/1]).

-export_type([openapi_catalogs_local_stores_create_200_response_inner_data_one_of/0]).

-type openapi_catalogs_local_stores_create_200_response_inner_data_one_of() ::
    #{ 'id' := binary(),
       'exceptions' := openapi_pinterest_lib_error:openapi_pinterest_lib_error()
     }.

encode(#{ 'id' := Id,
          'exceptions' := Exceptions
        }) ->
    #{ 'id' => Id,
       'exceptions' => Exceptions
     }.
