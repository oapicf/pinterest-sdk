-module(openapi_pin).

-export([encode/1]).

-export_type([openapi_pin/0]).

-type openapi_pin() ::
    #{ 'ai_disclosures' => openapi_ai_disclosures:openapi_ai_disclosures(),
       'board_id' => binary(),
       'board_owner' => openapi_board_owner:openapi_board_owner(),
       'board_section_id' => binary(),
       'created_at' => openapi_date_time:openapi_date_time(),
       'creative_type' => openapi_creative_type:openapi_creative_type(),
       'dominant_color' => binary(),
       'has_been_promoted' => boolean(),
       'id' := binary(),
       'is_owner' => boolean(),
       'is_product' => boolean(),
       'is_standard' => boolean(),
       'media' => openapi_pin_media:openapi_pin_media(),
       'parent_pin_id' => binary(),
       'pin_metrics' => maps:map(),
       'alt_text' => binary(),
       'description' => binary(),
       'link' => binary(),
       'title' => binary()
     }.

encode(#{ 'ai_disclosures' := AiDisclosures,
          'board_id' := BoardId,
          'board_owner' := BoardOwner,
          'board_section_id' := BoardSectionId,
          'created_at' := CreatedAt,
          'creative_type' := CreativeType,
          'dominant_color' := DominantColor,
          'has_been_promoted' := HasBeenPromoted,
          'id' := Id,
          'is_owner' := IsOwner,
          'is_product' := IsProduct,
          'is_standard' := IsStandard,
          'media' := Media,
          'parent_pin_id' := ParentPinId,
          'pin_metrics' := PinMetrics,
          'alt_text' := AltText,
          'description' := Description,
          'link' := Link,
          'title' := Title
        }) ->
    #{ 'ai_disclosures' => AiDisclosures,
       'board_id' => BoardId,
       'board_owner' => BoardOwner,
       'board_section_id' => BoardSectionId,
       'created_at' => CreatedAt,
       'creative_type' => CreativeType,
       'dominant_color' => DominantColor,
       'has_been_promoted' => HasBeenPromoted,
       'id' => Id,
       'is_owner' => IsOwner,
       'is_product' => IsProduct,
       'is_standard' => IsStandard,
       'media' => Media,
       'parent_pin_id' => ParentPinId,
       'pin_metrics' => PinMetrics,
       'alt_text' => AltText,
       'description' => Description,
       'link' => Link,
       'title' => Title
     }.
