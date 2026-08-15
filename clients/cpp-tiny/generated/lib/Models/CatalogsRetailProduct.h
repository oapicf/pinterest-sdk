
/*
 * CatalogsRetailProduct.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CatalogsRetailProduct_H_
#define TINY_CPP_CLIENT_CatalogsRetailProduct_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsRetailProductMetadata.h"
#include "Pin.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CatalogsRetailProduct{
public:

    /*! \brief Constructor.
	 */
    CatalogsRetailProduct();
    CatalogsRetailProduct(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsRetailProduct();


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
	CatalogsRetailProductMetadata getMetadata();

	/*! \brief Set 
	 */
	void setMetadata(CatalogsRetailProductMetadata  metadata);
	/*! \brief Get 
	 */
	Pin getPin();

	/*! \brief Set 
	 */
	void setPin(Pin  pin);


    private:
    std::string catalog_type{};
    CatalogsRetailProductMetadata metadata;
    Pin pin;
};
}

#endif /* TINY_CPP_CLIENT_CatalogsRetailProduct_H_ */
