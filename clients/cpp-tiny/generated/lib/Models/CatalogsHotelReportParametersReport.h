
/*
 * CatalogsHotelReportParameters_report.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CatalogsHotelReportParameters_report_H_
#define TINY_CPP_CLIENT_CatalogsHotelReportParameters_report_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsReportAllItemsFilter.h"
#include "CatalogsReportDistributionIssueFilter.h"
#include "CatalogsReportFeedIngestionFilter.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CatalogsHotelReportParameters_report{
public:

    /*! \brief Constructor.
	 */
    CatalogsHotelReportParameters_report();
    CatalogsHotelReportParameters_report(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsHotelReportParameters_report();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getReportType();

	/*! \brief Set 
	 */
	void setReportType(std::string  report_type);
	/*! \brief Get ID of the feed entity.
	 */
	std::string getFeedId();

	/*! \brief Set ID of the feed entity.
	 */
	void setFeedId(std::string  feed_id);
	/*! \brief Get Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result.
	 */
	std::string getProcessingResultId();

	/*! \brief Set Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result.
	 */
	void setProcessingResultId(std::string  processing_result_id);
	/*! \brief Get Unique identifier of a catalog. If not given, oldest catalog will be used
	 */
	std::string getCatalogId();

	/*! \brief Set Unique identifier of a catalog. If not given, oldest catalog will be used
	 */
	void setCatalogId(std::string  catalog_id);


    private:
    std::string report_type{};
    std::string feed_id{};
    std::string processing_result_id{};
    std::string catalog_id{};
};
}

#endif /* TINY_CPP_CLIENT_CatalogsHotelReportParameters_report_H_ */
