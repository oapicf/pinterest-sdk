/*
 * AudienceDefinitionScope.h
 *
 * Generated audience scope to request.
 */

#ifndef _AudienceDefinitionScope_H_
#define _AudienceDefinitionScope_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Generated audience scope to request.
 *
 *  \ingroup Models
 *
 */

class AudienceDefinitionScope : public Object {
public:
	/*! \brief Constructor.
	 */
	AudienceDefinitionScope();
	AudienceDefinitionScope(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AudienceDefinitionScope();

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

#endif /* _AudienceDefinitionScope_H_ */
