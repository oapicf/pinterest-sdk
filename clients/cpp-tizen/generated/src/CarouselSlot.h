/*
 * CarouselSlot.h
 *
 * 
 */

#ifndef _CarouselSlot_H_
#define _CarouselSlot_H_


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

class CarouselSlot : public Object {
public:
	/*! \brief Constructor.
	 */
	CarouselSlot();
	CarouselSlot(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CarouselSlot();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	/*! \brief Get Carousel Pin slot title.
	 */
	std::string getTitle();

	/*! \brief Set Carousel Pin slot title.
	 */
	void setTitle(std::string  title);

private:
	std::string description;
	std::string link;
	std::string title;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CarouselSlot_H_ */
