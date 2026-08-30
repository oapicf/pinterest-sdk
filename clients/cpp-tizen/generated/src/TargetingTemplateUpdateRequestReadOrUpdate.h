/*
 * TargetingTemplateUpdateRequestReadOrUpdate.h
 *
 * 
 */

#ifndef _TargetingTemplateUpdateRequestReadOrUpdate_H_
#define _TargetingTemplateUpdateRequestReadOrUpdate_H_


#include <string>
#include "AudienceUpdateOperationType.h"
#include "TargetingSpecOptimal.h"
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

class TargetingTemplateUpdateRequestReadOrUpdate : public Object {
public:
	/*! \brief Constructor.
	 */
	TargetingTemplateUpdateRequestReadOrUpdate();
	TargetingTemplateUpdateRequestReadOrUpdate(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TargetingTemplateUpdateRequestReadOrUpdate();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Targeting template ID
	 */
	std::string getId();

	/*! \brief Set Targeting template ID
	 */
	void setId(std::string  id);
	/*! \brief Get 
	 */
	AudienceUpdateOperationType getOperationType();

	/*! \brief Set 
	 */
	void setOperationType(AudienceUpdateOperationType  operation_type);
	/*! \brief Get targeting profile attributes
	 */
	TargetingSpecOptimal getTargetingAttributes();

	/*! \brief Set targeting profile attributes
	 */
	void setTargetingAttributes(TargetingSpecOptimal  targeting_attributes);

private:
	std::string id;
	AudienceUpdateOperationType operation_type;
	TargetingSpecOptimal targeting_attributes;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TargetingTemplateUpdateRequestReadOrUpdate_H_ */
