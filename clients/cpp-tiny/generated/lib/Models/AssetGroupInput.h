
/*
 * AssetGroupInput.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AssetGroupInput_H_
#define TINY_CPP_CLIENT_AssetGroupInput_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AssetGroupBinding.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AssetGroupInput{
public:

    /*! \brief Constructor.
	 */
    AssetGroupInput();
    AssetGroupInput(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AssetGroupInput();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	AssetGroupBinding getAssetGroup();

	/*! \brief Set 
	 */
	void setAssetGroup(AssetGroupBinding asset_group);


    private:
    AssetGroupBinding asset_group;
};
}

#endif /* TINY_CPP_CLIENT_AssetGroupInput_H_ */
