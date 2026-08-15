
/*
 * Business_partner_asset_access_get_200_response.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Business_partner_asset_access_get_200_response_H_
#define TINY_CPP_CLIENT_Business_partner_asset_access_get_200_response_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "GetPartnerAssetsResponse.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Business_partner_asset_access_get_200_response{
public:

    /*! \brief Constructor.
	 */
    Business_partner_asset_access_get_200_response();
    Business_partner_asset_access_get_200_response(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Business_partner_asset_access_get_200_response();


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
	/*! \brief Get List assets on which you granted access to your partner or assets on which your partner has granted you access.
	 */
	std::list<GetPartnerAssetsResponse> getItems();

	/*! \brief Set List assets on which you granted access to your partner or assets on which your partner has granted you access.
	 */
	void setItems(std::list <GetPartnerAssetsResponse> items);


    private:
    std::string bookmark{};
    std::list<GetPartnerAssetsResponse> items;
};
}

#endif /* TINY_CPP_CLIENT_Business_partner_asset_access_get_200_response_H_ */
