
/*
 * DeleteMemberAssetAccessItem.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_DeleteMemberAssetAccessItem_H_
#define TINY_CPP_CLIENT_DeleteMemberAssetAccessItem_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class DeleteMemberAssetAccessItem{
public:

    /*! \brief Constructor.
	 */
    DeleteMemberAssetAccessItem();
    DeleteMemberAssetAccessItem(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~DeleteMemberAssetAccessItem();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Id of the asset on which to remove member permissions.
	 */
	std::string getAssetId();

	/*! \brief Set Id of the asset on which to remove member permissions.
	 */
	void setAssetId(std::string asset_id);
	/*! \brief Get Unique identifier of the member on which to perform the asset permission removal
	 */
	std::string getMemberId();

	/*! \brief Set Unique identifier of the member on which to perform the asset permission removal
	 */
	void setMemberId(std::string member_id);


    private:
    std::string asset_id{};
    std::string member_id{};
};
}

#endif /* TINY_CPP_CLIENT_DeleteMemberAssetAccessItem_H_ */
