/*
 * TargetingTemplateUpdateRequest.h
 *
 * 
 */

#ifndef _TargetingTemplateUpdateRequest_H_
#define _TargetingTemplateUpdateRequest_H_


#include <string>
#include "TargetingSpec.h"
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

class TargetingTemplateUpdateRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	TargetingTemplateUpdateRequest();
	TargetingTemplateUpdateRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TargetingTemplateUpdateRequest();

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
	std::string getOperationType();

	/*! \brief Set 
	 */
	void setOperationType(std::string  operation_type);
	/*! \brief Get 
	 */
	TargetingSpec getTargetingAttributes();

	/*! \brief Set 
	 */
	void setTargetingAttributes(TargetingSpec  targeting_attributes);

private:
	std::string id;
	std::string operation_type;
	TargetingSpec targeting_attributes;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TargetingTemplateUpdateRequest_H_ */
