/*
 * CatalogsProductGroupType.h
 *
 * Catalog product group type
 */

#ifndef _CatalogsProductGroupType_H_
#define _CatalogsProductGroupType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Catalog product group type
 *
 *  \ingroup Models
 *
 */

class CatalogsProductGroupType : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsProductGroupType();
	CatalogsProductGroupType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsProductGroupType();

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

#endif /* _CatalogsProductGroupType_H_ */
