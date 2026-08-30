
/*
 * LabeledEntitiesCreate.h
 *
 * Resource create operation model.
 */

#ifndef TINY_CPP_CLIENT_LabeledEntitiesCreate_H_
#define TINY_CPP_CLIENT_LabeledEntitiesCreate_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include <list>

namespace Tiny {


/*! \brief Resource create operation model.
 *
 *  \ingroup Models
 *
 */

class LabeledEntitiesCreate{
public:

    /*! \brief Constructor.
	 */
    LabeledEntitiesCreate();
    LabeledEntitiesCreate(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~LabeledEntitiesCreate();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Entity IDs to apply label to.
	 */
	std::list<std::string> getEntityIds();

	/*! \brief Set Entity IDs to apply label to.
	 */
	void setEntityIds(std::list<std::string> entity_ids);


    private:
    std::list<std::string> entity_ids;
};
}

#endif /* TINY_CPP_CLIENT_LabeledEntitiesCreate_H_ */
