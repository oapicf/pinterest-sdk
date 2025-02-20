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
class AD_GROUPS_ANALYTICS_RESPONSE_INNER

inherit


  STRING_TABLE [ANY]

feature --Access

    AD_GROUP_ID: detachable STRING_32
      -- The ID of the ad group that this metrics belongs to.
    DATE: detachable DATE
      -- Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)

feature -- Change Element

    set_AD_GROUP_ID (a_name: like AD_GROUP_ID)
        -- Set 'AD_GROUP_ID' with 'a_name'.
      do
        AD_GROUP_ID := a_name
      ensure
        AD_GROUP_ID_set: AD_GROUP_ID = a_name
      end

    set_DATE (a_name: like DATE)
        -- Set 'DATE' with 'a_name'.
      do
        DATE := a_name
      ensure
        DATE_set: DATE = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append(out_)
        Result.append("%Nclass AD_GROUPS_ANALYTICS_RESPONSE_INNER%N")
        if attached AD_GROUP_ID as l_AD_GROUP_ID then
          Result.append ("%NAD_GROUP_ID:")
          Result.append (l_AD_GROUP_ID.out)
          Result.append ("%N")
        end
        if attached DATE as l_DATE then
          Result.append ("%NDATE:")
          Result.append (l_DATE.out)
          Result.append ("%N")
        end
      end
end

