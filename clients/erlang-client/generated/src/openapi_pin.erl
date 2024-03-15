-module(openapi_pin).

-export([encode/1]).

-export_type([openapi_pin/0]).

-type openapi_pin() ::
    #{ 'id' => binary(),
       'created_at' => openapi_date_time:openapi_date_time(),
       'link' => binary(),
       'title' => binary(),
       'description' => binary(),
       'dominant_color' => binary(),
       'alt_text' => binary(),
       'creative_type' => openapi_creative_type:openapi_creative_type(),
       'board_id' => binary(),
       'board_section_id' => binary(),
       'board_owner' => openapi_board_owner:openapi_board_owner(),
       'is_owner' => boolean(),
       'media' => openapi_summary_pin_media:openapi_summary_pin_media(),
       'media_source' => openapi_pin_media_source:openapi_pin_media_source(),
       'parent_pin_id' => binary(),
       'is_standard' => boolean(),
       'has_been_promoted' => boolean(),
       'note' => binary(),
       'pin_metrics' => maps:map()
     }.

encode(#{ 'id' := Id,
          'created_at' := CreatedAt,
          'link' := Link,
          'title' := Title,
          'description' := Description,
          'dominant_color' := DominantColor,
          'alt_text' := AltText,
          'creative_type' := CreativeType,
          'board_id' := BoardId,
          'board_section_id' := BoardSectionId,
          'board_owner' := BoardOwner,
          'is_owner' := IsOwner,
          'media' := Media,
          'media_source' := MediaSource,
          'parent_pin_id' := ParentPinId,
          'is_standard' := IsStandard,
          'has_been_promoted' := HasBeenPromoted,
          'note' := Note,
          'pin_metrics' := PinMetrics
        }) ->
    #{ 'id' => Id,
       'created_at' => CreatedAt,
       'link' => Link,
       'title' => Title,
       'description' => Description,
       'dominant_color' => DominantColor,
       'alt_text' => AltText,
       'creative_type' => CreativeType,
       'board_id' => BoardId,
       'board_section_id' => BoardSectionId,
       'board_owner' => BoardOwner,
       'is_owner' => IsOwner,
       'media' => Media,
       'media_source' => MediaSource,
       'parent_pin_id' => ParentPinId,
       'is_standard' => IsStandard,
       'has_been_promoted' => HasBeenPromoted,
       'note' => Note,
       'pin_metrics' => PinMetrics
     }.
