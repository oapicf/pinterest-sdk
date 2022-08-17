/*
 * Items_issues_list_200_response_allOf.h
 *
 * 
 */

#ifndef _Items_issues_list_200_response_allOf_H_
#define _Items_issues_list_200_response_allOf_H_


#include <string>
#include "CatalogsItemValidationIssues.h"
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

class Items_issues_list_200_response_allOf : public Object {
public:
	/*! \brief Constructor.
	 */
	Items_issues_list_200_response_allOf();
	Items_issues_list_200_response_allOf(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Items_issues_list_200_response_allOf();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<CatalogsItemValidationIssues> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list <CatalogsItemValidationIssues> items);

private:
	std::list <CatalogsItemValidationIssues>items;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Items_issues_list_200_response_allOf_H_ */
