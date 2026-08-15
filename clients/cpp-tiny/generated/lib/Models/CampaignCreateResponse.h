
/*
 * CampaignCreateResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CampaignCreateResponse_H_
#define TINY_CPP_CLIENT_CampaignCreateResponse_H_


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

class CampaignCreateResponse{
public:

    /*! \brief Constructor.
	 */
    CampaignCreateResponse();
    CampaignCreateResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CampaignCreateResponse();


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

#endif /* TINY_CPP_CLIENT_CampaignCreateResponse_H_ */
