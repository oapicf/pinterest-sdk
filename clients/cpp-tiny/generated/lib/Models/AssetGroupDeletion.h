
/*
 * AssetGroupDeletion.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AssetGroupDeletion_H_
#define TINY_CPP_CLIENT_AssetGroupDeletion_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AssetGroupDeleteError.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AssetGroupDeletion{
public:

    /*! \brief Constructor.
	 */
    AssetGroupDeletion();
    AssetGroupDeletion(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AssetGroupDeletion();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<std::string> getDeletedAssetGroups();

	/*! \brief Set 
	 */
	void setDeletedAssetGroups(std::list<std::string> deleted_asset_groups);
	/*! \brief Get 
	 */
	std::list<AssetGroupDeleteError> getExceptions();

	/*! \brief Set 
	 */
	void setExceptions(std::list<AssetGroupDeleteError> exceptions);


    private:
    std::list<std::string> deleted_asset_groups;
    std::list<AssetGroupDeleteError> exceptions;
};
}

#endif /* TINY_CPP_CLIENT_AssetGroupDeletion_H_ */
