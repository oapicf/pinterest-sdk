-module(openapi_carousel_slot).

-export([encode/1]).

-export_type([openapi_carousel_slot/0]).

-type openapi_carousel_slot() ::
    #{ 'description' => binary(),
       'link' => binary(),
       'title' => binary()
     }.

encode(#{ 'description' := Description,
          'link' := Link,
          'title' := Title
        }) ->
    #{ 'description' => Description,
       'link' => Link,
       'title' => Title
     }.
