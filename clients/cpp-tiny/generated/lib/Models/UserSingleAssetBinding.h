
/*
 * UserSingleAssetBinding.h
 *
 * An object containing the permissions a business member/partner has on the asset.
 */

#ifndef TINY_CPP_CLIENT_UserSingleAssetBinding_H_
#define TINY_CPP_CLIENT_UserSingleAssetBinding_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "BusinessAccessUserSummary.h"
#include <list>

namespace Tiny {


/*! \brief An object containing the permissions a business member/partner has on the asset.
 *
 *  \ingroup Models
 *
 */

class UserSingleAssetBinding{
public:

    /*! \brief Constructor.
	 */
    UserSingleAssetBinding();
    UserSingleAssetBinding(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UserSingleAssetBinding();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Permission levels member or partner has on an asset.
	 */
	std::list<std::string> getPermissions();

	/*! \brief Set Permission levels member or partner has on an asset.
	 */
	void setPermissions(std::list <std::string> permissions);
	/*! \brief Get 
	 */
	BusinessAccessUserSummary getUser();

	/*! \brief Set 
	 */
	void setUser(BusinessAccessUserSummary  user);


    private:
    std::list<std::string> permissions;
    BusinessAccessUserSummary user;
};
}

#endif /* TINY_CPP_CLIENT_UserSingleAssetBinding_H_ */
