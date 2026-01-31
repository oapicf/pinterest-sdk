-module(openapi_pin_create).

-export([encode/1]).

-export_type([openapi_pin_create/0]).

-type openapi_pin_create() ::
    #{ 'alt_text' => binary(),
       'board_id' => binary(),
       'board_section_id' => binary(),
       'description' => binary(),
       'dominant_color' => binary(),
       'link' => binary(),
       'media_source' => openapi_pin_media_source:openapi_pin_media_source(),
       'parent_pin_id' => binary(),
       'sponsor_id' => binary(),
       'title' => binary()
     }.

encode(#{ 'alt_text' := AltText,
          'board_id' := BoardId,
          'board_section_id' := BoardSectionId,
          'description' := Description,
          'dominant_color' := DominantColor,
          'link' := Link,
          'media_source' := MediaSource,
          'parent_pin_id' := ParentPinId,
          'sponsor_id' := SponsorId,
          'title' := Title
        }) ->
    #{ 'alt_text' => AltText,
       'board_id' => BoardId,
       'board_section_id' => BoardSectionId,
       'description' => Description,
       'dominant_color' => DominantColor,
       'link' => Link,
       'media_source' => MediaSource,
       'parent_pin_id' => ParentPinId,
       'sponsor_id' => SponsorId,
       'title' => Title
     }.
