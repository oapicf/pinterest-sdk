-module(openapi_pin).

-export([encode/1]).

-export_type([openapi_pin/0]).

-type openapi_pin() ::
    #{ 'id' => binary(),
       'created_at' => openapi_date_time:openapi_date_time(),
       'link' => binary(),
       'title' => binary(),
       'description' => binary(),
       'alt_text' => binary(),
       'board_id' => binary(),
       'board_section_id' => binary(),
       'board_owner' => openapi_board_owner:openapi_board_owner(),
       'media' => openapi_pin_media:openapi_pin_media(),
       'media_source' => openapi_pin_media_source:openapi_pin_media_source()
     }.

encode(#{ 'id' := Id,
          'created_at' := CreatedAt,
          'link' := Link,
          'title' := Title,
          'description' := Description,
          'alt_text' := AltText,
          'board_id' := BoardId,
          'board_section_id' := BoardSectionId,
          'board_owner' := BoardOwner,
          'media' := Media,
          'media_source' := MediaSource
        }) ->
    #{ 'id' => Id,
       'created_at' => CreatedAt,
       'link' => Link,
       'title' => Title,
       'description' => Description,
       'alt_text' => AltText,
       'board_id' => BoardId,
       'board_section_id' => BoardSectionId,
       'board_owner' => BoardOwner,
       'media' => Media,
       'media_source' => MediaSource
     }.
