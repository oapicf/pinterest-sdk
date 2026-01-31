/*
 * AgeTrendsBucket.h
 *
 * 
 */

#ifndef _AgeTrendsBucket_H_
#define _AgeTrendsBucket_H_


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

class AgeTrendsBucket : public Object {
public:
	/*! \brief Constructor.
	 */
	AgeTrendsBucket();
	AgeTrendsBucket(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AgeTrendsBucket();

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

#endif /* _AgeTrendsBucket_H_ */
