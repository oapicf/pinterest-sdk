
/*
 * Pins_save_request.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Pins_save_request_H_
#define TINY_CPP_CLIENT_Pins_save_request_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Pins_save_request{
public:

    /*! \brief Constructor.
	 */
    Pins_save_request();
    Pins_save_request(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Pins_save_request();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::string board_id{};
    std::string board_section_id{};
};
}

#endif /* TINY_CPP_CLIENT_Pins_save_request_H_ */
