/*
 * Lead_forms_create_200_response.h
 *
 * 
 */

#ifndef _Lead_forms_create_200_response_H_
#define _Lead_forms_create_200_response_H_


#include <string>
#include "Lead_forms_create_200_response_items_inner.h"
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

class Lead_forms_create_200_response : public Object {
public:
	/*! \brief Constructor.
	 */
	Lead_forms_create_200_response();
	Lead_forms_create_200_response(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Lead_forms_create_200_response();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<Lead_forms_create_200_response_items_inner> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list <Lead_forms_create_200_response_items_inner> items);

private:
	std::list <Lead_forms_create_200_response_items_inner>items;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Lead_forms_create_200_response_H_ */
