/*
 * CatalogsFeedIngestion.h
 *
 * 
 */

#ifndef _CatalogsFeedIngestion_H_
#define _CatalogsFeedIngestion_H_


#include <string>
#include "CatalogsFeedProcessingStatus.h"
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

class CatalogsFeedIngestion : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsFeedIngestion();
	CatalogsFeedIngestion(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsFeedIngestion();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Timestamp of the feed ingestion.
	 */
	std::string getCreatedAt();

	/*! \brief Set Timestamp of the feed ingestion.
	 */
	void setCreatedAt(std::string  created_at);
	/*! \brief Get Catalog Feed id pertaining to the feed ingestion.
	 */
	std::string getFeedId();

	/*! \brief Set Catalog Feed id pertaining to the feed ingestion.
	 */
	void setFeedId(std::string  feed_id);
	/*! \brief Get Unique identifier of a feed ingestion.
	 */
	std::string getId();

	/*! \brief Set Unique identifier of a feed ingestion.
	 */
	void setId(std::string  id);
	/*! \brief Get Status of the feed ingestion.
	 */
	CatalogsFeedProcessingStatus getStatus();

	/*! \brief Set Status of the feed ingestion.
	 */
	void setStatus(CatalogsFeedProcessingStatus  status);

private:
	std::string created_at;
	std::string feed_id;
	std::string id;
	CatalogsFeedProcessingStatus status;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsFeedIngestion_H_ */
