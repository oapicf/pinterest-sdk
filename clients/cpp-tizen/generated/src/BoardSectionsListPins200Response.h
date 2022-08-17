/*
 * Board_sections_list_pins_200_response.h
 *
 * 
 */

#ifndef _Board_sections_list_pins_200_response_H_
#define _Board_sections_list_pins_200_response_H_


#include <string>
#include "Board_sections_list_pins_200_response_allOf.h"
#include "Paginated.h"
#include "Pin.h"
#include <list>
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

class Board_sections_list_pins_200_response : public Object {
public:
	/*! \brief Constructor.
	 */
	Board_sections_list_pins_200_response();
	Board_sections_list_pins_200_response(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Board_sections_list_pins_200_response();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Pins
	 */
	std::list<Pin> getItems();

	/*! \brief Set Pins
	 */
	void setItems(std::list <Pin> items);
	/*! \brief Get 
	 */
	std::string getBookmark();

	/*! \brief Set 
	 */
	void setBookmark(std::string  bookmark);

private:
	std::list <Pin>items;
	std::string bookmark;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Board_sections_list_pins_200_response_H_ */
