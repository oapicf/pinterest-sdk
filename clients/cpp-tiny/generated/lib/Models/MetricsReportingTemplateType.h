
/*
 * MetricsReportingTemplateType.h
 *
 * Reporting template type
 */

#ifndef TINY_CPP_CLIENT_MetricsReportingTemplateType_H_
#define TINY_CPP_CLIENT_MetricsReportingTemplateType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Reporting template type
 *
 *  \ingroup Models
 *
 */

class MetricsReportingTemplateType{
public:

    /*! \brief Constructor.
	 */
    MetricsReportingTemplateType();
    MetricsReportingTemplateType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MetricsReportingTemplateType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_MetricsReportingTemplateType_H_ */
