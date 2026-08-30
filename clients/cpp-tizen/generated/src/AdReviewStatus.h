/*
 * AdReviewStatus.h
 *
 * Ad review status
 */

#ifndef _AdReviewStatus_H_
#define _AdReviewStatus_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Ad review status
 *
 *  \ingroup Models
 *
 */

class AdReviewStatus : public Object {
public:
	/*! \brief Constructor.
	 */
	AdReviewStatus();
	AdReviewStatus(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdReviewStatus();

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

#endif /* _AdReviewStatus_H_ */
