/*
 * Pins_save_request.h
 *
 * 
 */

#ifndef _Pins_save_request_H_
#define _Pins_save_request_H_


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

class Pins_save_request : public Object {
public:
	/*! \brief Constructor.
	 */
	Pins_save_request();
	Pins_save_request(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Pins_save_request();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Unique identifier of the board to which the pin will be saved.
	 */
	std::string getBoardId();

	/*! \brief Set Unique identifier of the board to which the pin will be saved.
	 */
	void setBoardId(std::string  board_id);
	/*! \brief Get Unique identifier of the board section to which the pin will be saved.
	 */
	std::string getBoardSectionId();

	/*! \brief Set Unique identifier of the board section to which the pin will be saved.
	 */
	void setBoardSectionId(std::string  board_section_id);

private:
	std::string board_id;
	std::string board_section_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Pins_save_request_H_ */
