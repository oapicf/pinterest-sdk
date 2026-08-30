/*
 * CatalogsRetailReportParametersReport.h
 *
 * 
 */

#ifndef _CatalogsRetailReportParametersReport_H_
#define _CatalogsRetailReportParametersReport_H_


#include <string>
#include "CatalogsReportDistributionIssueFilter.h"
#include "CatalogsReportFeedIngestionFilter.h"
#include "CatalogsRetailReportAllItemsFilter.h"
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

class CatalogsRetailReportParametersReport : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsRetailReportParametersReport();
	CatalogsRetailReportParametersReport(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsRetailReportParametersReport();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	/*! \brief Get Unique identifier of a catalog. If not given, oldest catalog will be used
	 */
	std::string getCatalogId();

	/*! \brief Set Unique identifier of a catalog. If not given, oldest catalog will be used
	 */
	void setCatalogId(std::string  catalog_id);
	/*! \brief Get Optional product group ID. If omitted, all items are included. This feature is only available for allowlisted merchants. Please contact your account manager to enable this feature.
	 */
	std::string getProductGroupId();

	/*! \brief Set Optional product group ID. If omitted, all items are included. This feature is only available for allowlisted merchants. Please contact your account manager to enable this feature.
	 */
	void setProductGroupId(std::string  product_group_id);

private:
	std::string feed_id;
	std::string processing_result_id;
	std::string report_type;
	std::string catalog_id;
	std::string product_group_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsRetailReportParametersReport_H_ */
