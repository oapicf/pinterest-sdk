
/*
 * EntityLabelError.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_EntityLabelError_H_
#define TINY_CPP_CLIENT_EntityLabelError_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "EntityLabel.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class EntityLabelError{
public:

    /*! \brief Constructor.
	 */
    EntityLabelError();
    EntityLabelError(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~EntityLabelError();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	EntityLabel getData();

	/*! \brief Set 
	 */
	void setData(EntityLabel data);
	/*! \brief Get 
	 */
	std::list<std::string> getErrorMessages();

	/*! \brief Set 
	 */
	void setErrorMessages(std::list<std::string> error_messages);


    private:
    EntityLabel data;
    std::list<std::string> error_messages;
};
}

#endif /* TINY_CPP_CLIENT_EntityLabelError_H_ */
