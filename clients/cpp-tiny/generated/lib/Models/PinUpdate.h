
/*
 * PinUpdate.h
 *
 * Resource create or update operation model.
 */

#ifndef TINY_CPP_CLIENT_PinUpdate_H_
#define TINY_CPP_CLIENT_PinUpdate_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CarouselSlot.h"
#include <list>

namespace Tiny {


/*! \brief Resource create or update operation model.
 *
 *  \ingroup Models
 *
 */

class PinUpdate{
public:

    /*! \brief Constructor.
	 */
    PinUpdate();
    PinUpdate(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PinUpdate();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::string alt_text{};
    std::string board_id{};
    std::string board_section_id{};
    std::list<CarouselSlot> carousel_slots;
    std::string description{};
    std::string link{};
    std::string title{};
};
}

#endif /* TINY_CPP_CLIENT_PinUpdate_H_ */
