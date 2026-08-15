
/*
 * MetricsReportingLevel.h
 *
 * Level of the reporting request
 */

#ifndef TINY_CPP_CLIENT_MetricsReportingLevel_H_
#define TINY_CPP_CLIENT_MetricsReportingLevel_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Level of the reporting request
 *
 *  \ingroup Models
 *
 */

class MetricsReportingLevel{
public:

    /*! \brief Constructor.
	 */
    MetricsReportingLevel();
    MetricsReportingLevel(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MetricsReportingLevel();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_MetricsReportingLevel_H_ */
