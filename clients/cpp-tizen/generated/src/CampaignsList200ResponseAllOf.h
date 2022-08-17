/*
 * Campaigns_list_200_response_allOf.h
 *
 * 
 */

#ifndef _Campaigns_list_200_response_allOf_H_
#define _Campaigns_list_200_response_allOf_H_


#include <string>
#include "CampaignResponse.h"
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

class Campaigns_list_200_response_allOf : public Object {
public:
	/*! \brief Constructor.
	 */
	Campaigns_list_200_response_allOf();
	Campaigns_list_200_response_allOf(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Campaigns_list_200_response_allOf();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<CampaignResponse> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list <CampaignResponse> items);

private:
	std::list <CampaignResponse>items;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Campaigns_list_200_response_allOf_H_ */
