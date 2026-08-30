
/*
 * BusinessMemberAssetsGetResponse.h
 *
 * Paginated response for business member assets with total count metadata.
 */

#ifndef TINY_CPP_CLIENT_BusinessMemberAssetsGetResponse_H_
#define TINY_CPP_CLIENT_BusinessMemberAssetsGetResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AssetIdPermissions.h"
#include "TotalCountByEntityStatus.h"
#include <list>

namespace Tiny {


/*! \brief Paginated response for business member assets with total count metadata.
 *
 *  \ingroup Models
 *
 */

class BusinessMemberAssetsGetResponse{
public:

    /*! \brief Constructor.
	 */
    BusinessMemberAssetsGetResponse();
    BusinessMemberAssetsGetResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BusinessMemberAssetsGetResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getBookmark();

	/*! \brief Set 
	 */
	void setBookmark(std::string bookmark);
	/*! \brief Get 
	 */
	std::list<AssetIdPermissions> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list<AssetIdPermissions> items);
	/*! \brief Get Total number of assets matching the query
	 */
	int getTotalDataCount();

	/*! \brief Set Total number of assets matching the query
	 */
	void setTotalDataCount(int total_data_count);
	/*! \brief Get Breakdown of asset counts by entity status (ad accounts only)
	 */
	TotalCountByEntityStatus getTotalDataCountByStatus();

	/*! \brief Set Breakdown of asset counts by entity status (ad accounts only)
	 */
	void setTotalDataCountByStatus(TotalCountByEntityStatus total_data_count_by_status);


    private:
    std::string bookmark{};
    std::list<AssetIdPermissions> items;
    int total_data_count{};
    TotalCountByEntityStatus total_data_count_by_status;
};
}

#endif /* TINY_CPP_CLIENT_BusinessMemberAssetsGetResponse_H_ */
