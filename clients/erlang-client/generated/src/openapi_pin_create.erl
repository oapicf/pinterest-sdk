-module(openapi_pin_create).

-export([encode/1]).

-export_type([openapi_pin_create/0]).

-type openapi_pin_create() ::
    #{ 'id' => binary(),
       'created_at' => openapi_date_time:openapi_date_time(),
       'link' => binary(),
       'title' => binary(),
       'description' => binary(),
       'dominant_color' => binary(),
       'alt_text' => binary(),
       'board_id' => binary(),
       'board_section_id' => binary(),
       'board_owner' => openapi_board_owner:openapi_board_owner(),
       'media' => openapi_pin_media:openapi_pin_media(),
       'media_source' => openapi_pin_media_source:openapi_pin_media_source(),
       'parent_pin_id' => binary(),
       'note' => binary()
     }.

encode(#{ 'id' := Id,
          'created_at' := CreatedAt,
          'link' := Link,
          'title' := Title,
          'description' := Description,
          'dominant_color' := DominantColor,
          'alt_text' := AltText,
          'board_id' := BoardId,
          'board_section_id' := BoardSectionId,
          'board_owner' := BoardOwner,
          'media' := Media,
          'media_source' := MediaSource,
          'parent_pin_id' := ParentPinId,
          'note' := Note
        }) ->
    #{ 'id' => Id,
       'created_at' => CreatedAt,
       'link' => Link,
       'title' => Title,
       'description' => Description,
       'dominant_color' => DominantColor,
       'alt_text' => AltText,
       'board_id' => BoardId,
       'board_section_id' => BoardSectionId,
       'board_owner' => BoardOwner,
       'media' => Media,
       'media_source' => MediaSource,
       'parent_pin_id' => ParentPinId,
       'note' => Note
     }.
