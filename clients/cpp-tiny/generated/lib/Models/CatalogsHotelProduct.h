
/*
 * CatalogsHotelProduct.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CatalogsHotelProduct_H_
#define TINY_CPP_CLIENT_CatalogsHotelProduct_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsHotelProductMetadata.h"
#include "Pin.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CatalogsHotelProduct{
public:

    /*! \brief Constructor.
	 */
    CatalogsHotelProduct();
    CatalogsHotelProduct(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsHotelProduct();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getCatalogType();

	/*! \brief Set 
	 */
	void setCatalogType(std::string  catalog_type);
	/*! \brief Get 
	 */
	CatalogsHotelProductMetadata getMetadata();

	/*! \brief Set 
	 */
	void setMetadata(CatalogsHotelProductMetadata  metadata);
	/*! \brief Get 
	 */
	Pin getPin();

	/*! \brief Set 
	 */
	void setPin(Pin  pin);


    private:
    std::string catalog_type{};
    CatalogsHotelProductMetadata metadata;
    Pin pin;
};
}

#endif /* TINY_CPP_CLIENT_CatalogsHotelProduct_H_ */
