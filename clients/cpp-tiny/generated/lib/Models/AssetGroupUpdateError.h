
/*
 * AssetGroupUpdateError.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AssetGroupUpdateError_H_
#define TINY_CPP_CLIENT_AssetGroupUpdateError_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AssetGroupUpdateError{
public:

    /*! \brief Constructor.
	 */
    AssetGroupUpdateError();
    AssetGroupUpdateError(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AssetGroupUpdateError();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getAssetGroupId();

	/*! \brief Set 
	 */
	void setAssetGroupId(std::string asset_group_id);
	/*! \brief Get 
	 */
	int getCode();

	/*! \brief Set 
	 */
	void setCode(int code);
	/*! \brief Get 
	 */
	std::string getMessage();

	/*! \brief Set 
	 */
	void setMessage(std::string message);


    private:
    std::string asset_group_id{};
    int code{};
    std::string message{};
};
}

#endif /* TINY_CPP_CLIENT_AssetGroupUpdateError_H_ */
