/*
 * NonDraftEntityStatus.h
 *
 * Entity status
 */

#ifndef _NonDraftEntityStatus_H_
#define _NonDraftEntityStatus_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Entity status
 *
 *  \ingroup Models
 *
 */

class NonDraftEntityStatus : public Object {
public:
	/*! \brief Constructor.
	 */
	NonDraftEntityStatus();
	NonDraftEntityStatus(char* str);

	/*! \brief Destructor.
	 */
	virtual ~NonDraftEntityStatus();

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

#endif /* _NonDraftEntityStatus_H_ */
