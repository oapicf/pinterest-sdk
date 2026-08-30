/*
 * ConversionDeletionRequestCreate.h
 *
 * Resource create operation model.
 */

#ifndef _ConversionDeletionRequestCreate_H_
#define _ConversionDeletionRequestCreate_H_


#include <string>
#include "ConversionDeletionRequestTargets.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Resource create operation model.
 *
 *  \ingroup Models
 *
 */

class ConversionDeletionRequestCreate : public Object {
public:
	/*! \brief Constructor.
	 */
	ConversionDeletionRequestCreate();
	ConversionDeletionRequestCreate(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ConversionDeletionRequestCreate();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Object containing the targets of the conversion deletion request. Users can be identified with user_emails, epiks, or both within the same request.
	 */
	ConversionDeletionRequestTargets getDeletionTargets();

	/*! \brief Set Object containing the targets of the conversion deletion request. Users can be identified with user_emails, epiks, or both within the same request.
	 */
	void setDeletionTargets(ConversionDeletionRequestTargets  deletion_targets);

private:
	ConversionDeletionRequestTargets deletion_targets;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ConversionDeletionRequestCreate_H_ */
