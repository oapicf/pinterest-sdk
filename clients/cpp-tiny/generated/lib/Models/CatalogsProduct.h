
/*
 * CatalogsProduct.h
 *
 * Catalogs product for all verticals
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
#include "CatalogsType.h"
#include "Pin.h"

namespace Tiny {


/*! \brief Catalogs product for all verticals
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
	CatalogsType getCatalogType();

	/*! \brief Set 
	 */
	void setCatalogType(CatalogsType  catalog_type);
	/*! \brief Get 
	 */
	CatalogsCreativeAssetsProductMetadata getMetadata();

	/*! \brief Set 
	 */
	void setMetadata(CatalogsCreativeAssetsProductMetadata  metadata);
	/*! \brief Get 
	 */
	Pin getPin();

	/*! \brief Set 
	 */
	void setPin(Pin  pin);


    private:
    CatalogsType catalog_type;
    CatalogsCreativeAssetsProductMetadata metadata;
    Pin pin;
};
}

#endif /* TINY_CPP_CLIENT_CatalogsProduct_H_ */
