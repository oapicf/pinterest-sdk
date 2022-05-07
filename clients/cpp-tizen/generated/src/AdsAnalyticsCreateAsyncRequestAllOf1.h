/*
 * AdsAnalyticsCreateAsyncRequest_allOf_1.h
 *
 * 
 */

#ifndef _AdsAnalyticsCreateAsyncRequest_allOf_1_H_
#define _AdsAnalyticsCreateAsyncRequest_allOf_1_H_


#include <string>
#include "DataOutputFormat.h"
#include "MetricsReportingLevel.h"
#include "ReportingColumnAsync.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AdsAnalyticsCreateAsyncRequest_allOf_1 : public Object {
public:
	/*! \brief Constructor.
	 */
	AdsAnalyticsCreateAsyncRequest_allOf_1();
	AdsAnalyticsCreateAsyncRequest_allOf_1(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdsAnalyticsCreateAsyncRequest_allOf_1();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Metric and entity columns
	 */
	std::list<ReportingColumnAsync> getColumns();

	/*! \brief Set Metric and entity columns
	 */
	void setColumns(std::list <ReportingColumnAsync> columns);
	/*! \brief Get Level of the report
	 */
	MetricsReportingLevel getLevel();

	/*! \brief Set Level of the report
	 */
	void setLevel(MetricsReportingLevel  level);
	/*! \brief Get Specification for formatting report data
	 */
	DataOutputFormat getReportFormat();

	/*! \brief Set Specification for formatting report data
	 */
	void setReportFormat(DataOutputFormat  report_format);

private:
	std::list <ReportingColumnAsync>columns;
	MetricsReportingLevel level;
	DataOutputFormat report_format;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdsAnalyticsCreateAsyncRequest_allOf_1_H_ */
