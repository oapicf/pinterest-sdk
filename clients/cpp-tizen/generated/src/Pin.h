/*
 * Pin.h
 *
 * Pin
 */

#ifndef _Pin_H_
#define _Pin_H_


#include <string>
#include "Board_owner.h"
#include "Pin_media.h"
#include "Pin_media_source.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Pin
 *
 *  \ingroup Models
 *
 */

class Pin : public Object {
public:
	/*! \brief Constructor.
	 */
	Pin();
	Pin(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Pin();

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
	std::string getCreatedAt();

	/*! \brief Set 
	 */
	void setCreatedAt(std::string  created_at);
	/*! \brief Get 
	 */
	std::string getLink();

	/*! \brief Set 
	 */
	void setLink(std::string  link);
	/*! \brief Get 
	 */
	std::string getTitle();

	/*! \brief Set 
	 */
	void setTitle(std::string  title);
	/*! \brief Get 
	 */
	std::string getDescription();

	/*! \brief Set 
	 */
	void setDescription(std::string  description);
	/*! \brief Get Dominant pin color. Hex number, e.g. \\\"#6E7874\\\".
	 */
	std::string getDominantColor();

	/*! \brief Set Dominant pin color. Hex number, e.g. \\\"#6E7874\\\".
	 */
	void setDominantColor(std::string  dominant_color);
	/*! \brief Get 
	 */
	std::string getAltText();

	/*! \brief Set 
	 */
	void setAltText(std::string  alt_text);
	/*! \brief Get The board to which this Pin belongs.
	 */
	std::string getBoardId();

	/*! \brief Set The board to which this Pin belongs.
	 */
	void setBoardId(std::string  board_id);
	/*! \brief Get The board section to which this Pin belongs.
	 */
	std::string getBoardSectionId();

	/*! \brief Set The board section to which this Pin belongs.
	 */
	void setBoardSectionId(std::string  board_section_id);
	/*! \brief Get 
	 */
	Board_owner getBoardOwner();

	/*! \brief Set 
	 */
	void setBoardOwner(Board_owner  board_owner);
	/*! \brief Get 
	 */
	Pin_media getMedia();

	/*! \brief Set 
	 */
	void setMedia(Pin_media  media);
	/*! \brief Get 
	 */
	Pin_media_source getMediaSource();

	/*! \brief Set 
	 */
	void setMediaSource(Pin_media_source  media_source);
	/*! \brief Get The source pin id if this pin was saved from another pin. <a href=\"https://help.pinterest.com/article/save-pins-on-pinterest\">Learn more</a>.
	 */
	std::string getParentPinId();

	/*! \brief Set The source pin id if this pin was saved from another pin. <a href=\"https://help.pinterest.com/article/save-pins-on-pinterest\">Learn more</a>.
	 */
	void setParentPinId(std::string  parent_pin_id);

private:
	std::string id;
	std::string created_at;
	std::string link;
	std::string title;
	std::string description;
	std::string dominant_color;
	std::string alt_text;
	std::string board_id;
	std::string board_section_id;
	Board_owner board_owner;
	Pin_media media;
	Pin_media_source media_source;
	std::string parent_pin_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Pin_H_ */
