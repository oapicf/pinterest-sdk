
/*
 * CreateAssetGroupBody.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CreateAssetGroupBody_H_
#define TINY_CPP_CLIENT_CreateAssetGroupBody_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AssetGroupType.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CreateAssetGroupBody{
public:

    /*! \brief Constructor.
	 */
    CreateAssetGroupBody();
    CreateAssetGroupBody(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CreateAssetGroupBody();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Asset group description
	 */
	std::string getAssetGroupDescription();

	/*! \brief Set Asset group description
	 */
	void setAssetGroupDescription(std::string  asset_group_description);
	/*! \brief Get Asset Group name
	 */
	std::string getAssetGroupName();

	/*! \brief Set Asset Group name
	 */
	void setAssetGroupName(std::string  asset_group_name);
	/*! \brief Get Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.
	 */
	std::list<AssetGroupType> getAssetGroupTypes();

	/*! \brief Set Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.
	 */
	void setAssetGroupTypes(std::list <AssetGroupType> asset_group_types);


    private:
    std::string asset_group_description{};
    std::string asset_group_name{};
    std::list<AssetGroupType> asset_group_types;
};
}

#endif /* TINY_CPP_CLIENT_CreateAssetGroupBody_H_ */
