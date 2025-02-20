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
class CATALOGS_ITEM_VALIDATION_DETAILS




feature --Access

    attribute_name: detachable NULLABLE_CATALOGS_ITEM_FIELD_TYPE
      
    provided_value: detachable STRING_32
      -- Provided value that caused the validation issue.

feature -- Change Element

    set_attribute_name (a_name: like attribute_name)
        -- Set 'attribute_name' with 'a_name'.
      do
        attribute_name := a_name
      ensure
        attribute_name_set: attribute_name = a_name
      end

    set_provided_value (a_name: like provided_value)
        -- Set 'provided_value' with 'a_name'.
      do
        provided_value := a_name
      ensure
        provided_value_set: provided_value = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass CATALOGS_ITEM_VALIDATION_DETAILS%N")
        if attached attribute_name as l_attribute_name then
          Result.append ("%Nattribute_name:")
          Result.append (l_attribute_name.out)
          Result.append ("%N")
        end
        if attached provided_value as l_provided_value then
          Result.append ("%Nprovided_value:")
          Result.append (l_provided_value.out)
          Result.append ("%N")
        end
      end
end

