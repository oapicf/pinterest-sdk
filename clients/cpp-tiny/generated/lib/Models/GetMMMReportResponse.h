
/*
 * GetMMMReportResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_GetMMMReportResponse_H_
#define TINY_CPP_CLIENT_GetMMMReportResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "GetMMMReportResponseData.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class GetMMMReportResponse{
public:

    /*! \brief Constructor.
	 */
    GetMMMReportResponse();
    GetMMMReportResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetMMMReportResponse();


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
	GetMMMReportResponseData getData();

	/*! \brief Set 
	 */
	void setData(GetMMMReportResponseData  data);
	/*! \brief Get 
	 */
	std::string getMessage();

	/*! \brief Set 
	 */
	void setMessage(std::string  message);
	/*! \brief Get 
	 */
	std::string getStatus();

	/*! \brief Set 
	 */
	void setStatus(std::string  status);


    private:
    long code{};
    GetMMMReportResponseData data;
    std::string message{};
    std::string status{};
};
}

#endif /* TINY_CPP_CLIENT_GetMMMReportResponse_H_ */
