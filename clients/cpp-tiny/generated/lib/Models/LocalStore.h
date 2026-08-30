
/*
 * LocalStore.h
 *
 * Local store entity
 */

#ifndef TINY_CPP_CLIENT_LocalStore_H_
#define TINY_CPP_CLIENT_LocalStore_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Country.h"

namespace Tiny {


/*! \brief Local store entity
 *
 *  \ingroup Models
 *
 */

class LocalStore{
public:

    /*! \brief Constructor.
	 */
    LocalStore();
    LocalStore(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~LocalStore();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Primary address line of the store.
	 */
	std::string getAddressPrimary();

	/*! \brief Set Primary address line of the store.
	 */
	void setAddressPrimary(std::string address_primary);
	/*! \brief Get Secondary address line of the store.
	 */
	std::string getAddressSecondary();

	/*! \brief Set Secondary address line of the store.
	 */
	void setAddressSecondary(std::string address_secondary);
	/*! \brief Get City where the store is located.
	 */
	std::string getCity();

	/*! \brief Set City where the store is located.
	 */
	void setCity(std::string city);
	/*! \brief Get Country code where the store is located.
	 */
	Country getCountry();

	/*! \brief Set Country code where the store is located.
	 */
	void setCountry(Country country);
	/*! \brief Get Creation timestamp
	 */
	std::string getCreatedAt();

	/*! \brief Set Creation timestamp
	 */
	void setCreatedAt(std::string created_at);
	/*! \brief Get The ID of the local store.
	 */
	std::string getId();

	/*! \brief Set The ID of the local store.
	 */
	void setId(std::string id);
	/*! \brief Get Geographic latitude coordinate of the store.
	 */
	float getLatitude();

	/*! \brief Set Geographic latitude coordinate of the store.
	 */
	void setLatitude(float latitude);
	/*! \brief Get Geographic longitude coordinate of the store.
	 */
	float getLongitude();

	/*! \brief Set Geographic longitude coordinate of the store.
	 */
	void setLongitude(float longitude);
	/*! \brief Get The name of the local store.
	 */
	std::string getName();

	/*! \brief Set The name of the local store.
	 */
	void setName(std::string name);
	/*! \brief Get Postal or ZIP code of the store.
	 */
	std::string getPostalCode();

	/*! \brief Set Postal or ZIP code of the store.
	 */
	void setPostalCode(std::string postal_code);
	/*! \brief Get State or region code where the store is located.
	 */
	std::string getRegion();

	/*! \brief Set State or region code where the store is located.
	 */
	void setRegion(std::string region);
	/*! \brief Get Merchant provided code for the local store. Unique within the merchant's catalog.
	 */
	std::string getStoreCode();

	/*! \brief Set Merchant provided code for the local store. Unique within the merchant's catalog.
	 */
	void setStoreCode(std::string store_code);
	/*! \brief Get Last update timestamp
	 */
	std::string getUpdatedAt();

	/*! \brief Set Last update timestamp
	 */
	void setUpdatedAt(std::string updated_at);


    private:
    std::string address_primary{};
    std::string address_secondary{};
    std::string city{};
    Country country;
    std::string created_at{};
    std::string id{};
    float latitude{};
    float longitude{};
    std::string name{};
    std::string postal_code{};
    std::string region{};
    std::string store_code{};
    std::string updated_at{};
};
}

#endif /* TINY_CPP_CLIENT_LocalStore_H_ */
