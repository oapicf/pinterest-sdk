/*
 * AssetGroupDeleteError.h
 *
 * 
 */

#ifndef _AssetGroupDeleteError_H_
#define _AssetGroupDeleteError_H_


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

class AssetGroupDeleteError : public Object {
public:
	/*! \brief Constructor.
	 */
	AssetGroupDeleteError();
	AssetGroupDeleteError(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AssetGroupDeleteError();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	std::string asset_group_id;
	int code;
	std::string message;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AssetGroupDeleteError_H_ */
