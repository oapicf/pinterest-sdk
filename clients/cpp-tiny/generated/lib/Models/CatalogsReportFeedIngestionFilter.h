
/*
 * CatalogsReportFeedIngestionFilter.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CatalogsReportFeedIngestionFilter_H_
#define TINY_CPP_CLIENT_CatalogsReportFeedIngestionFilter_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CatalogsReportFeedIngestionFilter{
public:

    /*! \brief Constructor.
	 */
    CatalogsReportFeedIngestionFilter();
    CatalogsReportFeedIngestionFilter(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsReportFeedIngestionFilter();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
	/*! \brief Get 
	 */
	std::string getReportType();

	/*! \brief Set 
	 */
	void setReportType(std::string  report_type);


    private:
    std::string feed_id{};
    std::string processing_result_id{};
    std::string report_type{};
};
}

#endif /* TINY_CPP_CLIENT_CatalogsReportFeedIngestionFilter_H_ */
