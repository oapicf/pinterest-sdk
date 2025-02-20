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
class CATALOGS_HOTEL_PRODUCT_METADATA




feature --Access

    hotel_id: detachable STRING_32
      -- The user-created unique ID that represents the hotel item.

feature -- Change Element

    set_hotel_id (a_name: like hotel_id)
        -- Set 'hotel_id' with 'a_name'.
      do
        hotel_id := a_name
      ensure
        hotel_id_set: hotel_id = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass CATALOGS_HOTEL_PRODUCT_METADATA%N")
        if attached hotel_id as l_hotel_id then
          Result.append ("%Nhotel_id:")
          Result.append (l_hotel_id.out)
          Result.append ("%N")
        end
      end
end

