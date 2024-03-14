/*
 * CatalogsFeedProcessingResult.h
 *
 * 
 */

#ifndef _CatalogsFeedProcessingResult_H_
#define _CatalogsFeedProcessingResult_H_


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

class CatalogsFeedProcessingResult : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsFeedProcessingResult();
	CatalogsFeedProcessingResult(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsFeedProcessingResult();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getCreatedAt();

	/*! \brief Set 
	 */
	void setCreatedAt(std::string  created_at);
	/*! \brief Get 
	 */
	std::string getId();

	/*! \brief Set 
	 */
	void setId(std::string  id);
	/*! \brief Get 
	 */
	std::string getUpdatedAt();

	/*! \brief Set 
	 */
	void setUpdatedAt(std::string  updated_at);
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
	std::string created_at;
	std::string id;
	std::string updated_at;
	CatalogsFeedIngestionDetails ingestion_details;
	CatalogsFeedProcessingStatus status;
	CatalogsFeedProductCounts product_counts;
	CatalogsFeedValidationDetails validation_details;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsFeedProcessingResult_H_ */
