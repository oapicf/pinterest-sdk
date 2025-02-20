note
 description:"[
		Pinterest REST API
 		Pinterest's REST API
  		The version of the OpenAPI document: 5.14.0
 	    Contact: blah+oapicf@cliffano.com

  	NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

 		 Do not edit the class manually.
 	]"
	date: "$Date$"
	revision: "$Revision$"
	EIS:"Eiffel openapi generator", "src=https://openapi-generator.tech", "protocol=uri"
class PIN




feature --Access

    id: detachable STRING_32
      
    created_at: detachable DATE_TIME
      
    link: detachable STRING_32
      
    title: detachable STRING_32
      
    description: detachable STRING_32
      
    dominant_color: detachable STRING_32
      -- Dominant pin color. Hex number, e.g. \\\"#6E7874\\\".
    alt_text: detachable STRING_32
      
    creative_type: detachable CREATIVE_TYPE
      
    board_id: detachable STRING_32
      -- The board to which this Pin belongs.
    board_section_id: detachable STRING_32
      -- The board section to which this Pin belongs.
    board_owner: detachable BOARD_OWNER
      
    is_owner: BOOLEAN
      -- Whether the \"operation user_account\" is the Pin owner.
    media: detachable PIN_MEDIA
      
    media_source: detachable PIN_MEDIA_SOURCE
      
    parent_pin_id: detachable STRING_32
      -- The source pin id if this pin was saved from another pin. <a href=\"https://help.pinterest.com/article/save-pins-on-pinterest\">Learn more</a>.
    is_standard: BOOLEAN
      -- Whether the Pin is standard or not. See documentation on <a href=\"/docs/api-features/content-overview/\">Changes to Pin creation</a> for more information.
    has_been_promoted: BOOLEAN
      -- Whether the Pin has been promoted or not.
    var_note: detachable STRING_32
      -- Private note for this Pin. <a href=\"https://help.pinterest.com/en/article/add-notes-to-your-pins\">Learn more</a>.
    pin_metrics: detachable ANY
      -- Pin metrics with associated time intervals if any.

