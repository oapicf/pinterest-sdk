/*
 * TrendsAgeBucket.h
 *
 * 
 */

#ifndef _TrendsAgeBucket_H_
#define _TrendsAgeBucket_H_


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

class TrendsAgeBucket : public Object {
public:
	/*! \brief Constructor.
	 */
	TrendsAgeBucket();
	TrendsAgeBucket(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TrendsAgeBucket();

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

#endif /* _TrendsAgeBucket_H_ */
