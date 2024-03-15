/*
 * CatalogsLocale.h
 *
 * 
 */

#ifndef _CatalogsLocale_H_
#define _CatalogsLocale_H_


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

class CatalogsLocale : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsLocale();
	CatalogsLocale(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsLocale();

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

#endif /* _CatalogsLocale_H_ */
