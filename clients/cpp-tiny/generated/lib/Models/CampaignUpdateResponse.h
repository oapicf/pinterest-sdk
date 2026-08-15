
/*
 * CampaignUpdateResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CampaignUpdateResponse_H_
#define TINY_CPP_CLIENT_CampaignUpdateResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CampaignCreateResponseItem.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CampaignUpdateResponse{
public:

    /*! \brief Constructor.
	 */
    CampaignUpdateResponse();
    CampaignUpdateResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CampaignUpdateResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<CampaignCreateResponseItem> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list <CampaignCreateResponseItem> items);


    private:
    std::list<CampaignCreateResponseItem> items;
};
}

#endif /* TINY_CPP_CLIENT_CampaignUpdateResponse_H_ */
