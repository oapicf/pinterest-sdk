/*
 * CatalogsFeedProcessingStatus.h
 *
 * 
 */

#ifndef _CatalogsFeedProcessingStatus_H_
#define _CatalogsFeedProcessingStatus_H_


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

class CatalogsFeedProcessingStatus : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsFeedProcessingStatus();
	CatalogsFeedProcessingStatus(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsFeedProcessingStatus();

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

#endif /* _CatalogsFeedProcessingStatus_H_ */
