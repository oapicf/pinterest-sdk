
/*
 * UsersForIndividualAssetResponse.h
 *
 * An object containing the permissions a business member has on the asset.
 */

#ifndef TINY_CPP_CLIENT_UsersForIndividualAssetResponse_H_
#define TINY_CPP_CLIENT_UsersForIndividualAssetResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include <list>

namespace Tiny {


/*! \brief An object containing the permissions a business member has on the asset.
 *
 *  \ingroup Models
 *
 */

class UsersForIndividualAssetResponse{
public:

    /*! \brief Constructor.
	 */
    UsersForIndividualAssetResponse();
    UsersForIndividualAssetResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UsersForIndividualAssetResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Unique identifier of a business asset.
	 */
	std::string getAssetId();

	/*! \brief Set Unique identifier of a business asset.
	 */
	void setAssetId(std::string asset_id);
	/*! \brief Get Unique identifier of the business member with asset access.
	 */
	std::string getMemberId();

	/*! \brief Set Unique identifier of the business member with asset access.
	 */
	void setMemberId(std::string member_id);
	/*! \brief Get Permission levels member or partner has on an asset.
	 */
	std::list<std::string> getPermissions();

	/*! \brief Set Permission levels member or partner has on an asset.
	 */
	void setPermissions(std::list<std::string> permissions);


    private:
    std::string asset_id{};
    std::string member_id{};
    std::list<std::string> permissions;
};
}

#endif /* TINY_CPP_CLIENT_UsersForIndividualAssetResponse_H_ */
