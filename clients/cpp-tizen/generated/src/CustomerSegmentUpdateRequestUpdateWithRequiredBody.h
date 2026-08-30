/*
 * CustomerSegmentUpdateRequestUpdateWithRequiredBody.h
 *
 * Resource create or update operation model with required body fields (no OptionalProperties).
 */

#ifndef _CustomerSegmentUpdateRequestUpdateWithRequiredBody_H_
#define _CustomerSegmentUpdateRequestUpdateWithRequiredBody_H_


#include <string>
#include "AudienceUpdateOperationType.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Resource create or update operation model with required body fields (no OptionalProperties).
 *
 *  \ingroup Models
 *
 */

class CustomerSegmentUpdateRequestUpdateWithRequiredBody : public Object {
public:
	/*! \brief Constructor.
	 */
	CustomerSegmentUpdateRequestUpdateWithRequiredBody();
	CustomerSegmentUpdateRequestUpdateWithRequiredBody(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CustomerSegmentUpdateRequestUpdateWithRequiredBody();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Audience IDs to update the customer segment to. Only applicable for UPDATE operations.
	 */
	std::list<std::string> getAudienceIds();

	/*! \brief Set Audience IDs to update the customer segment to. Only applicable for UPDATE operations.
	 */
	void setAudienceIds(std::list <std::string> audience_ids);
	/*! \brief Get Customer segment ID.
	 */
	std::string getId();

	/*! \brief Set Customer segment ID.
	 */
	void setId(std::string  id);
	/*! \brief Get 
	 */
	AudienceUpdateOperationType getOperationType();

	/*! \brief Set 
	 */
	void setOperationType(AudienceUpdateOperationType  operation_type);

private:
	std::list <std::string>audience_ids;
	std::string id;
	AudienceUpdateOperationType operation_type;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CustomerSegmentUpdateRequestUpdateWithRequiredBody_H_ */
