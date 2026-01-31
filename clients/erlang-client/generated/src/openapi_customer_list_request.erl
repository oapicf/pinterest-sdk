-module(openapi_customer_list_request).

-export([encode/1]).

-export_type([openapi_customer_list_request/0]).

-type openapi_customer_list_request() ::
    #{ 'list_type' => openapi_user_list_type:openapi_user_list_type(),
       'name' := binary(),
       'records' := binary()
     }.

encode(#{ 'list_type' := ListType,
          'name' := Name,
          'records' := Records
        }) ->
    #{ 'list_type' => ListType,
       'name' => Name,
       'records' => Records
     }.
