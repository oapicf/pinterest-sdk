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
class ITEM_RESPONSE_ANY_OF_1




feature --Access

    catalog_type: detachable CATALOGS_TYPE
      
    item_id: detachable STRING_32
      -- The catalog item id in the merchant namespace
    errors: detachable LIST [ITEM_VALIDATION_EVENT]
      -- Array with the errors for the item id requested
    hotel_id: detachable STRING_32
      -- The catalog hotel id in the merchant namespace
    creative_assets_id: detachable STRING_32
      -- The catalog creative assets id in the merchant namespace

feature -- Change Element

    set_catalog_type (a_name: like catalog_type)
        -- Set 'catalog_type' with 'a_name'.
      do
        catalog_type := a_name
      ensure
        catalog_type_set: catalog_type = a_name
      end

    set_item_id (a_name: like item_id)
        -- Set 'item_id' with 'a_name'.
      do
        item_id := a_name
      ensure
        item_id_set: item_id = a_name
      end

    set_errors (a_name: like errors)
        -- Set 'errors' with 'a_name'.
      do
        errors := a_name
      ensure
        errors_set: errors = a_name
      end

    set_hotel_id (a_name: like hotel_id)
        -- Set 'hotel_id' with 'a_name'.
      do
        hotel_id := a_name
      ensure
        hotel_id_set: hotel_id = a_name
      end

    set_creative_assets_id (a_name: like creative_assets_id)
        -- Set 'creative_assets_id' with 'a_name'.
      do
        creative_assets_id := a_name
      ensure
        creative_assets_id_set: creative_assets_id = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass ITEM_RESPONSE_ANY_OF_1%N")
        if attached catalog_type as l_catalog_type then
          Result.append ("%Ncatalog_type:")
          Result.append (l_catalog_type.out)
          Result.append ("%N")
        end
        if attached item_id as l_item_id then
          Result.append ("%Nitem_id:")
          Result.append (l_item_id.out)
          Result.append ("%N")
        end
        if attached errors as l_errors then
          across l_errors as ic loop
            Result.append ("%N errors:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end
        if attached hotel_id as l_hotel_id then
          Result.append ("%Nhotel_id:")
          Result.append (l_hotel_id.out)
          Result.append ("%N")
        end
        if attached creative_assets_id as l_creative_assets_id then
          Result.append ("%Ncreative_assets_id:")
          Result.append (l_creative_assets_id.out)
          Result.append ("%N")
        end
      end
end

