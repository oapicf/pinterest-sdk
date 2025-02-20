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
class TEMPLATE_RESPONSE




feature --Access

    id: detachable STRING_32
      -- Template ID
    ad_account_id: detachable STRING_32
      -- ID of the Ad Account that owns the template
    ad_account_ids: detachable LIST [STRING_32]
      -- IDs of the Ad Accounts that have access to this template
    user_id: detachable STRING_32
      -- ID of the user who created the template
    name: detachable STRING_32
      -- Template Name
    report_start_relative_days_in_past: REAL_32
      -- The number of days prior to the day the report will be delivered at which the report will start
    report_end_relative_days_in_past: REAL_32
      -- The number of days prior to the day the report will be delivered at which the report will end
    date_range: detachable TEMPLATE_RESPONSE_DATE_RANGE
      
    report_level: detachable METRICS_REPORTING_LEVEL
      
    report_format: detachable DATA_OUTPUT_FORMAT
      
    columns: detachable LIST [STRING_32]
      -- A list of columns to be included in the report
    granularity: detachable GRANULARITY
      
    view_window_days: REAL_32
      -- The length of the sliding window over which view conversions will be attributed
    click_window_days: REAL_32
      -- The length of the sliding window over which click conversions will be attributed
    engagement_window_days: REAL_32
      -- The length of the sliding window over which engagement conversions will be attributed
    conversion_report_time_type: detachable STRING_32
      -- Conversion report time type
    filters_json: detachable STRING_32
      -- A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:<br> \"field\": The column name<br> \"operator\": The operator. Allowed operators: [\"=\", \"!=\", \"in\", \"not_in\", \"~\", \">\", \"<\", \"contains_substring\"]<br> \"value\": A single value or a list of values
    is_owned_by_user: BOOLEAN
      -- A boolean value that indicates if the user owns the template
    is_scheduled: BOOLEAN
      -- A boolean value that indicates if this template has been used to create a scheduled report
    creation_source: detachable STRING_32
      -- The surface used to create this template
    is_deleted: BOOLEAN
      -- A boolean that indicates if the template has been deleted
    updated_time: REAL_32
      -- Time of last update in seconds since Unix epoch
    custom_column_ids: detachable LIST [STRING_32]
      -- A list of custom column IDs
    type: detachable STRING_32
      -- Reporting template type
    ingestion_sources: detachable LIST [STRING_32]
      -- The filter on the conversion ingestion source method for conversion metrics

