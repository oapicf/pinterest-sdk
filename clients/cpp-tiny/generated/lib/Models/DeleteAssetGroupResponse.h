
/*
 * DeleteAssetGroupResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_DeleteAssetGroupResponse_H_
#define TINY_CPP_CLIENT_DeleteAssetGroupResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "DeleteAssetGroupResponse_exceptions_inner.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class DeleteAssetGroupResponse{
public:

    /*! \brief Constructor.
	 */
    DeleteAssetGroupResponse();
    DeleteAssetGroupResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~DeleteAssetGroupResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get A list of ids of successfully deleted asset groups.
	 */
	std::list<std::string> getDeletedAssetGroups();

	/*! \brief Set A list of ids of successfully deleted asset groups.
	 */
	void setDeletedAssetGroups(std::list <std::string> deleted_asset_groups);
	/*! \brief Get A list of errors associated with the asset groups. Will be returned if there is an error.
	 */
	std::list<DeleteAssetGroupResponse_exceptions_inner> getExceptions();

	/*! \brief Set A list of errors associated with the asset groups. Will be returned if there is an error.
	 */
	void setExceptions(std::list <DeleteAssetGroupResponse_exceptions_inner> exceptions);


    private:
    std::list<std::string> deleted_asset_groups;
    std::list<DeleteAssetGroupResponse_exceptions_inner> exceptions;
};
}

#endif /* TINY_CPP_CLIENT_DeleteAssetGroupResponse_H_ */
