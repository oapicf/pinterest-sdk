/*
 * AssetSortBy.h
 *
 * The field to sort member assets by
 */

#ifndef _AssetSortBy_H_
#define _AssetSortBy_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The field to sort member assets by
 *
 *  \ingroup Models
 *
 */

class AssetSortBy : public Object {
public:
	/*! \brief Constructor.
	 */
	AssetSortBy();
	AssetSortBy(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AssetSortBy();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);


private:
	void __init();
	void __cleanup();

};
}
}

#endif /* _AssetSortBy_H_ */
