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
class MEDIA_TYPE_FILTER




feature --Access

    MEDIA_TYPE: detachable CATALOGS_PRODUCT_GROUP_MULTIPLE_MEDIA_TYPES_CRITERIA
      

feature -- Change Element

    set_MEDIA_TYPE (a_name: like MEDIA_TYPE)
        -- Set 'MEDIA_TYPE' with 'a_name'.
      do
        MEDIA_TYPE := a_name
      ensure
        MEDIA_TYPE_set: MEDIA_TYPE = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass MEDIA_TYPE_FILTER%N")
        if attached MEDIA_TYPE as l_MEDIA_TYPE then
          Result.append ("%NMEDIA_TYPE:")
          Result.append (l_MEDIA_TYPE.out)
          Result.append ("%N")
        end
      end
end

