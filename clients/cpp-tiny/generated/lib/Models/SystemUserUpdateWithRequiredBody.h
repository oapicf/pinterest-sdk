
/*
 * SystemUserUpdateWithRequiredBody.h
 *
 * Resource create or update operation model with required body fields (no OptionalProperties).
 */

#ifndef TINY_CPP_CLIENT_SystemUserUpdateWithRequiredBody_H_
#define TINY_CPP_CLIENT_SystemUserUpdateWithRequiredBody_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Resource create or update operation model with required body fields (no OptionalProperties).
 *
 *  \ingroup Models
 *
 */

class SystemUserUpdateWithRequiredBody{
public:

    /*! \brief Constructor.
	 */
    SystemUserUpdateWithRequiredBody();
    SystemUserUpdateWithRequiredBody(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~SystemUserUpdateWithRequiredBody();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get New system user name
	 */
	std::string getName();

	/*! \brief Set New system user name
	 */
	void setName(std::string name);


    private:
    std::string name{};
};
}

#endif /* TINY_CPP_CLIENT_SystemUserUpdateWithRequiredBody_H_ */
