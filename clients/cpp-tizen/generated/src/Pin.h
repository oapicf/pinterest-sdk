/*
 * Pin.h
 *
 * Pin
 */

#ifndef _Pin_H_
#define _Pin_H_


#include <string>
#include "BoardOwner.h"
#include "CreativeType.h"
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
	/*! \brief Get 
	 */
	CreativeType getCreativeType();

	/*! \brief Set 
	 */
	void setCreativeType(CreativeType  creative_type);
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
	/*! \brief Get Whether the \"operation user_account\" is the Pin owner.
	 */
	bool getIsOwner();

	/*! \brief Set Whether the \"operation user_account\" is the Pin owner.
	 */
	void setIsOwner(bool  is_owner);
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
	/*! \brief Get The source pin id if this pin was saved from another pin. <a href=\"https://help.pinterest.com/article/save-pins-on-pinterest\">Learn more</a>.
	 */
	std::string getParentPinId();

	/*! \brief Set The source pin id if this pin was saved from another pin. <a href=\"https://help.pinterest.com/article/save-pins-on-pinterest\">Learn more</a>.
	 */
	void setParentPinId(std::string  parent_pin_id);
	/*! \brief Get Whether the Pin is standard or not. See documentation on <a href=\"/docs/api-features/content-overview/\">Changes to Pin creation</a> for more information.
	 */
	bool getIsStandard();

	/*! \brief Set Whether the Pin is standard or not. See documentation on <a href=\"/docs/api-features/content-overview/\">Changes to Pin creation</a> for more information.
	 */
	void setIsStandard(bool  is_standard);
	/*! \brief Get Whether the Pin has been promoted or not.
	 */
	bool getHasBeenPromoted();

	/*! \brief Set Whether the Pin has been promoted or not.
	 */
	void setHasBeenPromoted(bool  has_been_promoted);
	/*! \brief Get Private note for this Pin. <a href=\"https://help.pinterest.com/en/article/add-notes-to-your-pins\">Learn more</a>.
	 */
	std::string getNote();

	/*! \brief Set Private note for this Pin. <a href=\"https://help.pinterest.com/en/article/add-notes-to-your-pins\">Learn more</a>.
	 */
	void setNote(std::string  note);
	/*! \brief Get Pin metrics with associated time intervals if any.
	 */
	std::string getPinMetrics();

	/*! \brief Set Pin metrics with associated time intervals if any.
	 */
	void setPinMetrics(std::string  pin_metrics);

private:
	std::string id;
	std::string created_at;
	std::string link;
	std::string title;
	std::string description;
	std::string dominant_color;
	std::string alt_text;
	CreativeType creative_type;
	std::string board_id;
	std::string board_section_id;
	BoardOwner board_owner;
	bool is_owner;
	PinMedia media;
	PinMediaSource media_source;
	std::string parent_pin_id;
	bool is_standard;
	bool has_been_promoted;
	std::string note;
	std::string pin_metrics;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Pin_H_ */
