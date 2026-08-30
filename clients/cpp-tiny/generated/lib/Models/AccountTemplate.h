
/*
 * AccountTemplate.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AccountTemplate_H_
#define TINY_CPP_CLIENT_AccountTemplate_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AnyType.h"
#include "ConversionReportTimeType.h"
#include "CreationSource.h"
#include "DataOutputFormat.h"
#include "Granularity.h"
#include "IngestionSource.h"
#include "MetricsReportingLevel.h"
#include "ReportingColumn.h"
#include "ReportingTimeZone.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AccountTemplate{
public:

    /*! \brief Constructor.
	 */
    AccountTemplate();
    AccountTemplate(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AccountTemplate();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get ID of the Ad Account that owns the template
	 */
	std::string getAdAccountId();

	/*! \brief Set ID of the Ad Account that owns the template
	 */
	void setAdAccountId(std::string ad_account_id);
	/*! \brief Get IDs of the Ad Accounts that have access to this template
	 */
	std::list<std::string> getAdAccountIds();

	/*! \brief Set IDs of the Ad Accounts that have access to this template
	 */
	void setAdAccountIds(std::list<std::string> ad_account_ids);
	/*! \brief Get A list of ADE columns
	 */
	std::list<std::string> getAdeColumns();

	/*! \brief Set A list of ADE columns
	 */
	void setAdeColumns(std::list<std::string> ade_columns);
	/*! \brief Get Attribution type for Brand/Category/SKU reports
	 */
	AnyType getAttributionType();

	/*! \brief Set Attribution type for Brand/Category/SKU reports
	 */
	void setAttributionType(AnyType attribution_type);
	/*! \brief Get The length of the sliding window over which click conversions will be attributed
	 */
	long getClickWindowDays();

	/*! \brief Set The length of the sliding window over which click conversions will be attributed
	 */
	void setClickWindowDays(long click_window_days);
	/*! \brief Get A list of columns to be included in the report
	 */
	std::list<ReportingColumn> getColumns();

	/*! \brief Set A list of columns to be included in the report
	 */
	void setColumns(std::list<ReportingColumn> columns);
	/*! \brief Get Conversion report time type
	 */
	ConversionReportTimeType getConversionReportTimeType();

	/*! \brief Set Conversion report time type
	 */
	void setConversionReportTimeType(ConversionReportTimeType conversion_report_time_type);
	/*! \brief Get The surface used to create this template
	 */
	CreationSource getCreationSource();

	/*! \brief Set The surface used to create this template
	 */
	void setCreationSource(CreationSource creation_source);
	/*! \brief Get A list of custom column IDs
	 */
	std::list<std::string> getCustomColumnIds();

	/*! \brief Set A list of custom column IDs
	 */
	void setCustomColumnIds(std::list<std::string> custom_column_ids);
	/*! \brief Get Additional metadata about this reporting template
	 */
	std::string getDisplayMetadata();

	/*! \brief Set Additional metadata about this reporting template
	 */
	void setDisplayMetadata(std::string display_metadata);
	/*! \brief Get The length of the sliding window over which engagement conversions will be attributed
	 */
	long getEngagementWindowDays();

	/*! \brief Set The length of the sliding window over which engagement conversions will be attributed
	 */
	void setEngagementWindowDays(long engagement_window_days);
	/*! \brief Get A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:\\ \"field\": The column name\\ \"operator\": The operator. Allowed operators: [\"=\", \"!=\", \"in\", \"not_in\", \"~\", \">\", \"<\", \"contains_substring\"]\\ \"value\": A single value or a list of values
	 */
	std::string getFiltersJson();

	/*! \brief Set A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:\\ \"field\": The column name\\ \"operator\": The operator. Allowed operators: [\"=\", \"!=\", \"in\", \"not_in\", \"~\", \">\", \"<\", \"contains_substring\"]\\ \"value\": A single value or a list of values
	 */
	void setFiltersJson(std::string filters_json);
	/*! \brief Get 
	 */
	Granularity getGranularity();

	/*! \brief Set 
	 */
	void setGranularity(Granularity granularity);
	/*! \brief Get Template ID
	 */
	std::string getId();

	/*! \brief Set Template ID
	 */
	void setId(std::string id);
	/*! \brief Get The filter on the conversion ingestion source method for conversion metrics
	 */
	std::list<IngestionSource> getIngestionSources();

	/*! \brief Set The filter on the conversion ingestion source method for conversion metrics
	 */
	void setIngestionSources(std::list<IngestionSource> ingestion_sources);
	/*! \brief Get A boolean representing if this is the default view that loads for this template type
	 */
	bool isIsDefault();

	/*! \brief Set A boolean representing if this is the default view that loads for this template type
	 */
	void setIsDefault(bool is_default);
	/*! \brief Get A boolean that indicates if the template has been deleted
	 */
	bool isIsDeleted();

	/*! \brief Set A boolean that indicates if the template has been deleted
	 */
	void setIsDeleted(bool is_deleted);
	/*! \brief Get A boolean value that indicates if the user owns the template
	 */
	bool isIsOwnedByUser();

	/*! \brief Set A boolean value that indicates if the user owns the template
	 */
	void setIsOwnedByUser(bool is_owned_by_user);
	/*! \brief Get A boolean value that indicates if this template has been used to create a scheduled report
	 */
	bool isIsScheduled();

	/*! \brief Set A boolean value that indicates if this template has been used to create a scheduled report
	 */
	void setIsScheduled(bool is_scheduled);
	/*! \brief Get Template Name
	 */
	std::string getName();

	/*! \brief Set Template Name
	 */
	void setName(std::string name);
	/*! \brief Get The number of days prior to the day the report will be delivered at which the report will end
	 */
	long getReportEndRelativeDaysInPast();

	/*! \brief Set The number of days prior to the day the report will be delivered at which the report will end
	 */
	void setReportEndRelativeDaysInPast(long report_end_relative_days_in_past);
	/*! \brief Get 
	 */
	DataOutputFormat getReportFormat();

	/*! \brief Set 
	 */
	void setReportFormat(DataOutputFormat report_format);
	/*! \brief Get 
	 */
	MetricsReportingLevel getReportLevel();

	/*! \brief Set 
	 */
	void setReportLevel(MetricsReportingLevel report_level);
	/*! \brief Get The number of days prior to the day the report will be delivered at which the report will start
	 */
	long getReportStartRelativeDaysInPast();

	/*! \brief Set The number of days prior to the day the report will be delivered at which the report will start
	 */
	void setReportStartRelativeDaysInPast(long report_start_relative_days_in_past);
	/*! \brief Get Timezone for reporting data
	 */
	ReportingTimeZone getReportingTimeZone();

	/*! \brief Set Timezone for reporting data
	 */
	void setReportingTimeZone(ReportingTimeZone reporting_time_zone);
	/*! \brief Get Unified metric sort configuration
	 */
	AnyType getSortBy();

	/*! \brief Set Unified metric sort configuration
	 */
	void setSortBy(AnyType sort_by);
	/*! \brief Get Type of the template
	 */
	std::string getType();

	/*! \brief Set Type of the template
	 */
	void setType(std::string type);
	/*! \brief Get Time of last update in seconds since Unix epoch
	 */
	long getUpdatedTime();

	/*! \brief Set Time of last update in seconds since Unix epoch
	 */
	void setUpdatedTime(long updated_time);
	/*! \brief Get ID of the user who created the template
	 */
	std::string getUserId();

	/*! \brief Set ID of the user who created the template
	 */
	void setUserId(std::string user_id);
	/*! \brief Get The length of the sliding window over which view conversions will be attributed
	 */
	long getViewWindowDays();

	/*! \brief Set The length of the sliding window over which view conversions will be attributed
	 */
	void setViewWindowDays(long view_window_days);


    private:
    std::string ad_account_id{};
    std::list<std::string> ad_account_ids;
    std::list<std::string> ade_columns;
    AnyType attribution_type;
    long click_window_days{};
    std::list<ReportingColumn> columns;
    ConversionReportTimeType conversion_report_time_type;
    CreationSource creation_source;
    std::list<std::string> custom_column_ids;
    std::string display_metadata{};
    long engagement_window_days{};
    std::string filters_json{};
    Granularity granularity;
    std::string id{};
    std::list<IngestionSource> ingestion_sources;
    bool is_default{};
    bool is_deleted{};
    bool is_owned_by_user{};
    bool is_scheduled{};
    std::string name{};
    long report_end_relative_days_in_past{};
    DataOutputFormat report_format;
    MetricsReportingLevel report_level;
    long report_start_relative_days_in_past{};
    ReportingTimeZone reporting_time_zone;
    AnyType sort_by;
    std::string type{};
    long updated_time{};
    std::string user_id{};
    long view_window_days{};
};
}

#endif /* TINY_CPP_CLIENT_AccountTemplate_H_ */
