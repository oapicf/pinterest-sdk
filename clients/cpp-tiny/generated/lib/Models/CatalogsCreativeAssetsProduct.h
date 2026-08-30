
/*
 * CatalogsCreativeAssetsProduct.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CatalogsCreativeAssetsProduct_H_
#define TINY_CPP_CLIENT_CatalogsCreativeAssetsProduct_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsCreativeAssetsProductMetadata.h"
#include "Pin.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CatalogsCreativeAssetsProduct{
public:

    /*! \brief Constructor.
	 */
    CatalogsCreativeAssetsProduct();
    CatalogsCreativeAssetsProduct(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsCreativeAssetsProduct();


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

#endif /* TINY_CPP_CLIENT_CatalogsCreativeAssetsProduct_H_ */
