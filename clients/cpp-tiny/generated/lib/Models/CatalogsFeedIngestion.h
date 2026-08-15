
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

	/*! \brief Get 
	 */
	std::string getCreatedAt();

	/*! \brief Set 
	 */
	void setCreatedAt(std::string  created_at);
	/*! \brief Get 
	 */
	std::string getFeedId();

	/*! \brief Set 
	 */
	void setFeedId(std::string  feed_id);
	/*! \brief Get 
	 */
	std::string getId();

	/*! \brief Set 
	 */
	void setId(std::string  id);
	/*! \brief Get 
	 */
	CatalogsFeedProcessingStatus getStatus();

	/*! \brief Set 
	 */
	void setStatus(CatalogsFeedProcessingStatus  status);


    private:
    std::string created_at{};
    std::string feed_id{};
    std::string id{};
    CatalogsFeedProcessingStatus status;
};
}

#endif /* TINY_CPP_CLIENT_CatalogsFeedIngestion_H_ */
