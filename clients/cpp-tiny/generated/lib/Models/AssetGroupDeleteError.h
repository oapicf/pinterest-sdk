
/*
 * AssetGroupDeleteError.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AssetGroupDeleteError_H_
#define TINY_CPP_CLIENT_AssetGroupDeleteError_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AssetGroupDeleteError{
public:

    /*! \brief Constructor.
	 */
    AssetGroupDeleteError();
    AssetGroupDeleteError(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AssetGroupDeleteError();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Asset group id of the exception.
	 */
	std::string getAssetGroupId();

	/*! \brief Set Asset group id of the exception.
	 */
	void setAssetGroupId(std::string asset_group_id);
	/*! \brief Get Error code associated with the error deleting asset group.
	 */
	int getCode();

	/*! \brief Set Error code associated with the error deleting asset group.
	 */
	void setCode(int code);
	/*! \brief Get Error message associated with the error deleting asset group.
	 */
	std::string getMessage();

	/*! \brief Set Error message associated with the error deleting asset group.
	 */
	void setMessage(std::string message);


    private:
    std::string asset_group_id{};
    int code{};
    std::string message{};
};
}

#endif /* TINY_CPP_CLIENT_AssetGroupDeleteError_H_ */
