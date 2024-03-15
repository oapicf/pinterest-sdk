/*
 * Ads_credits_discounts_get_200_response.h
 *
 * 
 */

#ifndef _Ads_credits_discounts_get_200_response_H_
#define _Ads_credits_discounts_get_200_response_H_


#include <string>
#include "AdsCreditDiscountsResponse.h"
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

class Ads_credits_discounts_get_200_response : public Object {
public:
	/*! \brief Constructor.
	 */
	Ads_credits_discounts_get_200_response();
	Ads_credits_discounts_get_200_response(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Ads_credits_discounts_get_200_response();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<AdsCreditDiscountsResponse> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list <AdsCreditDiscountsResponse> items);
	/*! \brief Get 
	 */
	std::string getBookmark();

	/*! \brief Set 
	 */
	void setBookmark(std::string  bookmark);

private:
	std::list <AdsCreditDiscountsResponse>items;
	std::string bookmark;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Ads_credits_discounts_get_200_response_H_ */
