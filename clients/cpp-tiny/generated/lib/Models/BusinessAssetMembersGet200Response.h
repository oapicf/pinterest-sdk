
/*
 * Business_asset_members_get_200_response.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Business_asset_members_get_200_response_H_
#define TINY_CPP_CLIENT_Business_asset_members_get_200_response_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "UserSingleAssetBinding.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Business_asset_members_get_200_response{
public:

    /*! \brief Constructor.
	 */
    Business_asset_members_get_200_response();
    Business_asset_members_get_200_response(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Business_asset_members_get_200_response();


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
	std::list<UserSingleAssetBinding> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list<UserSingleAssetBinding> items);


    private:
    std::string bookmark{};
    std::list<UserSingleAssetBinding> items;
};
}

#endif /* TINY_CPP_CLIENT_Business_asset_members_get_200_response_H_ */
