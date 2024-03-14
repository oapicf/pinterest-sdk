/*
 * AdAccountCreateRequest.h
 *
 * 
 */

#ifndef _AdAccountCreateRequest_H_
#define _AdAccountCreateRequest_H_


#include <string>
#include "Country.h"
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

class AdAccountCreateRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	AdAccountCreateRequest();
	AdAccountCreateRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdAccountCreateRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	Country getCountry();

	/*! \brief Set 
	 */
	void setCountry(Country  country);
	/*! \brief Get Ad Account name.
	 */
	std::string getName();

	/*! \brief Set Ad Account name.
	 */
	void setName(std::string  name);
	/*! \brief Get Advertiser's owning user ID.
	 */
	std::string getOwnerUserId();

	/*! \brief Set Advertiser's owning user ID.
	 */
	void setOwnerUserId(std::string  owner_user_id);

private:
	Country country;
	std::string name;
	std::string owner_user_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdAccountCreateRequest_H_ */
