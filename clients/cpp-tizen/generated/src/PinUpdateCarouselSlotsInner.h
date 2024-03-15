/*
 * PinUpdate_carousel_slots_inner.h
 *
 * 
 */

#ifndef _PinUpdate_carousel_slots_inner_H_
#define _PinUpdate_carousel_slots_inner_H_


#include <string>
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

class PinUpdate_carousel_slots_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	PinUpdate_carousel_slots_inner();
	PinUpdate_carousel_slots_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PinUpdate_carousel_slots_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Carousel Pin slot title.
	 */
	std::string getTitle();

	/*! \brief Set Carousel Pin slot title.
	 */
	void setTitle(std::string  title);
	/*! \brief Get Carousel Pin slot description.
	 */
	std::string getDescription();

	/*! \brief Set Carousel Pin slot description.
	 */
	void setDescription(std::string  description);
	/*! \brief Get Carousel Pin slot link.
	 */
	std::string getLink();

	/*! \brief Set Carousel Pin slot link.
	 */
	void setLink(std::string  link);

private:
	std::string title;
	std::string description;
	std::string link;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PinUpdate_carousel_slots_inner_H_ */
