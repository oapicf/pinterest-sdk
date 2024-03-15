/*
 * CreateMMMReportRequest.h
 *
 * 
 */

#ifndef _CreateMMMReportRequest_H_
#define _CreateMMMReportRequest_H_


#include <string>
#include "MMMReportingColumn.h"
#include "MMMReportingTargetingType.h"
#include "TargetingAdvertiserCountry.h"
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

class CreateMMMReportRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateMMMReportRequest();
	CreateMMMReportRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateMMMReportRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Name of the Marketing Mix Modeling (MMM) report
	 */
	std::string getReportName();

	/*! \brief Set Name of the Marketing Mix Modeling (MMM) report
	 */
	void setReportName(std::string  report_name);
	/*! \brief Get Metric report start date (UTC). Format: YYYY-MM-DD
	 */
	std::string getStartDate();

	/*! \brief Set Metric report start date (UTC). Format: YYYY-MM-DD
	 */
	void setStartDate(std::string  start_date);
	/*! \brief Get Metric report end date (UTC). Format: YYYY-MM-DD
	 */
	std::string getEndDate();

	/*! \brief Set Metric report end date (UTC). Format: YYYY-MM-DD
	 */
	void setEndDate(std::string  end_date);
	/*! \brief Get DAY - metrics are broken down daily.<br> WEEK - metrics are broken down weekly.
	 */
	std::string getGranularity();

	/*! \brief Set DAY - metrics are broken down daily.<br> WEEK - metrics are broken down weekly.
	 */
	void setGranularity(std::string  granularity);
	/*! \brief Get Level of the report
	 */
	std::string getLevel();

	/*! \brief Set Level of the report
	 */
	void setLevel(std::string  level);
	/*! \brief Get List of targeting types
	 */
	std::list<MMMReportingTargetingType> getTargetingTypes();

	/*! \brief Set List of targeting types
	 */
	void setTargetingTypes(std::list <MMMReportingTargetingType> targeting_types);
	/*! \brief Get Metric and entity columns
	 */
	std::list<MMMReportingColumn> getColumns();

	/*! \brief Set Metric and entity columns
	 */
	void setColumns(std::list <MMMReportingColumn> columns);
	/*! \brief Get A List of countries for filtering
	 */
	std::list<TargetingAdvertiserCountry> getCountries();

	/*! \brief Set A List of countries for filtering
	 */
	void setCountries(std::list <TargetingAdvertiserCountry> countries);

private:
	std::string report_name;
	std::string start_date;
	std::string end_date;
	std::string granularity;
	std::string level;
	std::list <MMMReportingTargetingType>targeting_types;
	std::list <MMMReportingColumn>columns;
	std::list <TargetingAdvertiserCountry>countries;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateMMMReportRequest_H_ */
