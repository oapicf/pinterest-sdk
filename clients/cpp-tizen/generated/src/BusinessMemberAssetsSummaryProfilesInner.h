/*
 * BusinessMemberAssetsSummary_profiles_inner.h
 *
 * 
 */

#ifndef _BusinessMemberAssetsSummary_profiles_inner_H_
#define _BusinessMemberAssetsSummary_profiles_inner_H_


#include <string>
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

class BusinessMemberAssetsSummary_profiles_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	BusinessMemberAssetsSummary_profiles_inner();
	BusinessMemberAssetsSummary_profiles_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BusinessMemberAssetsSummary_profiles_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Unique identifier of a business profile.
	 */
	std::string getId();

	/*! \brief Set Unique identifier of a business profile.
	 */
	void setId(std::string  id);
	/*! \brief Get Permission levels member or partner has on an asset.
	 */
	std::list<std::string> getPermissions();

	/*! \brief Set Permission levels member or partner has on an asset.
	 */
	void setPermissions(std::list <std::string> permissions);

private:
	std::string id;
	std::list <std::string>permissions;
	void __init();
	void __cleanup();

};
}
}

#endif /* _BusinessMemberAssetsSummary_profiles_inner_H_ */
