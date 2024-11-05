/*
 * CatalogsCreativeAssetsProductGroupProductCounts.h
 *
 * Product counts for a Creative Assets CatalogsProductGroup
 */

#ifndef _CatalogsCreativeAssetsProductGroupProductCounts_H_
#define _CatalogsCreativeAssetsProductGroupProductCounts_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Product counts for a Creative Assets CatalogsProductGroup
 *
 *  \ingroup Models
 *
 */

class CatalogsCreativeAssetsProductGroupProductCounts : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsCreativeAssetsProductGroupProductCounts();
	CatalogsCreativeAssetsProductGroupProductCounts(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsCreativeAssetsProductGroupProductCounts();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getCatalogType();

	/*! \brief Set 
	 */
	void setCatalogType(std::string  catalog_type);
	/*! \brief Get 
	 */
	long long getTotal();

	/*! \brief Set 
	 */
	void setTotal(long long  total);
	/*! \brief Get 
	 */
	long long getVideos();

	/*! \brief Set 
	 */
	void setVideos(long long  videos);

private:
	std::string catalog_type;
	long long total;
	long long videos;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsCreativeAssetsProductGroupProductCounts_H_ */
