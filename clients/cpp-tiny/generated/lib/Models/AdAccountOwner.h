
/*
 * AdAccountOwner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AdAccountOwner_H_
#define TINY_CPP_CLIENT_AdAccountOwner_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AdAccountOwner{
public:

    /*! \brief Constructor.
	 */
    AdAccountOwner();
    AdAccountOwner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdAccountOwner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The owning account's user ID.
	 */
	std::string getId();

	/*! \brief Set The owning account's user ID.
	 */
	void setId(std::string id);
	/*! \brief Get Public username for the user account
	 */
	std::string getUsername();

	/*! \brief Set Public username for the user account
	 */
	void setUsername(std::string username);


    private:
    std::string id{};
    std::string username{};
};
}

#endif /* TINY_CPP_CLIENT_AdAccountOwner_H_ */
