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
class UPDATE_PARTNER_RESULTS_RESPONSE_ARRAY_ITEMS_INNER




feature --Access

    exception: detachable BUSINESS_ACCESS_ERROR
      
    member_or_partner_id: detachable STRING_32
      

feature -- Change Element

    set_exception (a_name: like exception)
        -- Set 'exception' with 'a_name'.
      do
        exception := a_name
      ensure
        exception_set: exception = a_name
      end

    set_member_or_partner_id (a_name: like member_or_partner_id)
        -- Set 'member_or_partner_id' with 'a_name'.
      do
        member_or_partner_id := a_name
      ensure
        member_or_partner_id_set: member_or_partner_id = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass UPDATE_PARTNER_RESULTS_RESPONSE_ARRAY_ITEMS_INNER%N")
        if attached exception as l_exception then
          Result.append ("%Nexception:")
          Result.append (l_exception.out)
          Result.append ("%N")
        end
        if attached member_or_partner_id as l_member_or_partner_id then
          Result.append ("%Nmember_or_partner_id:")
          Result.append (l_member_or_partner_id.out)
          Result.append ("%N")
        end
      end
end

