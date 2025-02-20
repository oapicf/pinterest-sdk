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
class USER_WEBSITE_VERIFY_REQUEST




feature --Access

    website: detachable STRING_32
      
    verification_method: detachable STRING_32
      

feature -- Change Element

    set_website (a_name: like website)
        -- Set 'website' with 'a_name'.
      do
        website := a_name
      ensure
        website_set: website = a_name
      end

    set_verification_method (a_name: like verification_method)
        -- Set 'verification_method' with 'a_name'.
      do
        verification_method := a_name
      ensure
        verification_method_set: verification_method = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass USER_WEBSITE_VERIFY_REQUEST%N")
        if attached website as l_website then
          Result.append ("%Nwebsite:")
          Result.append (l_website.out)
          Result.append ("%N")
        end
        if attached verification_method as l_verification_method then
          Result.append ("%Nverification_method:")
          Result.append (l_verification_method.out)
          Result.append ("%N")
        end
      end
end

