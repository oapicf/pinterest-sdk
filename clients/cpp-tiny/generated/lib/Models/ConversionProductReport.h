
/*
 * ConversionProductReport.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ConversionProductReport_H_
#define TINY_CPP_CLIENT_ConversionProductReport_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "BulkReportingJobStatus.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ConversionProductReport{
public:

    /*! \brief Constructor.
	 */
    ConversionProductReport();
    ConversionProductReport(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ConversionProductReport();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Message returned from the create report request
	 */
	std::string getMessage();

	/*! \brief Set Message returned from the create report request
	 */
	void setMessage(std::string message);
	/*! \brief Get Async report status
	 */
	BulkReportingJobStatus getReportStatus();

	/*! \brief Set Async report status
	 */
	void setReportStatus(BulkReportingJobStatus report_status);
	/*! \brief Get Size of the report in bytes
	 */
	long getSize();

	/*! \brief Set Size of the report in bytes
	 */
	void setSize(long size);
	/*! \brief Get Token returned from the create report request
	 */
	std::string getToken();

	/*! \brief Set Token returned from the create report request
	 */
	void setToken(std::string token);
	/*! \brief Get URL of the report
	 */
	std::string getUrl();

	/*! \brief Set URL of the report
	 */
	void setUrl(std::string url);


    private:
    std::string message{};
    BulkReportingJobStatus report_status;
    long size{};
    std::string token{};
    std::string url{};
};
}

#endif /* TINY_CPP_CLIENT_ConversionProductReport_H_ */
