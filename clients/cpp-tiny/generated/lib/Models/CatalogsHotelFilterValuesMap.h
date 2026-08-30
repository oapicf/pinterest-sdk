
/*
 * CatalogsHotelFilterValuesMap.h
 *
 * A map of filter attributes to their available values.
 */

#ifndef TINY_CPP_CLIENT_CatalogsHotelFilterValuesMap_H_
#define TINY_CPP_CLIENT_CatalogsHotelFilterValuesMap_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include <list>

namespace Tiny {


/*! \brief A map of filter attributes to their available values.
 *
 *  \ingroup Models
 *
 */

class CatalogsHotelFilterValuesMap{
public:

    /*! \brief Constructor.
	 */
    CatalogsHotelFilterValuesMap();
    CatalogsHotelFilterValuesMap(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsHotelFilterValuesMap();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<std::string> getBrand();

	/*! \brief Set 
	 */
	void setBrand(std::list<std::string> brand);
	/*! \brief Get 
	 */
	std::list<std::string> getCustomLabel0();

	/*! \brief Set 
	 */
	void setCustomLabel0(std::list<std::string> custom_label_0);
	/*! \brief Get 
	 */
	std::list<std::string> getCustomLabel1();

	/*! \brief Set 
	 */
	void setCustomLabel1(std::list<std::string> custom_label_1);
	/*! \brief Get 
	 */
	std::list<std::string> getCustomLabel2();

	/*! \brief Set 
	 */
	void setCustomLabel2(std::list<std::string> custom_label_2);
	/*! \brief Get 
	 */
	std::list<std::string> getCustomLabel3();

	/*! \brief Set 
	 */
	void setCustomLabel3(std::list<std::string> custom_label_3);
	/*! \brief Get 
	 */
	std::list<std::string> getCustomLabel4();

	/*! \brief Set 
	 */
	void setCustomLabel4(std::list<std::string> custom_label_4);


    private:
    std::list<std::string> brand;
    std::list<std::string> custom_label_0;
    std::list<std::string> custom_label_1;
    std::list<std::string> custom_label_2;
    std::list<std::string> custom_label_3;
    std::list<std::string> custom_label_4;
};
}

#endif /* TINY_CPP_CLIENT_CatalogsHotelFilterValuesMap_H_ */
