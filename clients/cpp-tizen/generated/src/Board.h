/*
 * Board.h
 *
 * Board
 */

#ifndef _Board_H_
#define _Board_H_


#include <string>
#include "Board_owner.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Board
 *
 *  \ingroup Models
 *
 */

class Board : public Object {
public:
	/*! \brief Constructor.
	 */
	Board();
	Board(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Board();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getId();

	/*! \brief Set 
	 */
	void setId(std::string  id);
	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	std::string getDescription();

	/*! \brief Set 
	 */
	void setDescription(std::string  description);
	/*! \brief Get 
	 */
	Board_owner getOwner();

	/*! \brief Set 
	 */
	void setOwner(Board_owner  owner);
	/*! \brief Get Privacy setting for a board. Learn more about <a href=\"https://help.pinterest.com/en/article/secret-boards\">secret boards</a> and <a href=\"https://help.pinterest.com/en/business/article/protected-boards\">protected boards</a>
	 */
	std::string getPrivacy();

	/*! \brief Set Privacy setting for a board. Learn more about <a href=\"https://help.pinterest.com/en/article/secret-boards\">secret boards</a> and <a href=\"https://help.pinterest.com/en/business/article/protected-boards\">protected boards</a>
	 */
	void setPrivacy(std::string  privacy);

private:
	std::string id;
	std::string name;
	std::string description;
	Board_owner owner;
	std::string privacy;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Board_H_ */
