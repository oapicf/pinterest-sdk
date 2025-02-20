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
class PIN_UPDATE_CAROUSEL_SLOTS_INNER




feature --Access

    title: detachable STRING_32
      -- Carousel Pin slot title.
    description: detachable STRING_32
      -- Carousel Pin slot description.
    link: detachable STRING_32
      -- Carousel Pin slot link.

feature -- Change Element

    set_title (a_name: like title)
        -- Set 'title' with 'a_name'.
      do
        title := a_name
      ensure
        title_set: title = a_name
      end

    set_description (a_name: like description)
        -- Set 'description' with 'a_name'.
      do
        description := a_name
      ensure
        description_set: description = a_name
      end

    set_link (a_name: like link)
        -- Set 'link' with 'a_name'.
      do
        link := a_name
      ensure
        link_set: link = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass PIN_UPDATE_CAROUSEL_SLOTS_INNER%N")
        if attached title as l_title then
          Result.append ("%Ntitle:")
          Result.append (l_title.out)
          Result.append ("%N")
        end
        if attached description as l_description then
          Result.append ("%Ndescription:")
          Result.append (l_description.out)
          Result.append ("%N")
        end
        if attached link as l_link then
          Result.append ("%Nlink:")
          Result.append (l_link.out)
          Result.append ("%N")
        end
      end
end

