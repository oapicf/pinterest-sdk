
/*
 * ReportingColumnAsync.h
 *
 * Reporting columns
 */

#ifndef TINY_CPP_CLIENT_ReportingColumnAsync_H_
#define TINY_CPP_CLIENT_ReportingColumnAsync_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Reporting columns
 *
 *  \ingroup Models
 *
 */

class ReportingColumnAsync{
public:

    /*! \brief Constructor.
	 */
    ReportingColumnAsync();
    ReportingColumnAsync(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ReportingColumnAsync();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_ReportingColumnAsync_H_ */
