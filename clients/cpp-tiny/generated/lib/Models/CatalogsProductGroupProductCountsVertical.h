
/*
 * CatalogsProductGroupProductCountsVertical.h
 *
 * Product counts for a CatalogsProductGroup
 */

#ifndef TINY_CPP_CLIENT_CatalogsProductGroupProductCountsVertical_H_
#define TINY_CPP_CLIENT_CatalogsProductGroupProductCountsVertical_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsCreativeAssetsProductGroupProductCounts.h"
#include "CatalogsHotelProductGroupProductCounts.h"
#include "CatalogsRetailProductGroupProductCounts.h"
#include "CatalogsType.h"

namespace Tiny {


/*! \brief Product counts for a CatalogsProductGroup
 *
 *  \ingroup Models
 *
 */

class CatalogsProductGroupProductCountsVertical{
public:

    /*! \brief Constructor.
	 */
    CatalogsProductGroupProductCountsVertical();
    CatalogsProductGroupProductCountsVertical(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsProductGroupProductCountsVertical();


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
	long getInStock();

	/*! \brief Set 
	 */
	void setInStock(long  in_stock);
	/*! \brief Get 
	 */
	long getOutOfStock();

	/*! \brief Set 
	 */
	void setOutOfStock(long  out_of_stock);
	/*! \brief Get 
	 */
	long getPreorder();

	/*! \brief Set 
	 */
	void setPreorder(long  preorder);
	/*! \brief Get 
	 */
	long getTotal();

	/*! \brief Set 
	 */
	void setTotal(long  total);
	/*! \brief Get 
	 */
	long getVideos();

	/*! \brief Set 
	 */
	void setVideos(long  videos);


    private:
    CatalogsType catalog_type;
    long in_stock{};
    long out_of_stock{};
    long preorder{};
    long total{};
    long videos{};
};
}

#endif /* TINY_CPP_CLIENT_CatalogsProductGroupProductCountsVertical_H_ */
