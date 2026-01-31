/*
 * AudienceDefinitionType.h
 *
 * Generated audience type to request.
 */

#ifndef _AudienceDefinitionType_H_
#define _AudienceDefinitionType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Generated audience type to request.
 *
 *  \ingroup Models
 *
 */

class AudienceDefinitionType : public Object {
public:
	/*! \brief Constructor.
	 */
	AudienceDefinitionType();
	AudienceDefinitionType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AudienceDefinitionType();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getScope();

	/*! \brief Set 
	 */
	void setScope(std::string  scope);

private:
	std::string scope;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AudienceDefinitionType_H_ */
