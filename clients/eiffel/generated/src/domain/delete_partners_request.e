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
class DELETE_PARTNERS_REQUEST




feature --Access

    partner_ids: detachable LIST [STRING_32]
      
    partner_type: detachable STRING_32
      

feature -- Change Element

    set_partner_ids (a_name: like partner_ids)
        -- Set 'partner_ids' with 'a_name'.
      do
        partner_ids := a_name
      ensure
        partner_ids_set: partner_ids = a_name
      end

    set_partner_type (a_name: like partner_type)
        -- Set 'partner_type' with 'a_name'.
      do
        partner_type := a_name
      ensure
        partner_type_set: partner_type = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass DELETE_PARTNERS_REQUEST%N")
        if attached partner_ids as l_partner_ids then
          across l_partner_ids as ic loop
            Result.append ("%N partner_ids:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end
        if attached partner_type as l_partner_type then
          Result.append ("%Npartner_type:")
          Result.append (l_partner_type.out)
          Result.append ("%N")
        end
      end
end

