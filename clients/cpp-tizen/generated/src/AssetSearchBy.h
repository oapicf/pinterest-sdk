/*
 * AssetSearchBy.h
 *
 * The field to search member assets by
 */

#ifndef _AssetSearchBy_H_
#define _AssetSearchBy_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The field to search member assets by
 *
 *  \ingroup Models
 *
 */

class AssetSearchBy : public Object {
public:
	/*! \brief Constructor.
	 */
	AssetSearchBy();
	AssetSearchBy(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AssetSearchBy();

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

#endif /* _AssetSearchBy_H_ */
