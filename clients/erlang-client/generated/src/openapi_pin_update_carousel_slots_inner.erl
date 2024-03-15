-module(openapi_pin_update_carousel_slots_inner).

-export([encode/1]).

-export_type([openapi_pin_update_carousel_slots_inner/0]).

-type openapi_pin_update_carousel_slots_inner() ::
    #{ 'title' => binary(),
       'description' => binary(),
       'link' => binary()
     }.

encode(#{ 'title' := Title,
          'description' := Description,
          'link' := Link
        }) ->
    #{ 'title' => Title,
       'description' => Description,
       'link' => Link
     }.
