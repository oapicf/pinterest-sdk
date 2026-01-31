/*
 * TemplateBasedReport.h
 *
 * 
 */

#ifndef _TemplateBasedReport_H_
#define _TemplateBasedReport_H_


#include <string>
#include "BulkReportingJobStatus.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class TemplateBasedReport : public Object {
public:
	/*! \brief Constructor.
	 */
	TemplateBasedReport();
	TemplateBasedReport(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TemplateBasedReport();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getMessage();

	/*! \brief Set 
	 */
	void setMessage(std::string  message);
	/*! \brief Get 
	 */
	BulkReportingJobStatus getReportStatus();

	/*! \brief Set 
	 */
	void setReportStatus(BulkReportingJobStatus  report_status);
	/*! \brief Get Unique identifier of a template.
	 */
	std::string getTemplateId();

	/*! \brief Set Unique identifier of a template.
	 */
	void setTemplateId(std::string  template_id);
	/*! \brief Get 
	 */
	std::string getToken();

	/*! \brief Set 
	 */
	void setToken(std::string  token);

private:
	std::string message;
	BulkReportingJobStatus report_status;
	std::string template_id;
	std::string token;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TemplateBasedReport_H_ */
