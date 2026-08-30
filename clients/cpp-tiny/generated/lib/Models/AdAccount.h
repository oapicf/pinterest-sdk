
/*
 * AdAccount.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AdAccount_H_
#define TINY_CPP_CLIENT_AdAccount_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AdAccountOwner.h"
#include "BusinessAccessRole.h"
#include "Country.h"
#include "Currency.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AdAccount{
public:

    /*! \brief Constructor.
	 */
    AdAccount();
    AdAccount(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdAccount();


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
	/*! \brief Get  Creation time. Unix timestamp in seconds.
	 */
	int getCreatedTime();

	/*! \brief Set  Creation time. Unix timestamp in seconds.
	 */
	void setCreatedTime(int created_time);
	/*! \brief Get 
	 */
	Currency getCurrency();

	/*! \brief Set 
	 */
	void setCurrency(Currency currency);
	/*! \brief Get 
	 */
	std::string getId();

	/*! \brief Set 
	 */
	void setId(std::string id);
	/*! \brief Get Ad account name.
	 */
	std::string getName();

	/*! \brief Set Ad account name.
	 */
	void setName(std::string name);
	/*! \brief Get Ad account owner
	 */
	AdAccountOwner getOwner();

	/*! \brief Set Ad account owner
	 */
	void setOwner(AdAccountOwner owner);
	/*! \brief Get 
	 */
	std::list<BusinessAccessRole> getPermissions();

	/*! \brief Set 
	 */
	void setPermissions(std::list<BusinessAccessRole> permissions);
	/*! \brief Get The time zone of the ad account, in IANA format (e.g., \"America/Los_Angeles\"). Adding your local time zone lets you view your campaigns and ad reporting in your preferred time zone. Future reports will be available in both your local time zone and default UTC time zone. Historical data takes 1-2 months to backfill. Your billing and order lines will remain in UTC.
	 */
	std::string getTimeZone();

	/*! \brief Set The time zone of the ad account, in IANA format (e.g., \"America/Los_Angeles\"). Adding your local time zone lets you view your campaigns and ad reporting in your preferred time zone. Future reports will be available in both your local time zone and default UTC time zone. Historical data takes 1-2 months to backfill. Your billing and order lines will remain in UTC.
	 */
	void setTimeZone(std::string time_zone);
	/*! \brief Get 
	 */
	int getUpdatedTime();

	/*! \brief Set 
	 */
	void setUpdatedTime(int updated_time);


    private:
    Country country;
    int created_time{};
    Currency currency;
    std::string id{};
    std::string name{};
    AdAccountOwner owner;
    std::list<BusinessAccessRole> permissions;
    std::string time_zone{};
    int updated_time{};
};
}

#endif /* TINY_CPP_CLIENT_AdAccount_H_ */
