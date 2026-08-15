
/*
 * CreateAssetAccessRequestBody_asset_requests_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CreateAssetAccessRequestBody_asset_requests_inner_H_
#define TINY_CPP_CLIENT_CreateAssetAccessRequestBody_asset_requests_inner_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Permissions.h"
#include <list>
#include <map>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CreateAssetAccessRequestBody_asset_requests_inner{
public:

    /*! \brief Constructor.
	 */
    CreateAssetAccessRequestBody_asset_requests_inner();
    CreateAssetAccessRequestBody_asset_requests_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CreateAssetAccessRequestBody_asset_requests_inner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner. 
	 */
	Map<std::string, std::string> getAssetIdToPermissions();

	/*! \brief Set An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner. 
	 */
	void setAssetIdToPermissions(Map <std::string, std::string> asset_id_to_permissions);
	/*! \brief Get Unique identifier of a business partner to request asset access to.
	 */
	std::string getPartnerId();

	/*! \brief Set Unique identifier of a business partner to request asset access to.
	 */
	void setPartnerId(std::string  partner_id);


    private:
    Map<std::string, std::string> asset_id_to_permissions;
    std::string partner_id{};
};
}

#endif /* TINY_CPP_CLIENT_CreateAssetAccessRequestBody_asset_requests_inner_H_ */
