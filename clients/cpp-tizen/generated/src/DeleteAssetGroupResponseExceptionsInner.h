/*
 * DeleteAssetGroupResponse_exceptions_inner.h
 *
 * 
 */

#ifndef _DeleteAssetGroupResponse_exceptions_inner_H_
#define _DeleteAssetGroupResponse_exceptions_inner_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class DeleteAssetGroupResponse_exceptions_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	DeleteAssetGroupResponse_exceptions_inner();
	DeleteAssetGroupResponse_exceptions_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DeleteAssetGroupResponse_exceptions_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	/*! \brief Get Asset group id of the exception.
	 */
	std::string getAssetGroupId();

	/*! \brief Set Asset group id of the exception.
	 */
	void setAssetGroupId(std::string  asset_group_id);

private:
	int code;
	std::string message;
	std::string asset_group_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DeleteAssetGroupResponse_exceptions_inner_H_ */
