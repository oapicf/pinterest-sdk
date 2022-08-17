/*
 * Feeds_list_200_response_allOf.h
 *
 * 
 */

#ifndef _Feeds_list_200_response_allOf_H_
#define _Feeds_list_200_response_allOf_H_


#include <string>
#include "CatalogsFeed.h"
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

class Feeds_list_200_response_allOf : public Object {
public:
	/*! \brief Constructor.
	 */
	Feeds_list_200_response_allOf();
	Feeds_list_200_response_allOf(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Feeds_list_200_response_allOf();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<CatalogsFeed> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list <CatalogsFeed> items);

private:
	std::list <CatalogsFeed>items;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Feeds_list_200_response_allOf_H_ */
