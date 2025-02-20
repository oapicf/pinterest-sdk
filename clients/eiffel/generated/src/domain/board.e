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
class BOARD




feature --Access

    id: detachable STRING_32
      
    created_at: detachable DATE_TIME
      -- Date and time of board creation.
    board_pins_modified_at: detachable DATE_TIME
      -- Date and time of last board pins modified.
    name: detachable STRING_32
      
    description: detachable STRING_32
      
    collaborator_count: INTEGER_32
      -- Count of collaborators on the board.
    pin_count: INTEGER_32
      -- Count of pins on the board.
    follower_count: INTEGER_32
      -- Board follower count.
    media: detachable BOARD_MEDIA
      
    owner: detachable BOARD_OWNER
      
    privacy: detachable STRING_32
      -- Privacy setting for a board. Learn more about <a href=\"https://help.pinterest.com/en/article/secret-boards\">secret boards</a> and <a href=\"https://help.pinterest.com/en/business/article/protected-boards\">protected boards</a>

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

    set_board_pins_modified_at (a_name: like board_pins_modified_at)
        -- Set 'board_pins_modified_at' with 'a_name'.
      do
        board_pins_modified_at := a_name
      ensure
        board_pins_modified_at_set: board_pins_modified_at = a_name
      end

    set_name (a_name: like name)
        -- Set 'name' with 'a_name'.
      do
        name := a_name
      ensure
        name_set: name = a_name
      end

    set_description (a_name: like description)
        -- Set 'description' with 'a_name'.
      do
        description := a_name
      ensure
        description_set: description = a_name
      end

    set_collaborator_count (a_name: like collaborator_count)
        -- Set 'collaborator_count' with 'a_name'.
      do
        collaborator_count := a_name
      ensure
        collaborator_count_set: collaborator_count = a_name
      end

    set_pin_count (a_name: like pin_count)
        -- Set 'pin_count' with 'a_name'.
      do
        pin_count := a_name
      ensure
        pin_count_set: pin_count = a_name
      end

    set_follower_count (a_name: like follower_count)
        -- Set 'follower_count' with 'a_name'.
      do
        follower_count := a_name
      ensure
        follower_count_set: follower_count = a_name
      end

    set_media (a_name: like media)
        -- Set 'media' with 'a_name'.
      do
        media := a_name
      ensure
        media_set: media = a_name
      end

    set_owner (a_name: like owner)
        -- Set 'owner' with 'a_name'.
      do
        owner := a_name
      ensure
        owner_set: owner = a_name
      end

    set_privacy (a_name: like privacy)
        -- Set 'privacy' with 'a_name'.
      do
        privacy := a_name
      ensure
        privacy_set: privacy = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass BOARD%N")
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
        if attached board_pins_modified_at as l_board_pins_modified_at then
          Result.append ("%Nboard_pins_modified_at:")
          Result.append (l_board_pins_modified_at.out)
          Result.append ("%N")
        end
        if attached name as l_name then
          Result.append ("%Nname:")
          Result.append (l_name.out)
          Result.append ("%N")
        end
        if attached description as l_description then
          Result.append ("%Ndescription:")
          Result.append (l_description.out)
          Result.append ("%N")
        end
        if attached collaborator_count as l_collaborator_count then
          Result.append ("%Ncollaborator_count:")
          Result.append (l_collaborator_count.out)
          Result.append ("%N")
        end
        if attached pin_count as l_pin_count then
          Result.append ("%Npin_count:")
          Result.append (l_pin_count.out)
          Result.append ("%N")
        end
        if attached follower_count as l_follower_count then
          Result.append ("%Nfollower_count:")
          Result.append (l_follower_count.out)
          Result.append ("%N")
        end
        if attached media as l_media then
          Result.append ("%Nmedia:")
          Result.append (l_media.out)
          Result.append ("%N")
        end
        if attached owner as l_owner then
          Result.append ("%Nowner:")
          Result.append (l_owner.out)
          Result.append ("%N")
        end
        if attached privacy as l_privacy then
          Result.append ("%Nprivacy:")
          Result.append (l_privacy.out)
          Result.append ("%N")
        end
      end
end

