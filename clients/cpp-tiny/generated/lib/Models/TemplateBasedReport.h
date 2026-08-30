
/*
 * TemplateBasedReport.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_TemplateBasedReport_H_
#define TINY_CPP_CLIENT_TemplateBasedReport_H_


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

class TemplateBasedReport{
public:

    /*! \brief Constructor.
	 */
    TemplateBasedReport();
    TemplateBasedReport(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~TemplateBasedReport();


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
	/*! \brief Get Unique identifier of a template.
	 */
	std::string getTemplateId();

	/*! \brief Set Unique identifier of a template.
	 */
	void setTemplateId(std::string template_id);
	/*! \brief Get 
	 */
	std::string getToken();

	/*! \brief Set 
	 */
	void setToken(std::string token);


    private:
    std::string message{};
    BulkReportingJobStatus report_status;
    std::string template_id{};
    std::string token{};
};
}

#endif /* TINY_CPP_CLIENT_TemplateBasedReport_H_ */
