/*
 * LabeledEntities.h
 *
 * 
 */

#ifndef _LabeledEntities_H_
#define _LabeledEntities_H_


#include <string>
#include "EntityLabel.h"
#include "EntityLabelError.h"
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

class LabeledEntities : public Object {
public:
	/*! \brief Constructor.
	 */
	LabeledEntities();
	LabeledEntities(char* str);

	/*! \brief Destructor.
	 */
	virtual ~LabeledEntities();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<EntityLabel> getEntitiesLabels();

	/*! \brief Set 
	 */
	void setEntitiesLabels(std::list <EntityLabel> entities_labels);
	/*! \brief Get Labels that were not successfully applied.
	 */
	std::list<EntityLabelError> getErrors();

	/*! \brief Set Labels that were not successfully applied.
	 */
	void setErrors(std::list <EntityLabelError> errors);

private:
	std::list <EntityLabel>entities_labels;
	std::list <EntityLabelError>errors;
	void __init();
	void __cleanup();

};
}
}

#endif /* _LabeledEntities_H_ */
