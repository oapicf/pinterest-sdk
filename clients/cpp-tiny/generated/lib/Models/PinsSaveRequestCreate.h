
/*
 * PinsSaveRequestCreate.h
 *
 * Resource create operation model.
 */

#ifndef TINY_CPP_CLIENT_PinsSaveRequestCreate_H_
#define TINY_CPP_CLIENT_PinsSaveRequestCreate_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Resource create operation model.
 *
 *  \ingroup Models
 *
 */

class PinsSaveRequestCreate{
public:

    /*! \brief Constructor.
	 */
    PinsSaveRequestCreate();
    PinsSaveRequestCreate(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PinsSaveRequestCreate();


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
	void setBoardId(std::string board_id);
	/*! \brief Get Unique identifier of the board section to which the pin will be saved.
	 */
	std::string getBoardSectionId();

	/*! \brief Set Unique identifier of the board section to which the pin will be saved.
	 */
	void setBoardSectionId(std::string board_section_id);


    private:
    std::string board_id{};
    std::string board_section_id{};
};
}

#endif /* TINY_CPP_CLIENT_PinsSaveRequestCreate_H_ */
