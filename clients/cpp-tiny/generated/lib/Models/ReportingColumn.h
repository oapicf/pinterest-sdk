
/*
 * ReportingColumn.h
 *
 * Reporting Columns
 */

#ifndef TINY_CPP_CLIENT_ReportingColumn_H_
#define TINY_CPP_CLIENT_ReportingColumn_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Reporting Columns
 *
 *  \ingroup Models
 *
 */

class ReportingColumn{
public:

    /*! \brief Constructor.
	 */
    ReportingColumn();
    ReportingColumn(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ReportingColumn();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_ReportingColumn_H_ */
