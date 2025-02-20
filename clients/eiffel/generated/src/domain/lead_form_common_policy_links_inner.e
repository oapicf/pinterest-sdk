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
class LEAD_FORM_COMMON_POLICY_LINKS_INNER




feature --Access

    label: detachable STRING_32
      -- Policy label for an additional policy link.
    link: detachable STRING_32
      -- Policy link for an additional policy link.

feature -- Change Element

    set_label (a_name: like label)
        -- Set 'label' with 'a_name'.
      do
        label := a_name
      ensure
        label_set: label = a_name
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
        Result.append("%Nclass LEAD_FORM_COMMON_POLICY_LINKS_INNER%N")
        if attached label as l_label then
          Result.append ("%Nlabel:")
          Result.append (l_label.out)
          Result.append ("%N")
        end
        if attached link as l_link then
          Result.append ("%Nlink:")
          Result.append (l_link.out)
          Result.append ("%N")
        end
      end
end

