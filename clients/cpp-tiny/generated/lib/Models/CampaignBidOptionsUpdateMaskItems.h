
/*
 * CampaignBidOptionsUpdateMaskItems.h
 *
 * Fields that can be updated in campaign bid options.
 */

#ifndef TINY_CPP_CLIENT_CampaignBidOptionsUpdateMaskItems_H_
#define TINY_CPP_CLIENT_CampaignBidOptionsUpdateMaskItems_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Fields that can be updated in campaign bid options.
 *
 *  \ingroup Models
 *
 */

class CampaignBidOptionsUpdateMaskItems{
public:

    /*! \brief Constructor.
	 */
    CampaignBidOptionsUpdateMaskItems();
    CampaignBidOptionsUpdateMaskItems(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CampaignBidOptionsUpdateMaskItems();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_CampaignBidOptionsUpdateMaskItems_H_ */
