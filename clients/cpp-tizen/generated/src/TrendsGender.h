/*
 * TrendsGender.h
 *
 * Gender category for trends demographic distribution.
 */

#ifndef _TrendsGender_H_
#define _TrendsGender_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Gender category for trends demographic distribution.
 *
 *  \ingroup Models
 *
 */

class TrendsGender : public Object {
public:
	/*! \brief Constructor.
	 */
	TrendsGender();
	TrendsGender(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TrendsGender();

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

#endif /* _TrendsGender_H_ */
