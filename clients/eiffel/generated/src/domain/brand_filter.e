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
class BRAND_FILTER




feature --Access

    BRAND: detachable CATALOGS_PRODUCT_GROUP_MULTIPLE_STRING_CRITERIA
      

feature -- Change Element

    set_BRAND (a_name: like BRAND)
        -- Set 'BRAND' with 'a_name'.
      do
        BRAND := a_name
      ensure
        BRAND_set: BRAND = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass BRAND_FILTER%N")
        if attached BRAND as l_BRAND then
          Result.append ("%NBRAND:")
          Result.append (l_BRAND.out)
          Result.append ("%N")
        end
      end
end
