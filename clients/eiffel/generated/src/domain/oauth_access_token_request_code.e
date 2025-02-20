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
class OAUTH_ACCESS_TOKEN_REQUEST_CODE




feature --Access

    grant_type: detachable STRING_32
      
    code: detachable STRING_32
      
    redirect_uri: detachable STRING_32
      

feature -- Change Element

    set_grant_type (a_name: like grant_type)
        -- Set 'grant_type' with 'a_name'.
      do
        grant_type := a_name
      ensure
        grant_type_set: grant_type = a_name
      end

    set_code (a_name: like code)
        -- Set 'code' with 'a_name'.
      do
        code := a_name
      ensure
        code_set: code = a_name
      end

    set_redirect_uri (a_name: like redirect_uri)
        -- Set 'redirect_uri' with 'a_name'.
      do
        redirect_uri := a_name
      ensure
        redirect_uri_set: redirect_uri = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass OAUTH_ACCESS_TOKEN_REQUEST_CODE%N")
        if attached grant_type as l_grant_type then
          Result.append ("%Ngrant_type:")
          Result.append (l_grant_type.out)
          Result.append ("%N")
        end
        if attached code as l_code then
          Result.append ("%Ncode:")
          Result.append (l_code.out)
          Result.append ("%N")
        end
        if attached redirect_uri as l_redirect_uri then
          Result.append ("%Nredirect_uri:")
          Result.append (l_redirect_uri.out)
          Result.append ("%N")
        end
      end
end

