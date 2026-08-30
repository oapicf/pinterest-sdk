/*
 * LabelType.h
 *
 * Label type values.
 */

#ifndef _LabelType_H_
#define _LabelType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Label type values.
 *
 *  \ingroup Models
 *
 */

class LabelType : public Object {
public:
	/*! \brief Constructor.
	 */
	LabelType();
	LabelType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~LabelType();

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

#endif /* _LabelType_H_ */
