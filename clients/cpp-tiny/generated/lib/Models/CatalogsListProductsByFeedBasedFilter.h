
/*
 * CatalogsListProductsByFeedBasedFilter.h
 *
 * Request object to list products for a given feed_id and product group filter.
 */

#ifndef TINY_CPP_CLIENT_CatalogsListProductsByFeedBasedFilter_H_
#define TINY_CPP_CLIENT_CatalogsListProductsByFeedBasedFilter_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsProductGroupFilters.h"

namespace Tiny {


/*! \brief Request object to list products for a given feed_id and product group filter.
 *
 *  \ingroup Models
 *
 */

class CatalogsListProductsByFeedBasedFilter{
public:

    /*! \brief Constructor.
	 */
    CatalogsListProductsByFeedBasedFilter();
    CatalogsListProductsByFeedBasedFilter(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsListProductsByFeedBasedFilter();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Catalog Feed id pertaining to the catalog product group filter.
	 */
	std::string getFeedId();

	/*! \brief Set Catalog Feed id pertaining to the catalog product group filter.
	 */
	void setFeedId(std::string feed_id);
	/*! \brief Get 
	 */
	CatalogsProductGroupFilters getFilters();

	/*! \brief Set 
	 */
	void setFilters(CatalogsProductGroupFilters filters);


    private:
    std::string feed_id{};
    CatalogsProductGroupFilters filters;
};
}

#endif /* TINY_CPP_CLIENT_CatalogsListProductsByFeedBasedFilter_H_ */
