
/*
 * CatalogsHotelProductGroupProductCounts.h
 *
 * Product counts for a Hotel CatalogsProductGroup
 */

#ifndef TINY_CPP_CLIENT_CatalogsHotelProductGroupProductCounts_H_
#define TINY_CPP_CLIENT_CatalogsHotelProductGroupProductCounts_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Product counts for a Hotel CatalogsProductGroup
 *
 *  \ingroup Models
 *
 */

class CatalogsHotelProductGroupProductCounts{
public:

    /*! \brief Constructor.
	 */
    CatalogsHotelProductGroupProductCounts();
    CatalogsHotelProductGroupProductCounts(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsHotelProductGroupProductCounts();


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
	long getTotal();

	/*! \brief Set 
	 */
	void setTotal(long total);


    private:
    std::string catalog_type{};
    long total{};
};
}

#endif /* TINY_CPP_CLIENT_CatalogsHotelProductGroupProductCounts_H_ */
