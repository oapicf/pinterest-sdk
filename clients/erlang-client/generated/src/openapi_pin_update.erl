-module(openapi_pin_update).

-export([encode/1]).

-export_type([openapi_pin_update/0]).

-type openapi_pin_update() ::
    #{ 'alt_text' => binary(),
       'board_id' => binary(),
       'board_section_id' => binary(),
       'description' => binary(),
       'link' => binary(),
       'title' => binary(),
       'carousel_slots' => list(),
       'note' => binary()
     }.

encode(#{ 'alt_text' := AltText,
          'board_id' := BoardId,
          'board_section_id' := BoardSectionId,
          'description' := Description,
          'link' := Link,
          'title' := Title,
          'carousel_slots' := CarouselSlots,
          'note' := Note
        }) ->
    #{ 'alt_text' => AltText,
       'board_id' => BoardId,
       'board_section_id' => BoardSectionId,
       'description' => Description,
       'link' => Link,
       'title' => Title,
       'carousel_slots' => CarouselSlots,
       'note' => Note
     }.