feature -- Change Element

    set_id (a_name: like id)
        -- Set 'id' with 'a_name'.
      do
        id := a_name
      ensure
        id_set: id = a_name
      end

    set_ad_account_id (a_name: like ad_account_id)
        -- Set 'ad_account_id' with 'a_name'.
      do
        ad_account_id := a_name
      ensure
        ad_account_id_set: ad_account_id = a_name
      end

    set_ad_account_ids (a_name: like ad_account_ids)
        -- Set 'ad_account_ids' with 'a_name'.
      do
        ad_account_ids := a_name
      ensure
        ad_account_ids_set: ad_account_ids = a_name
      end

    set_user_id (a_name: like user_id)
        -- Set 'user_id' with 'a_name'.
      do
        user_id := a_name
      ensure
        user_id_set: user_id = a_name
      end

    set_name (a_name: like name)
        -- Set 'name' with 'a_name'.
      do
        name := a_name
      ensure
        name_set: name = a_name
      end

    set_report_start_relative_days_in_past (a_name: like report_start_relative_days_in_past)
        -- Set 'report_start_relative_days_in_past' with 'a_name'.
      do
        report_start_relative_days_in_past := a_name
      ensure
        report_start_relative_days_in_past_set: report_start_relative_days_in_past = a_name
      end

    set_report_end_relative_days_in_past (a_name: like report_end_relative_days_in_past)
        -- Set 'report_end_relative_days_in_past' with 'a_name'.
      do
        report_end_relative_days_in_past := a_name
      ensure
        report_end_relative_days_in_past_set: report_end_relative_days_in_past = a_name
      end

    set_date_range (a_name: like date_range)
        -- Set 'date_range' with 'a_name'.
      do
        date_range := a_name
      ensure
        date_range_set: date_range = a_name
      end

    set_report_level (a_name: like report_level)
        -- Set 'report_level' with 'a_name'.
      do
        report_level := a_name
      ensure
        report_level_set: report_level = a_name
      end

    set_report_format (a_name: like report_format)
        -- Set 'report_format' with 'a_name'.
      do
        report_format := a_name
      ensure
        report_format_set: report_format = a_name
      end

    set_columns (a_name: like columns)
        -- Set 'columns' with 'a_name'.
      do
        columns := a_name
      ensure
        columns_set: columns = a_name
      end

    set_granularity (a_name: like granularity)
        -- Set 'granularity' with 'a_name'.
      do
        granularity := a_name
      ensure
        granularity_set: granularity = a_name
      end

    set_view_window_days (a_name: like view_window_days)
        -- Set 'view_window_days' with 'a_name'.
      do
        view_window_days := a_name
      ensure
        view_window_days_set: view_window_days = a_name
      end

    set_click_window_days (a_name: like click_window_days)
        -- Set 'click_window_days' with 'a_name'.
      do
        click_window_days := a_name
      ensure
        click_window_days_set: click_window_days = a_name
      end

    set_engagement_window_days (a_name: like engagement_window_days)
        -- Set 'engagement_window_days' with 'a_name'.
      do
        engagement_window_days := a_name
      ensure
        engagement_window_days_set: engagement_window_days = a_name
      end

    set_conversion_report_time_type (a_name: like conversion_report_time_type)
        -- Set 'conversion_report_time_type' with 'a_name'.
      do
        conversion_report_time_type := a_name
      ensure
        conversion_report_time_type_set: conversion_report_time_type = a_name
      end

    set_filters_json (a_name: like filters_json)
        -- Set 'filters_json' with 'a_name'.
      do
        filters_json := a_name
      ensure
        filters_json_set: filters_json = a_name
      end

    set_is_owned_by_user (a_name: like is_owned_by_user)
        -- Set 'is_owned_by_user' with 'a_name'.
      do
        is_owned_by_user := a_name
      ensure
        is_owned_by_user_set: is_owned_by_user = a_name
      end

    set_is_scheduled (a_name: like is_scheduled)
        -- Set 'is_scheduled' with 'a_name'.
      do
        is_scheduled := a_name
      ensure
        is_scheduled_set: is_scheduled = a_name
      end

    set_creation_source (a_name: like creation_source)
        -- Set 'creation_source' with 'a_name'.
      do
        creation_source := a_name
      ensure
        creation_source_set: creation_source = a_name
      end

    set_is_deleted (a_name: like is_deleted)
        -- Set 'is_deleted' with 'a_name'.
      do
        is_deleted := a_name
      ensure
        is_deleted_set: is_deleted = a_name
      end

    set_updated_time (a_name: like updated_time)
        -- Set 'updated_time' with 'a_name'.
      do
        updated_time := a_name
      ensure
        updated_time_set: updated_time = a_name
      end

    set_custom_column_ids (a_name: like custom_column_ids)
        -- Set 'custom_column_ids' with 'a_name'.
      do
        custom_column_ids := a_name
      ensure
        custom_column_ids_set: custom_column_ids = a_name
      end

    set_type (a_name: like type)
        -- Set 'type' with 'a_name'.
      do
        type := a_name
      ensure
        type_set: type = a_name
      end

    set_ingestion_sources (a_name: like ingestion_sources)
        -- Set 'ingestion_sources' with 'a_name'.
      do
        ingestion_sources := a_name
      ensure
        ingestion_sources_set: ingestion_sources = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass TEMPLATE_RESPONSE%N")
        if attached id as l_id then
          Result.append ("%Nid:")
          Result.append (l_id.out)
          Result.append ("%N")
        end
        if attached ad_account_id as l_ad_account_id then
          Result.append ("%Nad_account_id:")
          Result.append (l_ad_account_id.out)
          Result.append ("%N")
        end
        if attached ad_account_ids as l_ad_account_ids then
          across l_ad_account_ids as ic loop
            Result.append ("%N ad_account_ids:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end
        if attached user_id as l_user_id then
          Result.append ("%Nuser_id:")
          Result.append (l_user_id.out)
          Result.append ("%N")
        end
        if attached name as l_name then
          Result.append ("%Nname:")
          Result.append (l_name.out)
          Result.append ("%N")
        end
        if attached report_start_relative_days_in_past as l_report_start_relative_days_in_past then
          Result.append ("%Nreport_start_relative_days_in_past:")
          Result.append (l_report_start_relative_days_in_past.out)
          Result.append ("%N")
        end
        if attached report_end_relative_days_in_past as l_report_end_relative_days_in_past then
          Result.append ("%Nreport_end_relative_days_in_past:")
          Result.append (l_report_end_relative_days_in_past.out)
          Result.append ("%N")
        end
        if attached date_range as l_date_range then
          Result.append ("%Ndate_range:")
          Result.append (l_date_range.out)
          Result.append ("%N")
        end
        if attached report_level as l_report_level then
          Result.append ("%Nreport_level:")
          Result.append (l_report_level.out)
          Result.append ("%N")
        end
        if attached report_format as l_report_format then
          Result.append ("%Nreport_format:")
          Result.append (l_report_format.out)
          Result.append ("%N")
        end
        if attached columns as l_columns then
          across l_columns as ic loop
            Result.append ("%N columns:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end
        if attached granularity as l_granularity then
          Result.append ("%Ngranularity:")
          Result.append (l_granularity.out)
          Result.append ("%N")
        end
        if attached view_window_days as l_view_window_days then
          Result.append ("%Nview_window_days:")
          Result.append (l_view_window_days.out)
          Result.append ("%N")
        end
        if attached click_window_days as l_click_window_days then
          Result.append ("%Nclick_window_days:")
          Result.append (l_click_window_days.out)
          Result.append ("%N")
        end
        if attached engagement_window_days as l_engagement_window_days then
          Result.append ("%Nengagement_window_days:")
          Result.append (l_engagement_window_days.out)
          Result.append ("%N")
        end
        if attached conversion_report_time_type as l_conversion_report_time_type then
          Result.append ("%Nconversion_report_time_type:")
          Result.append (l_conversion_report_time_type.out)
          Result.append ("%N")
        end
        if attached filters_json as l_filters_json then
          Result.append ("%Nfilters_json:")
          Result.append (l_filters_json.out)
          Result.append ("%N")
        end
        if attached is_owned_by_user as l_is_owned_by_user then
          Result.append ("%Nis_owned_by_user:")
          Result.append (l_is_owned_by_user.out)
          Result.append ("%N")
        end
        if attached is_scheduled as l_is_scheduled then
          Result.append ("%Nis_scheduled:")
          Result.append (l_is_scheduled.out)
          Result.append ("%N")
        end
        if attached creation_source as l_creation_source then
          Result.append ("%Ncreation_source:")
          Result.append (l_creation_source.out)
          Result.append ("%N")
        end
        if attached is_deleted as l_is_deleted then
          Result.append ("%Nis_deleted:")
          Result.append (l_is_deleted.out)
          Result.append ("%N")
        end
        if attached updated_time as l_updated_time then
          Result.append ("%Nupdated_time:")
          Result.append (l_updated_time.out)
          Result.append ("%N")
        end
        if attached custom_column_ids as l_custom_column_ids then
          across l_custom_column_ids as ic loop
            Result.append ("%N custom_column_ids:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end
        if attached type as l_type then
          Result.append ("%Ntype:")
          Result.append (l_type.out)
          Result.append ("%N")
        end
        if attached ingestion_sources as l_ingestion_sources then
          across l_ingestion_sources as ic loop
            Result.append ("%N ingestion_sources:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end
      end
end

