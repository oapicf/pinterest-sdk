/*
 * CatalogsType.h
 *
 * Type of the catalog entity.
 */

#ifndef _CatalogsType_H_
#define _CatalogsType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Type of the catalog entity.
 *
 *  \ingroup Models
 *
 */

class CatalogsType : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsType();
	CatalogsType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsType();

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

#endif /* _CatalogsType_H_ */
