/*
 * Billing_profiles_get_200_response.h
 *
 * 
 */

#ifndef _Billing_profiles_get_200_response_H_
#define _Billing_profiles_get_200_response_H_


#include <string>
#include "BillingProfilesResponse.h"
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

class Billing_profiles_get_200_response : public Object {
public:
	/*! \brief Constructor.
	 */
	Billing_profiles_get_200_response();
	Billing_profiles_get_200_response(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Billing_profiles_get_200_response();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<BillingProfilesResponse> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list <BillingProfilesResponse> items);
	/*! \brief Get 
	 */
	std::string getBookmark();

	/*! \brief Set 
	 */
	void setBookmark(std::string  bookmark);

private:
	std::list <BillingProfilesResponse>items;
	std::string bookmark;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Billing_profiles_get_200_response_H_ */
