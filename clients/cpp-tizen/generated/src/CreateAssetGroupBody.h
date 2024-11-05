/*
 * CreateAssetGroupBody.h
 *
 * 
 */

#ifndef _CreateAssetGroupBody_H_
#define _CreateAssetGroupBody_H_


#include <string>
#include "AssetGroupType.h"
#include <list>
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

class CreateAssetGroupBody : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateAssetGroupBody();
	CreateAssetGroupBody(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateAssetGroupBody();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Asset Group name
	 */
	std::string getAssetGroupName();

	/*! \brief Set Asset Group name
	 */
	void setAssetGroupName(std::string  asset_group_name);
	/*! \brief Get Asset group description
	 */
	std::string getAssetGroupDescription();

	/*! \brief Set Asset group description
	 */
	void setAssetGroupDescription(std::string  asset_group_description);
	/*! \brief Get Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.
	 */
	std::list<AssetGroupType> getAssetGroupTypes();

	/*! \brief Set Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.
	 */
	void setAssetGroupTypes(std::list <AssetGroupType> asset_group_types);

private:
	std::string asset_group_name;
	std::string asset_group_description;
	std::list <AssetGroupType>asset_group_types;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateAssetGroupBody_H_ */
