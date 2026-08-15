
/*
 * CatalogsFeedProcessingResult.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CatalogsFeedProcessingResult_H_
#define TINY_CPP_CLIENT_CatalogsFeedProcessingResult_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsFeedIngestionDetails.h"
#include "CatalogsFeedProcessingStatus.h"
#include "CatalogsFeedProductCounts.h"
#include "CatalogsFeedValidationDetails.h"
#include "CatalogsFeedVideoCounts.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CatalogsFeedProcessingResult{
public:

    /*! \brief Constructor.
	 */
    CatalogsFeedProcessingResult();
    CatalogsFeedProcessingResult(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsFeedProcessingResult();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
	CatalogsFeedProductCounts getProductCounts();

	/*! \brief Set 
	 */
	void setProductCounts(CatalogsFeedProductCounts  product_counts);
	/*! \brief Get 
	 */
	CatalogsFeedProcessingStatus getStatus();

	/*! \brief Set 
	 */
	void setStatus(CatalogsFeedProcessingStatus  status);
	/*! \brief Get 
	 */
	CatalogsFeedValidationDetails getValidationDetails();

	/*! \brief Set 
	 */
	void setValidationDetails(CatalogsFeedValidationDetails  validation_details);
	/*! \brief Get 
	 */
	CatalogsFeedVideoCounts getVideoCounts();

	/*! \brief Set 
	 */
	void setVideoCounts(CatalogsFeedVideoCounts  video_counts);


    private:
    std::string created_at{};
    std::string id{};
    std::string updated_at{};
    CatalogsFeedIngestionDetails ingestion_details;
    CatalogsFeedProductCounts product_counts;
    CatalogsFeedProcessingStatus status;
    CatalogsFeedValidationDetails validation_details;
    CatalogsFeedVideoCounts video_counts;
};
}

#endif /* TINY_CPP_CLIENT_CatalogsFeedProcessingResult_H_ */
