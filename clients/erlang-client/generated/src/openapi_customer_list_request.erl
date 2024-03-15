-module(openapi_customer_list_request).

-export([encode/1]).

-export_type([openapi_customer_list_request/0]).

-type openapi_customer_list_request() ::
    #{ 'name' := binary(),
       'records' := binary(),
       'list_type' => openapi_user_list_type:openapi_user_list_type(),
       'exceptions' => maps:map()
     }.

encode(#{ 'name' := Name,
          'records' := Records,
          'list_type' := ListType,
          'exceptions' := Exceptions
        }) ->
    #{ 'name' => Name,
       'records' => Records,
       'list_type' => ListType,
       'exceptions' => Exceptions
     }.
