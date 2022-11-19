/*
 * AudienceCreateRequest_1.h
 *
 * 
 */

#ifndef _AudienceCreateRequest_1_H_
#define _AudienceCreateRequest_1_H_


#include <string>
#include "AudienceType.h"
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

class AudienceCreateRequest_1 : public Object {
public:
	/*! \brief Constructor.
	 */
	AudienceCreateRequest_1();
	AudienceCreateRequest_1(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AudienceCreateRequest_1();

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
	AudienceType getAudienceType();

	/*! \brief Set 
	 */
	void setAudienceType(AudienceType  audience_type);

private:
	std::string description;
	AudienceType audience_type;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AudienceCreateRequest_1_H_ */
