note
 description:"[
		Pinterest REST API
 		Pinterest's REST API
  		The version of the OpenAPI document: 5.12.0
 	    Contact: blah+oapicf@cliffano.com

  	NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

 		 Do not edit the class manually.
 	]"
	date: "$Date$"
	revision: "$Revision$"
	EIS:"Eiffel openapi generator", "src=https://openapi-generator.tech", "protocol=uri"
class PIN_MEDIA_SOURCE_IMAGE_BASE64




feature --Access

    source_type: detachable STRING_32
      
    content_type: detachable STRING_32
      
    data: detachable STRING_32
      
    is_standard: BOOLEAN
      -- Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.

feature -- Change Element

    set_source_type (a_name: like source_type)
        -- Set 'source_type' with 'a_name'.
      do
        source_type := a_name
      ensure
        source_type_set: source_type = a_name
      end

    set_content_type (a_name: like content_type)
        -- Set 'content_type' with 'a_name'.
      do
        content_type := a_name
      ensure
        content_type_set: content_type = a_name
      end

    set_data (a_name: like data)
        -- Set 'data' with 'a_name'.
      do
        data := a_name
      ensure
        data_set: data = a_name
      end

    set_is_standard (a_name: like is_standard)
        -- Set 'is_standard' with 'a_name'.
      do
        is_standard := a_name
      ensure
        is_standard_set: is_standard = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass PIN_MEDIA_SOURCE_IMAGE_BASE64%N")
        if attached source_type as l_source_type then
          Result.append ("%Nsource_type:")
          Result.append (l_source_type.out)
          Result.append ("%N")
        end
        if attached content_type as l_content_type then
          Result.append ("%Ncontent_type:")
          Result.append (l_content_type.out)
          Result.append ("%N")
        end
        if attached data as l_data then
          Result.append ("%Ndata:")
          Result.append (l_data.out)
          Result.append ("%N")
        end
        if attached is_standard as l_is_standard then
          Result.append ("%Nis_standard:")
          Result.append (l_is_standard.out)
          Result.append ("%N")
        end
      end
end
