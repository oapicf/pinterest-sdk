
/*
 * ScheduleCreateRequestAllOf1.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ScheduleCreateRequestAllOf1_H_
#define TINY_CPP_CLIENT_ScheduleCreateRequestAllOf1_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ScheduleCreateRequestAllOf1{
public:

    /*! \brief Constructor.
	 */
    ScheduleCreateRequestAllOf1();
    ScheduleCreateRequestAllOf1(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ScheduleCreateRequestAllOf1();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getEntityId();

	/*! \brief Set 
	 */
	void setEntityId(std::string entity_id);
	/*! \brief Get Entity type
	 */
	std::string getEntityType();

	/*! \brief Set Entity type
	 */
	void setEntityType(std::string entity_type);


    private:
    std::string entity_id{};
    std::string entity_type{};
};
}

#endif /* TINY_CPP_CLIENT_ScheduleCreateRequestAllOf1_H_ */
