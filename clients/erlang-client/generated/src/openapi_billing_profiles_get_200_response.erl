-module(openapi_billing_profiles_get_200_response).

-export([encode/1]).

-export_type([openapi_billing_profiles_get_200_response/0]).

-type openapi_billing_profiles_get_200_response() ::
    #{ 'bookmark' => binary(),
       'items' := list()
     }.

encode(#{ 'bookmark' := Bookmark,
          'items' := Items
        }) ->
    #{ 'bookmark' => Bookmark,
       'items' => Items
     }.
