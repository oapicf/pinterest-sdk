
/*
 * ReportingTimeZone.h
 *
 * [Closed beta](/docs/getting-started/using-beta-and-restricted-features/) Specify the timezone to be applied for the reporting.
 */

#ifndef TINY_CPP_CLIENT_ReportingTimeZone_H_
#define TINY_CPP_CLIENT_ReportingTimeZone_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief [Closed beta](/docs/getting-started/using-beta-and-restricted-features/) Specify the timezone to be applied for the reporting.
 *
 *  \ingroup Models
 *
 */

class ReportingTimeZone{
public:

    /*! \brief Constructor.
	 */
    ReportingTimeZone();
    ReportingTimeZone(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ReportingTimeZone();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_ReportingTimeZone_H_ */
