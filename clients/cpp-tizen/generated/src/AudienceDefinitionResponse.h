/*
 * AudienceDefinitionResponse.h
 *
 * 
 */

#ifndef _AudienceDefinitionResponse_H_
#define _AudienceDefinitionResponse_H_


#include <string>
#include "AudienceDefinition.h"
#include <list>
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

class AudienceDefinitionResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	AudienceDefinitionResponse();
	AudienceDefinitionResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AudienceDefinitionResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<AudienceDefinition> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list <AudienceDefinition> items);

private:
	std::list <AudienceDefinition>items;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AudienceDefinitionResponse_H_ */
