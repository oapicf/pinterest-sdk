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
class AD_PIN_ID




feature --Access

    pin_id: detachable STRING_32
      -- Pin ID.

feature -- Change Element

    set_pin_id (a_name: like pin_id)
        -- Set 'pin_id' with 'a_name'.
      do
        pin_id := a_name
      ensure
        pin_id_set: pin_id = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass AD_PIN_ID%N")
        if attached pin_id as l_pin_id then
          Result.append ("%Npin_id:")
          Result.append (l_pin_id.out)
          Result.append ("%N")
        end
      end
end

