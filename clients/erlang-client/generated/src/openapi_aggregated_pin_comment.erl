-module(openapi_aggregated_pin_comment).

-export([encode/1]).

-export_type([openapi_aggregated_pin_comment/0]).

-type openapi_aggregated_pin_comment() ::
    #{ 'ai_disclosures' => openapi_ai_disclosures:openapi_ai_disclosures(),
       'alt_text' => binary(),
       'board_id' => binary(),
       'board_owner' => openapi_board_owner:openapi_board_owner(),
       'board_section_id' => binary(),
       'created_at' => openapi_date_time:openapi_date_time(),
       'creative_type' => openapi_creative_type:openapi_creative_type(),
       'description' => binary(),
       'dominant_color' => binary(),
       'has_been_promoted' => boolean(),
       'id' := binary(),
       'is_owner' => boolean(),
       'is_product' => boolean(),
       'is_standard' => boolean(),
       'link' => binary(),
       'media' => openapi_pin_media:openapi_pin_media(),
       'parent_pin_id' => binary(),
       'pin_metrics' => maps:map(),
       'title' => binary()
     }.

encode(#{ 'ai_disclosures' := AiDisclosures,
          'alt_text' := AltText,
          'board_id' := BoardId,
          'board_owner' := BoardOwner,
          'board_section_id' := BoardSectionId,
          'created_at' := CreatedAt,
          'creative_type' := CreativeType,
          'description' := Description,
          'dominant_color' := DominantColor,
          'has_been_promoted' := HasBeenPromoted,
          'id' := Id,
          'is_owner' := IsOwner,
          'is_product' := IsProduct,
          'is_standard' := IsStandard,
          'link' := Link,
          'media' := Media,
          'parent_pin_id' := ParentPinId,
          'pin_metrics' := PinMetrics,
          'title' := Title
        }) ->
    #{ 'ai_disclosures' => AiDisclosures,
       'alt_text' => AltText,
       'board_id' => BoardId,
       'board_owner' => BoardOwner,
       'board_section_id' => BoardSectionId,
       'created_at' => CreatedAt,
       'creative_type' => CreativeType,
       'description' => Description,
       'dominant_color' => DominantColor,
       'has_been_promoted' => HasBeenPromoted,
       'id' => Id,
       'is_owner' => IsOwner,
       'is_product' => IsProduct,
       'is_standard' => IsStandard,
       'link' => Link,
       'media' => Media,
       'parent_pin_id' => ParentPinId,
       'pin_metrics' => PinMetrics,
       'title' => Title
     }.
