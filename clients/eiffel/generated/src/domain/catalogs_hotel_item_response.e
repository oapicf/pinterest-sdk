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
class CATALOGS_HOTEL_ITEM_RESPONSE




feature --Access

    catalog_type: detachable CATALOGS_TYPE
      
    hotel_id: detachable STRING_32
      -- The catalog hotel id in the merchant namespace
    pins: detachable LIST [PIN]
      -- The pins mapped to the item
    attributes: detachable CATALOGS_HOTEL_ATTRIBUTES
      

feature -- Change Element

    set_catalog_type (a_name: like catalog_type)
        -- Set 'catalog_type' with 'a_name'.
      do
        catalog_type := a_name
      ensure
        catalog_type_set: catalog_type = a_name
      end

    set_hotel_id (a_name: like hotel_id)
        -- Set 'hotel_id' with 'a_name'.
      do
        hotel_id := a_name
      ensure
        hotel_id_set: hotel_id = a_name
      end

    set_pins (a_name: like pins)
        -- Set 'pins' with 'a_name'.
      do
        pins := a_name
      ensure
        pins_set: pins = a_name
      end

    set_attributes (a_name: like attributes)
        -- Set 'attributes' with 'a_name'.
      do
        attributes := a_name
      ensure
        attributes_set: attributes = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass CATALOGS_HOTEL_ITEM_RESPONSE%N")
        if attached catalog_type as l_catalog_type then
          Result.append ("%Ncatalog_type:")
          Result.append (l_catalog_type.out)
          Result.append ("%N")
        end
        if attached hotel_id as l_hotel_id then
          Result.append ("%Nhotel_id:")
          Result.append (l_hotel_id.out)
          Result.append ("%N")
        end
        if attached pins as l_pins then
          across l_pins as ic loop
            Result.append ("%N pins:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end
        if attached attributes as l_attributes then
          Result.append ("%Nattributes:")
          Result.append (l_attributes.out)
          Result.append ("%N")
        end
      end
end

