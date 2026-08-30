
/*
 * WorkloadState.h
 *
 * Workload processing state
 */

#ifndef TINY_CPP_CLIENT_WorkloadState_H_
#define TINY_CPP_CLIENT_WorkloadState_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Workload processing state
 *
 *  \ingroup Models
 *
 */

class WorkloadState{
public:

    /*! \brief Constructor.
	 */
    WorkloadState();
    WorkloadState(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~WorkloadState();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_WorkloadState_H_ */
