/*
 * Boards_list_200_response.h
 *
 * 
 */

#ifndef _Boards_list_200_response_H_
#define _Boards_list_200_response_H_


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

class Boards_list_200_response : public Object {
public:
	/*! \brief Constructor.
	 */
	Boards_list_200_response();
	Boards_list_200_response(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Boards_list_200_response();

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
	/*! \brief Get 
	 */
	std::string getBookmark();

	/*! \brief Set 
	 */
	void setBookmark(std::string  bookmark);

private:
	std::list <Board>items;
	std::string bookmark;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Boards_list_200_response_H_ */
