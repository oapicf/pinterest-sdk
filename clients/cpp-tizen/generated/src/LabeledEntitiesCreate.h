/*
 * LabeledEntitiesCreate.h
 *
 * Resource create operation model.
 */

#ifndef _LabeledEntitiesCreate_H_
#define _LabeledEntitiesCreate_H_


#include <string>
#include <list>
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

class LabeledEntitiesCreate : public Object {
public:
	/*! \brief Constructor.
	 */
	LabeledEntitiesCreate();
	LabeledEntitiesCreate(char* str);

	/*! \brief Destructor.
	 */
	virtual ~LabeledEntitiesCreate();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Entity IDs to apply label to.
	 */
	std::list<std::string> getEntityIds();

	/*! \brief Set Entity IDs to apply label to.
	 */
	void setEntityIds(std::list <std::string> entity_ids);

private:
	std::list <std::string>entity_ids;
	void __init();
	void __cleanup();

};
}
}

#endif /* _LabeledEntitiesCreate_H_ */
