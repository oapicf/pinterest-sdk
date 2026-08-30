/*
 * AdDisapprovalReasons.h
 *
 * ad disapproval reasons
 */

#ifndef _AdDisapprovalReasons_H_
#define _AdDisapprovalReasons_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief ad disapproval reasons
 *
 *  \ingroup Models
 *
 */

class AdDisapprovalReasons : public Object {
public:
	/*! \brief Constructor.
	 */
	AdDisapprovalReasons();
	AdDisapprovalReasons(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdDisapprovalReasons();

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

#endif /* _AdDisapprovalReasons_H_ */
