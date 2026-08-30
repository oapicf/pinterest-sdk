/*
 * CampaignBidOptionsUpdateMaskItems.h
 *
 * Fields that can be updated in campaign bid options.
 */

#ifndef _CampaignBidOptionsUpdateMaskItems_H_
#define _CampaignBidOptionsUpdateMaskItems_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Fields that can be updated in campaign bid options.
 *
 *  \ingroup Models
 *
 */

class CampaignBidOptionsUpdateMaskItems : public Object {
public:
	/*! \brief Constructor.
	 */
	CampaignBidOptionsUpdateMaskItems();
	CampaignBidOptionsUpdateMaskItems(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CampaignBidOptionsUpdateMaskItems();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);


private:
	void __init();
	void __cleanup();

};
}
}

#endif /* _CampaignBidOptionsUpdateMaskItems_H_ */
