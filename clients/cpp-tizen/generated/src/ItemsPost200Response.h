/*
 * Items_post_200_response.h
 *
 * 
 */

#ifndef _Items_post_200_response_H_
#define _Items_post_200_response_H_


#include <string>
#include "ItemResponse.h"
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

class Items_post_200_response : public Object {
public:
	/*! \brief Constructor.
	 */
	Items_post_200_response();
	Items_post_200_response(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Items_post_200_response();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<ItemResponse> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list <ItemResponse> items);

private:
	std::list <ItemResponse>items;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Items_post_200_response_H_ */
