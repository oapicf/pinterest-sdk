
/*
 * AssetGroupDeletionDelete.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AssetGroupDeletionDelete_H_
#define TINY_CPP_CLIENT_AssetGroupDeletionDelete_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AssetGroupDeletionDelete{
public:

    /*! \brief Constructor.
	 */
    AssetGroupDeletionDelete();
    AssetGroupDeletionDelete(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AssetGroupDeletionDelete();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<std::string> getAssetGroupsToDelete();

	/*! \brief Set 
	 */
	void setAssetGroupsToDelete(std::list<std::string> asset_groups_to_delete);


    private:
    std::list<std::string> asset_groups_to_delete;
};
}

#endif /* TINY_CPP_CLIENT_AssetGroupDeletionDelete_H_ */
