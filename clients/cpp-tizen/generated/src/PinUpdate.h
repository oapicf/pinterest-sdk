/*
 * PinUpdate.h
 *
 * Pin fields for updates
 */

#ifndef _PinUpdate_H_
#define _PinUpdate_H_


#include <string>
#include "PinUpdate_carousel_slots_inner.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Pin fields for updates
 *
 *  \ingroup Models
 *
 */

class PinUpdate : public Object {
public:
	/*! \brief Constructor.
	 */
	PinUpdate();
	PinUpdate(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PinUpdate();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Pin's alternative text.
	 */
	std::string getAltText();

	/*! \brief Set Pin's alternative text.
	 */
	void setAltText(std::string  alt_text);
	/*! \brief Get The id of the board to move the Pin onto.
	 */
	std::string getBoardId();

	/*! \brief Set The id of the board to move the Pin onto.
	 */
	void setBoardId(std::string  board_id);
	/*! \brief Get <a href=\"https://help.pinterest.com/en/article/create-a-board-section\">Board section</a> ID.
	 */
	std::string getBoardSectionId();

	/*! \brief Set <a href=\"https://help.pinterest.com/en/article/create-a-board-section\">Board section</a> ID.
	 */
	void setBoardSectionId(std::string  board_section_id);
	/*! \brief Get Pin description - 800 characters maximum.
	 */
	std::string getDescription();

	/*! \brief Set Pin description - 800 characters maximum.
	 */
	void setDescription(std::string  description);
	/*! \brief Get URL viewer is taken to when they click pin.
	 */
	std::string getLink();

	/*! \brief Set URL viewer is taken to when they click pin.
	 */
	void setLink(std::string  link);
	/*! \brief Get The native pin title that creators explicitly prefer to display.
	 */
	std::string getTitle();

	/*! \brief Set The native pin title that creators explicitly prefer to display.
	 */
	void setTitle(std::string  title);
	/*! \brief Get Carousel Pin slots data.
	 */
	std::list<PinUpdate_carousel_slots_inner> getCarouselSlots();

	/*! \brief Set Carousel Pin slots data.
	 */
	void setCarouselSlots(std::list <PinUpdate_carousel_slots_inner> carousel_slots);
	/*! \brief Get Private note for this Pin. <a href=\"https://help.pinterest.com/en/article/add-notes-to-your-pins\">Learn more</a>.
	 */
	std::string getNote();

	/*! \brief Set Private note for this Pin. <a href=\"https://help.pinterest.com/en/article/add-notes-to-your-pins\">Learn more</a>.
	 */
	void setNote(std::string  note);

private:
	std::string alt_text;
	std::string board_id;
	std::string board_section_id;
	std::string description;
	std::string link;
	std::string title;
	std::list <PinUpdate_carousel_slots_inner>carousel_slots;
	std::string note;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PinUpdate_H_ */
