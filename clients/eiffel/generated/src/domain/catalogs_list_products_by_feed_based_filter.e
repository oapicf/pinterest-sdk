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
class CATALOGS_LIST_PRODUCTS_BY_FEED_BASED_FILTER




feature --Access

    feed_id: detachable STRING_32
      -- Catalog Feed id pertaining to the catalog product group filter.
    filters: detachable CATALOGS_PRODUCT_GROUP_FILTERS
      

feature -- Change Element

    set_feed_id (a_name: like feed_id)
        -- Set 'feed_id' with 'a_name'.
      do
        feed_id := a_name
      ensure
        feed_id_set: feed_id = a_name
      end

    set_filters (a_name: like filters)
        -- Set 'filters' with 'a_name'.
      do
        filters := a_name
      ensure
        filters_set: filters = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass CATALOGS_LIST_PRODUCTS_BY_FEED_BASED_FILTER%N")
        if attached feed_id as l_feed_id then
          Result.append ("%Nfeed_id:")
          Result.append (l_feed_id.out)
          Result.append ("%N")
        end
        if attached filters as l_filters then
          Result.append ("%Nfilters:")
          Result.append (l_filters.out)
          Result.append ("%N")
        end
      end
end

