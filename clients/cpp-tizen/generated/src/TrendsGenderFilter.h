/*
 * TrendsGenderFilter.h
 *
 * Gender category for trends demographic distribution.
 */

#ifndef _TrendsGenderFilter_H_
#define _TrendsGenderFilter_H_


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

class TrendsGenderFilter : public Object {
public:
	/*! \brief Constructor.
	 */
	TrendsGenderFilter();
	TrendsGenderFilter(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TrendsGenderFilter();

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

#endif /* _TrendsGenderFilter_H_ */
