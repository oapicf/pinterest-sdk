/*
 * BulkCampaignDeliveryEstimatesResponse.h
 *
 * Bulk campaign delivery estimates response.
 */

#ifndef _BulkCampaignDeliveryEstimatesResponse_H_
#define _BulkCampaignDeliveryEstimatesResponse_H_


#include <string>
#include "BulkCampaignDeliveryEstimatesItem.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Bulk campaign delivery estimates response.
 *
 *  \ingroup Models
 *
 */

class BulkCampaignDeliveryEstimatesResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	BulkCampaignDeliveryEstimatesResponse();
	BulkCampaignDeliveryEstimatesResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BulkCampaignDeliveryEstimatesResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Per-campaign delivery estimate results, in the same order as the request.
	 */
	std::list<BulkCampaignDeliveryEstimatesItem> getData();

	/*! \brief Set Per-campaign delivery estimate results, in the same order as the request.
	 */
	void setData(std::list <BulkCampaignDeliveryEstimatesItem> data);

private:
	std::list <BulkCampaignDeliveryEstimatesItem>data;
	void __init();
	void __cleanup();

};
}
}

#endif /* _BulkCampaignDeliveryEstimatesResponse_H_ */
