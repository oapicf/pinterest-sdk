-module(openapi_customer_list_create).

-export([encode/1]).

-export_type([openapi_customer_list_create/0]).

-type openapi_customer_list_create() ::
    #{ 'is_nca' => boolean(),
       'list_type' => openapi_user_list_type:openapi_user_list_type(),
       'name' := binary(),
       'records' => binary(),
       'records_v2' => list()
     }.

encode(#{ 'is_nca' := IsNca,
          'list_type' := ListType,
          'name' := Name,
          'records' := Records,
          'records_v2' := RecordsV2
        }) ->
    #{ 'is_nca' => IsNca,
       'list_type' => ListType,
       'name' => Name,
       'records' => Records,
       'records_v2' => RecordsV2
     }.
