/*
 * EntityLabel.h
 *
 * 
 */

#ifndef _EntityLabel_H_
#define _EntityLabel_H_


#include <string>
#include "EntityLabelStatus.h"
#include "LabelParentType.h"
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

class EntityLabel : public Object {
public:
	/*! \brief Constructor.
	 */
	EntityLabel();
	EntityLabel(char* str);

	/*! \brief Destructor.
	 */
	virtual ~EntityLabel();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Entity ID to apply label to.
	 */
	std::string getEntityId();

	/*! \brief Set Entity ID to apply label to.
	 */
	void setEntityId(std::string  entity_id);
	/*! \brief Get 
	 */
	LabelParentType getEntityType();

	/*! \brief Set 
	 */
	void setEntityType(LabelParentType  entity_type);
	/*! \brief Get Label ID.
	 */
	std::string getLabelId();

	/*! \brief Set Label ID.
	 */
	void setLabelId(std::string  label_id);
	/*! \brief Get 
	 */
	EntityLabelStatus getStatus();

	/*! \brief Set 
	 */
	void setStatus(EntityLabelStatus  status);

private:
	std::string entity_id;
	LabelParentType entity_type;
	std::string label_id;
	EntityLabelStatus status;
	void __init();
	void __cleanup();

};
}
}

#endif /* _EntityLabel_H_ */
