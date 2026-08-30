
/*
 * BoardSectionUpdateWithRequiredBody.h
 *
 * Resource create or update operation model with required body fields (no OptionalProperties).
 */

#ifndef TINY_CPP_CLIENT_BoardSectionUpdateWithRequiredBody_H_
#define TINY_CPP_CLIENT_BoardSectionUpdateWithRequiredBody_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Resource create or update operation model with required body fields (no OptionalProperties).
 *
 *  \ingroup Models
 *
 */

class BoardSectionUpdateWithRequiredBody{
public:

    /*! \brief Constructor.
	 */
    BoardSectionUpdateWithRequiredBody();
    BoardSectionUpdateWithRequiredBody(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BoardSectionUpdateWithRequiredBody();


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
	void setId(std::string id);
	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string name);


    private:
    std::string id{};
    std::string name{};
};
}

#endif /* TINY_CPP_CLIENT_BoardSectionUpdateWithRequiredBody_H_ */
