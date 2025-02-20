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
class UPDATE_ASSET_GROUP_BODY_ASSET_GROUPS_TO_UPDATE_INNER




feature --Access

    asset_group_id: detachable STRING_32
      -- Unique identifier of the asset group to update.
    name: detachable STRING_32
      -- Asset Group name
    description: detachable STRING_32
      -- Asset group description
    asset_group_types: detachable LIST [ASSET_GROUP_TYPE]
      -- Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.
    assets_to_add: detachable LIST [STRING_32]
      -- A list of asset ids to add to the asset group.
    assets_to_remove: detachable LIST [STRING_32]
      -- A list of asset ids to remove from the asset group.

feature -- Change Element

    set_asset_group_id (a_name: like asset_group_id)
        -- Set 'asset_group_id' with 'a_name'.
      do
        asset_group_id := a_name
      ensure
        asset_group_id_set: asset_group_id = a_name
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

    set_asset_group_types (a_name: like asset_group_types)
        -- Set 'asset_group_types' with 'a_name'.
      do
        asset_group_types := a_name
      ensure
        asset_group_types_set: asset_group_types = a_name
      end

    set_assets_to_add (a_name: like assets_to_add)
        -- Set 'assets_to_add' with 'a_name'.
      do
        assets_to_add := a_name
      ensure
        assets_to_add_set: assets_to_add = a_name
      end

    set_assets_to_remove (a_name: like assets_to_remove)
        -- Set 'assets_to_remove' with 'a_name'.
      do
        assets_to_remove := a_name
      ensure
        assets_to_remove_set: assets_to_remove = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass UPDATE_ASSET_GROUP_BODY_ASSET_GROUPS_TO_UPDATE_INNER%N")
        if attached asset_group_id as l_asset_group_id then
          Result.append ("%Nasset_group_id:")
          Result.append (l_asset_group_id.out)
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
        if attached asset_group_types as l_asset_group_types then
          across l_asset_group_types as ic loop
            Result.append ("%N asset_group_types:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end
        if attached assets_to_add as l_assets_to_add then
          across l_assets_to_add as ic loop
            Result.append ("%N assets_to_add:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end
        if attached assets_to_remove as l_assets_to_remove then
          across l_assets_to_remove as ic loop
            Result.append ("%N assets_to_remove:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end
      end
end

