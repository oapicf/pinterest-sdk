-module(openapi_catalogs_hotel_attributes_all_of_main_image).

-export([encode/1]).

-export_type([openapi_catalogs_hotel_attributes_all_of_main_image/0]).

-type openapi_catalogs_hotel_attributes_all_of_main_image() ::
    #{ 'link' => binary(),
       'tag' => list()
     }.

encode(#{ 'link' := Link,
          'tag' := Tag
        }) ->
    #{ 'link' => Link,
       'tag' => Tag
     }.
