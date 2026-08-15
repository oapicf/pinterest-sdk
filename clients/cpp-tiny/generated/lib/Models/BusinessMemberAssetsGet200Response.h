
/*
 * Business_member_assets_get_200_response.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Business_member_assets_get_200_response_H_
#define TINY_CPP_CLIENT_Business_member_assets_get_200_response_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AssetIdPermissions.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Business_member_assets_get_200_response{
public:

    /*! \brief Constructor.
	 */
    Business_member_assets_get_200_response();
    Business_member_assets_get_200_response(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Business_member_assets_get_200_response();


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
	void setBookmark(std::string  bookmark);
	/*! \brief Get List asset permissions the given member was granted.
	 */
	std::list<AssetIdPermissions> getItems();

	/*! \brief Set List asset permissions the given member was granted.
	 */
	void setItems(std::list <AssetIdPermissions> items);


    private:
    std::string bookmark{};
    std::list<AssetIdPermissions> items;
};
}

#endif /* TINY_CPP_CLIENT_Business_member_assets_get_200_response_H_ */
