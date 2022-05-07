/*
 * CatalogsFeedIngestionInfo.h
 *
 * 
 */

#ifndef _CatalogsFeedIngestionInfo_H_
#define _CatalogsFeedIngestionInfo_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CatalogsFeedIngestionInfo : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsFeedIngestionInfo();
	CatalogsFeedIngestionInfo(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsFeedIngestionInfo();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	int getInStock();

	/*! \brief Set 
	 */
	void setInStock(int  in_stock);
	/*! \brief Get 
	 */
	int getOutOfStock();

	/*! \brief Set 
	 */
	void setOutOfStock(int  out_of_stock);
	/*! \brief Get 
	 */
	int getPreorder();

	/*! \brief Set 
	 */
	void setPreorder(int  preorder);

private:
	int in_stock;
	int out_of_stock;
	int preorder;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsFeedIngestionInfo_H_ */
