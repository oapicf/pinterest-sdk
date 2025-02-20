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
class AUDIENCE_INSIGHTS_RESPONSE




feature --Access

    categories: detachable LIST [AUDIENCE_CATEGORY]
      -- Category interest distribution
    demographics: detachable AUDIENCE_DEMOGRAPHICS
      
    type: detachable AUDIENCE_INSIGHT_TYPE
      
    date: detachable STRING_32
      -- Generation date
    size: INTEGER_32
      -- Population count.
    size_is_upper_bound: BOOLEAN
      -- Indicates whether the audience size has been rounded up to the next highest upper boundary.

feature -- Change Element

    set_categories (a_name: like categories)
        -- Set 'categories' with 'a_name'.
      do
        categories := a_name
      ensure
        categories_set: categories = a_name
      end

    set_demographics (a_name: like demographics)
        -- Set 'demographics' with 'a_name'.
      do
        demographics := a_name
      ensure
        demographics_set: demographics = a_name
      end

    set_type (a_name: like type)
        -- Set 'type' with 'a_name'.
      do
        type := a_name
      ensure
        type_set: type = a_name
      end

    set_date (a_name: like date)
        -- Set 'date' with 'a_name'.
      do
        date := a_name
      ensure
        date_set: date = a_name
      end

    set_size (a_name: like size)
        -- Set 'size' with 'a_name'.
      do
        size := a_name
      ensure
        size_set: size = a_name
      end

    set_size_is_upper_bound (a_name: like size_is_upper_bound)
        -- Set 'size_is_upper_bound' with 'a_name'.
      do
        size_is_upper_bound := a_name
      ensure
        size_is_upper_bound_set: size_is_upper_bound = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass AUDIENCE_INSIGHTS_RESPONSE%N")
        if attached categories as l_categories then
          across l_categories as ic loop
            Result.append ("%N categories:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end
        if attached demographics as l_demographics then
          Result.append ("%Ndemographics:")
          Result.append (l_demographics.out)
          Result.append ("%N")
        end
        if attached type as l_type then
          Result.append ("%Ntype:")
          Result.append (l_type.out)
          Result.append ("%N")
        end
        if attached date as l_date then
          Result.append ("%Ndate:")
          Result.append (l_date.out)
          Result.append ("%N")
        end
        if attached size as l_size then
          Result.append ("%Nsize:")
          Result.append (l_size.out)
          Result.append ("%N")
        end
        if attached size_is_upper_bound as l_size_is_upper_bound then
          Result.append ("%Nsize_is_upper_bound:")
          Result.append (l_size_is_upper_bound.out)
          Result.append ("%N")
        end
      end
end

