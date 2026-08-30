
/*
 * CatalogsFeedIngestion.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CatalogsFeedIngestion_H_
#define TINY_CPP_CLIENT_CatalogsFeedIngestion_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsFeedProcessingStatus.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CatalogsFeedIngestion{
public:

    /*! \brief Constructor.
	 */
    CatalogsFeedIngestion();
    CatalogsFeedIngestion(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsFeedIngestion();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Timestamp of the feed ingestion.
	 */
	std::string getCreatedAt();

	/*! \brief Set Timestamp of the feed ingestion.
	 */
	void setCreatedAt(std::string created_at);
	/*! \brief Get Catalog Feed id pertaining to the feed ingestion.
	 */
	std::string getFeedId();

	/*! \brief Set Catalog Feed id pertaining to the feed ingestion.
	 */
	void setFeedId(std::string feed_id);
	/*! \brief Get Unique identifier of a feed ingestion.
	 */
	std::string getId();

	/*! \brief Set Unique identifier of a feed ingestion.
	 */
	void setId(std::string id);
	/*! \brief Get Status of the feed ingestion.
	 */
	CatalogsFeedProcessingStatus getStatus();

	/*! \brief Set Status of the feed ingestion.
	 */
	void setStatus(CatalogsFeedProcessingStatus status);


    private:
    std::string created_at{};
    std::string feed_id{};
    std::string id{};
    CatalogsFeedProcessingStatus status;
};
}

#endif /* TINY_CPP_CLIENT_CatalogsFeedIngestion_H_ */
