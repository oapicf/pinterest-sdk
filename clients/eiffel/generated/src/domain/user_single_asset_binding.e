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
class USER_SINGLE_ASSET_BINDING




feature --Access

    permissions: detachable LIST [STRING_32]
      -- Permission levels member or partner has on an asset.
    user: detachable BUSINESS_ACCESS_USER_SUMMARY
      

feature -- Change Element

    set_permissions (a_name: like permissions)
        -- Set 'permissions' with 'a_name'.
      do
        permissions := a_name
      ensure
        permissions_set: permissions = a_name
      end

    set_user (a_name: like user)
        -- Set 'user' with 'a_name'.
      do
        user := a_name
      ensure
        user_set: user = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass USER_SINGLE_ASSET_BINDING%N")
        if attached permissions as l_permissions then
          across l_permissions as ic loop
            Result.append ("%N permissions:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end
        if attached user as l_user then
          Result.append ("%Nuser:")
          Result.append (l_user.out)
          Result.append ("%N")
        end
      end
end

