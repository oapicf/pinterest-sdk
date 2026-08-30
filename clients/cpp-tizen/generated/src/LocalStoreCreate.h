/*
 * LocalStoreCreate.h
 *
 * Resource create operation model.
 */

#ifndef _LocalStoreCreate_H_
#define _LocalStoreCreate_H_


#include <string>
#include "Country.h"
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

class LocalStoreCreate : public Object {
public:
	/*! \brief Constructor.
	 */
	LocalStoreCreate();
	LocalStoreCreate(char* str);

	/*! \brief Destructor.
	 */
	virtual ~LocalStoreCreate();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Primary address line of the store.
	 */
	std::string getAddressPrimary();

	/*! \brief Set Primary address line of the store.
	 */
	void setAddressPrimary(std::string  address_primary);
	/*! \brief Get Secondary address line of the store.
	 */
	std::string getAddressSecondary();

	/*! \brief Set Secondary address line of the store.
	 */
	void setAddressSecondary(std::string  address_secondary);
	/*! \brief Get City where the store is located.
	 */
	std::string getCity();

	/*! \brief Set City where the store is located.
	 */
	void setCity(std::string  city);
	/*! \brief Get Country code where the store is located.
	 */
	Country getCountry();

	/*! \brief Set Country code where the store is located.
	 */
	void setCountry(Country  country);
	/*! \brief Get Geographic latitude coordinate of the store.
	 */
	float getLatitude();

	/*! \brief Set Geographic latitude coordinate of the store.
	 */
	void setLatitude(float  latitude);
	/*! \brief Get Geographic longitude coordinate of the store.
	 */
	float getLongitude();

	/*! \brief Set Geographic longitude coordinate of the store.
	 */
	void setLongitude(float  longitude);
	/*! \brief Get The name of the local store.
	 */
	std::string getName();

	/*! \brief Set The name of the local store.
	 */
	void setName(std::string  name);
	/*! \brief Get Postal or ZIP code of the store.
	 */
	std::string getPostalCode();

	/*! \brief Set Postal or ZIP code of the store.
	 */
	void setPostalCode(std::string  postal_code);
	/*! \brief Get State or region code where the store is located.
	 */
	std::string getRegion();

	/*! \brief Set State or region code where the store is located.
	 */
	void setRegion(std::string  region);
	/*! \brief Get Merchant provided code for the local store. Unique within the merchant's catalog.
	 */
	std::string getStoreCode();

	/*! \brief Set Merchant provided code for the local store. Unique within the merchant's catalog.
	 */
	void setStoreCode(std::string  store_code);

private:
	std::string address_primary;
	std::string address_secondary;
	std::string city;
	Country country;
	float latitude;
	float longitude;
	std::string name;
	std::string postal_code;
	std::string region;
	std::string store_code;
	void __init();
	void __cleanup();

};
}
}

#endif /* _LocalStoreCreate_H_ */
