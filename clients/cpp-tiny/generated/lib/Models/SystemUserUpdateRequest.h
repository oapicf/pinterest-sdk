
/*
 * System_user_update_request.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_System_user_update_request_H_
#define TINY_CPP_CLIENT_System_user_update_request_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class System_user_update_request{
public:

    /*! \brief Constructor.
	 */
    System_user_update_request();
    System_user_update_request(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~System_user_update_request();


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
	void setName(std::string  name);


    private:
    std::string name{};
};
}

#endif /* TINY_CPP_CLIENT_System_user_update_request_H_ */
