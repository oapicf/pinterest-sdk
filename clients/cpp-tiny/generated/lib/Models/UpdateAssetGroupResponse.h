
/*
 * UpdateAssetGroupResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_UpdateAssetGroupResponse_H_
#define TINY_CPP_CLIENT_UpdateAssetGroupResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AssetGroupBinding.h"
#include "UpdateAssetGroupResponse_exceptions_inner.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class UpdateAssetGroupResponse{
public:

    /*! \brief Constructor.
	 */
    UpdateAssetGroupResponse();
    UpdateAssetGroupResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UpdateAssetGroupResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get A list of errors associated with the asset groups. Will be returned if there is an error.
	 */
	std::list<UpdateAssetGroupResponse_exceptions_inner> getExceptions();

	/*! \brief Set A list of errors associated with the asset groups. Will be returned if there is an error.
	 */
	void setExceptions(std::list <UpdateAssetGroupResponse_exceptions_inner> exceptions);
	/*! \brief Get A list of successfully edited asset groups.
	 */
	std::list<AssetGroupBinding> getUpdatedAssetGroups();

	/*! \brief Set A list of successfully edited asset groups.
	 */
	void setUpdatedAssetGroups(std::list <AssetGroupBinding> updated_asset_groups);


    private:
    std::list<UpdateAssetGroupResponse_exceptions_inner> exceptions;
    std::list<AssetGroupBinding> updated_asset_groups;
};
}

#endif /* TINY_CPP_CLIENT_UpdateAssetGroupResponse_H_ */
