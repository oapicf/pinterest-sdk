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

	/*! \brief Get 
	 */
	std::string getId();

	/*! \brief Set 
	 */
	void setId(std::string  id);
	/*! \brief Get 
	 */
	std::string getFeedId();

	/*! \brief Set 
	 */
	void setFeedId(std::string  feed_id);
	/*! \brief Get 
	 */
	std::string getCreatedAt();

	/*! \brief Set 
	 */
	void setCreatedAt(std::string  created_at);
	/*! \brief Get 
	 */
	CatalogsFeedProcessingStatus getStatus();

	/*! \brief Set 
	 */
	void setStatus(CatalogsFeedProcessingStatus  status);

private:
	std::string id;
	std::string feed_id;
	std::string created_at;
	CatalogsFeedProcessingStatus status;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsFeedIngestion_H_ */
