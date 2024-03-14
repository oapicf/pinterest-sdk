/*
 * CatalogsProductGroupProductCounts.h
 *
 * Product counts for a CatalogsProductGroup
 */

#ifndef _CatalogsProductGroupProductCounts_H_
#define _CatalogsProductGroupProductCounts_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Product counts for a CatalogsProductGroup
 *
 *  \ingroup Models
 *
 */

class CatalogsProductGroupProductCounts : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsProductGroupProductCounts();
	CatalogsProductGroupProductCounts(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsProductGroupProductCounts();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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

private:
	long long in_stock;
	long long out_of_stock;
	long long preorder;
	long long total;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsProductGroupProductCounts_H_ */
