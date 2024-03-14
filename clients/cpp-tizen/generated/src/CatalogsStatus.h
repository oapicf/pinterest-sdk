/*
 * CatalogsStatus.h
 *
 * Status for catalogs entities. Present in catalogs_feed values. When a feed is deleted, the response will inform DELETED as status.
 */

#ifndef _CatalogsStatus_H_
#define _CatalogsStatus_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Status for catalogs entities. Present in catalogs_feed values. When a feed is deleted, the response will inform DELETED as status.
 *
 *  \ingroup Models
 *
 */

class CatalogsStatus : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsStatus();
	CatalogsStatus(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsStatus();

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

#endif /* _CatalogsStatus_H_ */
