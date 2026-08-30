
/*
 * CatalogsDeleteHotelItem.h
 *
 * A hotel item to be deleted
 */

#ifndef TINY_CPP_CLIENT_CatalogsDeleteHotelItem_H_
#define TINY_CPP_CLIENT_CatalogsDeleteHotelItem_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief A hotel item to be deleted
 *
 *  \ingroup Models
 *
 */

class CatalogsDeleteHotelItem{
public:

    /*! \brief Constructor.
	 */
    CatalogsDeleteHotelItem();
    CatalogsDeleteHotelItem(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsDeleteHotelItem();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The catalog hotel id in the merchant namespace
	 */
	std::string getHotelId();

	/*! \brief Set The catalog hotel id in the merchant namespace
	 */
	void setHotelId(std::string hotel_id);
	/*! \brief Get 
	 */
	std::string getOperation();

	/*! \brief Set 
	 */
	void setOperation(std::string operation);


    private:
    std::string hotel_id{};
    std::string operation{};
};
}

#endif /* TINY_CPP_CLIENT_CatalogsDeleteHotelItem_H_ */
