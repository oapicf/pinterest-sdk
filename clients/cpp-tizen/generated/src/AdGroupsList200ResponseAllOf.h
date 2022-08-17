/*
 * Ad_groups_list_200_response_allOf.h
 *
 * 
 */

#ifndef _Ad_groups_list_200_response_allOf_H_
#define _Ad_groups_list_200_response_allOf_H_


#include <string>
#include "AdGroupResponse.h"
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

class Ad_groups_list_200_response_allOf : public Object {
public:
	/*! \brief Constructor.
	 */
	Ad_groups_list_200_response_allOf();
	Ad_groups_list_200_response_allOf(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Ad_groups_list_200_response_allOf();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<AdGroupResponse> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list <AdGroupResponse> items);

private:
	std::list <AdGroupResponse>items;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Ad_groups_list_200_response_allOf_H_ */
