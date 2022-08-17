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

	/*! \brief Get The number of ingested products that are in stock.
	 */
	int getINSTOCK();

	/*! \brief Set The number of ingested products that are in stock.
	 */
	void setINSTOCK(int  iN_STOCK);
	/*! \brief Get The number of ingested products that are in out of stock.
	 */
	int getOUTOFSTOCK();

	/*! \brief Set The number of ingested products that are in out of stock.
	 */
	void setOUTOFSTOCK(int  oUT_OF_STOCK);
	/*! \brief Get The number of ingested products that are in preorder.
	 */
	int getPREORDER();

	/*! \brief Set The number of ingested products that are in preorder.
	 */
	void setPREORDER(int  pREORDER);

private:
	int iN_STOCK;
	int oUT_OF_STOCK;
	int pREORDER;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsFeedIngestionInfo_H_ */
