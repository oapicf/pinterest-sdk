
/*
 * CatalogsUpdatableHotelAttributes.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CatalogsUpdatableHotelAttributes_H_
#define TINY_CPP_CLIENT_CatalogsUpdatableHotelAttributes_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsHotelAddress.h"
#include "CatalogsHotelGuestRatings.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CatalogsUpdatableHotelAttributes{
public:

    /*! \brief Constructor.
	 */
    CatalogsUpdatableHotelAttributes();
    CatalogsUpdatableHotelAttributes(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsUpdatableHotelAttributes();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	CatalogsHotelAddress getAddress();

	/*! \brief Set 
	 */
	void setAddress(CatalogsHotelAddress  address);
	/*! \brief Get Base price of the hotel room per night followed by the ISO currency code
	 */
	std::string getBasePrice();

	/*! \brief Set Base price of the hotel room per night followed by the ISO currency code
	 */
	void setBasePrice(std::string  base_price);
	/*! \brief Get The brand to which this hotel belongs to.
	 */
	std::string getBrand();

	/*! \brief Set The brand to which this hotel belongs to.
	 */
	void setBrand(std::string  brand);
	/*! \brief Get The type of property. The category can be any type of internal description desired.
	 */
	std::string getCategory();

	/*! \brief Set The type of property. The category can be any type of internal description desired.
	 */
	void setCategory(std::string  category);
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
	/*! \brief Get Brief description of the hotel.
	 */
	std::string getDescription();

	/*! \brief Set Brief description of the hotel.
	 */
	void setDescription(std::string  description);
	/*! \brief Get 
	 */
	CatalogsHotelGuestRatings getGuestRatings();

	/*! \brief Set 
	 */
	void setGuestRatings(CatalogsHotelGuestRatings  guest_ratings);
	/*! \brief Get Latitude of the hotel.
	 */
	long getLatitude();

	/*! \brief Set Latitude of the hotel.
	 */
	void setLatitude(long  latitude);
	/*! \brief Get Link to the product page
	 */
	std::string getLink();

	/*! \brief Set Link to the product page
	 */
	void setLink(std::string  link);
	/*! \brief Get Longitude of the hotel.
	 */
	long getLongitude();

	/*! \brief Set Longitude of the hotel.
	 */
	void setLongitude(long  longitude);
	/*! \brief Get The hotel's name.
	 */
	std::string getName();

	/*! \brief Set The hotel's name.
	 */
	void setName(std::string  name);
	/*! \brief Get A list of neighborhoods where the hotel is located
	 */
	std::list<std::string> getNeighborhood();

	/*! \brief Set A list of neighborhoods where the hotel is located
	 */
	void setNeighborhood(std::list <std::string> neighborhood);
	/*! \brief Get Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel.
	 */
	std::string getSalePrice();

	/*! \brief Set Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel.
	 */
	void setSalePrice(std::string  sale_price);


    private:
    CatalogsHotelAddress address;
    std::string base_price{};
    std::string brand{};
    std::string category{};
    std::string custom_label_0{};
    std::string custom_label_1{};
    std::string custom_label_2{};
    std::string custom_label_3{};
    std::string custom_label_4{};
    std::string description{};
    CatalogsHotelGuestRatings guest_ratings;
    long latitude{};
    std::string link{};
    long longitude{};
    std::string name{};
    std::list<std::string> neighborhood;
    std::string sale_price{};
};
}

#endif /* TINY_CPP_CLIENT_CatalogsUpdatableHotelAttributes_H_ */
