
/*
 * MMMReportingColumn.h
 *
 * Marketing Mix Modeling (MMM) Reporting Columns
 */

#ifndef TINY_CPP_CLIENT_MMMReportingColumn_H_
#define TINY_CPP_CLIENT_MMMReportingColumn_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Marketing Mix Modeling (MMM) Reporting Columns
 *
 *  \ingroup Models
 *
 */

class MMMReportingColumn{
public:

    /*! \brief Constructor.
	 */
    MMMReportingColumn();
    MMMReportingColumn(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MMMReportingColumn();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_MMMReportingColumn_H_ */
