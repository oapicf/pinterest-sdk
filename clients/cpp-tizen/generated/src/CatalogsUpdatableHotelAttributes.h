/*
 * CatalogsUpdatableHotelAttributes.h
 *
 * 
 */

#ifndef _CatalogsUpdatableHotelAttributes_H_
#define _CatalogsUpdatableHotelAttributes_H_


#include <string>
#include "CatalogsHotelAddress.h"
#include "CatalogsHotelGuestRatings.h"
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

class CatalogsUpdatableHotelAttributes : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsUpdatableHotelAttributes();
	CatalogsUpdatableHotelAttributes(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsUpdatableHotelAttributes();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The hotel's name.
	 */
	std::string getName();

	/*! \brief Set The hotel's name.
	 */
	void setName(std::string  name);
	/*! \brief Get Link to the product page
	 */
	std::string getLink();

	/*! \brief Set Link to the product page
	 */
	void setLink(std::string  link);
	/*! \brief Get Brief description of the hotel.
	 */
	std::string getDescription();

	/*! \brief Set Brief description of the hotel.
	 */
	void setDescription(std::string  description);
	/*! \brief Get The brand to which this hotel belongs to.
	 */
	std::string getBrand();

	/*! \brief Set The brand to which this hotel belongs to.
	 */
	void setBrand(std::string  brand);
	/*! \brief Get Latitude of the hotel.
	 */
	long long getLatitude();

	/*! \brief Set Latitude of the hotel.
	 */
	void setLatitude(long long  latitude);
	/*! \brief Get Longitude of the hotel.
	 */
	long long getLongitude();

	/*! \brief Set Longitude of the hotel.
	 */
	void setLongitude(long long  longitude);
	/*! \brief Get A list of neighborhoods where the hotel is located
	 */
	std::list<std::string> getNeighborhood();

	/*! \brief Set A list of neighborhoods where the hotel is located
	 */
	void setNeighborhood(std::list <std::string> neighborhood);
	/*! \brief Get 
	 */
	CatalogsHotelAddress getAddress();

	/*! \brief Set 
	 */
	void setAddress(CatalogsHotelAddress  address);
	/*! \brief Get Custom grouping of hotels
	 */
	std::string getCustomLabel0();

	/*! \brief Set Custom grouping of hotels
	 */
	void setCustomLabel0(std::string  custom_label_0);
	/*! \brief Get Custom grouping of hotels
	 */
	std::string getCustomLabel1();

	/*! \brief Set Custom grouping of hotels
	 */
	void setCustomLabel1(std::string  custom_label_1);
	/*! \brief Get Custom grouping of hotels
	 */
	std::string getCustomLabel2();

	/*! \brief Set Custom grouping of hotels
	 */
	void setCustomLabel2(std::string  custom_label_2);
	/*! \brief Get Custom grouping of hotels
	 */
	std::string getCustomLabel3();

	/*! \brief Set Custom grouping of hotels
	 */
	void setCustomLabel3(std::string  custom_label_3);
	/*! \brief Get Custom grouping of hotels
	 */
	std::string getCustomLabel4();

	/*! \brief Set Custom grouping of hotels
	 */
	void setCustomLabel4(std::string  custom_label_4);
	/*! \brief Get The type of property. The category can be any type of internal description desired.
	 */
	std::string getCategory();

	/*! \brief Set The type of property. The category can be any type of internal description desired.
	 */
	void setCategory(std::string  category);
	/*! \brief Get Base price of the hotel room per night followed by the ISO currency code
	 */
	std::string getBasePrice();

	/*! \brief Set Base price of the hotel room per night followed by the ISO currency code
	 */
	void setBasePrice(std::string  base_price);
	/*! \brief Get Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel.
	 */
	std::string getSalePrice();

	/*! \brief Set Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel.
	 */
	void setSalePrice(std::string  sale_price);
	/*! \brief Get 
	 */
	CatalogsHotelGuestRatings getGuestRatings();

	/*! \brief Set 
	 */
	void setGuestRatings(CatalogsHotelGuestRatings  guest_ratings);

private:
	std::string name;
	std::string link;
	std::string description;
	std::string brand;
	long long latitude;
	long long longitude;
	std::list <std::string>neighborhood;
	CatalogsHotelAddress address;
	std::string custom_label_0;
	std::string custom_label_1;
	std::string custom_label_2;
	std::string custom_label_3;
	std::string custom_label_4;
	std::string category;
	std::string base_price;
	std::string sale_price;
	CatalogsHotelGuestRatings guest_ratings;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsUpdatableHotelAttributes_H_ */
