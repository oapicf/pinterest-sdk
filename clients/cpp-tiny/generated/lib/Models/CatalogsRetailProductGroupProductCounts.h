
/*
 * CatalogsRetailProductGroupProductCounts.h
 *
 * Product counts for a Retail CatalogsProductGroup
 */

#ifndef TINY_CPP_CLIENT_CatalogsRetailProductGroupProductCounts_H_
#define TINY_CPP_CLIENT_CatalogsRetailProductGroupProductCounts_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Product counts for a Retail CatalogsProductGroup
 *
 *  \ingroup Models
 *
 */

class CatalogsRetailProductGroupProductCounts{
public:

    /*! \brief Constructor.
	 */
    CatalogsRetailProductGroupProductCounts();
    CatalogsRetailProductGroupProductCounts(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsRetailProductGroupProductCounts();


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
    std::string catalog_type{};
    long in_stock{};
    long out_of_stock{};
    long preorder{};
    long total{};
    long videos{};
};
}

#endif /* TINY_CPP_CLIENT_CatalogsRetailProductGroupProductCounts_H_ */
