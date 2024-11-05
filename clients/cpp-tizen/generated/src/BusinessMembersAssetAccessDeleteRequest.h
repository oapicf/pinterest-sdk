/*
 * Business_members_asset_access_delete_request.h
 *
 * 
 */

#ifndef _Business_members_asset_access_delete_request_H_
#define _Business_members_asset_access_delete_request_H_


#include <string>
#include "Business_members_asset_access_delete_request_accesses_inner.h"
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

class Business_members_asset_access_delete_request : public Object {
public:
	/*! \brief Constructor.
	 */
	Business_members_asset_access_delete_request();
	Business_members_asset_access_delete_request(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Business_members_asset_access_delete_request();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get List of members asset access to be deleted
	 */
	std::list<Business_members_asset_access_delete_request_accesses_inner> getAccesses();

	/*! \brief Set List of members asset access to be deleted
	 */
	void setAccesses(std::list <Business_members_asset_access_delete_request_accesses_inner> accesses);

private:
	std::list <Business_members_asset_access_delete_request_accesses_inner>accesses;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Business_members_asset_access_delete_request_H_ */
