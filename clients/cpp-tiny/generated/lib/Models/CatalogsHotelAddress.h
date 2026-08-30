
/*
 * CatalogsHotelAddress.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CatalogsHotelAddress_H_
#define TINY_CPP_CLIENT_CatalogsHotelAddress_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CatalogsHotelAddress{
public:

    /*! \brief Constructor.
	 */
    CatalogsHotelAddress();
    CatalogsHotelAddress(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsHotelAddress();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Primary street address of hotel.
	 */
	std::string getAddr1();

	/*! \brief Set Primary street address of hotel.
	 */
	void setAddr1(std::string addr1);
	/*! \brief Get City where the hotel is located.
	 */
	std::string getCity();

	/*! \brief Set City where the hotel is located.
	 */
	void setCity(std::string city);
	/*! \brief Get Country where the hotel is located.
	 */
	std::string getCountry();

	/*! \brief Set Country where the hotel is located.
	 */
	void setCountry(std::string country);
	/*! \brief Get Required for countries with a postal code system. Postal or zip code of the hotel.
	 */
	std::string getPostalCode();

	/*! \brief Set Required for countries with a postal code system. Postal or zip code of the hotel.
	 */
	void setPostalCode(std::string postal_code);
	/*! \brief Get State, county, province, where the hotel is located.
	 */
	std::string getRegion();

	/*! \brief Set State, county, province, where the hotel is located.
	 */
	void setRegion(std::string region);


    private:
    std::string addr1{};
    std::string city{};
    std::string country{};
    std::string postal_code{};
    std::string region{};
};
}

#endif /* TINY_CPP_CLIENT_CatalogsHotelAddress_H_ */
