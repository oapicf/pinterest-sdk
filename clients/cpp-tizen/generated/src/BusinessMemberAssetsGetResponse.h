/*
 * BusinessMemberAssetsGetResponse.h
 *
 * Paginated response for business member assets with total count metadata.
 */

#ifndef _BusinessMemberAssetsGetResponse_H_
#define _BusinessMemberAssetsGetResponse_H_


#include <string>
#include "AssetIdPermissions.h"
#include "TotalCountByEntityStatus.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Paginated response for business member assets with total count metadata.
 *
 *  \ingroup Models
 *
 */

class BusinessMemberAssetsGetResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	BusinessMemberAssetsGetResponse();
	BusinessMemberAssetsGetResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BusinessMemberAssetsGetResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getBookmark();

	/*! \brief Set 
	 */
	void setBookmark(std::string  bookmark);
	/*! \brief Get 
	 */
	std::list<AssetIdPermissions> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list <AssetIdPermissions> items);
	/*! \brief Get Total number of assets matching the query
	 */
	int getTotalDataCount();

	/*! \brief Set Total number of assets matching the query
	 */
	void setTotalDataCount(int  total_data_count);
	/*! \brief Get Breakdown of asset counts by entity status (ad accounts only)
	 */
	TotalCountByEntityStatus getTotalDataCountByStatus();

	/*! \brief Set Breakdown of asset counts by entity status (ad accounts only)
	 */
	void setTotalDataCountByStatus(TotalCountByEntityStatus  total_data_count_by_status);

private:
	std::string bookmark;
	std::list <AssetIdPermissions>items;
	int total_data_count;
	TotalCountByEntityStatus total_data_count_by_status;
	void __init();
	void __cleanup();

};
}
}

#endif /* _BusinessMemberAssetsGetResponse_H_ */
