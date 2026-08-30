/*
 * ChangeHistoryDataType.h
 *
 * 
 */

#ifndef _ChangeHistoryDataType_H_
#define _ChangeHistoryDataType_H_


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

class ChangeHistoryDataType : public Object {
public:
	/*! \brief Constructor.
	 */
	ChangeHistoryDataType();
	ChangeHistoryDataType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ChangeHistoryDataType();

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

#endif /* _ChangeHistoryDataType_H_ */
