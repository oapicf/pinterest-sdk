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
class UPDATE_MEMBER_ASSETS_RESULTS_RESPONSE_ARRAY_ITEMS_INNER




feature --Access

    response: detachable USERS_FOR_INDIVIDUAL_ASSET_RESPONSE
      

feature -- Change Element

    set_response (a_name: like response)
        -- Set 'response' with 'a_name'.
      do
        response := a_name
      ensure
        response_set: response = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass UPDATE_MEMBER_ASSETS_RESULTS_RESPONSE_ARRAY_ITEMS_INNER%N")
        if attached response as l_response then
          Result.append ("%Nresponse:")
          Result.append (l_response.out)
          Result.append ("%N")
        end
      end
end

