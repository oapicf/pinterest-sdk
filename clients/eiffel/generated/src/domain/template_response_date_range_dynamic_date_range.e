note
 description:"[
		Pinterest REST API
 		Pinterest's REST API
  		The version of the OpenAPI document: 5.12.0
 	    Contact: blah+oapicf@cliffano.com

  	NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

 		 Do not edit the class manually.
 	]"
	date: "$Date$"
	revision: "$Revision$"
	EIS:"Eiffel openapi generator", "src=https://openapi-generator.tech", "protocol=uri"
class TEMPLATE_RESPONSE_DATE_RANGE_DYNAMIC_DATE_RANGE




feature --Access

    type: detachable STRING_32
      -- The date range type
    range: detachable STRING_32
      -- The dynamic range type

feature -- Change Element

    set_type (a_name: like type)
        -- Set 'type' with 'a_name'.
      do
        type := a_name
      ensure
        type_set: type = a_name
      end

    set_range (a_name: like range)
        -- Set 'range' with 'a_name'.
      do
        range := a_name
      ensure
        range_set: range = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass TEMPLATE_RESPONSE_DATE_RANGE_DYNAMIC_DATE_RANGE%N")
        if attached type as l_type then
          Result.append ("%Ntype:")
          Result.append (l_type.out)
          Result.append ("%N")
        end
        if attached range as l_range then
          Result.append ("%Nrange:")
          Result.append (l_range.out)
          Result.append ("%N")
        end
      end
end
