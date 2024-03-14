/*
 * CampaignCreateResponse.h
 *
 * 
 */

#ifndef _CampaignCreateResponse_H_
#define _CampaignCreateResponse_H_


#include <string>
#include "CampaignCreateResponseItem.h"
#include <list>
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

class CampaignCreateResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	CampaignCreateResponse();
	CampaignCreateResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CampaignCreateResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<CampaignCreateResponseItem> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list <CampaignCreateResponseItem> items);

private:
	std::list <CampaignCreateResponseItem>items;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CampaignCreateResponse_H_ */