feature -- Change Element

    set_id (a_name: like id)
        -- Set 'id' with 'a_name'.
      do
        id := a_name
      ensure
        id_set: id = a_name
      end

    set_created_at (a_name: like created_at)
        -- Set 'created_at' with 'a_name'.
      do
        created_at := a_name
      ensure
        created_at_set: created_at = a_name
      end

    set_link (a_name: like link)
        -- Set 'link' with 'a_name'.
      do
        link := a_name
      ensure
        link_set: link = a_name
      end

    set_title (a_name: like title)
        -- Set 'title' with 'a_name'.
      do
        title := a_name
      ensure
        title_set: title = a_name
      end

    set_description (a_name: like description)
        -- Set 'description' with 'a_name'.
      do
        description := a_name
      ensure
        description_set: description = a_name
      end

    set_dominant_color (a_name: like dominant_color)
        -- Set 'dominant_color' with 'a_name'.
      do
        dominant_color := a_name
      ensure
        dominant_color_set: dominant_color = a_name
      end

    set_alt_text (a_name: like alt_text)
        -- Set 'alt_text' with 'a_name'.
      do
        alt_text := a_name
      ensure
        alt_text_set: alt_text = a_name
      end

    set_creative_type (a_name: like creative_type)
        -- Set 'creative_type' with 'a_name'.
      do
        creative_type := a_name
      ensure
        creative_type_set: creative_type = a_name
      end

    set_board_id (a_name: like board_id)
        -- Set 'board_id' with 'a_name'.
      do
        board_id := a_name
      ensure
        board_id_set: board_id = a_name
      end

    set_board_section_id (a_name: like board_section_id)
        -- Set 'board_section_id' with 'a_name'.
      do
        board_section_id := a_name
      ensure
        board_section_id_set: board_section_id = a_name
      end

    set_board_owner (a_name: like board_owner)
        -- Set 'board_owner' with 'a_name'.
      do
        board_owner := a_name
      ensure
        board_owner_set: board_owner = a_name
      end

    set_is_owner (a_name: like is_owner)
        -- Set 'is_owner' with 'a_name'.
      do
        is_owner := a_name
      ensure
        is_owner_set: is_owner = a_name
      end

    set_media (a_name: like media)
        -- Set 'media' with 'a_name'.
      do
        media := a_name
      ensure
        media_set: media = a_name
      end

    set_media_source (a_name: like media_source)
        -- Set 'media_source' with 'a_name'.
      do
        media_source := a_name
      ensure
        media_source_set: media_source = a_name
      end

    set_parent_pin_id (a_name: like parent_pin_id)
        -- Set 'parent_pin_id' with 'a_name'.
      do
        parent_pin_id := a_name
      ensure
        parent_pin_id_set: parent_pin_id = a_name
      end

    set_is_standard (a_name: like is_standard)
        -- Set 'is_standard' with 'a_name'.
      do
        is_standard := a_name
      ensure
        is_standard_set: is_standard = a_name
      end

    set_has_been_promoted (a_name: like has_been_promoted)
        -- Set 'has_been_promoted' with 'a_name'.
      do
        has_been_promoted := a_name
      ensure
        has_been_promoted_set: has_been_promoted = a_name
      end

    set_var_note (a_name: like var_note)
        -- Set 'var_note' with 'a_name'.
      do
        var_note := a_name
      ensure
        var_note_set: var_note = a_name
      end

    set_pin_metrics (a_name: like pin_metrics)
        -- Set 'pin_metrics' with 'a_name'.
      do
        pin_metrics := a_name
      ensure
        pin_metrics_set: pin_metrics = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass PIN%N")
        if attached id as l_id then
          Result.append ("%Nid:")
          Result.append (l_id.out)
          Result.append ("%N")
        end
        if attached created_at as l_created_at then
          Result.append ("%Ncreated_at:")
          Result.append (l_created_at.out)
          Result.append ("%N")
        end
        if attached link as l_link then
          Result.append ("%Nlink:")
          Result.append (l_link.out)
          Result.append ("%N")
        end
        if attached title as l_title then
          Result.append ("%Ntitle:")
          Result.append (l_title.out)
          Result.append ("%N")
        end
        if attached description as l_description then
          Result.append ("%Ndescription:")
          Result.append (l_description.out)
          Result.append ("%N")
        end
        if attached dominant_color as l_dominant_color then
          Result.append ("%Ndominant_color:")
          Result.append (l_dominant_color.out)
          Result.append ("%N")
        end
        if attached alt_text as l_alt_text then
          Result.append ("%Nalt_text:")
          Result.append (l_alt_text.out)
          Result.append ("%N")
        end
        if attached creative_type as l_creative_type then
          Result.append ("%Ncreative_type:")
          Result.append (l_creative_type.out)
          Result.append ("%N")
        end
        if attached board_id as l_board_id then
          Result.append ("%Nboard_id:")
          Result.append (l_board_id.out)
          Result.append ("%N")
        end
        if attached board_section_id as l_board_section_id then
          Result.append ("%Nboard_section_id:")
          Result.append (l_board_section_id.out)
          Result.append ("%N")
        end
        if attached board_owner as l_board_owner then
          Result.append ("%Nboard_owner:")
          Result.append (l_board_owner.out)
          Result.append ("%N")
        end
        if attached is_owner as l_is_owner then
          Result.append ("%Nis_owner:")
          Result.append (l_is_owner.out)
          Result.append ("%N")
        end
        if attached media as l_media then
          Result.append ("%Nmedia:")
          Result.append (l_media.out)
          Result.append ("%N")
        end
        if attached media_source as l_media_source then
          Result.append ("%Nmedia_source:")
          Result.append (l_media_source.out)
          Result.append ("%N")
        end
        if attached parent_pin_id as l_parent_pin_id then
          Result.append ("%Nparent_pin_id:")
          Result.append (l_parent_pin_id.out)
          Result.append ("%N")
        end
        if attached is_standard as l_is_standard then
          Result.append ("%Nis_standard:")
          Result.append (l_is_standard.out)
          Result.append ("%N")
        end
        if attached has_been_promoted as l_has_been_promoted then
          Result.append ("%Nhas_been_promoted:")
          Result.append (l_has_been_promoted.out)
          Result.append ("%N")
        end
        if attached var_note as l_var_note then
          Result.append ("%Nvar_note:")
          Result.append (l_var_note.out)
          Result.append ("%N")
        end
        if attached pin_metrics as l_pin_metrics then
          Result.append ("%Npin_metrics:")
          Result.append (l_pin_metrics.out)
          Result.append ("%N")
        end
      end
end

