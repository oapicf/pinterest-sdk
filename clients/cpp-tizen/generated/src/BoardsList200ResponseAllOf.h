/*
 * Boards_list_200_response_allOf.h
 *
 * 
 */

#ifndef _Boards_list_200_response_allOf_H_
#define _Boards_list_200_response_allOf_H_


#include <string>
#include "Board.h"
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

class Boards_list_200_response_allOf : public Object {
public:
	/*! \brief Constructor.
	 */
	Boards_list_200_response_allOf();
	Boards_list_200_response_allOf(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Boards_list_200_response_allOf();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Boards
	 */
	std::list<Board> getItems();

	/*! \brief Set Boards
	 */
	void setItems(std::list <Board> items);

private:
	std::list <Board>items;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Boards_list_200_response_allOf_H_ */
