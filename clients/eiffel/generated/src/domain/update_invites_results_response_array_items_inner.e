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
class UPDATE_INVITES_RESULTS_RESPONSE_ARRAY_ITEMS_INNER




feature --Access

    exception: detachable INVITE_EXCEPTION_RESPONSE
      
    invite: detachable INVITE_BUSINESS_ROLE_BINDING
      

feature -- Change Element

    set_exception (a_name: like exception)
        -- Set 'exception' with 'a_name'.
      do
        exception := a_name
      ensure
        exception_set: exception = a_name
      end

    set_invite (a_name: like invite)
        -- Set 'invite' with 'a_name'.
      do
        invite := a_name
      ensure
        invite_set: invite = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass UPDATE_INVITES_RESULTS_RESPONSE_ARRAY_ITEMS_INNER%N")
        if attached exception as l_exception then
          Result.append ("%Nexception:")
          Result.append (l_exception.out)
          Result.append ("%N")
        end
        if attached invite as l_invite then
          Result.append ("%Ninvite:")
          Result.append (l_invite.out)
          Result.append ("%N")
        end
      end
end

