-module(openapi_pin_update).

-export([encode/1]).

-export_type([openapi_pin_update/0]).

-type openapi_pin_update() ::
    #{ 'ai_disclosures' => openapi_ai_disclosures_update:openapi_ai_disclosures_update(),
       'alt_text' => binary(),
       'board_id' => binary(),
       'board_section_id' => binary(),
       'carousel_slots' => list(),
       'description' => binary(),
       'link' => binary(),
       'title' => binary()
     }.

encode(#{ 'ai_disclosures' := AiDisclosures,
          'alt_text' := AltText,
          'board_id' := BoardId,
          'board_section_id' := BoardSectionId,
          'carousel_slots' := CarouselSlots,
          'description' := Description,
          'link' := Link,
          'title' := Title
        }) ->
    #{ 'ai_disclosures' => AiDisclosures,
       'alt_text' => AltText,
       'board_id' => BoardId,
       'board_section_id' => BoardSectionId,
       'carousel_slots' => CarouselSlots,
       'description' => Description,
       'link' => Link,
       'title' => Title
     }.
