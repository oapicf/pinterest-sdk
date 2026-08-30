
/*
 * Schedules_create_200_response_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Schedules_create_200_response_inner_H_
#define TINY_CPP_CLIENT_Schedules_create_200_response_inner_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Schedules_create_200_response_inner_data.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Schedules_create_200_response_inner{
public:

    /*! \brief Constructor.
	 */
    Schedules_create_200_response_inner();
    Schedules_create_200_response_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Schedules_create_200_response_inner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	Schedules_create_200_response_inner_data getData();

	/*! \brief Set 
	 */
	void setData(Schedules_create_200_response_inner_data data);


    private:
    Schedules_create_200_response_inner_data data;
};
}

#endif /* TINY_CPP_CLIENT_Schedules_create_200_response_inner_H_ */
