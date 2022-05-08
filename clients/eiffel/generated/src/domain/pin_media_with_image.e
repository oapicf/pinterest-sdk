note
 description:"[
		Pinterest REST API
 		Pinterest's REST API
  		The version of the OpenAPI document: 5.3.0
 	    Contact: pinterest-api@pinterest.com

  	NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

 		 Do not edit the class manually.
 	]"
	date: "$Date$"
	revision: "$Revision$"
	EIS:"Eiffel openapi generator", "src=https://openapi-generator.tech", "protocol=uri"
class PIN_MEDIA_WITH_IMAGE

inherit


  PIN_MEDIA
      rename
          output as out_pinmedia
      end

feature --Access

    images: detachable STRING_TABLE [IMAGE_DETAILS]
      

feature -- Change Element

    set_images (a_name: like images)
        -- Set 'images' with 'a_name'.
      do
        images := a_name
      ensure
        images_set: images = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append(out_pinmedia)
        Result.append("%Nclass PIN_MEDIA_WITH_IMAGE%N")
        if attached images as l_images then
          Result.append ("%Nimages:")
          across l_images as ic loop
            Result.append ("%N")
            Result.append ("key:")
            Result.append (ic.key.out)
            Result.append (" - ")
            Result.append ("val:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end
      end
end
