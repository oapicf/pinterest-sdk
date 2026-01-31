/*
 * PinUpdate.h
 *
 * Resource create or update operation model.
 */

#ifndef _PinUpdate_H_
#define _PinUpdate_H_


#include <string>
#include "CarouselSlot.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Resource create or update operation model.
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
	/*! \brief Get Carousel Pin slots data.
	 */
	std::list<CarouselSlot> getCarouselSlots();

	/*! \brief Set Carousel Pin slots data.
	 */
	void setCarouselSlots(std::list <CarouselSlot> carousel_slots);
	/*! \brief Get 
	 */
	std::string getDescription();

	/*! \brief Set 
	 */
	void setDescription(std::string  description);
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

private:
	std::string alt_text;
	std::string board_id;
	std::string board_section_id;
	std::list <CarouselSlot>carousel_slots;
	std::string description;
	std::string link;
	std::string title;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PinUpdate_H_ */
