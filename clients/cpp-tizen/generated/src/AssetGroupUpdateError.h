/*
 * AssetGroupUpdateError.h
 *
 * 
 */

#ifndef _AssetGroupUpdateError_H_
#define _AssetGroupUpdateError_H_


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

class AssetGroupUpdateError : public Object {
public:
	/*! \brief Constructor.
	 */
	AssetGroupUpdateError();
	AssetGroupUpdateError(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AssetGroupUpdateError();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getAssetGroupId();

	/*! \brief Set 
	 */
	void setAssetGroupId(std::string  asset_group_id);
	/*! \brief Get 
	 */
	int getCode();

	/*! \brief Set 
	 */
	void setCode(int  code);
	/*! \brief Get 
	 */
	std::string getMessage();

	/*! \brief Set 
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

#endif /* _AssetGroupUpdateError_H_ */
