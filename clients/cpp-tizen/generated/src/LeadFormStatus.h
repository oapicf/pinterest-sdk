/*
 * LeadFormStatus.h
 *
 * Status of the lead form
 */

#ifndef _LeadFormStatus_H_
#define _LeadFormStatus_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Status of the lead form
 *
 *  \ingroup Models
 *
 */

class LeadFormStatus : public Object {
public:
	/*! \brief Constructor.
	 */
	LeadFormStatus();
	LeadFormStatus(char* str);

	/*! \brief Destructor.
	 */
	virtual ~LeadFormStatus();

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

#endif /* _LeadFormStatus_H_ */
