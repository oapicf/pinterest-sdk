-module(openapi_ad_groups_create_200_response_items_inner).

-export([encode/1]).

-export_type([openapi_ad_groups_create_200_response_items_inner/0]).

-type openapi_ad_groups_create_200_response_items_inner() ::
    #{ 'data' => openapi_ad_group:openapi_ad_group(),
       'exceptions' => list()
     }.

encode(#{ 'data' := Data,
          'exceptions' := Exceptions
        }) ->
    #{ 'data' => Data,
       'exceptions' => Exceptions
     }.
