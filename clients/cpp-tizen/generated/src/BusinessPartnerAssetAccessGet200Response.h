/*
 * Business_partner_asset_access_get_200_response.h
 *
 * 
 */

#ifndef _Business_partner_asset_access_get_200_response_H_
#define _Business_partner_asset_access_get_200_response_H_


#include <string>
#include "GetPartnerAssetsResponse.h"
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

class Business_partner_asset_access_get_200_response : public Object {
public:
	/*! \brief Constructor.
	 */
	Business_partner_asset_access_get_200_response();
	Business_partner_asset_access_get_200_response(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Business_partner_asset_access_get_200_response();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get List assets on which you granted access to your partner or assets on which your partner has granted you access.
	 */
	std::list<GetPartnerAssetsResponse> getItems();

	/*! \brief Set List assets on which you granted access to your partner or assets on which your partner has granted you access.
	 */
	void setItems(std::list <GetPartnerAssetsResponse> items);
	/*! \brief Get 
	 */
	std::string getBookmark();

	/*! \brief Set 
	 */
	void setBookmark(std::string  bookmark);

private:
	std::list <GetPartnerAssetsResponse>items;
	std::string bookmark;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Business_partner_asset_access_get_200_response_H_ */
