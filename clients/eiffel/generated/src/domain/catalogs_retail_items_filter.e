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
class CATALOGS_RETAIL_ITEMS_FILTER




feature --Access

    catalog_type: detachable STRING_32
      
    item_ids: detachable LIST [STRING_32]
      
    catalog_id: detachable STRING_32
      -- Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog

feature -- Change Element

    set_catalog_type (a_name: like catalog_type)
        -- Set 'catalog_type' with 'a_name'.
      do
        catalog_type := a_name
      ensure
        catalog_type_set: catalog_type = a_name
      end

    set_item_ids (a_name: like item_ids)
        -- Set 'item_ids' with 'a_name'.
      do
        item_ids := a_name
      ensure
        item_ids_set: item_ids = a_name
      end

    set_catalog_id (a_name: like catalog_id)
        -- Set 'catalog_id' with 'a_name'.
      do
        catalog_id := a_name
      ensure
        catalog_id_set: catalog_id = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass CATALOGS_RETAIL_ITEMS_FILTER%N")
        if attached catalog_type as l_catalog_type then
          Result.append ("%Ncatalog_type:")
          Result.append (l_catalog_type.out)
          Result.append ("%N")
        end
        if attached item_ids as l_item_ids then
          across l_item_ids as ic loop
            Result.append ("%N item_ids:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end
        if attached catalog_id as l_catalog_id then
          Result.append ("%Ncatalog_id:")
          Result.append (l_catalog_id.out)
          Result.append ("%N")
        end
      end
end

