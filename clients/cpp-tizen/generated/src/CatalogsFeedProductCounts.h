/*
 * CatalogsFeedProductCounts.h
 *
 * The counts can be null early in the process.
 */

#ifndef _CatalogsFeedProductCounts_H_
#define _CatalogsFeedProductCounts_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The counts can be null early in the process.
 *
 *  \ingroup Models
 *
 */

class CatalogsFeedProductCounts : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsFeedProductCounts();
	CatalogsFeedProductCounts(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsFeedProductCounts();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The number of products in the feed file
	 */
	int getOriginal();

	/*! \brief Set The number of products in the feed file
	 */
	void setOriginal(int  original);

private:
	int original;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsFeedProductCounts_H_ */
