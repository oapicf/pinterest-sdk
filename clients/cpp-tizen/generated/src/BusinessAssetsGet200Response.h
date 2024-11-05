/*
 * Business_assets_get_200_response.h
 *
 * 
 */

#ifndef _Business_assets_get_200_response_H_
#define _Business_assets_get_200_response_H_


#include <string>
#include "GetBusinessAssetsResponse.h"
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

class Business_assets_get_200_response : public Object {
public:
	/*! \brief Constructor.
	 */
	Business_assets_get_200_response();
	Business_assets_get_200_response(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Business_assets_get_200_response();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get List of assets the requesting business has access to.
	 */
	std::list<GetBusinessAssetsResponse> getItems();

	/*! \brief Set List of assets the requesting business has access to.
	 */
	void setItems(std::list <GetBusinessAssetsResponse> items);
	/*! \brief Get 
	 */
	std::string getBookmark();

	/*! \brief Set 
	 */
	void setBookmark(std::string  bookmark);

private:
	std::list <GetBusinessAssetsResponse>items;
	std::string bookmark;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Business_assets_get_200_response_H_ */
