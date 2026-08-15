
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
	void setCountry(Country  country);
	/*! \brief Get  Creation time. Unix timestamp in seconds.
	 */
	int getCreatedTime();

	/*! \brief Set  Creation time. Unix timestamp in seconds.
	 */
	void setCreatedTime(int  created_time);
	/*! \brief Get 
	 */
	Currency getCurrency();

	/*! \brief Set 
	 */
	void setCurrency(Currency  currency);
	/*! \brief Get 
	 */
	std::string getId();

	/*! \brief Set 
	 */
	void setId(std::string  id);
	/*! \brief Get Ad account name.
	 */
	std::string getName();

	/*! \brief Set Ad account name.
	 */
	void setName(std::string  name);
	/*! \brief Get Ad account owner
	 */
	AdAccountOwner getOwner();

	/*! \brief Set Ad account owner
	 */
	void setOwner(AdAccountOwner  owner);
	/*! \brief Get 
	 */
	std::list<BusinessAccessRole> getPermissions();

	/*! \brief Set 
	 */
	void setPermissions(std::list <BusinessAccessRole> permissions);
	/*! \brief Get 
	 */
	int getUpdatedTime();

	/*! \brief Set 
	 */
	void setUpdatedTime(int  updated_time);


    private:
    Country country;
    int created_time{};
    Currency currency;
    std::string id{};
    std::string name{};
    AdAccountOwner owner;
    std::list<BusinessAccessRole> permissions;
    int updated_time{};
};
}

#endif /* TINY_CPP_CLIENT_AdAccount_H_ */
