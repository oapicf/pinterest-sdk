
/*
 * LabeledEntities.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_LabeledEntities_H_
#define TINY_CPP_CLIENT_LabeledEntities_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "EntityLabel.h"
#include "EntityLabelError.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class LabeledEntities{
public:

    /*! \brief Constructor.
	 */
    LabeledEntities();
    LabeledEntities(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~LabeledEntities();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<EntityLabel> getEntitiesLabels();

	/*! \brief Set 
	 */
	void setEntitiesLabels(std::list<EntityLabel> entities_labels);
	/*! \brief Get Labels that were not successfully applied.
	 */
	std::list<EntityLabelError> getErrors();

	/*! \brief Set Labels that were not successfully applied.
	 */
	void setErrors(std::list<EntityLabelError> errors);


    private:
    std::list<EntityLabel> entities_labels;
    std::list<EntityLabelError> errors;
};
}

#endif /* TINY_CPP_CLIENT_LabeledEntities_H_ */
