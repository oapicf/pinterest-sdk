
/*
 * UpdateAssetGroupBody.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_UpdateAssetGroupBody_H_
#define TINY_CPP_CLIENT_UpdateAssetGroupBody_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "UpdateAssetGroupBody_asset_groups_to_update_inner.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class UpdateAssetGroupBody{
public:

    /*! \brief Constructor.
	 */
    UpdateAssetGroupBody();
    UpdateAssetGroupBody(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UpdateAssetGroupBody();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get A list of asset groups and the data that will be used to update them.
	 */
	std::list<UpdateAssetGroupBody_asset_groups_to_update_inner> getAssetGroupsToUpdate();

	/*! \brief Set A list of asset groups and the data that will be used to update them.
	 */
	void setAssetGroupsToUpdate(std::list <UpdateAssetGroupBody_asset_groups_to_update_inner> asset_groups_to_update);


    private:
    std::list<UpdateAssetGroupBody_asset_groups_to_update_inner> asset_groups_to_update;
};
}

#endif /* TINY_CPP_CLIENT_UpdateAssetGroupBody_H_ */
