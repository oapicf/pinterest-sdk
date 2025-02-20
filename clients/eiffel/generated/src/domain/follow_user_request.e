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
class FOLLOW_USER_REQUEST




feature --Access

    auto_follow: BOOLEAN
      -- Whether this request comes as result of auto-follow after clicking on a link. Follow links can be used by partners on their site or in emails. Only selected partners can be followed this way. We verify that partner can be auto-followed.

feature -- Change Element

    set_auto_follow (a_name: like auto_follow)
        -- Set 'auto_follow' with 'a_name'.
      do
        auto_follow := a_name
      ensure
        auto_follow_set: auto_follow = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass FOLLOW_USER_REQUEST%N")
        if attached auto_follow as l_auto_follow then
          Result.append ("%Nauto_follow:")
          Result.append (l_auto_follow.out)
          Result.append ("%N")
        end
      end
end

