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
class OPTIMIZATION_GOAL_METADATA_CONVERSION_TAG_V3_GOAL_METADATA




feature --Access

    attribution_windows: detachable OPTIMIZATION_GOAL_METADATA_CONVERSION_TAG_V3_GOAL_METADATA_ATTRIBUTION_WINDOWS
      
    conversion_event: detachable STRING_32
      
    conversion_tag_id: detachable STRING_32
      
    cpa_goal_value_in_micro_currency: detachable STRING_32
      
    is_roas_optimized: BOOLEAN
      -- Ad group is ROAS optimized
    learning_mode_type: detachable STRING_32
      -- Conversion learning model type

feature -- Change Element

    set_attribution_windows (a_name: like attribution_windows)
        -- Set 'attribution_windows' with 'a_name'.
      do
        attribution_windows := a_name
      ensure
        attribution_windows_set: attribution_windows = a_name
      end

    set_conversion_event (a_name: like conversion_event)
        -- Set 'conversion_event' with 'a_name'.
      do
        conversion_event := a_name
      ensure
        conversion_event_set: conversion_event = a_name
      end

    set_conversion_tag_id (a_name: like conversion_tag_id)
        -- Set 'conversion_tag_id' with 'a_name'.
      do
        conversion_tag_id := a_name
      ensure
        conversion_tag_id_set: conversion_tag_id = a_name
      end

    set_cpa_goal_value_in_micro_currency (a_name: like cpa_goal_value_in_micro_currency)
        -- Set 'cpa_goal_value_in_micro_currency' with 'a_name'.
      do
        cpa_goal_value_in_micro_currency := a_name
      ensure
        cpa_goal_value_in_micro_currency_set: cpa_goal_value_in_micro_currency = a_name
      end

    set_is_roas_optimized (a_name: like is_roas_optimized)
        -- Set 'is_roas_optimized' with 'a_name'.
      do
        is_roas_optimized := a_name
      ensure
        is_roas_optimized_set: is_roas_optimized = a_name
      end

    set_learning_mode_type (a_name: like learning_mode_type)
        -- Set 'learning_mode_type' with 'a_name'.
      do
        learning_mode_type := a_name
      ensure
        learning_mode_type_set: learning_mode_type = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass OPTIMIZATION_GOAL_METADATA_CONVERSION_TAG_V3_GOAL_METADATA%N")
        if attached attribution_windows as l_attribution_windows then
          Result.append ("%Nattribution_windows:")
          Result.append (l_attribution_windows.out)
          Result.append ("%N")
        end
        if attached conversion_event as l_conversion_event then
          Result.append ("%Nconversion_event:")
          Result.append (l_conversion_event.out)
          Result.append ("%N")
        end
        if attached conversion_tag_id as l_conversion_tag_id then
          Result.append ("%Nconversion_tag_id:")
          Result.append (l_conversion_tag_id.out)
          Result.append ("%N")
        end
        if attached cpa_goal_value_in_micro_currency as l_cpa_goal_value_in_micro_currency then
          Result.append ("%Ncpa_goal_value_in_micro_currency:")
          Result.append (l_cpa_goal_value_in_micro_currency.out)
          Result.append ("%N")
        end
        if attached is_roas_optimized as l_is_roas_optimized then
          Result.append ("%Nis_roas_optimized:")
          Result.append (l_is_roas_optimized.out)
          Result.append ("%N")
        end
        if attached learning_mode_type as l_learning_mode_type then
          Result.append ("%Nlearning_mode_type:")
          Result.append (l_learning_mode_type.out)
          Result.append ("%N")
        end
      end
end
