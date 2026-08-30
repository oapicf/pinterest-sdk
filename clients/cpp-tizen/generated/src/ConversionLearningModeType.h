/*
 * ConversionLearningModeType.h
 *
 * oCPM learn mode.
 */

#ifndef _ConversionLearningModeType_H_
#define _ConversionLearningModeType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief oCPM learn mode.
 *
 *  \ingroup Models
 *
 */

class ConversionLearningModeType : public Object {
public:
	/*! \brief Constructor.
	 */
	ConversionLearningModeType();
	ConversionLearningModeType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ConversionLearningModeType();

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

#endif /* _ConversionLearningModeType_H_ */
