/*
 * CatalogsRetailProductGroupProductCounts.h
 *
 * Product counts for a Retail CatalogsProductGroup
 */

#ifndef _CatalogsRetailProductGroupProductCounts_H_
#define _CatalogsRetailProductGroupProductCounts_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Product counts for a Retail CatalogsProductGroup
 *
 *  \ingroup Models
 *
 */

class CatalogsRetailProductGroupProductCounts : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsRetailProductGroupProductCounts();
	CatalogsRetailProductGroupProductCounts(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsRetailProductGroupProductCounts();

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
	long long getInStock();

	/*! \brief Set 
	 */
	void setInStock(long long  in_stock);
	/*! \brief Get 
	 */
	long long getOutOfStock();

	/*! \brief Set 
	 */
	void setOutOfStock(long long  out_of_stock);
	/*! \brief Get 
	 */
	long long getPreorder();

	/*! \brief Set 
	 */
	void setPreorder(long long  preorder);
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
	long long in_stock;
	long long out_of_stock;
	long long preorder;
	long long total;
	long long videos;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsRetailProductGroupProductCounts_H_ */
