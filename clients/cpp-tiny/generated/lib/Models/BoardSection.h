
/*
 * BoardSection.h
 *
 * Sections help organize pins within a board.
 */

#ifndef TINY_CPP_CLIENT_BoardSection_H_
#define TINY_CPP_CLIENT_BoardSection_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Sections help organize pins within a board.
 *
 *  \ingroup Models
 *
 */

class BoardSection{
public:

    /*! \brief Constructor.
	 */
    BoardSection();
    BoardSection(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BoardSection();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getId();

	/*! \brief Set 
	 */
	void setId(std::string  id);
	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string  name);


    private:
    std::string id{};
    std::string name{};
};
}

#endif /* TINY_CPP_CLIENT_BoardSection_H_ */
