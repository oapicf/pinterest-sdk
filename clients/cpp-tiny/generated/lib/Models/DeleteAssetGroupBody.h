
/*
 * DeleteAssetGroupBody.h
 *
 * Request body used to delete asset groups
 */

#ifndef TINY_CPP_CLIENT_DeleteAssetGroupBody_H_
#define TINY_CPP_CLIENT_DeleteAssetGroupBody_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include <list>

namespace Tiny {


/*! \brief Request body used to delete asset groups
 *
 *  \ingroup Models
 *
 */

class DeleteAssetGroupBody{
public:

    /*! \brief Constructor.
	 */
    DeleteAssetGroupBody();
    DeleteAssetGroupBody(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~DeleteAssetGroupBody();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get List of ids of asset groups to be deleted
	 */
	std::list<std::string> getAssetGroupsToDelete();

	/*! \brief Set List of ids of asset groups to be deleted
	 */
	void setAssetGroupsToDelete(std::list <std::string> asset_groups_to_delete);


    private:
    std::list<std::string> asset_groups_to_delete;
};
}

#endif /* TINY_CPP_CLIENT_DeleteAssetGroupBody_H_ */
