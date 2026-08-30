
/*
 * InviteAssetsSummaryItem.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_InviteAssetsSummaryItem_H_
#define TINY_CPP_CLIENT_InviteAssetsSummaryItem_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class InviteAssetsSummaryItem{
public:

    /*! \brief Constructor.
	 */
    InviteAssetsSummaryItem();
    InviteAssetsSummaryItem(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~InviteAssetsSummaryItem();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Unique identifier of the asset.
	 */
	std::string getId();

	/*! \brief Set Unique identifier of the asset.
	 */
	void setId(std::string id);
	/*! \brief Get Permission levels member or partner has on an asset.
	 */
	std::list<std::string> getPermissions();

	/*! \brief Set Permission levels member or partner has on an asset.
	 */
	void setPermissions(std::list<std::string> permissions);


    private:
    std::string id{};
    std::list<std::string> permissions;
};
}

#endif /* TINY_CPP_CLIENT_InviteAssetsSummaryItem_H_ */
