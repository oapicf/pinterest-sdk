/*
 * Pin.h
 *
 * Pin
 */

#ifndef _Pin_H_
#define _Pin_H_


#include <string>
#include "BoardOwner.h"
#include "PinMedia.h"
#include "PinMediaSource.h"
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
	BoardOwner getBoardOwner();

	/*! \brief Set 
	 */
	void setBoardOwner(BoardOwner  board_owner);
	/*! \brief Get 
	 */
	PinMedia getMedia();

	/*! \brief Set 
	 */
	void setMedia(PinMedia  media);
	/*! \brief Get 
	 */
	PinMediaSource getMediaSource();

	/*! \brief Set 
	 */
	void setMediaSource(PinMediaSource  media_source);

private:
	std::string id;
	std::string created_at;
	std::string link;
	std::string title;
	std::string description;
	std::string alt_text;
	std::string board_id;
	std::string board_section_id;
	BoardOwner board_owner;
	PinMedia media;
	PinMediaSource media_source;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Pin_H_ */
