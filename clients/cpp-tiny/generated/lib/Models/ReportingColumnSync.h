
/*
 * ReportingColumnSync.h
 *
 * Reporting columns for sync reporting endpoints
 */

#ifndef TINY_CPP_CLIENT_ReportingColumnSync_H_
#define TINY_CPP_CLIENT_ReportingColumnSync_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Reporting columns for sync reporting endpoints
 *
 *  \ingroup Models
 *
 */

class ReportingColumnSync{
public:

    /*! \brief Constructor.
	 */
    ReportingColumnSync();
    ReportingColumnSync(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ReportingColumnSync();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_ReportingColumnSync_H_ */
