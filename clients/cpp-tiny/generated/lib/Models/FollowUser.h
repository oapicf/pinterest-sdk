
/*
 * FollowUser.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_FollowUser_H_
#define TINY_CPP_CLIENT_FollowUser_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class FollowUser{
public:

    /*! \brief Constructor.
	 */
    FollowUser();
    FollowUser(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~FollowUser();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Always 'user'
	 */
	std::string getType();

	/*! \brief Set Always 'user'
	 */
	void setType(std::string type);
	/*! \brief Get Username
	 */
	std::string getUsername();

	/*! \brief Set Username
	 */
	void setUsername(std::string username);


    private:
    std::string type{};
    std::string username{};
};
}

#endif /* TINY_CPP_CLIENT_FollowUser_H_ */
