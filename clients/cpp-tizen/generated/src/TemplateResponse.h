/*
 * TemplateResponse.h
 *
 * Template fields
 */

#ifndef _TemplateResponse_H_
#define _TemplateResponse_H_


#include <string>
#include "DataOutputFormat.h"
#include "Granularity.h"
#include "MetricsReportingLevel.h"
#include "TemplateResponse_date_range.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Template fields
 *
 *  \ingroup Models
 *
 */

class TemplateResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	TemplateResponse();
	TemplateResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TemplateResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Template ID
	 */
	std::string getId();

	/*! \brief Set Template ID
	 */
	void setId(std::string  id);
	/*! \brief Get ID of the Ad Account that owns the template
	 */
	std::string getAdAccountId();

	/*! \brief Set ID of the Ad Account that owns the template
	 */
	void setAdAccountId(std::string  ad_account_id);
	/*! \brief Get IDs of the Ad Accounts that have access to this template
	 */
	std::list<std::string> getAdAccountIds();

	/*! \brief Set IDs of the Ad Accounts that have access to this template
	 */
	void setAdAccountIds(std::list <std::string> ad_account_ids);
	/*! \brief Get ID of the user who created the template
	 */
	std::string getUserId();

	/*! \brief Set ID of the user who created the template
	 */
	void setUserId(std::string  user_id);
	/*! \brief Get Template Name
	 */
	std::string getName();

	/*! \brief Set Template Name
	 */
	void setName(std::string  name);
	/*! \brief Get The number of days prior to the day the report will be delivered at which the report will start
	 */
	long long getReportStartRelativeDaysInPast();

	/*! \brief Set The number of days prior to the day the report will be delivered at which the report will start
	 */
	void setReportStartRelativeDaysInPast(long long  report_start_relative_days_in_past);
	/*! \brief Get The number of days prior to the day the report will be delivered at which the report will end
	 */
	long long getReportEndRelativeDaysInPast();

	/*! \brief Set The number of days prior to the day the report will be delivered at which the report will end
	 */
	void setReportEndRelativeDaysInPast(long long  report_end_relative_days_in_past);
	/*! \brief Get 
	 */
	TemplateResponse_date_range getDateRange();

	/*! \brief Set 
	 */
	void setDateRange(TemplateResponse_date_range  date_range);
	/*! \brief Get 
	 */
	MetricsReportingLevel getReportLevel();

	/*! \brief Set 
	 */
	void setReportLevel(MetricsReportingLevel  report_level);
	/*! \brief Get 
	 */
	DataOutputFormat getReportFormat();

	/*! \brief Set 
	 */
	void setReportFormat(DataOutputFormat  report_format);
	/*! \brief Get A list of columns to be included in the report
	 */
	std::list<std::string> getColumns();

	/*! \brief Set A list of columns to be included in the report
	 */
	void setColumns(std::list <std::string> columns);
	/*! \brief Get 
	 */
	Granularity getGranularity();

	/*! \brief Set 
	 */
	void setGranularity(Granularity  granularity);
	/*! \brief Get The length of the sliding window over which view conversions will be attributed
	 */
	long long getViewWindowDays();

	/*! \brief Set The length of the sliding window over which view conversions will be attributed
	 */
	void setViewWindowDays(long long  view_window_days);
	/*! \brief Get The length of the sliding window over which click conversions will be attributed
	 */
	long long getClickWindowDays();

	/*! \brief Set The length of the sliding window over which click conversions will be attributed
	 */
	void setClickWindowDays(long long  click_window_days);
	/*! \brief Get The length of the sliding window over which engagement conversions will be attributed
	 */
	long long getEngagementWindowDays();

	/*! \brief Set The length of the sliding window over which engagement conversions will be attributed
	 */
	void setEngagementWindowDays(long long  engagement_window_days);
	/*! \brief Get Conversion report time type
	 */
	std::string getConversionReportTimeType();

	/*! \brief Set Conversion report time type
	 */
	void setConversionReportTimeType(std::string  conversion_report_time_type);
	/*! \brief Get A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:<br> \"field\": The column name<br> \"operator\": The operator. Allowed operators: [\"=\", \"!=\", \"in\", \"not_in\", \"~\", \">\", \"<\", \"contains_substring\"]<br> \"value\": A single value or a list of values
	 */
	std::string getFiltersJson();

	/*! \brief Set A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:<br> \"field\": The column name<br> \"operator\": The operator. Allowed operators: [\"=\", \"!=\", \"in\", \"not_in\", \"~\", \">\", \"<\", \"contains_substring\"]<br> \"value\": A single value or a list of values
	 */
	void setFiltersJson(std::string  filters_json);
	/*! \brief Get A boolean value that indicates if the user owns the template
	 */
	bool getIsOwnedByUser();

	/*! \brief Set A boolean value that indicates if the user owns the template
	 */
	void setIsOwnedByUser(bool  is_owned_by_user);
	/*! \brief Get A boolean value that indicates if this template has been used to create a scheduled report
	 */
	bool getIsScheduled();

	/*! \brief Set A boolean value that indicates if this template has been used to create a scheduled report
	 */
	void setIsScheduled(bool  is_scheduled);
	/*! \brief Get The surface used to create this template
	 */
	std::string getCreationSource();

	/*! \brief Set The surface used to create this template
	 */
	void setCreationSource(std::string  creation_source);
	/*! \brief Get A boolean that indicates if the template has been deleted
	 */
	bool getIsDeleted();

	/*! \brief Set A boolean that indicates if the template has been deleted
	 */
	void setIsDeleted(bool  is_deleted);
	/*! \brief Get Time of last update in seconds since Unix epoch
	 */
	long long getUpdatedTime();

	/*! \brief Set Time of last update in seconds since Unix epoch
	 */
	void setUpdatedTime(long long  updated_time);
	/*! \brief Get A list of custom column IDs
	 */
	std::list<std::string> getCustomColumnIds();

	/*! \brief Set A list of custom column IDs
	 */
	void setCustomColumnIds(std::list <std::string> custom_column_ids);
	/*! \brief Get Reporting template type
	 */
	std::string getType();

	/*! \brief Set Reporting template type
	 */
	void setType(std::string  type);
	/*! \brief Get The filter on the conversion ingestion source method for conversion metrics
	 */
	std::list<std::string> getIngestionSources();

	/*! \brief Set The filter on the conversion ingestion source method for conversion metrics
	 */
	void setIngestionSources(std::list <std::string> ingestion_sources);

private:
	std::string id;
	std::string ad_account_id;
	std::list <std::string>ad_account_ids;
	std::string user_id;
	std::string name;
	long long report_start_relative_days_in_past;
	long long report_end_relative_days_in_past;
	TemplateResponse_date_range date_range;
	MetricsReportingLevel report_level;
	DataOutputFormat report_format;
	std::list <std::string>columns;
	Granularity granularity;
	long long view_window_days;
	long long click_window_days;
	long long engagement_window_days;
	std::string conversion_report_time_type;
	std::string filters_json;
	bool is_owned_by_user;
	bool is_scheduled;
	std::string creation_source;
	bool is_deleted;
	long long updated_time;
	std::list <std::string>custom_column_ids;
	std::string type;
	std::list <std::string>ingestion_sources;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TemplateResponse_H_ */
