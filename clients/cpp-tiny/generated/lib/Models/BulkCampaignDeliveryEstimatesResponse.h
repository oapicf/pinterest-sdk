
/*
 * BulkCampaignDeliveryEstimatesResponse.h
 *
 * Bulk campaign delivery estimates response.
 */

#ifndef TINY_CPP_CLIENT_BulkCampaignDeliveryEstimatesResponse_H_
#define TINY_CPP_CLIENT_BulkCampaignDeliveryEstimatesResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "BulkCampaignDeliveryEstimatesItem.h"
#include <list>

namespace Tiny {


/*! \brief Bulk campaign delivery estimates response.
 *
 *  \ingroup Models
 *
 */

class BulkCampaignDeliveryEstimatesResponse{
public:

    /*! \brief Constructor.
	 */
    BulkCampaignDeliveryEstimatesResponse();
    BulkCampaignDeliveryEstimatesResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BulkCampaignDeliveryEstimatesResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Per-campaign delivery estimate results, in the same order as the request.
	 */
	std::list<BulkCampaignDeliveryEstimatesItem> getData();

	/*! \brief Set Per-campaign delivery estimate results, in the same order as the request.
	 */
	void setData(std::list<BulkCampaignDeliveryEstimatesItem> data);


    private:
    std::list<BulkCampaignDeliveryEstimatesItem> data;
};
}

#endif /* TINY_CPP_CLIENT_BulkCampaignDeliveryEstimatesResponse_H_ */
