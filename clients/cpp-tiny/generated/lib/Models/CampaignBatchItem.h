
/*
 * CampaignBatchItem.h
 *
 * Item in a batch campaign response.
 */

#ifndef TINY_CPP_CLIENT_CampaignBatchItem_H_
#define TINY_CPP_CLIENT_CampaignBatchItem_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CampaignBatchResponseData.h"
#include "Exception.h"
#include <list>

namespace Tiny {


/*! \brief Item in a batch campaign response.
 *
 *  \ingroup Models
 *
 */

class CampaignBatchItem{
public:

    /*! \brief Constructor.
	 */
    CampaignBatchItem();
    CampaignBatchItem(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CampaignBatchItem();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Campaign data on success.
	 */
	CampaignBatchResponseData getData();

	/*! \brief Set Campaign data on success.
	 */
	void setData(CampaignBatchResponseData data);
	/*! \brief Get Exceptions on failure.
	 */
	std::list<Exception> getExceptions();

	/*! \brief Set Exceptions on failure.
	 */
	void setExceptions(std::list<Exception> exceptions);


    private:
    CampaignBatchResponseData data;
    std::list<Exception> exceptions;
};
}

#endif /* TINY_CPP_CLIENT_CampaignBatchItem_H_ */
