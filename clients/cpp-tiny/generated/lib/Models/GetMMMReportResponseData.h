
/*
 * GetMMMReportResponseData.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_GetMMMReportResponseData_H_
#define TINY_CPP_CLIENT_GetMMMReportResponseData_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class GetMMMReportResponseData{
public:

    /*! \brief Constructor.
	 */
    GetMMMReportResponseData();
    GetMMMReportResponseData(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetMMMReportResponseData();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getReportStatus();

	/*! \brief Set 
	 */
	void setReportStatus(std::string  report_status);
	/*! \brief Get 
	 */
	long getSize();

	/*! \brief Set 
	 */
	void setSize(long  size);
	/*! \brief Get 
	 */
	std::string getUrl();

	/*! \brief Set 
	 */
	void setUrl(std::string  url);


    private:
    std::string report_status{};
    long size{};
    std::string url{};
};
}

#endif /* TINY_CPP_CLIENT_GetMMMReportResponseData_H_ */
