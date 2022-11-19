/*
 * Audiences_list_200_response_allOf.h
 *
 * 
 */

#ifndef _Audiences_list_200_response_allOf_H_
#define _Audiences_list_200_response_allOf_H_


#include <string>
#include "Audience.h"
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

class Audiences_list_200_response_allOf : public Object {
public:
	/*! \brief Constructor.
	 */
	Audiences_list_200_response_allOf();
	Audiences_list_200_response_allOf(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Audiences_list_200_response_allOf();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<Audience> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list <Audience> items);

private:
	std::list <Audience>items;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Audiences_list_200_response_allOf_H_ */
