
/*
 * CatalogsCreativeAssetsProductGroupProductCounts.h
 *
 * Product counts for a Creative Assets CatalogsProductGroup
 */

#ifndef TINY_CPP_CLIENT_CatalogsCreativeAssetsProductGroupProductCounts_H_
#define TINY_CPP_CLIENT_CatalogsCreativeAssetsProductGroupProductCounts_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Product counts for a Creative Assets CatalogsProductGroup
 *
 *  \ingroup Models
 *
 */

class CatalogsCreativeAssetsProductGroupProductCounts{
public:

    /*! \brief Constructor.
	 */
    CatalogsCreativeAssetsProductGroupProductCounts();
    CatalogsCreativeAssetsProductGroupProductCounts(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsCreativeAssetsProductGroupProductCounts();


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
    long total{};
    long videos{};
};
}

#endif /* TINY_CPP_CLIENT_CatalogsCreativeAssetsProductGroupProductCounts_H_ */
