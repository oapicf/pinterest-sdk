
/*
 * TemplateBasedReportCreate.h
 *
 * Resource create operation model.
 */

#ifndef TINY_CPP_CLIENT_TemplateBasedReportCreate_H_
#define TINY_CPP_CLIENT_TemplateBasedReportCreate_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "BulkReportingJobStatus.h"

namespace Tiny {


/*! \brief Resource create operation model.
 *
 *  \ingroup Models
 *
 */

class TemplateBasedReportCreate{
public:

    /*! \brief Constructor.
	 */
    TemplateBasedReportCreate();
    TemplateBasedReportCreate(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~TemplateBasedReportCreate();


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
	std::string getToken();

	/*! \brief Set 
	 */
	void setToken(std::string token);


    private:
    std::string message{};
    BulkReportingJobStatus report_status;
    std::string token{};
};
}

#endif /* TINY_CPP_CLIENT_TemplateBasedReportCreate_H_ */
