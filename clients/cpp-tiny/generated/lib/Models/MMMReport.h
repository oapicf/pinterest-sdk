
/*
 * MMMReport.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_MMMReport_H_
#define TINY_CPP_CLIENT_MMMReport_H_


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

class MMMReport{
public:

    /*! \brief Constructor.
	 */
    MMMReport();
    MMMReport(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MMMReport();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getMessage();

	/*! \brief Set 
	 */
	void setMessage(std::string message);
	/*! \brief Get 
	 */
	BulkReportingJobStatus getReportStatus();

	/*! \brief Set 
	 */
	void setReportStatus(BulkReportingJobStatus report_status);
	/*! \brief Get 
	 */
	long getSize();

	/*! \brief Set 
	 */
	void setSize(long size);
	/*! \brief Get 
	 */
	std::string getStatus();

	/*! \brief Set 
	 */
	void setStatus(std::string status);
	/*! \brief Get 
	 */
	std::string getToken();

	/*! \brief Set 
	 */
	void setToken(std::string token);
	/*! \brief Get 
	 */
	std::string getUrl();

	/*! \brief Set 
	 */
	void setUrl(std::string url);


    private:
    std::string message{};
    BulkReportingJobStatus report_status;
    long size{};
    std::string status{};
    std::string token{};
    std::string url{};
};
}

#endif /* TINY_CPP_CLIENT_MMMReport_H_ */
