
/*
 * AssetGroupModification.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AssetGroupModification_H_
#define TINY_CPP_CLIENT_AssetGroupModification_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AssetGroupBinding.h"
#include "AssetGroupUpdateError.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AssetGroupModification{
public:

    /*! \brief Constructor.
	 */
    AssetGroupModification();
    AssetGroupModification(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AssetGroupModification();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get A list of errors associated with the asset groups. Will be returned if there is an error.
	 */
	std::list<AssetGroupUpdateError> getExceptions();

	/*! \brief Set A list of errors associated with the asset groups. Will be returned if there is an error.
	 */
	void setExceptions(std::list<AssetGroupUpdateError> exceptions);
	/*! \brief Get A list of successfully edited asset groups.
	 */
	std::list<AssetGroupBinding> getUpdatedAssetGroups();

	/*! \brief Set A list of successfully edited asset groups.
	 */
	void setUpdatedAssetGroups(std::list<AssetGroupBinding> updated_asset_groups);


    private:
    std::list<AssetGroupUpdateError> exceptions;
    std::list<AssetGroupBinding> updated_asset_groups;
};
}

#endif /* TINY_CPP_CLIENT_AssetGroupModification_H_ */
