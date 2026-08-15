
/*
 * CreateMMMReportResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CreateMMMReportResponse_H_
#define TINY_CPP_CLIENT_CreateMMMReportResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CreateMMMReportResponseData.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CreateMMMReportResponse{
public:

    /*! \brief Constructor.
	 */
    CreateMMMReportResponse();
    CreateMMMReportResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CreateMMMReportResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	long getCode();

	/*! \brief Set 
	 */
	void setCode(long  code);
	/*! \brief Get 
	 */
	CreateMMMReportResponseData getData();

	/*! \brief Set 
	 */
	void setData(CreateMMMReportResponseData  data);


    private:
    long code{};
    CreateMMMReportResponseData data;
};
}

#endif /* TINY_CPP_CLIENT_CreateMMMReportResponse_H_ */
