
/*
 * AdAccountCreate.h
 *
 * Resource create operation model.
 */

#ifndef TINY_CPP_CLIENT_AdAccountCreate_H_
#define TINY_CPP_CLIENT_AdAccountCreate_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Country.h"
#include "Currency.h"

namespace Tiny {


/*! \brief Resource create operation model.
 *
 *  \ingroup Models
 *
 */

class AdAccountCreate{
public:

    /*! \brief Constructor.
	 */
    AdAccountCreate();
    AdAccountCreate(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdAccountCreate();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	Country getCountry();

	/*! \brief Set 
	 */
	void setCountry(Country country);
	/*! \brief Get 
	 */
	Currency getCurrency();

	/*! \brief Set 
	 */
	void setCurrency(Currency currency);
	/*! \brief Get Ad account name.
	 */
	std::string getName();

	/*! \brief Set Ad account name.
	 */
	void setName(std::string name);
	/*! \brief Get Advertiser's owning user ID.
	 */
	std::string getOwnerUserId();

	/*! \brief Set Advertiser's owning user ID.
	 */
	void setOwnerUserId(std::string owner_user_id);
	/*! \brief Get The time zone of the ad account, in IANA format (e.g., \"America/Los_Angeles\"). Adding your local time zone lets you view your campaigns and ad reporting in your preferred time zone. Future reports will be available in both your local time zone and default UTC time zone. Historical data takes 1-2 months to backfill. Your billing and order lines will remain in UTC.
	 */
	std::string getTimeZone();

	/*! \brief Set The time zone of the ad account, in IANA format (e.g., \"America/Los_Angeles\"). Adding your local time zone lets you view your campaigns and ad reporting in your preferred time zone. Future reports will be available in both your local time zone and default UTC time zone. Historical data takes 1-2 months to backfill. Your billing and order lines will remain in UTC.
	 */
	void setTimeZone(std::string time_zone);


    private:
    Country country;
    Currency currency;
    std::string name{};
    std::string owner_user_id{};
    std::string time_zone{};
};
}

#endif /* TINY_CPP_CLIENT_AdAccountCreate_H_ */
