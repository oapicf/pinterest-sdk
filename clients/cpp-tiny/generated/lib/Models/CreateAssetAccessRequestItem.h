
/*
 * CreateAssetAccessRequestItem.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CreateAssetAccessRequestItem_H_
#define TINY_CPP_CLIENT_CreateAssetAccessRequestItem_H_


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

class CreateAssetAccessRequestItem{
public:

    /*! \brief Constructor.
	 */
    CreateAssetAccessRequestItem();
    CreateAssetAccessRequestItem(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CreateAssetAccessRequestItem();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner.
	 */
	std::map<std::string, std::list> getAssetIdToPermissions();

	/*! \brief Set An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner.
	 */
	void setAssetIdToPermissions(std::map<std::string, std::list> asset_id_to_permissions);
	/*! \brief Get Unique identifier of a business partner to request asset access to.
	 */
	std::string getPartnerId();

	/*! \brief Set Unique identifier of a business partner to request asset access to.
	 */
	void setPartnerId(std::string partner_id);


    private:
    std::map<std::string, std::list> asset_id_to_permissions;
    std::string partner_id{};
};
}

#endif /* TINY_CPP_CLIENT_CreateAssetAccessRequestItem_H_ */
