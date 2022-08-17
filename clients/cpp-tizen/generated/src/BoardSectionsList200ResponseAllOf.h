/*
 * Board_sections_list_200_response_allOf.h
 *
 * 
 */

#ifndef _Board_sections_list_200_response_allOf_H_
#define _Board_sections_list_200_response_allOf_H_


#include <string>
#include "BoardSection.h"
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

class Board_sections_list_200_response_allOf : public Object {
public:
	/*! \brief Constructor.
	 */
	Board_sections_list_200_response_allOf();
	Board_sections_list_200_response_allOf(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Board_sections_list_200_response_allOf();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Board sections
	 */
	std::list<BoardSection> getItems();

	/*! \brief Set Board sections
	 */
	void setItems(std::list <BoardSection> items);

private:
	std::list <BoardSection>items;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Board_sections_list_200_response_allOf_H_ */
