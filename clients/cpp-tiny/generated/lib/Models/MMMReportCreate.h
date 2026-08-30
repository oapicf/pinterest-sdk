
/*
 * MMMReportCreate.h
 *
 * Resource create operation model.
 */

#ifndef TINY_CPP_CLIENT_MMMReportCreate_H_
#define TINY_CPP_CLIENT_MMMReportCreate_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "MMMReportGranularity.h"
#include "MMMReportLevel.h"
#include "MMMReportingColumn.h"
#include "MMMReportingTargetingType.h"
#include "TargetingAdvertiserCountry.h"
#include <list>

namespace Tiny {


/*! \brief Resource create operation model.
 *
 *  \ingroup Models
 *
 */

class MMMReportCreate{
public:

    /*! \brief Constructor.
	 */
    MMMReportCreate();
    MMMReportCreate(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MMMReportCreate();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Advertiser IDs for multi-advertiser report
	 */
	std::list<std::string> getAdvertiserIds();

	/*! \brief Set Advertiser IDs for multi-advertiser report
	 */
	void setAdvertiserIds(std::list<std::string> advertiser_ids);
	/*! \brief Get Metric and entity columns
	 */
	std::list<MMMReportingColumn> getColumns();

	/*! \brief Set Metric and entity columns
	 */
	void setColumns(std::list<MMMReportingColumn> columns);
	/*! \brief Get A List of countries for filtering
	 */
	std::list<TargetingAdvertiserCountry> getCountries();

	/*! \brief Set A List of countries for filtering
	 */
	void setCountries(std::list<TargetingAdvertiserCountry> countries);
	/*! \brief Get List of custom column IDs
	 */
	std::list<std::string> getCustomColumnIds();

	/*! \brief Set List of custom column IDs
	 */
	void setCustomColumnIds(std::list<std::string> custom_column_ids);
	/*! \brief Get Metric report end date (UTC). Format: YYYY-MM-DD
	 */
	std::string getEndDate();

	/*! \brief Set Metric report end date (UTC). Format: YYYY-MM-DD
	 */
	void setEndDate(std::string end_date);
	/*! \brief Get   DAY - metrics are broken down daily.    WEEK - metrics are broken down weekly.
	 */
	MMMReportGranularity getGranularity();

	/*! \brief Set   DAY - metrics are broken down daily.    WEEK - metrics are broken down weekly.
	 */
	void setGranularity(MMMReportGranularity granularity);
	/*! \brief Get Level of the report
	 */
	MMMReportLevel getLevel();

	/*! \brief Set Level of the report
	 */
	void setLevel(MMMReportLevel level);
	/*! \brief Get Name of the Marketing Mix Modeling (MMM) report
	 */
	std::string getReportName();

	/*! \brief Set Name of the Marketing Mix Modeling (MMM) report
	 */
	void setReportName(std::string report_name);
	/*! \brief Get Metric report start date (UTC). Format: YYYY-MM-DD
	 */
	std::string getStartDate();

	/*! \brief Set Metric report start date (UTC). Format: YYYY-MM-DD
	 */
	void setStartDate(std::string start_date);
	/*! \brief Get List of targeting types
	 */
	std::list<MMMReportingTargetingType> getTargetingTypes();

	/*! \brief Set List of targeting types
	 */
	void setTargetingTypes(std::list<MMMReportingTargetingType> targeting_types);


    private:
    std::list<std::string> advertiser_ids;
    std::list<MMMReportingColumn> columns;
    std::list<TargetingAdvertiserCountry> countries;
    std::list<std::string> custom_column_ids;
    std::string end_date{};
    MMMReportGranularity granularity;
    MMMReportLevel level;
    std::string report_name{};
    std::string start_date{};
    std::list<MMMReportingTargetingType> targeting_types;
};
}

#endif /* TINY_CPP_CLIENT_MMMReportCreate_H_ */
