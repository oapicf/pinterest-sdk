/*
 * CatalogsListProductsByFeedBasedFilter.h
 *
 * Request object to list products for a given feed_id and product group filter.
 */

#ifndef _CatalogsListProductsByFeedBasedFilter_H_
#define _CatalogsListProductsByFeedBasedFilter_H_


#include <string>
#include "CatalogsProductGroupFilters.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Request object to list products for a given feed_id and product group filter.
 *
 *  \ingroup Models
 *
 */

class CatalogsListProductsByFeedBasedFilter : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsListProductsByFeedBasedFilter();
	CatalogsListProductsByFeedBasedFilter(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsListProductsByFeedBasedFilter();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Catalog Feed id pertaining to the catalog product group filter.
	 */
	std::string getFeedId();

	/*! \brief Set Catalog Feed id pertaining to the catalog product group filter.
	 */
	void setFeedId(std::string  feed_id);
	/*! \brief Get 
	 */
	CatalogsProductGroupFilters getFilters();

	/*! \brief Set 
	 */
	void setFilters(CatalogsProductGroupFilters  filters);

private:
	std::string feed_id;
	CatalogsProductGroupFilters filters;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsListProductsByFeedBasedFilter_H_ */
