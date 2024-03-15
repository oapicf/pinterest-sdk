/*
 * CatalogsHotelAddress.h
 *
 * 
 */

#ifndef _CatalogsHotelAddress_H_
#define _CatalogsHotelAddress_H_


#include <string>
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

class CatalogsHotelAddress : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsHotelAddress();
	CatalogsHotelAddress(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsHotelAddress();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Primary street address of hotel.
	 */
	std::string getAddr1();

	/*! \brief Set Primary street address of hotel.
	 */
	void setAddr1(std::string  addr1);
	/*! \brief Get City where the hotel is located.
	 */
	std::string getCity();

	/*! \brief Set City where the hotel is located.
	 */
	void setCity(std::string  city);
	/*! \brief Get State, county, province, where the hotel is located.
	 */
	std::string getRegion();

	/*! \brief Set State, county, province, where the hotel is located.
	 */
	void setRegion(std::string  region);
	/*! \brief Get Country where the hotel is located.
	 */
	std::string getCountry();

	/*! \brief Set Country where the hotel is located.
	 */
	void setCountry(std::string  country);
	/*! \brief Get Required for countries with a postal code system. Postal or zip code of the hotel.
	 */
	std::string getPostalCode();

	/*! \brief Set Required for countries with a postal code system. Postal or zip code of the hotel.
	 */
	void setPostalCode(std::string  postal_code);

private:
	std::string addr1;
	std::string city;
	std::string region;
	std::string country;
	std::string postal_code;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsHotelAddress_H_ */
