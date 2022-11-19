/*
 * AudienceUpdateRequest_1.h
 *
 * 
 */

#ifndef _AudienceUpdateRequest_1_H_
#define _AudienceUpdateRequest_1_H_


#include <string>
#include "AudienceUpdateOperationType.h"
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

class AudienceUpdateRequest_1 : public Object {
public:
	/*! \brief Constructor.
	 */
	AudienceUpdateRequest_1();
	AudienceUpdateRequest_1(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AudienceUpdateRequest_1();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Audience description.
	 */
	std::string getDescription();

	/*! \brief Set Audience description.
	 */
	void setDescription(std::string  description);
	/*! \brief Get 
	 */
	AudienceUpdateOperationType getOperationType();

	/*! \brief Set 
	 */
	void setOperationType(AudienceUpdateOperationType  operation_type);

private:
	std::string description;
	AudienceUpdateOperationType operation_type;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AudienceUpdateRequest_1_H_ */
