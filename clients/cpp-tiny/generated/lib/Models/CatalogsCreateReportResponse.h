
/*
 * CatalogsCreateReportResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CatalogsCreateReportResponse_H_
#define TINY_CPP_CLIENT_CatalogsCreateReportResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CatalogsCreateReportResponse{
public:

    /*! \brief Constructor.
	 */
    CatalogsCreateReportResponse();
    CatalogsCreateReportResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsCreateReportResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Token to be used to get the report
	 */
	std::string getToken();

	/*! \brief Set Token to be used to get the report
	 */
	void setToken(std::string token);


    private:
    std::string token{};
};
}

#endif /* TINY_CPP_CLIENT_CatalogsCreateReportResponse_H_ */
