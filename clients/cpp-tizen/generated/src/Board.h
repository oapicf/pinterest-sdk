/*
 * Board.h
 *
 * Board
 */

#ifndef _Board_H_
#define _Board_H_


#include <string>
#include "BoardOwner.h"
#include "Board_media.h"
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
	/*! \brief Get Date and time of board creation.
	 */
	std::string getCreatedAt();

	/*! \brief Set Date and time of board creation.
	 */
	void setCreatedAt(std::string  created_at);
	/*! \brief Get Date and time of last board pins modified.
	 */
	std::string getBoardPinsModifiedAt();

	/*! \brief Set Date and time of last board pins modified.
	 */
	void setBoardPinsModifiedAt(std::string  board_pins_modified_at);
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
	/*! \brief Get Count of collaborators on the board.
	 */
	int getCollaboratorCount();

	/*! \brief Set Count of collaborators on the board.
	 */
	void setCollaboratorCount(int  collaborator_count);
	/*! \brief Get Count of pins on the board.
	 */
	int getPinCount();

	/*! \brief Set Count of pins on the board.
	 */
	void setPinCount(int  pin_count);
	/*! \brief Get Board follower count.
	 */
	int getFollowerCount();

	/*! \brief Set Board follower count.
	 */
	void setFollowerCount(int  follower_count);
	/*! \brief Get 
	 */
	Board_media getMedia();

	/*! \brief Set 
	 */
	void setMedia(Board_media  media);
	/*! \brief Get 
	 */
	BoardOwner getOwner();

	/*! \brief Set 
	 */
	void setOwner(BoardOwner  owner);
	/*! \brief Get Privacy setting for a board. Learn more about <a href=\"https://help.pinterest.com/en/article/secret-boards\">secret boards</a> and <a href=\"https://help.pinterest.com/en/business/article/protected-boards\">protected boards</a>
	 */
	std::string getPrivacy();

	/*! \brief Set Privacy setting for a board. Learn more about <a href=\"https://help.pinterest.com/en/article/secret-boards\">secret boards</a> and <a href=\"https://help.pinterest.com/en/business/article/protected-boards\">protected boards</a>
	 */
	void setPrivacy(std::string  privacy);

private:
	std::string id;
	std::string created_at;
	std::string board_pins_modified_at;
	std::string name;
	std::string description;
	int collaborator_count;
	int pin_count;
	int follower_count;
	Board_media media;
	BoardOwner owner;
	std::string privacy;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Board_H_ */
