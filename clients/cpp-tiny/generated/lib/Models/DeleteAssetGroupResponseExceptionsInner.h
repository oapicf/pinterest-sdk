
/*
 * DeleteAssetGroupResponse_exceptions_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_DeleteAssetGroupResponse_exceptions_inner_H_
#define TINY_CPP_CLIENT_DeleteAssetGroupResponse_exceptions_inner_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class DeleteAssetGroupResponse_exceptions_inner{
public:

    /*! \brief Constructor.
	 */
    DeleteAssetGroupResponse_exceptions_inner();
    DeleteAssetGroupResponse_exceptions_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~DeleteAssetGroupResponse_exceptions_inner();


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
	void setAssetGroupId(std::string  asset_group_id);
	/*! \brief Get Error code associated with the error deleting asset group.
	 */
	int getCode();

	/*! \brief Set Error code associated with the error deleting asset group.
	 */
	void setCode(int  code);
	/*! \brief Get Error message associated with the error deleting asset group.
	 */
	std::string getMessage();

	/*! \brief Set Error message associated with the error deleting asset group.
	 */
	void setMessage(std::string  message);


    private:
    std::string asset_group_id{};
    int code{};
    std::string message{};
};
}

#endif /* TINY_CPP_CLIENT_DeleteAssetGroupResponse_exceptions_inner_H_ */
