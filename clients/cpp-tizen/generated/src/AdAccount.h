/*
 * AdAccount.h
 *
 * 
 */

#ifndef _AdAccount_H_
#define _AdAccount_H_


#include <string>
#include "Ad_account_owner.h"
#include "BusinessAccessRole.h"
#include "Country.h"
#include "Currency.h"
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

class AdAccount : public Object {
public:
	/*! \brief Constructor.
	 */
	AdAccount();
	AdAccount(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdAccount();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getId();

	/*! \brief Set 
	 */
	void setId(std::string  id);
	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	Ad_account_owner getOwner();

	/*! \brief Set 
	 */
	void setOwner(Ad_account_owner  owner);
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
	/*! \brief Get 
	 */
	std::list<BusinessAccessRole> getPermissions();

	/*! \brief Set 
	 */
	void setPermissions(std::list <BusinessAccessRole> permissions);
	/*! \brief Get Creation time. Unix timestamp in seconds.
	 */
	int getCreatedTime();

	/*! \brief Set Creation time. Unix timestamp in seconds.
	 */
	void setCreatedTime(int  created_time);
	/*! \brief Get Last update time. Unix timestamp in seconds.
	 */
	int getUpdatedTime();

	/*! \brief Set Last update time. Unix timestamp in seconds.
	 */
	void setUpdatedTime(int  updated_time);

private:
	std::string id;
	std::string name;
	Ad_account_owner owner;
	Country country;
	Currency currency;
	std::list <BusinessAccessRole>permissions;
	int created_time;
	int updated_time;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdAccount_H_ */
