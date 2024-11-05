/*
 * CatalogsHotelProductGroupProductCounts.h
 *
 * Product counts for a Hotel CatalogsProductGroup
 */

#ifndef _CatalogsHotelProductGroupProductCounts_H_
#define _CatalogsHotelProductGroupProductCounts_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Product counts for a Hotel CatalogsProductGroup
 *
 *  \ingroup Models
 *
 */

class CatalogsHotelProductGroupProductCounts : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsHotelProductGroupProductCounts();
	CatalogsHotelProductGroupProductCounts(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsHotelProductGroupProductCounts();

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

private:
	std::string catalog_type;
	long long total;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsHotelProductGroupProductCounts_H_ */
