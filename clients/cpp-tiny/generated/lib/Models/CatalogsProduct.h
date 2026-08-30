
/*
 * CatalogsProduct.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CatalogsProduct_H_
#define TINY_CPP_CLIENT_CatalogsProduct_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsCreativeAssetsProduct.h"
#include "CatalogsCreativeAssetsProductMetadata.h"
#include "CatalogsHotelProduct.h"
#include "CatalogsRetailProduct.h"
#include "Pin.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CatalogsProduct{
public:

    /*! \brief Constructor.
	 */
    CatalogsProduct();
    CatalogsProduct(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsProduct();


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
	void setCatalogType(std::string catalog_type);
	/*! \brief Get 
	 */
	CatalogsCreativeAssetsProductMetadata getMetadata();

	/*! \brief Set 
	 */
	void setMetadata(CatalogsCreativeAssetsProductMetadata metadata);
	/*! \brief Get 
	 */
	Pin getPin();

	/*! \brief Set 
	 */
	void setPin(Pin pin);


    private:
    std::string catalog_type{};
    CatalogsCreativeAssetsProductMetadata metadata;
    Pin pin;
};
}

#endif /* TINY_CPP_CLIENT_CatalogsProduct_H_ */
