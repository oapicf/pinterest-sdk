
/*
 * CatalogsCreateHotelItem.h
 *
 * A hotel item to be created.
 */

#ifndef TINY_CPP_CLIENT_CatalogsCreateHotelItem_H_
#define TINY_CPP_CLIENT_CatalogsCreateHotelItem_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsHotelAttributes.h"

namespace Tiny {


/*! \brief A hotel item to be created.
 *
 *  \ingroup Models
 *
 */

class CatalogsCreateHotelItem{
public:

    /*! \brief Constructor.
	 */
    CatalogsCreateHotelItem();
    CatalogsCreateHotelItem(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsCreateHotelItem();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	CatalogsHotelAttributes getAttributes();

	/*! \brief Set 
	 */
	void setAttributes(CatalogsHotelAttributes attributes);
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
    CatalogsHotelAttributes attributes;
    std::string hotel_id{};
    std::string operation{};
};
}

#endif /* TINY_CPP_CLIENT_CatalogsCreateHotelItem_H_ */
