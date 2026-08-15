
/*
 * LeadsExportStatus.h
 *
 * Status of a leads export job
 */

#ifndef TINY_CPP_CLIENT_LeadsExportStatus_H_
#define TINY_CPP_CLIENT_LeadsExportStatus_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Status of a leads export job
 *
 *  \ingroup Models
 *
 */

class LeadsExportStatus{
public:

    /*! \brief Constructor.
	 */
    LeadsExportStatus();
    LeadsExportStatus(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~LeadsExportStatus();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_LeadsExportStatus_H_ */
