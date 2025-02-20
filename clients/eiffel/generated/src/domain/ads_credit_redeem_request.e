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
class ADS_CREDIT_REDEEM_REQUEST




feature --Access

    offer_code_hash: detachable STRING_32
      -- Takes in a SHA256 hash of the offerCode.
    validate_only: BOOLEAN
      -- If true, only validate if we can redeem offer code. Otherwise it will actually apply the offer code to the account

feature -- Change Element

    set_offer_code_hash (a_name: like offer_code_hash)
        -- Set 'offer_code_hash' with 'a_name'.
      do
        offer_code_hash := a_name
      ensure
        offer_code_hash_set: offer_code_hash = a_name
      end

    set_validate_only (a_name: like validate_only)
        -- Set 'validate_only' with 'a_name'.
      do
        validate_only := a_name
      ensure
        validate_only_set: validate_only = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass ADS_CREDIT_REDEEM_REQUEST%N")
        if attached offer_code_hash as l_offer_code_hash then
          Result.append ("%Noffer_code_hash:")
          Result.append (l_offer_code_hash.out)
          Result.append ("%N")
        end
        if attached validate_only as l_validate_only then
          Result.append ("%Nvalidate_only:")
          Result.append (l_validate_only.out)
          Result.append ("%N")
        end
      end
end

