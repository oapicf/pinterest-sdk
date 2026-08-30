
/*
 * EntityLabel.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_EntityLabel_H_
#define TINY_CPP_CLIENT_EntityLabel_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "EntityLabelStatus.h"
#include "LabelParentType.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class EntityLabel{
public:

    /*! \brief Constructor.
	 */
    EntityLabel();
    EntityLabel(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~EntityLabel();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Entity ID to apply label to.
	 */
	std::string getEntityId();

	/*! \brief Set Entity ID to apply label to.
	 */
	void setEntityId(std::string entity_id);
	/*! \brief Get 
	 */
	LabelParentType getEntityType();

	/*! \brief Set 
	 */
	void setEntityType(LabelParentType entity_type);
	/*! \brief Get Label ID.
	 */
	std::string getLabelId();

	/*! \brief Set Label ID.
	 */
	void setLabelId(std::string label_id);
	/*! \brief Get 
	 */
	EntityLabelStatus getStatus();

	/*! \brief Set 
	 */
	void setStatus(EntityLabelStatus status);


    private:
    std::string entity_id{};
    LabelParentType entity_type;
    std::string label_id{};
    EntityLabelStatus status;
};
}

#endif /* TINY_CPP_CLIENT_EntityLabel_H_ */
