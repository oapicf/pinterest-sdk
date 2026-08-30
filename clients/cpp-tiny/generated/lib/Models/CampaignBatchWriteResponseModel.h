
/*
 * CampaignBatchWriteResponseModel.h
 *
 * Response model for batch campaign write operations.
 */

#ifndef TINY_CPP_CLIENT_CampaignBatchWriteResponseModel_H_
#define TINY_CPP_CLIENT_CampaignBatchWriteResponseModel_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CampaignBatchItem.h"
#include <list>

namespace Tiny {


/*! \brief Response model for batch campaign write operations.
 *
 *  \ingroup Models
 *
 */

class CampaignBatchWriteResponseModel{
public:

    /*! \brief Constructor.
	 */
    CampaignBatchWriteResponseModel();
    CampaignBatchWriteResponseModel(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CampaignBatchWriteResponseModel();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<CampaignBatchItem> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list<CampaignBatchItem> items);


    private:
    std::list<CampaignBatchItem> items;
};
}

#endif /* TINY_CPP_CLIENT_CampaignBatchWriteResponseModel_H_ */
