/*
 * PinCreate.h
 *
 * Resource create operation model.
 */

#ifndef _PinCreate_H_
#define _PinCreate_H_


#include <string>
#include "PinMediaSource.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Resource create operation model.
 *
 *  \ingroup Models
 *
 */

class PinCreate : public Object {
public:
	/*! \brief Constructor.
	 */
	PinCreate();
	PinCreate(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PinCreate();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	std::string getDescription();

	/*! \brief Set 
	 */
	void setDescription(std::string  description);
	/*! \brief Get Dominant pin color. Hex number, e.g. `#6E7874`.
	 */
	std::string getDominantColor();

	/*! \brief Set Dominant pin color. Hex number, e.g. `#6E7874`.
	 */
	void setDominantColor(std::string  dominant_color);
	/*! \brief Get 
	 */
	std::string getLink();

	/*! \brief Set 
	 */
	void setLink(std::string  link);
	/*! \brief Get 
	 */
	PinMediaSource getMediaSource();

	/*! \brief Set 
	 */
	void setMediaSource(PinMediaSource  media_source);
	/*! \brief Get The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest).
	 */
	std::string getParentPinId();

	/*! \brief Set The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest).
	 */
	void setParentPinId(std::string  parent_pin_id);
	/*! \brief Get The sponsor account id to request paid partnership from.  Currently the field is only available to a list of users in a closed beta.
	 */
	std::string getSponsorId();

	/*! \brief Set The sponsor account id to request paid partnership from.  Currently the field is only available to a list of users in a closed beta.
	 */
	void setSponsorId(std::string  sponsor_id);
	/*! \brief Get 
	 */
	std::string getTitle();

	/*! \brief Set 
	 */
	void setTitle(std::string  title);

private:
	std::string alt_text;
	std::string board_id;
	std::string board_section_id;
	std::string description;
	std::string dominant_color;
	std::string link;
	PinMediaSource media_source;
	std::string parent_pin_id;
	std::string sponsor_id;
	std::string title;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PinCreate_H_ */
