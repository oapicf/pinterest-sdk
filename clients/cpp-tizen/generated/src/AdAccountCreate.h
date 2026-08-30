/*
 * AdAccountCreate.h
 *
 * Resource create operation model.
 */

#ifndef _AdAccountCreate_H_
#define _AdAccountCreate_H_


#include <string>
#include "Country.h"
#include "Currency.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Resource create operation model.
 *
 *  \ingroup Models
 *
 */

class AdAccountCreate : public Object {
public:
	/*! \brief Constructor.
	 */
	AdAccountCreate();
	AdAccountCreate(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdAccountCreate();

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
	/*! \brief Get 
	 */
	Currency getCurrency();

	/*! \brief Set 
	 */
	void setCurrency(Currency  currency);
	/*! \brief Get Ad account name.
	 */
	std::string getName();

	/*! \brief Set Ad account name.
	 */
	void setName(std::string  name);
	/*! \brief Get Advertiser's owning user ID.
	 */
	std::string getOwnerUserId();

	/*! \brief Set Advertiser's owning user ID.
	 */
	void setOwnerUserId(std::string  owner_user_id);
	/*! \brief Get The time zone of the ad account, in IANA format (e.g., \"America/Los_Angeles\"). Adding your local time zone lets you view your campaigns and ad reporting in your preferred time zone. Future reports will be available in both your local time zone and default UTC time zone. Historical data takes 1-2 months to backfill. Your billing and order lines will remain in UTC.
	 */
	std::string getTimeZone();

	/*! \brief Set The time zone of the ad account, in IANA format (e.g., \"America/Los_Angeles\"). Adding your local time zone lets you view your campaigns and ad reporting in your preferred time zone. Future reports will be available in both your local time zone and default UTC time zone. Historical data takes 1-2 months to backfill. Your billing and order lines will remain in UTC.
	 */
	void setTimeZone(std::string  time_zone);

private:
	Country country;
	Currency currency;
	std::string name;
	std::string owner_user_id;
	std::string time_zone;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdAccountCreate_H_ */
