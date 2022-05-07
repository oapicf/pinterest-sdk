/*
 * Catalogs_feed_processing_result_fields.h
 *
 * 
 */

#ifndef _Catalogs_feed_processing_result_fields_H_
#define _Catalogs_feed_processing_result_fields_H_


#include <string>
#include "CatalogsFeedIngestionDetails.h"
#include "CatalogsFeedProcessingStatus.h"
#include "CatalogsFeedProductCounts.h"
#include "CatalogsFeedValidationDetails.h"
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

class Catalogs_feed_processing_result_fields : public Object {
public:
	/*! \brief Constructor.
	 */
	Catalogs_feed_processing_result_fields();
	Catalogs_feed_processing_result_fields(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Catalogs_feed_processing_result_fields();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	CatalogsFeedIngestionDetails getIngestionDetails();

	/*! \brief Set 
	 */
	void setIngestionDetails(CatalogsFeedIngestionDetails  ingestion_details);
	/*! \brief Get 
	 */
	CatalogsFeedProcessingStatus getStatus();

	/*! \brief Set 
	 */
	void setStatus(CatalogsFeedProcessingStatus  status);
	/*! \brief Get 
	 */
	CatalogsFeedProductCounts getProductCounts();

	/*! \brief Set 
	 */
	void setProductCounts(CatalogsFeedProductCounts  product_counts);
	/*! \brief Get 
	 */
	CatalogsFeedValidationDetails getValidationDetails();

	/*! \brief Set 
	 */
	void setValidationDetails(CatalogsFeedValidationDetails  validation_details);

private:
	CatalogsFeedIngestionDetails ingestion_details;
	CatalogsFeedProcessingStatus status;
	CatalogsFeedProductCounts product_counts;
	CatalogsFeedValidationDetails validation_details;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Catalogs_feed_processing_result_fields_H_ */
